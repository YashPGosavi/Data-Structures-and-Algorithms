/*

Binary AND ( & )

Rules :-
1. 0 & 0 :- 0
2. 0 & 1 :- 0
3. 1 & 0 :- 0 
4. 1 & 1 :- 1


Example :- (5 & 6) = 4
Let's cheak this :-

                   101
                &
                   110
                ---------
                   100
*/
public class _2_binaryAnd {
    public static void main(String[] args) {
      System.out.println((5&6));
    }
 }

 /*
Mass Mailing : This involves sending large volumes of emails to specific email addresses. Botnets or malicious software may be used to automate this attack, often by inputting the target's email as the sender's address.

List Linking : Attackers create numerous email subscriptions for particular addresses. If verification is not required, these can be used as attack emails. Since the traffic originates from various legitimate sources, this method is hard to stop.

ZIP Bomb : Huge compressed files are sent, consuming server resources during decompression and causing a slowdown.

Attachment Overload : Multiple emails with large attachments are sent, aiming to overwhelm a server's storage capacity and make it unresponsive.

Reply-All Storms : Responding to large distribution lists using "Reply All" floods inboxes with emails, often unintentional. Cybercriminals can also use this tactic to exploit automated responses.

  */