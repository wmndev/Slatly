package com.slatly.arch.platform.msg.content.process;

import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slatly.arch.platform.msg.content.MessagePOSInventory;

import edu.stanford.nlp.ling.CoreAnnotations.LemmaAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

@Service
public class MessageContentProcessorServiceImpl implements
		MessageContentProcessorService {

	@Autowired
	private MessagePOSInventory messagePOSInventory;
	
	private StanfordCoreNLP pipeline;
	
	@PostConstruct
	public void init(){
		// creates a StanfordCoreNLP object, with POS tagging, lemmatization,
		// NER, parsing, and coreference resolution
		Properties props = new Properties();
		props.put("annotators",
				"tokenize, ssplit, pos, lemma, ner, parse, dcoref");
		pipeline = new StanfordCoreNLP(props);
	}

	public void processMsg(String content) {

		// create an empty Annotation just with the given text
		Annotation document = new Annotation(content);

		// run all Annotators on this text
		pipeline.annotate(document);

		// these are all the sentences in this document
		// a CoreMap is essentially a Map that uses class objects as keys and
		// has values with custom types
		List<CoreMap> sentences = document.get(SentencesAnnotation.class);

		document.get(SentencesAnnotation.class);

		for (CoreMap sentence : sentences) {
			// traversing the words in the current sentence
			// a CoreLabel is a CoreMap with additional token-specific methods
			for (CoreLabel token : sentence.get(TokensAnnotation.class)) {
				String word = token.get(TextAnnotation.class);
				String pos = token.get(PartOfSpeechAnnotation.class);
				String ner = token.get(NamedEntityTagAnnotation.class);
				
				String lemma = token.get(LemmaAnnotation.class);

				System.out.println("**---->" + word +"|"+ lemma + "|" + pos + "|" + ner);
				messagePOSInventory.addTrend(lemma, pos, ner);
			}

			/**
			 * // this is the parse tree of the current sentence Tree tree =
			 * sentence.get(TreeAnnotation.class);
			 * 
			 * // this is the Stanford dependency graph of the current sentence
			 * SemanticGraph dependencies =
			 * sentence.get(CollapsedCCProcessedDependenciesAnnotation.class); }
			 * 
			 * // This is the coreference link graph // Each chain stores a set
			 * of mentions that link to each other, // along with a method for
			 * getting the most representative mention // Both sentence and
			 * token offsets start at 1! Map<Integer, CorefChain> graph =
			 * document.get(CorefChainAnnotation.class);
			 */

			// TODO Auto-generated method stub
		}
	}

}
