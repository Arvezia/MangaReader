package com.naufaldy.mangareader

object MangaList {
private val mangaName = arrayOf(
    "Monster",
    "20th Century Boys",
    "21st Century Boys",
    "Billy Bat",
    "Tenkuu Shinpan",
    "Imawa no Kuni no Alice",
    "Yakusoku no Neverland",
    "Tomo-chan wa Onnanoko!",
    "All You Need Is Kill",
    "World Trigger"
)

    private val mangaSynopsis = arrayOf(
        "Kenzou Tenma, a renowned Japanese neurosurgeon working in post-war Germany, faces a difficult choice: to operate on Johan Liebert, an orphan boy on the verge of death, or on the mayor of Düsseldorf. In the end, Tenma decides to gamble his reputation by saving Johan, effectively leaving the mayor for dead.\n \n As a consequence of his actions, hospital director Heinemann strips Tenma of his position, and Heinemann's daughter Eva breaks off their engagement. Disgraced and shunned by his colleagues, Tenma loses all hope of a successful career—that is, until the mysterious killing of Heinemann gives him another chance.\n \n Nine years later, Tenma is the head of the surgical department and close to becoming the director himself. Although all seems well for him at first, he soon becomes entangled in a chain of gruesome murders that have taken place throughout Germany. The culprit is a monster—the same one that Tenma saved on that fateful day nine years ago.",
        "As the 20th century approaches its end, people all over the world are anxious that the world is changing. And probably not for the better.\n \n Kenji Endo is a normal convenience store manager who's just trying to get by. But when he learns that one of his old friends going by the name \"Donkey\" has suddenly committed suicide, and that a new cult led by a figure known as \"Friend\" is becoming more notorious, Kenji starts to feel that something isn't right. With a few key clues left behind by his deceased friend, Kenji realizes that this cult is much more than he ever thought it would be—not only is this mysterious organization directly targeting him and his childhood friends, but the whole world also faces a grave danger that only the friends have the key to stop.\n \n Kenji's simple life of barely making ends meet is flipped upside down when he reunites with his childhood friends, and together they must figure out the truth of how their past is connected to the cult, as the turn of the century could mean the possible end of the world.",
        "Growing older is pretty rough and Kenji is finding out just how hard it can be as life starts wearing down on him. On top of trying to make ends meet running a convenience store he has to care for the niece that his missing sister left in his care. Memories of youth make it easier, until those memories come back to haunt him\n \n Picking up directly after the events of 20th Century Boys, it seems like the world is finally out of danger, but the mystery of \"Friend\" still exists. As the world is threatened again, Kenji must search his memories for any clue about \"Friend\"",
        "The story is set in 1949 and follows Japanese-American comic book artist Kevin Yamagata as he draws the popular detective series \"Billy Bat\" for \"Marble Comics.\" When he learns he may have unconsciously copied the character from an image he saw while serving in occupied Japan, he returns to Japan to get permission to use Billy Bat from its original creator. Upon arriving there, however, he becomes embroiled in a web of murder, cover-ups, and prophecy that all leads back to Billy Bat.\n \n It is soon evident, however, that the truth of Billy Bat's nature is far larger than Kevin could ever guess, spanning millennia and across the world.",
        "Upon witnessing a man's head cracked open with an axe, 16-year-old Yuri Honjou trembles in fear and confusion as she flees from the masked assailant, only to find out she's trapped in an abandoned building where every door is mysteriously locked. Desperately searching for a way out, Yuri runs to the rooftop, but a world with no signs of life stands before her, surrounded by high-rise buildings. Though filled with despair, once she learns that her brother is also in this strange place, Yuri is determined to find him and escape.\n \n However, she soon finds that there are more masked murderers in the area, anxious to terrorize their newfound victims and satiate their sickest desires, leaving Yuri to question if they will be able to make it out alive.",
        "Feeling unsettled about the future, high school student Ryouhei Arisu often escapes the reality of life. After hanging out at a bar, Arisu and his best friends, Daikichi Karube and Chouta Segawa, wait for the first train to arrive in the morning. Suddenly, a colorful array of fireworks set off in the sky, and an enormous blinding firework renders them unconscious.\n \n The trio finds themselves back at the bar covered in dust, discovering that the city has become a barren wasteland. But instead of being worried, Arisu feels alive for the very first time in his life and relishes the freedom of this lifeless city. However, his bliss is cut short when the group rashly enters a festival venue. Seeing its delicacies and lively ambiance, they think the place is a dream; unbeknownst to them, it will be the setting for their first deadly game.\n \n Together with his friends, Arisu slowly enters the mysterious area known as the Borderland—an unknown country where every game puts their lives at stake, and a single misstep can lead to their demise.",
        "At Grace Field House, life couldn't be better for the orphans! Though they have no parents, together with the other kids and a kind \"Mama\" who cares for them, they form one big, happy family. No child is ever overlooked, especially since they are all adopted by the age of 12. Their daily lives involve rigorous tests, but afterwards, they are allowed to play outside.\n \n There is only one rule they must obey: do not leave the orphanage. But one day, two top-scoring orphans, Emma and Norman, venture past the gate and unearth the harrowing secret behind their entire existence. Utilizing their quick-wittedness, the children must work together to somehow change their predetermined fate.",
        "Tomo Aizawa and Junichirou \"Jun\" Kubota are the tightest bros you'd ever see. They roughhouse and spar, but through thick and thin, they've got each other's back. Yet, there's just one small problem: Tomo is in love with Jun!\n \n Since she was young, tomboyish Tomo has been just another one of the guys; due to his extreme muscle-brained nature, Jun doesn't notice any of her advances—not even when she explicitly confesses. To add insult to injury, for the longest time, he didn't even realize that she was a girl.\n \n Tomo-chan wa Onnanoko! follows the comedic hijinks of Tomo and her friends as she tries to catch Jun's eye and escape the infamous brozone",
        "Strange creatures known as \"Mimics\" have invaded Earth, sparking a global war that has humanity fighting for survival. In response, mankind forms the United Defense Force, a joint organization whose purpose is to overcome this new threat. Dedicated to the extermination of the growing Mimic menace, soldiers are plunged into battle, wearing special exoskeleton combat suits in an attempt to gain the upper hand against their foes.\n \n New recruit Keiji Kiriya is immediately killed after his very first deployment, but to his shock, he wakes up exactly one day before his unit was dropped into a Mimic invasion. After experiencing the same event yet again, he realizes that he is stuck in a time loop triggered by his death. As he relives the day of the battle hundreds of times, Keiji begins to make use of what he has learned about the phenomenon, gradually building up his strength and improving his skills so that eventually, when he comes face-to-face with death once more, he will be ready to change his fate.",
        "Earth is under constant threat from Neighbors, invincible monsters from another dimension that destroy our way of life. At least we have the elite warriors of Border, who co-opt alien technology to fight back! Our hero Osamu Mikumo may not be the best agent, but he'll do whatever it takes to defend life on Earth as we know it. When Osamu meets a feisty humanoid Neighbor named Yuma, everything that he thinks is right is turned on its head. Can the two natural enemies ever become friends?"
    )
    private val mangaCover = intArrayOf(
        R.drawable.monster,
        R.drawable.twenty_century_boys,
        R.drawable.twentyfirst_century_boys,
        R.drawable.billy_bat,
        R.drawable.tenkuu_shinpan,
        R.drawable.imawa_no_kuni_alice,
        R.drawable.yakusoku_no_neverland,
        R.drawable.tomo_chan_wa_onnanoko,
        R.drawable.all_you_need_is_kill,
        R.drawable.world_trigger
    )
    val listdata: ArrayList<Manga>
    get(){
        val list = arrayListOf<Manga>()
        for (
            position in mangaName.indices){
            val manga = Manga()
            manga.name = mangaName[position]
            manga.cover = mangaCover[position]
            manga.synopsis = mangaSynopsis[position]
            list.add(manga)
        }
        return list
    }
}