package com.evikadar.habitsbackend.controller;

import com.evikadar.habitsbackend.model.Challenge;
import com.evikadar.habitsbackend.repository.ChallengeRepository;
import com.evikadar.habitsbackend.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChallengeController {

    @Autowired
    ChallengeService challengeService;

    @Autowired
    ChallengeRepository challengeRepository;

    @GetMapping("/challenges")
    public List<Challenge> getEveryChallenge() {
        return challengeRepository.findAll();
    }

    @GetMapping("/challenges/category/{categoryId}")
    public List<Challenge> getChallengesByCategory(@PathVariable Long categoryId) {
        return challengeRepository.getChallengeByHabitCategory(categoryId);

    }

    @GetMapping("/challenges/{id}")
    public Challenge getChallengeByName(@PathVariable Long id) {
        return challengeRepository.getChallengeById(id);
    }

    // todo: add new challenges to have at least 3 in every category
    // todo: add photos to them

    @GetMapping("/challenges/new")
    public void addNewChallenge() {
        challengeService.createChallenges((long) 1,
                "you'll have better insights into your spending habits",
                "you'll be able to find expenses that are easy to eliminate",
                "you might have better relationship with your spouse",
                "you will spend less impulsively",
                "Track Your Cash Flow",
                "Store all your expenses and incomes and see where you could save money.");
        challengeService.createChallenges((long) 1,
                "Become Financially Independent",
                "Easier To Buy Expensive Items Such As Car or Home",
                "you might feel more secure and more competent",
                "your stress could decrease",
                "Save 30% Of Your Income",
                "For every money you get, save 30% and possibly invest it into something.");
        challengeService.createChallenges((long) 1,
                "you can realise the bad reasons you buy stuffs",
                "you can realise what is it you actually don't need",
                "save quite a lot of money",
                "spend that money on something more useful",
                "Avoid Buying Something Every Day",
                "Catch Yourself wanting to buy an unnecessary item and don't buy it.");

        challengeService.createChallenges((long) 2,
                "You can grow as a person, develop your knowledge base and improve yourself for the better.",
                "Your learning speed increases.",
                "You could stave off dementia.",
                "build confidence and a sense of self-efficacy",
                "Learn Something New",
                "You can learn a big new area piece by piece or just a small hack every day.");
        challengeService.createChallenges((long) 2,
                "the mental stimulation keeps your brain active",
                "it reduces stress",
                "you will be more smarter",
                "your vocabulary expands",
                "Read Every Day",
                "Read Every Day For 20 Minutes");
        challengeService.createChallenges((long) 2,
                "It heals: reduces anger, fear, and stress and increases pleasant feelings",
                "nature helps us cope with pain",
                "your mood will become calm and balanced",
                "time spent in nature connects us to each other and the larger world",
                "Spend Time In Nature",
                "Be In A Forest, garden, By A Lake, by the sea etc. every day for 30 minutes");
        challengeService.createChallenges((long) 2,
                "A five-minute a daily gratitude journal can increase your long-term well-being by more than 10 percent.",
                "Gratitude makes us nicer, more trusting, more social, and more appreciative.",
                "As a result, it helps us make more friends, deepen our existing relationships, and improve our marriage.",
                "Gratitude makes us healthier.",
                "Gratitude Journal",
                "Write Down Something Every Day That Makes You Feel Happy and Blessed");
        challengeService.createChallenges((long) 2,
                "putting feelings down on paper reduces activity in a part of the brain called the amygdala, which is responsible for controlling the intensity of our emotions.",
                "cope more effectively with stress",
                "increases mindfulness",
                "helps you achieve your goals",
                "Write a diary or a blog",
                "Write every day about your feelings or struggles or anything that is on your mind");

        challengeService.createChallenges((long) 3,
                "Taking photos can enhance the enjoyment of everyday activities",
                "you remind yourself about things that make you grateful",
                "photos will become great memories",
                "if you share them you can connect to people",
                "Make a Photo Every Day",
                "Capture a moment of your day you would like to remember.");
        challengeService.createChallenges((long) 3,
                "decrease in anxiety and depression",
                "increased creativity",
                "excellent way to practice mindfulnes",
                "you can be receptive to the sensory world to capture the moment and be aware of her inner-self",
                "Write a poem or haiku every day",
                "Create a small poem every day");
        challengeService.createChallenges((long) 3,
                "improves your courage",
                "opens up the possibility for you to enjoy something new",
                "keeps you from becoming bored",
                "forces you to grow",
                "Try Something New Every Day",
                "Do Something You Have never done before, small or big");

        challengeService.createChallenges((long) 4,
                "Decreases symptoms of depression",
                "Improves your learning abilities",
                "Sharpens your memory",
                "Protects the brain from aging",
                "Go For A Run",
                "Decide the length and the frequency and just run");
        challengeService.createChallenges((long) 4,
                "relieves tension and stress, boosts physical and mental energy, and enhances well-being through the release of endorphins",
                "helps to relax the muscles and relieve tension in the body",
                "improves concentration, motivation, memory, and mood",
                "reduces symptoms of PTSD",
                "Exercise",
                "Do any kind of exercise for at least 20 minutes a day");
        challengeService.createChallenges((long) 4,
                "improves your courage",
                "opens up the possibility for you to enjoy something new",
                "keeps you from becoming bored",
                "forces you to grow",
                "Don't Eat Sugar",
                "Don't Eat Anything That Contains Sugar");

    }

}
