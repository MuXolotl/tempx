package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٜؓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1909l extends C3585l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC9659l f4367l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1909l(ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l) {
        super(3);
        this.f4367l = viewOnAttachStateChangeListenerC9659l;
    }

    @Override // defpackage.C3585l
    public final C15685l ads(int i) {
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l = this.f4367l;
        if (i != 1) {
            if (i == 2) {
                return smaato(viewOnAttachStateChangeListenerC9659l.f19736l);
            }
            C8339l.metrica(AbstractC0653l.vip(i, "Unknown focus type: "));
            return null;
        }
        int i2 = viewOnAttachStateChangeListenerC9659l.f19732l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return smaato(i2);
    }

    @Override // defpackage.C3585l
    public final void mopub(int i, C15685l c15685l, String str, Bundle bundle) {
        this.f4367l.isPro(i, c15685l, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0260  */
    /* JADX WARN: Code duplicated, block: B:540:0x0752  */
    /* JADX WARN: Code duplicated, block: B:545:0x0766  */
    /* JADX WARN: Code duplicated, block: B:552:0x0778  */
    /* JADX WARN: Code duplicated, block: B:554:0x077c  */
    /* JADX WARN: Code duplicated, block: B:556:0x078b  */
    /* JADX WARN: Code duplicated, block: B:558:0x078f  */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x01b0, code lost:
    
        r1 = null;
     */
    @Override // defpackage.C3585l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean premium(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1909l.premium(int, int, android.os.Bundle):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0206  */
    /* JADX WARN: Code duplicated, block: B:106:0x020b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0220  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0239  */
    /* JADX WARN: Code duplicated, block: B:117:0x0257  */
    /* JADX WARN: Code duplicated, block: B:119:0x0260  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:126:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:132:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x02df  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:142:0x0300  */
    /* JADX WARN: Code duplicated, block: B:145:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0316  */
    /* JADX WARN: Code duplicated, block: B:150:0x0327  */
    /* JADX WARN: Code duplicated, block: B:153:0x035a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0365  */
    /* JADX WARN: Code duplicated, block: B:158:0x0375  */
    /* JADX WARN: Code duplicated, block: B:164:0x0393  */
    /* JADX WARN: Code duplicated, block: B:167:0x039b  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ad A[LOOP:3: B:166:0x0399->B:169:0x03ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:176:0x03da  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:186:0x0417  */
    /* JADX WARN: Code duplicated, block: B:190:0x043a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0448  */
    /* JADX WARN: Code duplicated, block: B:200:0x0479  */
    /* JADX WARN: Code duplicated, block: B:202:0x0483  */
    /* JADX WARN: Code duplicated, block: B:204:0x0493  */
    /* JADX WARN: Code duplicated, block: B:207:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:212:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:218:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:221:0x0503  */
    /* JADX WARN: Code duplicated, block: B:224:0x0509  */
    /* JADX WARN: Code duplicated, block: B:226:0x050d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0512  */
    /* JADX WARN: Code duplicated, block: B:229:0x0516  */
    /* JADX WARN: Code duplicated, block: B:233:0x0524  */
    /* JADX WARN: Code duplicated, block: B:236:0x052a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0530  */
    /* JADX WARN: Code duplicated, block: B:239:0x0534  */
    /* JADX WARN: Code duplicated, block: B:241:0x053b  */
    /* JADX WARN: Code duplicated, block: B:245:0x0547  */
    /* JADX WARN: Code duplicated, block: B:250:0x0559  */
    /* JADX WARN: Code duplicated, block: B:252:0x0561  */
    /* JADX WARN: Code duplicated, block: B:255:0x0567  */
    /* JADX WARN: Code duplicated, block: B:256:0x056e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:260:0x057b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0581  */
    /* JADX WARN: Code duplicated, block: B:265:0x0584  */
    /* JADX WARN: Code duplicated, block: B:268:0x059b A[LOOP:7: B:264:0x0582->B:268:0x059b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:274:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:277:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:280:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:286:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:288:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:289:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:292:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:295:0x060d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0613  */
    /* JADX WARN: Code duplicated, block: B:299:0x0618  */
    /* JADX WARN: Code duplicated, block: B:302:0x0632  */
    /* JADX WARN: Code duplicated, block: B:304:0x0645  */
    /* JADX WARN: Code duplicated, block: B:306:0x064f  */
    /* JADX WARN: Code duplicated, block: B:307:0x0656  */
    /* JADX WARN: Code duplicated, block: B:310:0x0667  */
    /* JADX WARN: Code duplicated, block: B:311:0x066c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0677  */
    /* JADX WARN: Code duplicated, block: B:317:0x0683  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:320:0x0689  */
    /* JADX WARN: Code duplicated, block: B:322:0x068d  */
    /* JADX WARN: Code duplicated, block: B:323:0x068f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0692  */
    /* JADX WARN: Code duplicated, block: B:326:0x0694  */
    /* JADX WARN: Code duplicated, block: B:328:0x0697  */
    /* JADX WARN: Code duplicated, block: B:329:0x0699  */
    /* JADX WARN: Code duplicated, block: B:331:0x069c  */
    /* JADX WARN: Code duplicated, block: B:335:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:338:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:340:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:343:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:344:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:348:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:349:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:350:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:355:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:356:0x06df  */
    /* JADX WARN: Code duplicated, block: B:358:0x06e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:365:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:371:0x0711  */
    /* JADX WARN: Code duplicated, block: B:374:0x0717  */
    /* JADX WARN: Code duplicated, block: B:376:0x0721  */
    /* JADX WARN: Code duplicated, block: B:380:0x0739  */
    /* JADX WARN: Code duplicated, block: B:383:0x074d  */
    /* JADX WARN: Code duplicated, block: B:385:0x0757  */
    /* JADX WARN: Code duplicated, block: B:388:0x076f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:391:0x0788  */
    /* JADX WARN: Code duplicated, block: B:394:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:396:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:398:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:399:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:401:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:405:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:409:0x07de  */
    /* JADX WARN: Code duplicated, block: B:411:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:413:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:414:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:417:0x081e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:421:0x0827  */
    /* JADX WARN: Code duplicated, block: B:423:0x082a  */
    /* JADX WARN: Code duplicated, block: B:427:0x083e  */
    /* JADX WARN: Code duplicated, block: B:429:0x084a  */
    /* JADX WARN: Code duplicated, block: B:433:0x0855  */
    /* JADX WARN: Code duplicated, block: B:435:0x085d  */
    /* JADX WARN: Code duplicated, block: B:437:0x0863  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:445:0x087c  */
    /* JADX WARN: Code duplicated, block: B:447:0x0882  */
    /* JADX WARN: Code duplicated, block: B:449:0x088c  */
    /* JADX WARN: Code duplicated, block: B:451:0x0895  */
    /* JADX WARN: Code duplicated, block: B:453:0x0898  */
    /* JADX WARN: Code duplicated, block: B:456:0x089d  */
    /* JADX WARN: Code duplicated, block: B:459:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:461:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:465:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:467:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:472:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:475:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:479:0x0902  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:481:0x090e  */
    /* JADX WARN: Code duplicated, block: B:482:0x0914  */
    /* JADX WARN: Code duplicated, block: B:485:0x091d  */
    /* JADX WARN: Code duplicated, block: B:488:0x092f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0945  */
    /* JADX WARN: Code duplicated, block: B:495:0x094a  */
    /* JADX WARN: Code duplicated, block: B:498:0x0969  */
    /* JADX WARN: Code duplicated, block: B:501:0x096e  */
    /* JADX WARN: Code duplicated, block: B:504:0x0979  */
    /* JADX WARN: Code duplicated, block: B:508:0x098b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:511:0x0991  */
    /* JADX WARN: Code duplicated, block: B:514:0x09bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:517:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:519:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:521:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:524:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:525:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:527:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:546:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:548:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:551:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a57 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:567:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:581:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:584:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:587:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:589:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:592:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:598:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:603:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:605:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:607:0x0b83  */
    /* JADX WARN: Code duplicated, block: B:609:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:610:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:614:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:617:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:619:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:621:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:623:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:625:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:628:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:630:0x0bf4  */
    /* JADX WARN: Code duplicated, block: B:634:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:636:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:637:0x0c1b  */
    /* JADX WARN: Code duplicated, block: B:639:0x0c1f  */
    /* JADX WARN: Code duplicated, block: B:640:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:642:0x0c32  */
    /* JADX WARN: Code duplicated, block: B:645:0x0c3d  */
    /* JADX WARN: Code duplicated, block: B:647:0x0c43  */
    /* JADX WARN: Code duplicated, block: B:648:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:650:0x0c4b  */
    /* JADX WARN: Code duplicated, block: B:653:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code duplicated, block: B:663:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:667:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:684:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:690:0x0590 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0878 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0873 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0175  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df  */
    /* JADX WARN: Instruction removed from duplicated block: B:663:0x0c78, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v71, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.util.ArrayList] */
    @Override // defpackage.C3585l
    public final C15685l smaato(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        C15685l c15685l;
        int i2;
        C18666l c18666lSmaato;
        Integer numValueOf;
        int iIntValue;
        C13440l c13440l;
        C18152l c18152l;
        Resources resources;
        C6264l c6264l;
        C13660l c13660l;
        Object objMopub;
        C6402l c6402l;
        AccessibilityManager accessibilityManager;
        C18152l c18152l2;
        boolean zAd;
        List listIsPro;
        int size;
        boolean z;
        int i3;
        int i4;
        int i5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C3625l c3625lStartapp;
        C6264l c6264l2;
        C6402l c6402l2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        C13660l c13660l2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        SpannableString spannableString;
        C15685l c15685l2;
        C4707l c4707l;
        C13660l c13660l3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        AccessibilityNodeInfo accessibilityNodeInfo5;
        String strMetrica;
        Object objMopub2;
        EnumC13846l enumC13846l;
        Object objMopub3;
        Boolean bool;
        C6402l c6402l3;
        int i6;
        C6264l c6264l3;
        Object objMopub4;
        List list;
        String str;
        Object objMopub5;
        String str2;
        Object objMopub6;
        Object objMopub7;
        int i7;
        Object objMopub8;
        Boolean bool2;
        Object objMopub9;
        Integer num;
        int iIntValue2;
        C4707l c4707l2;
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l;
        boolean z2;
        C18666l c18666lSmaato2;
        Object objMopub10;
        C8223l c8223l;
        Object objMopub11;
        C7629l c7629l;
        char c;
        Object objMopub12;
        C7629l c7629l2;
        C7629l c7629l3;
        String strSubscription;
        boolean z3;
        C14519l c14519l;
        int i8;
        C11601l c11601l;
        C11601l c11601l2;
        boolean z4;
        int iAmazon;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l;
        int iAmazon2;
        String str3;
        C8697l androidViewsHandler;
        AbstractC0290l abstractC0290lMopub;
        C8697l androidViewsHandler2;
        AbstractC0290l abstractC0290lMopub2;
        C7629l c7629l4;
        C7629l c7629l5;
        C7629l c7629l6;
        C6264l c6264lVip;
        C4707l c4707l3;
        List list2;
        int size2;
        C16761l c16761l;
        int i9;
        C18152l c18152l3;
        int[] iArr;
        int i10;
        int[] iArrCopyOf;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        boolean z5;
        Object objMopub13;
        boolean z6;
        boolean zAdvert;
        EnumC9931l enumC9931l;
        C3654l c3654l;
        boolean z7;
        C6933l c6933l;
        boolean z8;
        C6933l c6933l2;
        Object objMopub14;
        Object objMopub15;
        C7629l c7629l7;
        C12015l c12015l;
        float f;
        C4707l c4707l4;
        float f2;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        ArrayList arrayList2;
        CharSequence charSequenceBilling;
        boolean z9;
        C7629l c7629l8;
        String str4;
        List list3;
        boolean z10;
        C3654l c3654lLicense;
        C6264l c6264lAdvert;
        boolean zYandex;
        Object objMopub16;
        C6264l c6264lAdvert2;
        boolean z11;
        Object objMopub17;
        C7629l c7629l9;
        C7629l c7629l10;
        C7629l c7629l11;
        C7629l c7629l12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objMopub18;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        boolean z16;
        boolean z17;
        int i15;
        int iAmazon3;
        C18666l c18666lSmaato3;
        boolean zBooleanValue;
        C6264l c6264l4;
        C4707l c4707l5;
        boolean zBooleanValue2;
        Object objMopub19;
        InterfaceC13490l density;
        C5991l c5991l;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList3;
        SpannableString spannableString3;
        ?? arrayList4;
        ?? arrayList5;
        int size3;
        int i16;
        int size4;
        int i17;
        List listYandex;
        int size5;
        int i18;
        C15012l c15012l;
        int i19;
        Object obj;
        int i20;
        AbstractC12494l abstractC12494l;
        WeakHashMap weakHashMap;
        Object c14607l;
        C18005l c18005l;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size6;
        int i21;
        C15012l c15012l2;
        C3938l c3938l;
        int i22;
        int i23;
        int size7;
        int i24;
        C15012l c15012l3;
        int size8;
        int i25;
        int i26;
        int i27;
        long jLoadAd;
        C6886l c6886l;
        C11617l c11617l;
        C16810l c16810l;
        long j;
        C9867l c9867l;
        InterfaceC12750l interfaceC12750l;
        InterfaceC12750l c8245l;
        InterfaceC12750l interfaceC12750l2;
        SpannableString spannableString4;
        C6886l c6886l2;
        int i28;
        int i29;
        int i30;
        C18666l c18666l;
        AbstractC14183l abstractC14183lAds;
        int i31;
        C8697l androidViewsHandler3;
        AbstractC0290l abstractC0290l;
        C13874l c13874l;
        boolean zYandex2;
        C18666l c18666l2;
        int i32;
        int i33;
        String strAdmob;
        Object parentForAccessibility;
        View view;
        C15685l c15685l3;
        ViewOnAttachStateChangeListenerC9659l viewOnAttachStateChangeListenerC9659l2 = this.f4367l;
        AccessibilityManager accessibilityManager2 = viewOnAttachStateChangeListenerC9659l2.f19709l;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l2 = viewOnAttachStateChangeListenerC9659l2.f19728l;
        C11096l composeViewContext = viewTreeObserverOnGlobalLayoutListenerC13840l2.getComposeViewContext();
        composeViewContext.purchase();
        if (((C5268l) composeViewContext.amazon.loadAd()).subs == EnumC8981l.f18522l) {
            if (accessibilityManager2.isEnabled()) {
                c15685l3 = null;
            } else {
                c15685l3 = new C15685l(AccessibilityNodeInfo.obtain());
            }
            C15685l c15685l4 = c15685l3;
            i7 = i;
            c15685l2 = c15685l4;
            viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
        } else {
            C13874l c13874l2 = (C13874l) viewOnAttachStateChangeListenerC9659l2.ads().loadAd(i);
            if (c13874l2 == null) {
                if (accessibilityManager2.isEnabled()) {
                    c15685l3 = null;
                } else {
                    c15685l3 = new C15685l(AccessibilityNodeInfo.obtain());
                }
                C15685l c15685l5 = c15685l3;
                i7 = i;
                c15685l2 = c15685l5;
                viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
            } else {
                C18666l c18666l3 = c13874l2.yandex;
                C6264l c6264lFirebase = c18666l3.firebase();
                C3654l c3654l2 = c18666l3.crashlytics;
                Object objMopub20 = c6264lFirebase.f13225l.mopub(AbstractC0424l.metrica);
                if (objMopub20 == null) {
                    objMopub20 = null;
                }
                boolean zYandex3 = AbstractC8576l.yandex(objMopub20, Boolean.TRUE);
                if (!zYandex3) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    c15685l = new C15685l(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC5917l.m1871strictfp(accessibilityNodeInfoObtain, zYandex3);
                    } else {
                        c15685l.subs(64, zYandex3);
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC13840l2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        c15685l.loadAd = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        c18666lSmaato = c18666l3.smaato();
                        if (c18666lSmaato != null) {
                            numValueOf = Integer.valueOf(c18666lSmaato.billing);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            AbstractC0081l.amazon("semanticsNode " + i + " has null parent");
                            C17132l.firebase();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC13840l2.getSemanticsOwner().yandex().billing) {
                            iIntValue = -1;
                        }
                        c15685l.loadAd = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC13840l2, iIntValue);
                    }
                    c15685l.crashlytics = i;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC13840l2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(viewOnAttachStateChangeListenerC9659l2.firebase(c13874l2));
                    c13440l = viewOnAttachStateChangeListenerC9659l2.f19731l;
                    c18152l = viewOnAttachStateChangeListenerC9659l2.f19719l;
                    resources = viewTreeObserverOnGlobalLayoutListenerC13840l2.getContext().getResources();
                    c15685l.isPro("android.view.View");
                    c6264l = c18666l3.amazon;
                    c13660l = c6264l.f13225l;
                    if (c13660l.crashlytics(AbstractC0424l.f1545package)) {
                        c15685l.isPro("android.widget.EditText");
                    }
                    if (c13660l.crashlytics(AbstractC0424l.applovin)) {
                        c15685l.isPro("android.widget.TextView");
                    }
                    objMopub = c13660l.mopub(AbstractC0424l.isVip);
                    if (objMopub == null) {
                        objMopub = null;
                    }
                    c6402l = (C6402l) objMopub;
                    if (c6402l != null) {
                        i32 = c6402l.yandex;
                        if (c18666l3.metrica()) {
                            accessibilityManager = accessibilityManager2;
                            i33 = 4;
                            c18152l2 = c18152l;
                            if (C18666l.isPro(4, c18666l3).isEmpty()) {
                            }
                            Unit unit = Unit.INSTANCE;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i33 = 4;
                            c18152l2 = c18152l;
                        }
                        if (i32 == i33) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i32 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strAdmob = AbstractC4603l.admob(i32);
                            if (i32 == 5 || c18666l3.adcel() || c6264l.f13223l) {
                                c15685l.isPro(strAdmob);
                            }
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c18152l2 = c18152l;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC13840l2.getContext().getPackageName());
                    c15685l.metrica(AbstractC14425l.firebase(c18666l3));
                    if (i2 >= 34) {
                        zAd = AbstractC5917l.ad(accessibilityManager);
                    } else {
                        zAd = true;
                    }
                    listIsPro = C18666l.isPro(4, c18666l3);
                    size = listIsPro.size();
                    z = zAd;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i34 = size;
                        c18666l = (C18666l) listIsPro.get(i4);
                        List list5 = listIsPro;
                        abstractC14183lAds = viewOnAttachStateChangeListenerC9659l2.ads();
                        int i35 = i4;
                        i31 = c18666l.billing;
                        if (!abstractC14183lAds.yandex(i31)) {
                            androidViewsHandler3 = viewTreeObserverOnGlobalLayoutListenerC13840l2.getAndroidViewsHandler();
                            if (androidViewsHandler3 != null) {
                                abstractC0290l = androidViewsHandler3.getLayoutNodeToHolder().get(c18666l.crashlytics);
                            } else {
                                abstractC0290l = null;
                            }
                            if (i31 != -1) {
                                if (abstractC0290l != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC0290l);
                                } else {
                                    c13874l = (C13874l) viewOnAttachStateChangeListenerC9659l2.ads().loadAd(i31);
                                    if (c13874l != null || (c18666l2 = c13874l.yandex) == null) {
                                        zYandex2 = false;
                                    } else {
                                        Object objMopub21 = c18666l2.firebase().f13225l.mopub(AbstractC0424l.metrica);
                                        if (objMopub21 == null) {
                                            objMopub21 = null;
                                        }
                                        zYandex2 = AbstractC8576l.yandex(objMopub21, Boolean.TRUE);
                                    }
                                    if (z || !zYandex2) {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC13840l2, i31);
                                    }
                                }
                                c13440l.billing(i31, i3);
                                i3++;
                            }
                        }
                        i4 = i35 + 1;
                        listIsPro = list5;
                        size = i34;
                    }
                    i5 = viewOnAttachStateChangeListenerC9659l2.f19736l;
                    accessibilityNodeInfo = c15685l.yandex;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c15685l.loadAd(C6933l.mopub);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c15685l.loadAd(C6933l.billing);
                    }
                    c3625lStartapp = AbstractC3292l.startapp(c18666l3);
                    if (c3625lStartapp != null) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l2.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC13840l2.getDensity();
                        c5991l = viewOnAttachStateChangeListenerC9659l2.f19704l;
                        String str5 = c3625lStartapp.f7563l;
                        list4 = c3625lStartapp.f7564l;
                        spannableString2 = new SpannableString(str5);
                        arrayList3 = c3625lStartapp.f7562l;
                        if (arrayList3 != null) {
                            size8 = arrayList3.size();
                            i25 = 0;
                            while (i25 < size8) {
                                int i36 = size8;
                                C15012l c15012l4 = (C15012l) arrayList3.get(i25);
                                ArrayList arrayList6 = arrayList3;
                                C14264l c14264l = (C14264l) c15012l4.yandex;
                                int i37 = i25;
                                i26 = c15012l4.loadAd;
                                i27 = c15012l4.crashlytics;
                                C6264l c6264l5 = c6264l;
                                C6402l c6402l4 = c6402l;
                                jLoadAd = c14264l.yandex.loadAd();
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                C13660l c13660l4 = c13660l;
                                long j2 = c14264l.loadAd;
                                c6886l = c14264l.crashlytics;
                                c11617l = c14264l.amazon;
                                c16810l = c14264l.isPro;
                                C10537l c10537l = c14264l.firebase;
                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfoObtain;
                                C15685l c15685l6 = c15685l;
                                j = c14264l.smaato;
                                c9867l = c14264l.remoteconfig;
                                interfaceC12750l = c14264l.yandex;
                                C3625l c3625l = c3625lStartapp;
                                if (C9735l.crashlytics(jLoadAd, interfaceC12750l.loadAd())) {
                                    interfaceC12750l2 = interfaceC12750l;
                                } else {
                                    if (jLoadAd != 16) {
                                        c8245l = new C8245l(jLoadAd);
                                    } else {
                                        c8245l = C15368l.yandex;
                                    }
                                    interfaceC12750l2 = c8245l;
                                }
                                AbstractC9027l.purchase(spannableString2, interfaceC12750l2.loadAd(), i26, i27);
                                spannableString4 = spannableString2;
                                AbstractC9027l.billing(spannableString4, j2, density, i26, i27);
                                if (c6886l == null || c11617l != null) {
                                    if (c6886l == null) {
                                        c6886l2 = C6886l.f14425l;
                                    } else {
                                        c6886l2 = c6886l;
                                    }
                                    if (c11617l != null) {
                                        i28 = c11617l.yandex;
                                    } else {
                                        i28 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(AbstractC15852l.loadAd(i28, c6886l2));
                                    i29 = 33;
                                    spannableString4.setSpan(styleSpan, i26, i27, 33);
                                } else {
                                    i29 = 33;
                                }
                                if (c9867l != null) {
                                    i30 = c9867l.yandex;
                                    if ((i30 | 1) == i30) {
                                        spannableString4.setSpan(new UnderlineSpan(), i26, i27, i29);
                                    }
                                    if ((i30 | 2) == i30) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i26, i27, i29);
                                    }
                                }
                                if (c16810l != null) {
                                    spannableString4.setSpan(new ScaleXSpan(c16810l.yandex), i26, i27, i29);
                                }
                                AbstractC9027l.mopub(spannableString4, c10537l, i26, i27);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(AbstractC12953l.startapp(j)), i26, i27, i29);
                                }
                                i25 = i37 + 1;
                                spannableString2 = spannableString4;
                                c3625lStartapp = c3625l;
                                size8 = i36;
                                arrayList3 = arrayList6;
                                c6264l = c6264l5;
                                c6402l = c6402l4;
                                accessibilityNodeInfo = accessibilityNodeInfo6;
                                c13660l = c13660l4;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo7;
                                c15685l = c15685l6;
                            }
                        }
                        c6264l2 = c6264l;
                        c6402l2 = c6402l;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        c13660l2 = c13660l;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        C15685l c15685l7 = c15685l;
                        spannableString3 = spannableString2;
                        C3625l c3625l2 = c3625lStartapp;
                        int length = str5.length();
                        arrayList4 = C2580l.f5619l;
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size7 = list4.size();
                            while (i24 < size7) {
                                Object obj2 = list4.get(i24);
                                c15012l3 = (C15012l) obj2;
                                if (!(c15012l3.yandex instanceof C3938l) && AbstractC0255l.loadAd(0, length, c15012l3.loadAd, c15012l3.crashlytics)) {
                                    arrayList5.add(obj2);
                                }
                            }
                        } else {
                            arrayList5 = arrayList4;
                        }
                        size3 = arrayList5.size();
                        while (i16 < size3) {
                            C15012l c15012l5 = (C15012l) arrayList5.get(i16);
                            c3938l = (C3938l) c15012l5.yandex;
                            i22 = c15012l5.loadAd;
                            i23 = c15012l5.crashlytics;
                            if (c3938l instanceof C3938l) {
                                C18725l.billing();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(c3938l.yandex).build(), i22, i23, 33);
                        }
                        int length2 = str5.length();
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            size6 = list4.size();
                            while (i21 < size6) {
                                Object obj3 = list4.get(i21);
                                c15012l2 = (C15012l) obj3;
                                if (!(c15012l2.yandex instanceof C18005l) && AbstractC0255l.loadAd(0, length2, c15012l2.loadAd, c15012l2.crashlytics)) {
                                    arrayList4.add(obj3);
                                }
                            }
                        }
                        size4 = arrayList4.size();
                        while (i17 < size4) {
                            C15012l c15012l6 = (C15012l) arrayList4.get(i17);
                            c18005l = (C18005l) c15012l6.yandex;
                            int i38 = c15012l6.loadAd;
                            int i39 = c15012l6.crashlytics;
                            weakHashMap2 = (WeakHashMap) c5991l.f12716l;
                            uRLSpan = weakHashMap2.get(c18005l);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(c18005l.yandex);
                                weakHashMap2.put(c18005l, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i38, i39, 33);
                        }
                        listYandex = c3625l2.yandex(str5.length());
                        size5 = listYandex.size();
                        while (i18 < size5) {
                            c15012l = (C15012l) listYandex.get(i18);
                            i19 = c15012l.loadAd;
                            obj = c15012l.yandex;
                            i20 = c15012l.crashlytics;
                            if (i19 != i20) {
                                abstractC12494l = (AbstractC12494l) obj;
                                if ((abstractC12494l instanceof C14754l) || ((C14754l) abstractC12494l).crashlytics != null) {
                                    weakHashMap = (WeakHashMap) c5991l.f12718l;
                                    c14607l = weakHashMap.get(c15012l);
                                    if (c14607l == null) {
                                        c14607l = new C14607l(abstractC12494l);
                                        weakHashMap.put(c15012l, c14607l);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c14607l, i19, i20, 33);
                                } else {
                                    C14754l c14754l = (C14754l) obj;
                                    C15012l c15012l7 = new C15012l(c14754l, i19, i20);
                                    WeakHashMap weakHashMap3 = (WeakHashMap) c5991l.f12715l;
                                    Object uRLSpan2 = weakHashMap3.get(c15012l7);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(c14754l.yandex);
                                        weakHashMap3.put(c15012l7, uRLSpan2);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan2, i19, i20, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) ViewOnAttachStateChangeListenerC9659l.m2708throw(spannableString3);
                        c15685l2 = c15685l7;
                    } else {
                        c13440l = c13440l;
                        c6264l2 = c6264l;
                        c6402l2 = c6402l;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        c13660l2 = c13660l;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        spannableString = null;
                        c15685l2 = c15685l;
                    }
                    c15685l2.tapsense(spannableString);
                    c4707l = AbstractC0424l.f1550throw;
                    c13660l3 = c13660l2;
                    if (c13660l3.crashlytics(c4707l)) {
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                        accessibilityNodeInfo5.setContentInvalid(true);
                        objMopub19 = c13660l3.mopub(c4707l);
                        if (objMopub19 == null) {
                            objMopub19 = null;
                        }
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setError((CharSequence) objMopub19);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                    }
                    strMetrica = AbstractC3292l.metrica(c18666l3, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC5121l.Signature(accessibilityNodeInfo4, strMetrica);
                    } else {
                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strMetrica);
                    }
                    accessibilityNodeInfo4.setCheckable(AbstractC3292l.vip(c18666l3));
                    objMopub2 = c13660l3.mopub(AbstractC0424l.f1546private);
                    if (objMopub2 == null) {
                        objMopub2 = null;
                    }
                    enumC13846l = (EnumC13846l) objMopub2;
                    if (enumC13846l != null) {
                        if (enumC13846l == EnumC13846l.f27083l) {
                            accessibilityNodeInfo4.setChecked(true);
                        } else if (enumC13846l == EnumC13846l.f27082l) {
                            accessibilityNodeInfo4.setChecked(false);
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    objMopub3 = c13660l3.mopub(AbstractC0424l.f1544native);
                    if (objMopub3 == null) {
                        objMopub3 = null;
                    }
                    bool = (Boolean) objMopub3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (c6402l2 == null) {
                            c6402l3 = c6402l2;
                            i6 = 4;
                        } else {
                            c6402l3 = c6402l2;
                            i6 = 4;
                            if (c6402l3.yandex == 4) {
                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                        Unit unit5 = Unit.INSTANCE;
                    } else {
                        c6402l3 = c6402l2;
                        i6 = 4;
                    }
                    c6264l3 = c6264l2;
                    if (c6264l3.f13223l || C18666l.isPro(i6, c18666l3).isEmpty()) {
                        objMopub4 = c13660l3.mopub(AbstractC0424l.yandex);
                        if (objMopub4 == null) {
                            objMopub4 = null;
                        }
                        list = (List) objMopub4;
                        if (list != null) {
                            str = (String) AbstractC16901l.m4217extends(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo5.setContentDescription(str);
                    }
                    objMopub5 = c13660l3.mopub(AbstractC0424l.signatures);
                    if (objMopub5 == null) {
                        objMopub5 = null;
                    }
                    str2 = (String) objMopub5;
                    if (str2 != null) {
                        c18666lSmaato3 = c18666l3;
                        while (true) {
                            if (c18666lSmaato3 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            c6264l4 = c18666lSmaato3.amazon;
                            c4707l5 = AbstractC1940l.yandex;
                            if (c6264l4.f13225l.crashlytics(c4707l5)) {
                                zBooleanValue = ((Boolean) c6264l4.mopub(c4707l5)).booleanValue();
                                break;
                            }
                            c18666lSmaato3 = c18666lSmaato3.smaato();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                        }
                    }
                    objMopub6 = c13660l3.mopub(AbstractC0424l.admob);
                    if (objMopub6 == null) {
                        objMopub6 = null;
                    }
                    if (((Unit) objMopub6) != null) {
                        c15685l2.remoteconfig(true);
                        Unit unit6 = Unit.INSTANCE;
                    }
                    objMopub7 = c13660l3.mopub(AbstractC0424l.subs);
                    if (objMopub7 == null) {
                        objMopub7 = null;
                    }
                    if (((Unit) objMopub7) != null) {
                        c15685l2.Signature();
                        Unit unit7 = Unit.INSTANCE;
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iAmazon3 = c13440l.amazon(c18666l3.billing);
                        if (iAmazon3 != -1) {
                            c15685l2.smaato(iAmazon3);
                            Unit unit8 = Unit.INSTANCE;
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo5.setPassword(c13660l3.crashlytics(AbstractC0424l.f1543for));
                    objMopub8 = c13660l3.mopub(AbstractC0424l.f1541else);
                    if (objMopub8 == null) {
                        objMopub8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo5.setEditable(AbstractC8576l.yandex(objMopub8, bool2));
                    objMopub9 = c13660l3.mopub(AbstractC0424l.f1539case);
                    if (objMopub9 == null) {
                        objMopub9 = null;
                    }
                    num = (Integer) objMopub9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo5.setEnabled(AbstractC3292l.loadAd(c18666l3));
                    c4707l2 = AbstractC0424l.smaato;
                    accessibilityNodeInfo5.setFocusable(c13660l3.crashlytics(c4707l2));
                    if (accessibilityNodeInfo5.isFocusable()) {
                        accessibilityNodeInfo5.setFocused(((Boolean) c6264l3.mopub(c4707l2)).booleanValue());
                        if (accessibilityNodeInfo5.isFocused()) {
                            c15685l2.yandex(2);
                            viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
                            viewOnAttachStateChangeListenerC9659l.f19732l = i7;
                        } else {
                            viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
                            z2 = true;
                            c15685l2.yandex(1);
                        }
                        accessibilityNodeInfo4.setVisibleToUser(AbstractC14425l.isPro(c18666l3) ^ z2);
                        if (c18666l3.metrica()) {
                            c18666lSmaato2 = c18666l3.smaato();
                        } else {
                            c18666lSmaato2 = c18666l3;
                        }
                        if (c18666lSmaato2.remoteconfig().firebase()) {
                            accessibilityNodeInfo4.setVisibleToUser(false);
                        }
                        objMopub10 = c13660l3.mopub(AbstractC0424l.firebase);
                        if (objMopub10 == null) {
                            objMopub10 = null;
                        }
                        c8223l = (C8223l) objMopub10;
                        if (c8223l != null) {
                            i14 = c8223l.yandex;
                            if (i14 == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                if (i14 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    i15 = 2;
                                } else {
                                    i15 = 1;
                                }
                            } else {
                                i15 = 1;
                            }
                            accessibilityNodeInfo5.setLiveRegion(i15);
                            Unit unit9 = Unit.INSTANCE;
                        }
                        accessibilityNodeInfo4.setClickable(false);
                        objMopub11 = c13660l3.mopub(AbstractC16601l.loadAd);
                        if (objMopub11 == null) {
                            objMopub11 = null;
                        }
                        c7629l = (C7629l) objMopub11;
                        c = 3;
                        if (c7629l != null) {
                            objMopub18 = c13660l3.mopub(AbstractC0424l.f1544native);
                            if (objMopub18 == null) {
                                objMopub18 = null;
                            }
                            boolean zYandex4 = AbstractC8576l.yandex(objMopub18, bool2);
                            if (c6402l3 == null && c6402l3.yandex == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                z13 = true;
                            } else {
                                if (c6402l3 == null && c6402l3.yandex == 3) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            if (z13 || (z13 && !zYandex4)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            accessibilityNodeInfo4.setClickable(z14);
                            if (AbstractC3292l.loadAd(c18666l3) && accessibilityNodeInfo5.isClickable()) {
                                c15685l2.loadAd(new C6933l(16, c7629l.yandex));
                            }
                            Unit unit10 = Unit.INSTANCE;
                        }
                        accessibilityNodeInfo4.setLongClickable(false);
                        objMopub12 = c13660l3.mopub(AbstractC16601l.crashlytics);
                        if (objMopub12 == null) {
                            objMopub12 = null;
                        }
                        c7629l2 = (C7629l) objMopub12;
                        if (c7629l2 != null) {
                            accessibilityNodeInfo4.setLongClickable(true);
                            if (AbstractC3292l.loadAd(c18666l3)) {
                                c15685l2.loadAd(new C6933l(32, c7629l2.yandex));
                            }
                            Unit unit11 = Unit.INSTANCE;
                        }
                        c7629l3 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.adcel);
                        if (c7629l3 != null) {
                            c15685l2.loadAd(new C6933l(16384, c7629l3.yandex));
                            Unit unit12 = Unit.INSTANCE;
                        }
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c7629l9 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.firebase);
                            if (c7629l9 != null) {
                                c15685l2.loadAd(new C6933l(2097152, c7629l9.yandex));
                                Unit unit13 = Unit.INSTANCE;
                            }
                            c7629l10 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.startapp);
                            if (c7629l10 != null) {
                                c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionImeEnter, c7629l10.yandex));
                                Unit unit14 = Unit.INSTANCE;
                            }
                            c7629l11 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.ads);
                            if (c7629l11 != null) {
                                c15685l2.loadAd(new C6933l(65536, c7629l11.yandex));
                                Unit unit15 = Unit.INSTANCE;
                            }
                            c7629l12 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.subscription);
                            if (c7629l12 != null) {
                                if (accessibilityNodeInfo5.isFocused()) {
                                    primaryClipDescription = ((C3633l) viewTreeObserverOnGlobalLayoutListenerC13840l2.getClipboardManager()).yandex().getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        zHasMimeType = false;
                                    }
                                    if (zHasMimeType) {
                                        c15685l2.loadAd(new C6933l(32768, c7629l12.yandex));
                                    }
                                }
                                Unit unit16 = Unit.INSTANCE;
                            }
                        }
                        strSubscription = ViewOnAttachStateChangeListenerC9659l.subscription(c18666l3);
                        if (strSubscription != null || strSubscription.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            accessibilityNodeInfo5.setTextSelection(viewOnAttachStateChangeListenerC9659l.adcel(c18666l3), viewOnAttachStateChangeListenerC9659l.startapp(c18666l3));
                            c7629l8 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.isPro);
                            if (c7629l8 != null) {
                                str4 = c7629l8.yandex;
                            } else {
                                str4 = null;
                            }
                            c15685l2.loadAd(new C6933l(131072, str4));
                            c15685l2.yandex(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            c15685l2.yandex(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                            accessibilityNodeInfo4.setMovementGranularities(11);
                            list3 = (List) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.yandex);
                            if (list3 != null || list3.isEmpty()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && c13660l3.crashlytics(AbstractC16601l.yandex)) {
                                if (c18666l3.amazon.f13225l.crashlytics(AbstractC0424l.f1545package)) {
                                    objMopub17 = c18666l3.amazon.f13225l.mopub(AbstractC0424l.smaato);
                                    if (objMopub17 == null) {
                                        objMopub17 = null;
                                    }
                                    if (!AbstractC8576l.yandex(objMopub17, Boolean.TRUE)) {
                                        c3654lLicense = c18666l3.crashlytics.license();
                                        while (true) {
                                            if (c3654lLicense == null) {
                                                c3654lLicense = null;
                                                break;
                                            }
                                            c6264lAdvert2 = c3654lLicense.advert();
                                            if (c6264lAdvert2 == null && c6264lAdvert2.f13223l) {
                                                if (c6264lAdvert2.f13225l.crashlytics(AbstractC0424l.f1545package)) {
                                                    break;
                                                }
                                            }
                                            c3654lLicense = c3654lLicense.license();
                                        }
                                        if (c3654lLicense != null) {
                                            c6264lAdvert = c3654lLicense.advert();
                                            if (c6264lAdvert != null) {
                                                objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                                if (objMopub16 == null) {
                                                    objMopub16 = null;
                                                }
                                                zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                            } else {
                                                zYandex = false;
                                            }
                                            z11 = zYandex ? false : true;
                                        }
                                    }
                                } else {
                                    c3654lLicense = c18666l3.crashlytics.license();
                                    while (true) {
                                        if (c3654lLicense == null) {
                                            c3654lLicense = null;
                                            break;
                                        }
                                        c6264lAdvert2 = c3654lLicense.advert();
                                        if (c6264lAdvert2 == null) {
                                        }
                                        c3654lLicense = c3654lLicense.license();
                                    }
                                    if (c3654lLicense != null) {
                                        c6264lAdvert = c3654lLicense.advert();
                                        if (c6264lAdvert != null) {
                                            objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                            if (objMopub16 == null) {
                                                objMopub16 = null;
                                            }
                                            zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                        } else {
                                            zYandex = false;
                                        }
                                        if (zYandex) {
                                        }
                                    }
                                }
                                if (!z11) {
                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList2 = new ArrayList();
                            arrayList2.add("androidx.compose.ui.semantics.id");
                            charSequenceBilling = c15685l2.billing();
                            if (charSequenceBilling != null || charSequenceBilling.length() == 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (!z9 && c13660l3.crashlytics(AbstractC16601l.yandex)) {
                                arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (c13660l3.crashlytics(AbstractC0424l.signatures)) {
                                arrayList2.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (c13660l3.crashlytics(AbstractC0424l.f1548switch)) {
                                AbstractC5020l.premium(arrayList2, "androidx.compose.ui.semantics.shapeType", "androidx.compose.ui.semantics.shapeRect", "androidx.compose.ui.semantics.shapeCorners", "androidx.compose.ui.semantics.shapeRegion");
                            }
                            c15685l2.admob(arrayList2);
                        }
                        c14519l = (C14519l) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.crashlytics);
                        if (c14519l != null) {
                            c12015l = c14519l.loadAd;
                            f = c14519l.yandex;
                            c4707l4 = AbstractC16601l.subs;
                            if (c13660l3.crashlytics(c4707l4)) {
                                c15685l2.isPro("android.widget.SeekBar");
                            } else {
                                c15685l2.isPro("android.widget.ProgressBar");
                            }
                            if (c14519l != C14519l.amazon) {
                                accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, c12015l.yandex, c12015l.loadAd, f));
                            }
                            if (c13660l3.crashlytics(c4707l4) && AbstractC3292l.loadAd(c18666l3)) {
                                f2 = c12015l.loadAd;
                                fFloatValue = ((Number) c12015l.yandex()).floatValue();
                                if (f2 < fFloatValue) {
                                    f2 = fFloatValue;
                                }
                                if (f < f2) {
                                    c15685l2.loadAd(C6933l.admob);
                                }
                                fFloatValue2 = ((Number) c12015l.yandex()).floatValue();
                                fFloatValue3 = Float.valueOf(c12015l.loadAd).floatValue();
                                if (fFloatValue2 > fFloatValue3) {
                                    fFloatValue2 = fFloatValue3;
                                }
                                if (f > fFloatValue2) {
                                    c15685l2.loadAd(C6933l.subs);
                                }
                            }
                        }
                        i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 24 && AbstractC3292l.loadAd(c18666l3)) {
                            objMopub15 = c18666l3.amazon.f13225l.mopub(AbstractC16601l.subs);
                            if (objMopub15 == null) {
                                objMopub15 = null;
                            }
                            c7629l7 = (C7629l) objMopub15;
                            if (c7629l7 != null) {
                                c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionSetProgress, c7629l7.yandex));
                            }
                        }
                        AbstractC0825l.remoteconfig(c15685l2, c18666l3);
                        AbstractC0825l.vip(c15685l2, c18666l3);
                        c11601l = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.license);
                        C7629l c7629l13 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.amazon);
                        if (c11601l != null && c7629l13 != null) {
                            objMopub13 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.billing);
                            if (objMopub13 == null) {
                                objMopub13 = null;
                            }
                            if (objMopub13 == null) {
                                objMopub14 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.purchase);
                                if (objMopub14 == null) {
                                    objMopub14 = null;
                                }
                                if (objMopub14 != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                z6 = true;
                            }
                            if (!z6) {
                                c15685l2.isPro("android.widget.HorizontalScrollView");
                            }
                            if (((Number) c11601l.loadAd.invoke()).floatValue() > 0.0f) {
                                c15685l2.ads(true);
                            }
                            if (AbstractC3292l.loadAd(c18666l3)) {
                                zAdvert = ViewOnAttachStateChangeListenerC9659l.advert(c11601l);
                                enumC9931l = EnumC9931l.f20222l;
                                if (zAdvert) {
                                    c15685l2.loadAd(C6933l.admob);
                                    c3654l = c3654l2;
                                    if (c3654l.f7691l == enumC9931l) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        c6933l2 = C6933l.adcel;
                                    } else {
                                        c6933l2 = C6933l.metrica;
                                    }
                                    c15685l2.loadAd(c6933l2);
                                } else {
                                    c3654l = c3654l2;
                                }
                                if (ViewOnAttachStateChangeListenerC9659l.ad(c11601l)) {
                                    c15685l2.loadAd(C6933l.subs);
                                    if (c3654l.f7691l == enumC9931l) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        c6933l = C6933l.metrica;
                                    } else {
                                        c6933l = C6933l.adcel;
                                    }
                                    c15685l2.loadAd(c6933l);
                                }
                            }
                        }
                        c11601l2 = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.pro);
                        if (c11601l2 != null || c7629l13 == null) {
                            z4 = true;
                        } else {
                            Object objMopub22 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.billing);
                            if (objMopub22 == null) {
                                objMopub22 = null;
                            }
                            if (objMopub22 == null) {
                                Object objMopub23 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.purchase);
                                if (objMopub23 == null) {
                                    objMopub23 = null;
                                }
                                if (objMopub23 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            } else {
                                z5 = true;
                            }
                            if (!z5) {
                                c15685l2.isPro("android.widget.ScrollView");
                            }
                            z4 = true;
                            if (((Number) c11601l2.loadAd.invoke()).floatValue() > 0.0f) {
                                c15685l2.ads(true);
                            }
                            if (AbstractC3292l.loadAd(c18666l3)) {
                                if (ViewOnAttachStateChangeListenerC9659l.advert(c11601l2)) {
                                    c15685l2.loadAd(C6933l.admob);
                                    c15685l2.loadAd(C6933l.startapp);
                                }
                                if (ViewOnAttachStateChangeListenerC9659l.ad(c11601l2)) {
                                    c15685l2.loadAd(C6933l.subs);
                                    c15685l2.loadAd(C6933l.vip);
                                }
                            }
                        }
                        if (i8 >= 29) {
                            AbstractC0079l.amazon(c15685l2, c18666l3);
                        }
                        c15685l2.startapp((CharSequence) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.amazon));
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c7629l4 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.tapsense);
                            if (c7629l4 != null) {
                                c15685l2.loadAd(new C6933l(262144, c7629l4.yandex));
                                Unit unit17 = Unit.INSTANCE;
                            }
                            c7629l5 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.Signature);
                            if (c7629l5 != null) {
                                c15685l2.loadAd(new C6933l(524288, c7629l5.yandex));
                                Unit unit18 = Unit.INSTANCE;
                            }
                            c7629l6 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.license);
                            if (c7629l6 != null) {
                                c15685l2.loadAd(new C6933l(1048576, c7629l6.yandex));
                                Unit unit19 = Unit.INSTANCE;
                            }
                            c6264lVip = c18666l3.vip();
                            c4707l3 = AbstractC16601l.ad;
                            if (c6264lVip.f13225l.crashlytics(AbstractC16601l.ad)) {
                                list2 = (List) c18666l3.vip().mopub(c4707l3);
                                size2 = list2.size();
                                c16761l = ViewOnAttachStateChangeListenerC9659l.f19703l;
                                i9 = c16761l.loadAd;
                                if (size2 < i9) {
                                    C8339l.smaato(AbstractC15560l.tapsense("Can't have more than ", i9, " custom actions for one widget"));
                                    return null;
                                }
                                C18152l c18152l4 = new C18152l(0);
                                C7661l c7661lYandex = AbstractC4785l.yandex();
                                c18152l3 = c18152l2;
                                if (AbstractC4918l.loadAd(c18152l3.f35537l, i7, c18152l3.f35539l) < 0) {
                                    z4 = false;
                                }
                                if (z4) {
                                    iArr = c16761l.yandex;
                                    i10 = c16761l.loadAd;
                                    iArrCopyOf = new int[16];
                                    i11 = 0;
                                    i12 = 0;
                                    while (i11 < i10) {
                                        int i40 = iArr[i11];
                                        char c2 = c;
                                        i13 = i12 + 1;
                                        int i41 = i10;
                                        if (iArrCopyOf.length < i13) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i12] = i40;
                                        i11++;
                                        i12 = i13;
                                        c = c2;
                                        i10 = i41;
                                    }
                                    arrayList = new ArrayList();
                                    if (list2.size() <= 0) {
                                        AbstractC12589l.m3424strictfp(list2.get(0));
                                        throw null;
                                    }
                                    if (arrayList.size() > 0) {
                                        AbstractC12589l.m3424strictfp(arrayList.get(0));
                                        if (i12 > 0) {
                                            int i42 = iArrCopyOf[0];
                                            throw null;
                                        }
                                        AbstractC13082l.amazon("Index must be between 0 and size");
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    AbstractC12589l.m3424strictfp(list2.get(0));
                                    c16761l.crashlytics(0);
                                    throw null;
                                }
                                viewOnAttachStateChangeListenerC9659l.f19740l.purchase(i7, c18152l4);
                                c18152l3.purchase(i7, c7661lYandex);
                            }
                        }
                        c15685l2.adcel(AbstractC3292l.crashlytics(c18666l3, resources));
                        iAmazon = viewOnAttachStateChangeListenerC9659l.f19729l.amazon(i7);
                        if (iAmazon != -1) {
                            androidViewsHandler2 = viewTreeObserverOnGlobalLayoutListenerC13840l2.getAndroidViewsHandler();
                            if (androidViewsHandler2 != null) {
                                abstractC0290lMopub2 = AbstractC4603l.mopub(androidViewsHandler2, iAmazon);
                            } else {
                                abstractC0290lMopub2 = null;
                            }
                            if (abstractC0290lMopub2 != null) {
                                accessibilityNodeInfo4.setTraversalBefore(abstractC0290lMopub2);
                                viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                                accessibilityNodeInfo4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC13840l, iAmazon);
                            }
                            viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19721l, null);
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                        }
                        iAmazon2 = viewOnAttachStateChangeListenerC9659l.f19739l.amazon(i7);
                        if (iAmazon2 != -1) {
                            androidViewsHandler = viewTreeObserverOnGlobalLayoutListenerC13840l.getAndroidViewsHandler();
                            if (androidViewsHandler != null) {
                                abstractC0290lMopub = AbstractC4603l.mopub(androidViewsHandler, iAmazon2);
                            } else {
                                abstractC0290lMopub = null;
                            }
                            if (abstractC0290lMopub != null) {
                                accessibilityNodeInfo4.setTraversalAfter(abstractC0290lMopub);
                                viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19733l, null);
                            }
                        }
                        str3 = (String) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC1940l.loadAd);
                        if (str3 != null) {
                            c15685l2.isPro(str3);
                            Unit unit20 = Unit.INSTANCE;
                        }
                    } else {
                        viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
                    }
                    z2 = true;
                    accessibilityNodeInfo4.setVisibleToUser(AbstractC14425l.isPro(c18666l3) ^ z2);
                    if (c18666l3.metrica()) {
                        c18666lSmaato2 = c18666l3.smaato();
                    } else {
                        c18666lSmaato2 = c18666l3;
                    }
                    if (c18666lSmaato2.remoteconfig().firebase()) {
                        accessibilityNodeInfo4.setVisibleToUser(false);
                    }
                    objMopub10 = c13660l3.mopub(AbstractC0424l.firebase);
                    if (objMopub10 == null) {
                        objMopub10 = null;
                    }
                    c8223l = (C8223l) objMopub10;
                    if (c8223l != null) {
                        i14 = c8223l.yandex;
                        if (i14 == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            if (i14 == 1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                i15 = 2;
                            } else {
                                i15 = 1;
                            }
                        } else {
                            i15 = 1;
                        }
                        accessibilityNodeInfo5.setLiveRegion(i15);
                        Unit unit21 = Unit.INSTANCE;
                    }
                    accessibilityNodeInfo4.setClickable(false);
                    objMopub11 = c13660l3.mopub(AbstractC16601l.loadAd);
                    if (objMopub11 == null) {
                        objMopub11 = null;
                    }
                    c7629l = (C7629l) objMopub11;
                    c = 3;
                    if (c7629l != null) {
                        objMopub18 = c13660l3.mopub(AbstractC0424l.f1544native);
                        if (objMopub18 == null) {
                            objMopub18 = null;
                        }
                        boolean zYandex5 = AbstractC8576l.yandex(objMopub18, bool2);
                        if (c6402l3 == null) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            z13 = true;
                        } else {
                            if (c6402l3 == null) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        accessibilityNodeInfo4.setClickable(z14);
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c15685l2.loadAd(new C6933l(16, c7629l.yandex));
                        }
                        Unit unit110 = Unit.INSTANCE;
                    }
                    accessibilityNodeInfo4.setLongClickable(false);
                    objMopub12 = c13660l3.mopub(AbstractC16601l.crashlytics);
                    if (objMopub12 == null) {
                        objMopub12 = null;
                    }
                    c7629l2 = (C7629l) objMopub12;
                    if (c7629l2 != null) {
                        accessibilityNodeInfo4.setLongClickable(true);
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c15685l2.loadAd(new C6933l(32, c7629l2.yandex));
                        }
                        Unit unit111 = Unit.INSTANCE;
                    }
                    c7629l3 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.adcel);
                    if (c7629l3 != null) {
                        c15685l2.loadAd(new C6933l(16384, c7629l3.yandex));
                        Unit unit112 = Unit.INSTANCE;
                    }
                    if (AbstractC3292l.loadAd(c18666l3)) {
                        c7629l9 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.firebase);
                        if (c7629l9 != null) {
                            c15685l2.loadAd(new C6933l(2097152, c7629l9.yandex));
                            Unit unit113 = Unit.INSTANCE;
                        }
                        c7629l10 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.startapp);
                        if (c7629l10 != null) {
                            c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionImeEnter, c7629l10.yandex));
                            Unit unit114 = Unit.INSTANCE;
                        }
                        c7629l11 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.ads);
                        if (c7629l11 != null) {
                            c15685l2.loadAd(new C6933l(65536, c7629l11.yandex));
                            Unit unit115 = Unit.INSTANCE;
                        }
                        c7629l12 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.subscription);
                        if (c7629l12 != null) {
                            if (accessibilityNodeInfo5.isFocused()) {
                                primaryClipDescription = ((C3633l) viewTreeObserverOnGlobalLayoutListenerC13840l2.getClipboardManager()).yandex().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    c15685l2.loadAd(new C6933l(32768, c7629l12.yandex));
                                }
                            }
                            Unit unit116 = Unit.INSTANCE;
                        }
                    }
                    strSubscription = ViewOnAttachStateChangeListenerC9659l.subscription(c18666l3);
                    if (strSubscription != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        accessibilityNodeInfo5.setTextSelection(viewOnAttachStateChangeListenerC9659l.adcel(c18666l3), viewOnAttachStateChangeListenerC9659l.startapp(c18666l3));
                        c7629l8 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.isPro);
                        if (c7629l8 != null) {
                            str4 = c7629l8.yandex;
                        } else {
                            str4 = null;
                        }
                        c15685l2.loadAd(new C6933l(131072, str4));
                        c15685l2.yandex(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        c15685l2.yandex(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                        accessibilityNodeInfo4.setMovementGranularities(11);
                        list3 = (List) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.yandex);
                        if (list3 != null) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (c18666l3.amazon.f13225l.crashlytics(AbstractC0424l.f1545package)) {
                                objMopub17 = c18666l3.amazon.f13225l.mopub(AbstractC0424l.smaato);
                                if (objMopub17 == null) {
                                    objMopub17 = null;
                                }
                                if (!AbstractC8576l.yandex(objMopub17, Boolean.TRUE)) {
                                    c3654lLicense = c18666l3.crashlytics.license();
                                    while (true) {
                                        if (c3654lLicense == null) {
                                            c3654lLicense = null;
                                            break;
                                        }
                                        c6264lAdvert2 = c3654lLicense.advert();
                                        if (c6264lAdvert2 == null) {
                                        }
                                        c3654lLicense = c3654lLicense.license();
                                    }
                                    if (c3654lLicense != null) {
                                        c6264lAdvert = c3654lLicense.advert();
                                        if (c6264lAdvert != null) {
                                            objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                            if (objMopub16 == null) {
                                                objMopub16 = null;
                                            }
                                            zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                        } else {
                                            zYandex = false;
                                        }
                                        if (zYandex) {
                                        }
                                    }
                                }
                            } else {
                                c3654lLicense = c18666l3.crashlytics.license();
                                while (true) {
                                    if (c3654lLicense == null) {
                                        c3654lLicense = null;
                                        break;
                                    }
                                    c6264lAdvert2 = c3654lLicense.advert();
                                    if (c6264lAdvert2 == null) {
                                    }
                                    c3654lLicense = c3654lLicense.license();
                                }
                                if (c3654lLicense != null) {
                                    c6264lAdvert = c3654lLicense.advert();
                                    if (c6264lAdvert != null) {
                                        objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                        if (objMopub16 == null) {
                                            objMopub16 = null;
                                        }
                                        zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                    } else {
                                        zYandex = false;
                                    }
                                    if (zYandex) {
                                    }
                                }
                            }
                            if (!z11) {
                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        arrayList2 = new ArrayList();
                        arrayList2.add("androidx.compose.ui.semantics.id");
                        charSequenceBilling = c15685l2.billing();
                        if (charSequenceBilling != null) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (!z9) {
                            arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (c13660l3.crashlytics(AbstractC0424l.signatures)) {
                            arrayList2.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (c13660l3.crashlytics(AbstractC0424l.f1548switch)) {
                            AbstractC5020l.premium(arrayList2, "androidx.compose.ui.semantics.shapeType", "androidx.compose.ui.semantics.shapeRect", "androidx.compose.ui.semantics.shapeCorners", "androidx.compose.ui.semantics.shapeRegion");
                        }
                        c15685l2.admob(arrayList2);
                    }
                    c14519l = (C14519l) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.crashlytics);
                    if (c14519l != null) {
                        c12015l = c14519l.loadAd;
                        f = c14519l.yandex;
                        c4707l4 = AbstractC16601l.subs;
                        if (c13660l3.crashlytics(c4707l4)) {
                            c15685l2.isPro("android.widget.SeekBar");
                        } else {
                            c15685l2.isPro("android.widget.ProgressBar");
                        }
                        if (c14519l != C14519l.amazon) {
                            accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, c12015l.yandex, c12015l.loadAd, f));
                        }
                        if (c13660l3.crashlytics(c4707l4)) {
                            f2 = c12015l.loadAd;
                            fFloatValue = ((Number) c12015l.yandex()).floatValue();
                            if (f2 < fFloatValue) {
                                f2 = fFloatValue;
                            }
                            if (f < f2) {
                                c15685l2.loadAd(C6933l.admob);
                            }
                            fFloatValue2 = ((Number) c12015l.yandex()).floatValue();
                            fFloatValue3 = Float.valueOf(c12015l.loadAd).floatValue();
                            if (fFloatValue2 > fFloatValue3) {
                                fFloatValue2 = fFloatValue3;
                            }
                            if (f > fFloatValue2) {
                                c15685l2.loadAd(C6933l.subs);
                            }
                        }
                    }
                    i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 24) {
                        objMopub15 = c18666l3.amazon.f13225l.mopub(AbstractC16601l.subs);
                        if (objMopub15 == null) {
                            objMopub15 = null;
                        }
                        c7629l7 = (C7629l) objMopub15;
                        if (c7629l7 != null) {
                            c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionSetProgress, c7629l7.yandex));
                        }
                    }
                    AbstractC0825l.remoteconfig(c15685l2, c18666l3);
                    AbstractC0825l.vip(c15685l2, c18666l3);
                    c11601l = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.license);
                    C7629l c7629l14 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.amazon);
                    if (c11601l != null) {
                        objMopub13 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.billing);
                        if (objMopub13 == null) {
                            objMopub13 = null;
                        }
                        if (objMopub13 == null) {
                            objMopub14 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.purchase);
                            if (objMopub14 == null) {
                                objMopub14 = null;
                            }
                            if (objMopub14 != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            z6 = true;
                        }
                        if (!z6) {
                            c15685l2.isPro("android.widget.HorizontalScrollView");
                        }
                        if (((Number) c11601l.loadAd.invoke()).floatValue() > 0.0f) {
                            c15685l2.ads(true);
                        }
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            zAdvert = ViewOnAttachStateChangeListenerC9659l.advert(c11601l);
                            enumC9931l = EnumC9931l.f20222l;
                            if (zAdvert) {
                                c15685l2.loadAd(C6933l.admob);
                                c3654l = c3654l2;
                                if (c3654l.f7691l == enumC9931l) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    c6933l2 = C6933l.adcel;
                                } else {
                                    c6933l2 = C6933l.metrica;
                                }
                                c15685l2.loadAd(c6933l2);
                            } else {
                                c3654l = c3654l2;
                            }
                            if (ViewOnAttachStateChangeListenerC9659l.ad(c11601l)) {
                                c15685l2.loadAd(C6933l.subs);
                                if (c3654l.f7691l == enumC9931l) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    c6933l = C6933l.metrica;
                                } else {
                                    c6933l = C6933l.adcel;
                                }
                                c15685l2.loadAd(c6933l);
                            }
                        }
                    }
                    c11601l2 = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.pro);
                    if (c11601l2 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (i8 >= 29) {
                        AbstractC0079l.amazon(c15685l2, c18666l3);
                    }
                    c15685l2.startapp((CharSequence) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.amazon));
                    if (AbstractC3292l.loadAd(c18666l3)) {
                        c7629l4 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.tapsense);
                        if (c7629l4 != null) {
                            c15685l2.loadAd(new C6933l(262144, c7629l4.yandex));
                            Unit unit117 = Unit.INSTANCE;
                        }
                        c7629l5 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.Signature);
                        if (c7629l5 != null) {
                            c15685l2.loadAd(new C6933l(524288, c7629l5.yandex));
                            Unit unit118 = Unit.INSTANCE;
                        }
                        c7629l6 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.license);
                        if (c7629l6 != null) {
                            c15685l2.loadAd(new C6933l(1048576, c7629l6.yandex));
                            Unit unit119 = Unit.INSTANCE;
                        }
                        c6264lVip = c18666l3.vip();
                        c4707l3 = AbstractC16601l.ad;
                        if (c6264lVip.f13225l.crashlytics(AbstractC16601l.ad)) {
                            list2 = (List) c18666l3.vip().mopub(c4707l3);
                            size2 = list2.size();
                            c16761l = ViewOnAttachStateChangeListenerC9659l.f19703l;
                            i9 = c16761l.loadAd;
                            if (size2 < i9) {
                                C8339l.smaato(AbstractC15560l.tapsense("Can't have more than ", i9, " custom actions for one widget"));
                                return null;
                            }
                            C18152l c18152l5 = new C18152l(0);
                            C7661l c7661lYandex2 = AbstractC4785l.yandex();
                            c18152l3 = c18152l2;
                            if (AbstractC4918l.loadAd(c18152l3.f35537l, i7, c18152l3.f35539l) < 0) {
                                z4 = false;
                            }
                            if (z4) {
                                iArr = c16761l.yandex;
                                i10 = c16761l.loadAd;
                                iArrCopyOf = new int[16];
                                i11 = 0;
                                i12 = 0;
                                while (i11 < i10) {
                                    int i43 = iArr[i11];
                                    char c3 = c;
                                    i13 = i12 + 1;
                                    int i44 = i10;
                                    if (iArrCopyOf.length < i13) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i12] = i43;
                                    i11++;
                                    i12 = i13;
                                    c = c3;
                                    i10 = i44;
                                }
                                arrayList = new ArrayList();
                                if (list2.size() <= 0) {
                                    AbstractC12589l.m3424strictfp(list2.get(0));
                                    throw null;
                                }
                                if (arrayList.size() > 0) {
                                    AbstractC12589l.m3424strictfp(arrayList.get(0));
                                    if (i12 > 0) {
                                        int i45 = iArrCopyOf[0];
                                        throw null;
                                    }
                                    AbstractC13082l.amazon("Index must be between 0 and size");
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                AbstractC12589l.m3424strictfp(list2.get(0));
                                c16761l.crashlytics(0);
                                throw null;
                            }
                            viewOnAttachStateChangeListenerC9659l.f19740l.purchase(i7, c18152l5);
                            c18152l3.purchase(i7, c7661lYandex2);
                        }
                    }
                    c15685l2.adcel(AbstractC3292l.crashlytics(c18666l3, resources));
                    iAmazon = viewOnAttachStateChangeListenerC9659l.f19729l.amazon(i7);
                    if (iAmazon != -1) {
                        androidViewsHandler2 = viewTreeObserverOnGlobalLayoutListenerC13840l2.getAndroidViewsHandler();
                        if (androidViewsHandler2 != null) {
                            abstractC0290lMopub2 = AbstractC4603l.mopub(androidViewsHandler2, iAmazon);
                        } else {
                            abstractC0290lMopub2 = null;
                        }
                        if (abstractC0290lMopub2 != null) {
                            accessibilityNodeInfo4.setTraversalBefore(abstractC0290lMopub2);
                            viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                            accessibilityNodeInfo4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC13840l, iAmazon);
                        }
                        viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19721l, null);
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                    }
                    iAmazon2 = viewOnAttachStateChangeListenerC9659l.f19739l.amazon(i7);
                    if (iAmazon2 != -1) {
                        androidViewsHandler = viewTreeObserverOnGlobalLayoutListenerC13840l.getAndroidViewsHandler();
                        if (androidViewsHandler != null) {
                            abstractC0290lMopub = AbstractC4603l.mopub(androidViewsHandler, iAmazon2);
                        } else {
                            abstractC0290lMopub = null;
                        }
                        if (abstractC0290lMopub != null) {
                            accessibilityNodeInfo4.setTraversalAfter(abstractC0290lMopub);
                            viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19733l, null);
                        }
                    }
                    str3 = (String) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC1940l.loadAd);
                    if (str3 != null) {
                        c15685l2.isPro(str3);
                        Unit unit22 = Unit.INSTANCE;
                    }
                } else if (Build.VERSION.SDK_INT >= 34 ? AbstractC5917l.ad(accessibilityManager2) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    c15685l = new C15685l(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC5917l.m1871strictfp(accessibilityNodeInfoObtain, zYandex3);
                    } else {
                        c15685l.subs(64, zYandex3);
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC13840l2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        c15685l.loadAd = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        c18666lSmaato = c18666l3.smaato();
                        if (c18666lSmaato != null) {
                            numValueOf = Integer.valueOf(c18666lSmaato.billing);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            AbstractC0081l.amazon("semanticsNode " + i + " has null parent");
                            C17132l.firebase();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC13840l2.getSemanticsOwner().yandex().billing) {
                            iIntValue = -1;
                        }
                        c15685l.loadAd = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC13840l2, iIntValue);
                    }
                    c15685l.crashlytics = i;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC13840l2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(viewOnAttachStateChangeListenerC9659l2.firebase(c13874l2));
                    c13440l = viewOnAttachStateChangeListenerC9659l2.f19731l;
                    c18152l = viewOnAttachStateChangeListenerC9659l2.f19719l;
                    resources = viewTreeObserverOnGlobalLayoutListenerC13840l2.getContext().getResources();
                    c15685l.isPro("android.view.View");
                    c6264l = c18666l3.amazon;
                    c13660l = c6264l.f13225l;
                    if (c13660l.crashlytics(AbstractC0424l.f1545package)) {
                        c15685l.isPro("android.widget.EditText");
                    }
                    if (c13660l.crashlytics(AbstractC0424l.applovin)) {
                        c15685l.isPro("android.widget.TextView");
                    }
                    objMopub = c13660l.mopub(AbstractC0424l.isVip);
                    if (objMopub == null) {
                        objMopub = null;
                    }
                    c6402l = (C6402l) objMopub;
                    if (c6402l != null) {
                        i32 = c6402l.yandex;
                        if (c18666l3.metrica()) {
                            accessibilityManager = accessibilityManager2;
                            i33 = 4;
                            c18152l2 = c18152l;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i33 = 4;
                            c18152l2 = c18152l;
                            if (C18666l.isPro(4, c18666l3).isEmpty()) {
                            }
                            Unit unit23 = Unit.INSTANCE;
                        }
                        if (i32 == i33) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i32 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strAdmob = AbstractC4603l.admob(i32);
                            if (i32 == 5) {
                                c15685l.isPro(strAdmob);
                            } else {
                                c15685l.isPro(strAdmob);
                            }
                        }
                        Unit unit24 = Unit.INSTANCE;
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c18152l2 = c18152l;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC13840l2.getContext().getPackageName());
                    c15685l.metrica(AbstractC14425l.firebase(c18666l3));
                    if (i2 >= 34) {
                        zAd = AbstractC5917l.ad(accessibilityManager);
                    } else {
                        zAd = true;
                    }
                    listIsPro = C18666l.isPro(4, c18666l3);
                    size = listIsPro.size();
                    z = zAd;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i310 = size;
                        c18666l = (C18666l) listIsPro.get(i4);
                        List list6 = listIsPro;
                        abstractC14183lAds = viewOnAttachStateChangeListenerC9659l2.ads();
                        int i311 = i4;
                        i31 = c18666l.billing;
                        if (!abstractC14183lAds.yandex(i31)) {
                            androidViewsHandler3 = viewTreeObserverOnGlobalLayoutListenerC13840l2.getAndroidViewsHandler();
                            if (androidViewsHandler3 != null) {
                                abstractC0290l = androidViewsHandler3.getLayoutNodeToHolder().get(c18666l.crashlytics);
                            } else {
                                abstractC0290l = null;
                            }
                            if (i31 != -1) {
                                if (abstractC0290l != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC0290l);
                                } else {
                                    c13874l = (C13874l) viewOnAttachStateChangeListenerC9659l2.ads().loadAd(i31);
                                    if (c13874l != null) {
                                        zYandex2 = false;
                                    } else {
                                        zYandex2 = false;
                                    }
                                    if (z) {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC13840l2, i31);
                                    } else {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC13840l2, i31);
                                    }
                                }
                                c13440l.billing(i31, i3);
                                i3++;
                            }
                        }
                        i4 = i311 + 1;
                        listIsPro = list6;
                        size = i310;
                    }
                    i5 = viewOnAttachStateChangeListenerC9659l2.f19736l;
                    accessibilityNodeInfo = c15685l.yandex;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c15685l.loadAd(C6933l.mopub);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c15685l.loadAd(C6933l.billing);
                    }
                    c3625lStartapp = AbstractC3292l.startapp(c18666l3);
                    if (c3625lStartapp != null) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l2.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC13840l2.getDensity();
                        c5991l = viewOnAttachStateChangeListenerC9659l2.f19704l;
                        String str6 = c3625lStartapp.f7563l;
                        list4 = c3625lStartapp.f7564l;
                        spannableString2 = new SpannableString(str6);
                        arrayList3 = c3625lStartapp.f7562l;
                        if (arrayList3 != null) {
                            size8 = arrayList3.size();
                            i25 = 0;
                            while (i25 < size8) {
                                int i312 = size8;
                                C15012l c15012l8 = (C15012l) arrayList3.get(i25);
                                ArrayList arrayList7 = arrayList3;
                                C14264l c14264l2 = (C14264l) c15012l8.yandex;
                                int i313 = i25;
                                i26 = c15012l8.loadAd;
                                i27 = c15012l8.crashlytics;
                                C6264l c6264l6 = c6264l;
                                C6402l c6402l5 = c6402l;
                                jLoadAd = c14264l2.yandex.loadAd();
                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfo;
                                C13660l c13660l5 = c13660l;
                                long j3 = c14264l2.loadAd;
                                c6886l = c14264l2.crashlytics;
                                c11617l = c14264l2.amazon;
                                c16810l = c14264l2.isPro;
                                C10537l c10537l2 = c14264l2.firebase;
                                AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfoObtain;
                                C15685l c15685l8 = c15685l;
                                j = c14264l2.smaato;
                                c9867l = c14264l2.remoteconfig;
                                interfaceC12750l = c14264l2.yandex;
                                C3625l c3625l3 = c3625lStartapp;
                                if (C9735l.crashlytics(jLoadAd, interfaceC12750l.loadAd())) {
                                    interfaceC12750l2 = interfaceC12750l;
                                } else {
                                    if (jLoadAd != 16) {
                                        c8245l = new C8245l(jLoadAd);
                                    } else {
                                        c8245l = C15368l.yandex;
                                    }
                                    interfaceC12750l2 = c8245l;
                                }
                                AbstractC9027l.purchase(spannableString2, interfaceC12750l2.loadAd(), i26, i27);
                                spannableString4 = spannableString2;
                                AbstractC9027l.billing(spannableString4, j3, density, i26, i27);
                                if (c6886l == null) {
                                    if (c6886l == null) {
                                        c6886l2 = C6886l.f14425l;
                                    } else {
                                        c6886l2 = c6886l;
                                    }
                                    if (c11617l != null) {
                                        i28 = c11617l.yandex;
                                    } else {
                                        i28 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(AbstractC15852l.loadAd(i28, c6886l2));
                                    i29 = 33;
                                    spannableString4.setSpan(styleSpan2, i26, i27, 33);
                                } else {
                                    if (c6886l == null) {
                                        c6886l2 = C6886l.f14425l;
                                    } else {
                                        c6886l2 = c6886l;
                                    }
                                    if (c11617l != null) {
                                        i28 = c11617l.yandex;
                                    } else {
                                        i28 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(AbstractC15852l.loadAd(i28, c6886l2));
                                    i29 = 33;
                                    spannableString4.setSpan(styleSpan3, i26, i27, 33);
                                }
                                if (c9867l != null) {
                                    i30 = c9867l.yandex;
                                    if ((i30 | 1) == i30) {
                                        spannableString4.setSpan(new UnderlineSpan(), i26, i27, i29);
                                    }
                                    if ((i30 | 2) == i30) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i26, i27, i29);
                                    }
                                }
                                if (c16810l != null) {
                                    spannableString4.setSpan(new ScaleXSpan(c16810l.yandex), i26, i27, i29);
                                }
                                AbstractC9027l.mopub(spannableString4, c10537l2, i26, i27);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(AbstractC12953l.startapp(j)), i26, i27, i29);
                                }
                                i25 = i313 + 1;
                                spannableString2 = spannableString4;
                                c3625lStartapp = c3625l3;
                                size8 = i312;
                                arrayList3 = arrayList7;
                                c6264l = c6264l6;
                                c6402l = c6402l5;
                                accessibilityNodeInfo = accessibilityNodeInfo8;
                                c13660l = c13660l5;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo9;
                                c15685l = c15685l8;
                            }
                        }
                        c6264l2 = c6264l;
                        c6402l2 = c6402l;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        c13660l2 = c13660l;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        C15685l c15685l9 = c15685l;
                        spannableString3 = spannableString2;
                        C3625l c3625l4 = c3625lStartapp;
                        int length3 = str6.length();
                        arrayList4 = C2580l.f5619l;
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size7 = list4.size();
                            for (i24 = 0; i24 < size7; i24++) {
                                Object obj4 = list4.get(i24);
                                c15012l3 = (C15012l) obj4;
                                if (!(c15012l3.yandex instanceof C3938l)) {
                                }
                            }
                        } else {
                            arrayList5 = arrayList4;
                        }
                        size3 = arrayList5.size();
                        for (i16 = 0; i16 < size3; i16++) {
                            C15012l c15012l9 = (C15012l) arrayList5.get(i16);
                            c3938l = (C3938l) c15012l9.yandex;
                            i22 = c15012l9.loadAd;
                            i23 = c15012l9.crashlytics;
                            if (c3938l instanceof C3938l) {
                                C18725l.billing();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(c3938l.yandex).build(), i22, i23, 33);
                        }
                        int length4 = str6.length();
                        if (list4 != null) {
                            arrayList4 = new ArrayList(list4.size());
                            size6 = list4.size();
                            for (i21 = 0; i21 < size6; i21++) {
                                Object obj5 = list4.get(i21);
                                c15012l2 = (C15012l) obj5;
                                if (!(c15012l2.yandex instanceof C18005l)) {
                                }
                            }
                        }
                        size4 = arrayList4.size();
                        for (i17 = 0; i17 < size4; i17++) {
                            C15012l c15012l10 = (C15012l) arrayList4.get(i17);
                            c18005l = (C18005l) c15012l10.yandex;
                            int i314 = c15012l10.loadAd;
                            int i315 = c15012l10.crashlytics;
                            weakHashMap2 = (WeakHashMap) c5991l.f12716l;
                            uRLSpan = weakHashMap2.get(c18005l);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(c18005l.yandex);
                                weakHashMap2.put(c18005l, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i314, i315, 33);
                        }
                        listYandex = c3625l4.yandex(str6.length());
                        size5 = listYandex.size();
                        for (i18 = 0; i18 < size5; i18++) {
                            c15012l = (C15012l) listYandex.get(i18);
                            i19 = c15012l.loadAd;
                            obj = c15012l.yandex;
                            i20 = c15012l.crashlytics;
                            if (i19 != i20) {
                                abstractC12494l = (AbstractC12494l) obj;
                                if (abstractC12494l instanceof C14754l) {
                                    weakHashMap = (WeakHashMap) c5991l.f12718l;
                                    c14607l = weakHashMap.get(c15012l);
                                    if (c14607l == null) {
                                        c14607l = new C14607l(abstractC12494l);
                                        weakHashMap.put(c15012l, c14607l);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c14607l, i19, i20, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) c5991l.f12718l;
                                    c14607l = weakHashMap.get(c15012l);
                                    if (c14607l == null) {
                                        c14607l = new C14607l(abstractC12494l);
                                        weakHashMap.put(c15012l, c14607l);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c14607l, i19, i20, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) ViewOnAttachStateChangeListenerC9659l.m2708throw(spannableString3);
                        c15685l2 = c15685l9;
                    } else {
                        c13440l = c13440l;
                        c6264l2 = c6264l;
                        c6402l2 = c6402l;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        c13660l2 = c13660l;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        spannableString = null;
                        c15685l2 = c15685l;
                    }
                    c15685l2.tapsense(spannableString);
                    c4707l = AbstractC0424l.f1550throw;
                    c13660l3 = c13660l2;
                    if (c13660l3.crashlytics(c4707l)) {
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                        accessibilityNodeInfo5.setContentInvalid(true);
                        objMopub19 = c13660l3.mopub(c4707l);
                        if (objMopub19 == null) {
                            objMopub19 = null;
                        }
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setError((CharSequence) objMopub19);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                    }
                    strMetrica = AbstractC3292l.metrica(c18666l3, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC5121l.Signature(accessibilityNodeInfo4, strMetrica);
                    } else {
                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strMetrica);
                    }
                    accessibilityNodeInfo4.setCheckable(AbstractC3292l.vip(c18666l3));
                    objMopub2 = c13660l3.mopub(AbstractC0424l.f1546private);
                    if (objMopub2 == null) {
                        objMopub2 = null;
                    }
                    enumC13846l = (EnumC13846l) objMopub2;
                    if (enumC13846l != null) {
                        if (enumC13846l == EnumC13846l.f27083l) {
                            accessibilityNodeInfo4.setChecked(true);
                        } else if (enumC13846l == EnumC13846l.f27082l) {
                            accessibilityNodeInfo4.setChecked(false);
                        }
                        Unit unit25 = Unit.INSTANCE;
                    }
                    objMopub3 = c13660l3.mopub(AbstractC0424l.f1544native);
                    if (objMopub3 == null) {
                        objMopub3 = null;
                    }
                    bool = (Boolean) objMopub3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (c6402l2 == null) {
                            c6402l3 = c6402l2;
                            i6 = 4;
                        } else {
                            c6402l3 = c6402l2;
                            i6 = 4;
                            if (c6402l3.yandex == 4) {
                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                            }
                            Unit unit26 = Unit.INSTANCE;
                        }
                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                        Unit unit27 = Unit.INSTANCE;
                    } else {
                        c6402l3 = c6402l2;
                        i6 = 4;
                    }
                    c6264l3 = c6264l2;
                    if (c6264l3.f13223l) {
                        objMopub4 = c13660l3.mopub(AbstractC0424l.yandex);
                        if (objMopub4 == null) {
                            objMopub4 = null;
                        }
                        list = (List) objMopub4;
                        if (list != null) {
                            str = (String) AbstractC16901l.m4217extends(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo5.setContentDescription(str);
                    } else {
                        objMopub4 = c13660l3.mopub(AbstractC0424l.yandex);
                        if (objMopub4 == null) {
                            objMopub4 = null;
                        }
                        list = (List) objMopub4;
                        if (list != null) {
                            str = (String) AbstractC16901l.m4217extends(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo5.setContentDescription(str);
                    }
                    objMopub5 = c13660l3.mopub(AbstractC0424l.signatures);
                    if (objMopub5 == null) {
                        objMopub5 = null;
                    }
                    str2 = (String) objMopub5;
                    if (str2 != null) {
                        c18666lSmaato3 = c18666l3;
                        while (true) {
                            if (c18666lSmaato3 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            c6264l4 = c18666lSmaato3.amazon;
                            c4707l5 = AbstractC1940l.yandex;
                            if (c6264l4.f13225l.crashlytics(c4707l5)) {
                                zBooleanValue = ((Boolean) c6264l4.mopub(c4707l5)).booleanValue();
                                break;
                            }
                            c18666lSmaato3 = c18666lSmaato3.smaato();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                        }
                    }
                    objMopub6 = c13660l3.mopub(AbstractC0424l.admob);
                    if (objMopub6 == null) {
                        objMopub6 = null;
                    }
                    if (((Unit) objMopub6) != null) {
                        c15685l2.remoteconfig(true);
                        Unit unit28 = Unit.INSTANCE;
                    }
                    objMopub7 = c13660l3.mopub(AbstractC0424l.subs);
                    if (objMopub7 == null) {
                        objMopub7 = null;
                    }
                    if (((Unit) objMopub7) != null) {
                        c15685l2.Signature();
                        Unit unit29 = Unit.INSTANCE;
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iAmazon3 = c13440l.amazon(c18666l3.billing);
                        if (iAmazon3 != -1) {
                            c15685l2.smaato(iAmazon3);
                            Unit unit30 = Unit.INSTANCE;
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo5.setPassword(c13660l3.crashlytics(AbstractC0424l.f1543for));
                    objMopub8 = c13660l3.mopub(AbstractC0424l.f1541else);
                    if (objMopub8 == null) {
                        objMopub8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo5.setEditable(AbstractC8576l.yandex(objMopub8, bool2));
                    objMopub9 = c13660l3.mopub(AbstractC0424l.f1539case);
                    if (objMopub9 == null) {
                        objMopub9 = null;
                    }
                    num = (Integer) objMopub9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo5.setEnabled(AbstractC3292l.loadAd(c18666l3));
                    c4707l2 = AbstractC0424l.smaato;
                    accessibilityNodeInfo5.setFocusable(c13660l3.crashlytics(c4707l2));
                    if (accessibilityNodeInfo5.isFocusable()) {
                        accessibilityNodeInfo5.setFocused(((Boolean) c6264l3.mopub(c4707l2)).booleanValue());
                        if (accessibilityNodeInfo5.isFocused()) {
                            c15685l2.yandex(2);
                            viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
                            viewOnAttachStateChangeListenerC9659l.f19732l = i7;
                        } else {
                            viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
                            z2 = true;
                            c15685l2.yandex(1);
                        }
                        accessibilityNodeInfo4.setVisibleToUser(AbstractC14425l.isPro(c18666l3) ^ z2);
                        if (c18666l3.metrica()) {
                            c18666lSmaato2 = c18666l3.smaato();
                        } else {
                            c18666lSmaato2 = c18666l3;
                        }
                        if (c18666lSmaato2.remoteconfig().firebase()) {
                            accessibilityNodeInfo4.setVisibleToUser(false);
                        }
                        objMopub10 = c13660l3.mopub(AbstractC0424l.firebase);
                        if (objMopub10 == null) {
                            objMopub10 = null;
                        }
                        c8223l = (C8223l) objMopub10;
                        if (c8223l != null) {
                            i14 = c8223l.yandex;
                            if (i14 == 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                i15 = 1;
                            } else {
                                if (i14 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    i15 = 2;
                                } else {
                                    i15 = 1;
                                }
                            }
                            accessibilityNodeInfo5.setLiveRegion(i15);
                            Unit unit210 = Unit.INSTANCE;
                        }
                        accessibilityNodeInfo4.setClickable(false);
                        objMopub11 = c13660l3.mopub(AbstractC16601l.loadAd);
                        if (objMopub11 == null) {
                            objMopub11 = null;
                        }
                        c7629l = (C7629l) objMopub11;
                        c = 3;
                        if (c7629l != null) {
                            objMopub18 = c13660l3.mopub(AbstractC0424l.f1544native);
                            if (objMopub18 == null) {
                                objMopub18 = null;
                            }
                            boolean zYandex6 = AbstractC8576l.yandex(objMopub18, bool2);
                            if (c6402l3 == null) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                z13 = true;
                            } else {
                                if (c6402l3 == null) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                if (z15) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            if (z13) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            accessibilityNodeInfo4.setClickable(z14);
                            if (AbstractC3292l.loadAd(c18666l3)) {
                                c15685l2.loadAd(new C6933l(16, c7629l.yandex));
                            }
                            Unit unit1110 = Unit.INSTANCE;
                        }
                        accessibilityNodeInfo4.setLongClickable(false);
                        objMopub12 = c13660l3.mopub(AbstractC16601l.crashlytics);
                        if (objMopub12 == null) {
                            objMopub12 = null;
                        }
                        c7629l2 = (C7629l) objMopub12;
                        if (c7629l2 != null) {
                            accessibilityNodeInfo4.setLongClickable(true);
                            if (AbstractC3292l.loadAd(c18666l3)) {
                                c15685l2.loadAd(new C6933l(32, c7629l2.yandex));
                            }
                            Unit unit1111 = Unit.INSTANCE;
                        }
                        c7629l3 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.adcel);
                        if (c7629l3 != null) {
                            c15685l2.loadAd(new C6933l(16384, c7629l3.yandex));
                            Unit unit1112 = Unit.INSTANCE;
                        }
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c7629l9 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.firebase);
                            if (c7629l9 != null) {
                                c15685l2.loadAd(new C6933l(2097152, c7629l9.yandex));
                                Unit unit1113 = Unit.INSTANCE;
                            }
                            c7629l10 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.startapp);
                            if (c7629l10 != null) {
                                c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionImeEnter, c7629l10.yandex));
                                Unit unit1114 = Unit.INSTANCE;
                            }
                            c7629l11 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.ads);
                            if (c7629l11 != null) {
                                c15685l2.loadAd(new C6933l(65536, c7629l11.yandex));
                                Unit unit1115 = Unit.INSTANCE;
                            }
                            c7629l12 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.subscription);
                            if (c7629l12 != null) {
                                if (accessibilityNodeInfo5.isFocused()) {
                                    primaryClipDescription = ((C3633l) viewTreeObserverOnGlobalLayoutListenerC13840l2.getClipboardManager()).yandex().getPrimaryClipDescription();
                                    if (primaryClipDescription != null) {
                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    } else {
                                        zHasMimeType = false;
                                    }
                                    if (zHasMimeType) {
                                        c15685l2.loadAd(new C6933l(32768, c7629l12.yandex));
                                    }
                                }
                                Unit unit1116 = Unit.INSTANCE;
                            }
                        }
                        strSubscription = ViewOnAttachStateChangeListenerC9659l.subscription(c18666l3);
                        if (strSubscription != null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            accessibilityNodeInfo5.setTextSelection(viewOnAttachStateChangeListenerC9659l.adcel(c18666l3), viewOnAttachStateChangeListenerC9659l.startapp(c18666l3));
                            c7629l8 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.isPro);
                            if (c7629l8 != null) {
                                str4 = c7629l8.yandex;
                            } else {
                                str4 = null;
                            }
                            c15685l2.loadAd(new C6933l(131072, str4));
                            c15685l2.yandex(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                            c15685l2.yandex(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                            accessibilityNodeInfo4.setMovementGranularities(11);
                            list3 = (List) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.yandex);
                            if (list3 != null) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                if (c18666l3.amazon.f13225l.crashlytics(AbstractC0424l.f1545package)) {
                                    objMopub17 = c18666l3.amazon.f13225l.mopub(AbstractC0424l.smaato);
                                    if (objMopub17 == null) {
                                        objMopub17 = null;
                                    }
                                    if (!AbstractC8576l.yandex(objMopub17, Boolean.TRUE)) {
                                        c3654lLicense = c18666l3.crashlytics.license();
                                        while (true) {
                                            if (c3654lLicense == null) {
                                                c3654lLicense = null;
                                                break;
                                            }
                                            c6264lAdvert2 = c3654lLicense.advert();
                                            if (c6264lAdvert2 == null) {
                                            }
                                            c3654lLicense = c3654lLicense.license();
                                        }
                                        if (c3654lLicense != null) {
                                            c6264lAdvert = c3654lLicense.advert();
                                            if (c6264lAdvert != null) {
                                                objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                                if (objMopub16 == null) {
                                                    objMopub16 = null;
                                                }
                                                zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                            } else {
                                                zYandex = false;
                                            }
                                            if (zYandex) {
                                            }
                                        }
                                    }
                                } else {
                                    c3654lLicense = c18666l3.crashlytics.license();
                                    while (true) {
                                        if (c3654lLicense == null) {
                                            c3654lLicense = null;
                                            break;
                                        }
                                        c6264lAdvert2 = c3654lLicense.advert();
                                        if (c6264lAdvert2 == null) {
                                        }
                                        c3654lLicense = c3654lLicense.license();
                                    }
                                    if (c3654lLicense != null) {
                                        c6264lAdvert = c3654lLicense.advert();
                                        if (c6264lAdvert != null) {
                                            objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                            if (objMopub16 == null) {
                                                objMopub16 = null;
                                            }
                                            zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                        } else {
                                            zYandex = false;
                                        }
                                        if (zYandex) {
                                        }
                                    }
                                }
                                if (!z11) {
                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            arrayList2 = new ArrayList();
                            arrayList2.add("androidx.compose.ui.semantics.id");
                            charSequenceBilling = c15685l2.billing();
                            if (charSequenceBilling != null) {
                                z9 = true;
                            } else {
                                z9 = true;
                            }
                            if (!z9) {
                                arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (c13660l3.crashlytics(AbstractC0424l.signatures)) {
                                arrayList2.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (c13660l3.crashlytics(AbstractC0424l.f1548switch)) {
                                AbstractC5020l.premium(arrayList2, "androidx.compose.ui.semantics.shapeType", "androidx.compose.ui.semantics.shapeRect", "androidx.compose.ui.semantics.shapeCorners", "androidx.compose.ui.semantics.shapeRegion");
                            }
                            c15685l2.admob(arrayList2);
                        }
                        c14519l = (C14519l) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.crashlytics);
                        if (c14519l != null) {
                            c12015l = c14519l.loadAd;
                            f = c14519l.yandex;
                            c4707l4 = AbstractC16601l.subs;
                            if (c13660l3.crashlytics(c4707l4)) {
                                c15685l2.isPro("android.widget.SeekBar");
                            } else {
                                c15685l2.isPro("android.widget.ProgressBar");
                            }
                            if (c14519l != C14519l.amazon) {
                                accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, c12015l.yandex, c12015l.loadAd, f));
                            }
                            if (c13660l3.crashlytics(c4707l4)) {
                                f2 = c12015l.loadAd;
                                fFloatValue = ((Number) c12015l.yandex()).floatValue();
                                if (f2 < fFloatValue) {
                                    f2 = fFloatValue;
                                }
                                if (f < f2) {
                                    c15685l2.loadAd(C6933l.admob);
                                }
                                fFloatValue2 = ((Number) c12015l.yandex()).floatValue();
                                fFloatValue3 = Float.valueOf(c12015l.loadAd).floatValue();
                                if (fFloatValue2 > fFloatValue3) {
                                    fFloatValue2 = fFloatValue3;
                                }
                                if (f > fFloatValue2) {
                                    c15685l2.loadAd(C6933l.subs);
                                }
                            }
                        }
                        i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 24) {
                            objMopub15 = c18666l3.amazon.f13225l.mopub(AbstractC16601l.subs);
                            if (objMopub15 == null) {
                                objMopub15 = null;
                            }
                            c7629l7 = (C7629l) objMopub15;
                            if (c7629l7 != null) {
                                c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionSetProgress, c7629l7.yandex));
                            }
                        }
                        AbstractC0825l.remoteconfig(c15685l2, c18666l3);
                        AbstractC0825l.vip(c15685l2, c18666l3);
                        c11601l = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.license);
                        C7629l c7629l15 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.amazon);
                        if (c11601l != null) {
                            objMopub13 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.billing);
                            if (objMopub13 == null) {
                                objMopub13 = null;
                            }
                            if (objMopub13 == null) {
                                objMopub14 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.purchase);
                                if (objMopub14 == null) {
                                    objMopub14 = null;
                                }
                                if (objMopub14 != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                z6 = true;
                            }
                            if (!z6) {
                                c15685l2.isPro("android.widget.HorizontalScrollView");
                            }
                            if (((Number) c11601l.loadAd.invoke()).floatValue() > 0.0f) {
                                c15685l2.ads(true);
                            }
                            if (AbstractC3292l.loadAd(c18666l3)) {
                                zAdvert = ViewOnAttachStateChangeListenerC9659l.advert(c11601l);
                                enumC9931l = EnumC9931l.f20222l;
                                if (zAdvert) {
                                    c15685l2.loadAd(C6933l.admob);
                                    c3654l = c3654l2;
                                    if (c3654l.f7691l == enumC9931l) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        c6933l2 = C6933l.metrica;
                                    } else {
                                        c6933l2 = C6933l.adcel;
                                    }
                                    c15685l2.loadAd(c6933l2);
                                } else {
                                    c3654l = c3654l2;
                                }
                                if (ViewOnAttachStateChangeListenerC9659l.ad(c11601l)) {
                                    c15685l2.loadAd(C6933l.subs);
                                    if (c3654l.f7691l == enumC9931l) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        c6933l = C6933l.adcel;
                                    } else {
                                        c6933l = C6933l.metrica;
                                    }
                                    c15685l2.loadAd(c6933l);
                                }
                            }
                        }
                        c11601l2 = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.pro);
                        if (c11601l2 != null) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (i8 >= 29) {
                            AbstractC0079l.amazon(c15685l2, c18666l3);
                        }
                        c15685l2.startapp((CharSequence) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.amazon));
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c7629l4 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.tapsense);
                            if (c7629l4 != null) {
                                c15685l2.loadAd(new C6933l(262144, c7629l4.yandex));
                                Unit unit1117 = Unit.INSTANCE;
                            }
                            c7629l5 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.Signature);
                            if (c7629l5 != null) {
                                c15685l2.loadAd(new C6933l(524288, c7629l5.yandex));
                                Unit unit1118 = Unit.INSTANCE;
                            }
                            c7629l6 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.license);
                            if (c7629l6 != null) {
                                c15685l2.loadAd(new C6933l(1048576, c7629l6.yandex));
                                Unit unit1119 = Unit.INSTANCE;
                            }
                            c6264lVip = c18666l3.vip();
                            c4707l3 = AbstractC16601l.ad;
                            if (c6264lVip.f13225l.crashlytics(AbstractC16601l.ad)) {
                                list2 = (List) c18666l3.vip().mopub(c4707l3);
                                size2 = list2.size();
                                c16761l = ViewOnAttachStateChangeListenerC9659l.f19703l;
                                i9 = c16761l.loadAd;
                                if (size2 < i9) {
                                    C8339l.smaato(AbstractC15560l.tapsense("Can't have more than ", i9, " custom actions for one widget"));
                                    return null;
                                }
                                C18152l c18152l6 = new C18152l(0);
                                C7661l c7661lYandex3 = AbstractC4785l.yandex();
                                c18152l3 = c18152l2;
                                if (AbstractC4918l.loadAd(c18152l3.f35537l, i7, c18152l3.f35539l) < 0) {
                                    z4 = false;
                                }
                                if (z4) {
                                    iArr = c16761l.yandex;
                                    i10 = c16761l.loadAd;
                                    iArrCopyOf = new int[16];
                                    i11 = 0;
                                    i12 = 0;
                                    while (i11 < i10) {
                                        int i46 = iArr[i11];
                                        char c4 = c;
                                        i13 = i12 + 1;
                                        int i47 = i10;
                                        if (iArrCopyOf.length < i13) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i12] = i46;
                                        i11++;
                                        i12 = i13;
                                        c = c4;
                                        i10 = i47;
                                    }
                                    arrayList = new ArrayList();
                                    if (list2.size() <= 0) {
                                        AbstractC12589l.m3424strictfp(list2.get(0));
                                        throw null;
                                    }
                                    if (arrayList.size() > 0) {
                                        AbstractC12589l.m3424strictfp(arrayList.get(0));
                                        if (i12 > 0) {
                                            int i48 = iArrCopyOf[0];
                                            throw null;
                                        }
                                        AbstractC13082l.amazon("Index must be between 0 and size");
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    AbstractC12589l.m3424strictfp(list2.get(0));
                                    c16761l.crashlytics(0);
                                    throw null;
                                }
                                viewOnAttachStateChangeListenerC9659l.f19740l.purchase(i7, c18152l6);
                                c18152l3.purchase(i7, c7661lYandex3);
                            }
                        }
                        c15685l2.adcel(AbstractC3292l.crashlytics(c18666l3, resources));
                        iAmazon = viewOnAttachStateChangeListenerC9659l.f19729l.amazon(i7);
                        if (iAmazon != -1) {
                            androidViewsHandler2 = viewTreeObserverOnGlobalLayoutListenerC13840l2.getAndroidViewsHandler();
                            if (androidViewsHandler2 != null) {
                                abstractC0290lMopub2 = AbstractC4603l.mopub(androidViewsHandler2, iAmazon);
                            } else {
                                abstractC0290lMopub2 = null;
                            }
                            if (abstractC0290lMopub2 != null) {
                                accessibilityNodeInfo4.setTraversalBefore(abstractC0290lMopub2);
                                viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                                accessibilityNodeInfo4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC13840l, iAmazon);
                            }
                            viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19721l, null);
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                        }
                        iAmazon2 = viewOnAttachStateChangeListenerC9659l.f19739l.amazon(i7);
                        if (iAmazon2 != -1) {
                            androidViewsHandler = viewTreeObserverOnGlobalLayoutListenerC13840l.getAndroidViewsHandler();
                            if (androidViewsHandler != null) {
                                abstractC0290lMopub = AbstractC4603l.mopub(androidViewsHandler, iAmazon2);
                            } else {
                                abstractC0290lMopub = null;
                            }
                            if (abstractC0290lMopub != null) {
                                accessibilityNodeInfo4.setTraversalAfter(abstractC0290lMopub);
                                viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19733l, null);
                            }
                        }
                        str3 = (String) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC1940l.loadAd);
                        if (str3 != null) {
                            c15685l2.isPro(str3);
                            Unit unit211 = Unit.INSTANCE;
                        }
                    } else {
                        viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
                    }
                    z2 = true;
                    accessibilityNodeInfo4.setVisibleToUser(AbstractC14425l.isPro(c18666l3) ^ z2);
                    if (c18666l3.metrica()) {
                        c18666lSmaato2 = c18666l3.smaato();
                    } else {
                        c18666lSmaato2 = c18666l3;
                    }
                    if (c18666lSmaato2.remoteconfig().firebase()) {
                        accessibilityNodeInfo4.setVisibleToUser(false);
                    }
                    objMopub10 = c13660l3.mopub(AbstractC0424l.firebase);
                    if (objMopub10 == null) {
                        objMopub10 = null;
                    }
                    c8223l = (C8223l) objMopub10;
                    if (c8223l != null) {
                        i14 = c8223l.yandex;
                        if (i14 == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            if (i14 == 1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                i15 = 2;
                            } else {
                                i15 = 1;
                            }
                        } else {
                            i15 = 1;
                        }
                        accessibilityNodeInfo5.setLiveRegion(i15);
                        Unit unit212 = Unit.INSTANCE;
                    }
                    accessibilityNodeInfo4.setClickable(false);
                    objMopub11 = c13660l3.mopub(AbstractC16601l.loadAd);
                    if (objMopub11 == null) {
                        objMopub11 = null;
                    }
                    c7629l = (C7629l) objMopub11;
                    c = 3;
                    if (c7629l != null) {
                        objMopub18 = c13660l3.mopub(AbstractC0424l.f1544native);
                        if (objMopub18 == null) {
                            objMopub18 = null;
                        }
                        boolean zYandex7 = AbstractC8576l.yandex(objMopub18, bool2);
                        if (c6402l3 == null) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            z13 = true;
                        } else {
                            if (c6402l3 == null) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        accessibilityNodeInfo4.setClickable(z14);
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c15685l2.loadAd(new C6933l(16, c7629l.yandex));
                        }
                        Unit unit11110 = Unit.INSTANCE;
                    }
                    accessibilityNodeInfo4.setLongClickable(false);
                    objMopub12 = c13660l3.mopub(AbstractC16601l.crashlytics);
                    if (objMopub12 == null) {
                        objMopub12 = null;
                    }
                    c7629l2 = (C7629l) objMopub12;
                    if (c7629l2 != null) {
                        accessibilityNodeInfo4.setLongClickable(true);
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            c15685l2.loadAd(new C6933l(32, c7629l2.yandex));
                        }
                        Unit unit11111 = Unit.INSTANCE;
                    }
                    c7629l3 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.adcel);
                    if (c7629l3 != null) {
                        c15685l2.loadAd(new C6933l(16384, c7629l3.yandex));
                        Unit unit11112 = Unit.INSTANCE;
                    }
                    if (AbstractC3292l.loadAd(c18666l3)) {
                        c7629l9 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.firebase);
                        if (c7629l9 != null) {
                            c15685l2.loadAd(new C6933l(2097152, c7629l9.yandex));
                            Unit unit11113 = Unit.INSTANCE;
                        }
                        c7629l10 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.startapp);
                        if (c7629l10 != null) {
                            c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionImeEnter, c7629l10.yandex));
                            Unit unit11114 = Unit.INSTANCE;
                        }
                        c7629l11 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.ads);
                        if (c7629l11 != null) {
                            c15685l2.loadAd(new C6933l(65536, c7629l11.yandex));
                            Unit unit11115 = Unit.INSTANCE;
                        }
                        c7629l12 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.subscription);
                        if (c7629l12 != null) {
                            if (accessibilityNodeInfo5.isFocused()) {
                                primaryClipDescription = ((C3633l) viewTreeObserverOnGlobalLayoutListenerC13840l2.getClipboardManager()).yandex().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    c15685l2.loadAd(new C6933l(32768, c7629l12.yandex));
                                }
                            }
                            Unit unit11116 = Unit.INSTANCE;
                        }
                    }
                    strSubscription = ViewOnAttachStateChangeListenerC9659l.subscription(c18666l3);
                    if (strSubscription != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        accessibilityNodeInfo5.setTextSelection(viewOnAttachStateChangeListenerC9659l.adcel(c18666l3), viewOnAttachStateChangeListenerC9659l.startapp(c18666l3));
                        c7629l8 = (C7629l) AbstractC13831l.crashlytics(c6264l3, AbstractC16601l.isPro);
                        if (c7629l8 != null) {
                            str4 = c7629l8.yandex;
                        } else {
                            str4 = null;
                        }
                        c15685l2.loadAd(new C6933l(131072, str4));
                        c15685l2.yandex(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        c15685l2.yandex(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
                        accessibilityNodeInfo4.setMovementGranularities(11);
                        list3 = (List) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.yandex);
                        if (list3 != null) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (c18666l3.amazon.f13225l.crashlytics(AbstractC0424l.f1545package)) {
                                objMopub17 = c18666l3.amazon.f13225l.mopub(AbstractC0424l.smaato);
                                if (objMopub17 == null) {
                                    objMopub17 = null;
                                }
                                if (!AbstractC8576l.yandex(objMopub17, Boolean.TRUE)) {
                                    c3654lLicense = c18666l3.crashlytics.license();
                                    while (true) {
                                        if (c3654lLicense == null) {
                                            c3654lLicense = null;
                                            break;
                                        }
                                        c6264lAdvert2 = c3654lLicense.advert();
                                        if (c6264lAdvert2 == null) {
                                        }
                                        c3654lLicense = c3654lLicense.license();
                                    }
                                    if (c3654lLicense != null) {
                                        c6264lAdvert = c3654lLicense.advert();
                                        if (c6264lAdvert != null) {
                                            objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                            if (objMopub16 == null) {
                                                objMopub16 = null;
                                            }
                                            zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                        } else {
                                            zYandex = false;
                                        }
                                        if (zYandex) {
                                        }
                                    }
                                }
                            } else {
                                c3654lLicense = c18666l3.crashlytics.license();
                                while (true) {
                                    if (c3654lLicense == null) {
                                        c3654lLicense = null;
                                        break;
                                    }
                                    c6264lAdvert2 = c3654lLicense.advert();
                                    if (c6264lAdvert2 == null) {
                                    }
                                    c3654lLicense = c3654lLicense.license();
                                }
                                if (c3654lLicense != null) {
                                    c6264lAdvert = c3654lLicense.advert();
                                    if (c6264lAdvert != null) {
                                        objMopub16 = c6264lAdvert.f13225l.mopub(AbstractC0424l.smaato);
                                        if (objMopub16 == null) {
                                            objMopub16 = null;
                                        }
                                        zYandex = AbstractC8576l.yandex(objMopub16, Boolean.TRUE);
                                    } else {
                                        zYandex = false;
                                    }
                                    if (zYandex) {
                                    }
                                }
                            }
                            if (!z11) {
                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        arrayList2 = new ArrayList();
                        arrayList2.add("androidx.compose.ui.semantics.id");
                        charSequenceBilling = c15685l2.billing();
                        if (charSequenceBilling != null) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (!z9) {
                            arrayList2.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (c13660l3.crashlytics(AbstractC0424l.signatures)) {
                            arrayList2.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (c13660l3.crashlytics(AbstractC0424l.f1548switch)) {
                            AbstractC5020l.premium(arrayList2, "androidx.compose.ui.semantics.shapeType", "androidx.compose.ui.semantics.shapeRect", "androidx.compose.ui.semantics.shapeCorners", "androidx.compose.ui.semantics.shapeRegion");
                        }
                        c15685l2.admob(arrayList2);
                    }
                    c14519l = (C14519l) AbstractC13831l.crashlytics(c6264l3, AbstractC0424l.crashlytics);
                    if (c14519l != null) {
                        c12015l = c14519l.loadAd;
                        f = c14519l.yandex;
                        c4707l4 = AbstractC16601l.subs;
                        if (c13660l3.crashlytics(c4707l4)) {
                            c15685l2.isPro("android.widget.SeekBar");
                        } else {
                            c15685l2.isPro("android.widget.ProgressBar");
                        }
                        if (c14519l != C14519l.amazon) {
                            accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, c12015l.yandex, c12015l.loadAd, f));
                        }
                        if (c13660l3.crashlytics(c4707l4)) {
                            f2 = c12015l.loadAd;
                            fFloatValue = ((Number) c12015l.yandex()).floatValue();
                            if (f2 < fFloatValue) {
                                f2 = fFloatValue;
                            }
                            if (f < f2) {
                                c15685l2.loadAd(C6933l.admob);
                            }
                            fFloatValue2 = ((Number) c12015l.yandex()).floatValue();
                            fFloatValue3 = Float.valueOf(c12015l.loadAd).floatValue();
                            if (fFloatValue2 > fFloatValue3) {
                                fFloatValue2 = fFloatValue3;
                            }
                            if (f > fFloatValue2) {
                                c15685l2.loadAd(C6933l.subs);
                            }
                        }
                    }
                    i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 24) {
                        objMopub15 = c18666l3.amazon.f13225l.mopub(AbstractC16601l.subs);
                        if (objMopub15 == null) {
                            objMopub15 = null;
                        }
                        c7629l7 = (C7629l) objMopub15;
                        if (c7629l7 != null) {
                            c15685l2.loadAd(new C6933l(android.R.id.accessibilityActionSetProgress, c7629l7.yandex));
                        }
                    }
                    AbstractC0825l.remoteconfig(c15685l2, c18666l3);
                    AbstractC0825l.vip(c15685l2, c18666l3);
                    c11601l = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.license);
                    C7629l c7629l16 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.amazon);
                    if (c11601l != null) {
                        objMopub13 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.billing);
                        if (objMopub13 == null) {
                            objMopub13 = null;
                        }
                        if (objMopub13 == null) {
                            objMopub14 = c18666l3.firebase().f13225l.mopub(AbstractC0424l.purchase);
                            if (objMopub14 == null) {
                                objMopub14 = null;
                            }
                            if (objMopub14 != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        } else {
                            z6 = true;
                        }
                        if (!z6) {
                            c15685l2.isPro("android.widget.HorizontalScrollView");
                        }
                        if (((Number) c11601l.loadAd.invoke()).floatValue() > 0.0f) {
                            c15685l2.ads(true);
                        }
                        if (AbstractC3292l.loadAd(c18666l3)) {
                            zAdvert = ViewOnAttachStateChangeListenerC9659l.advert(c11601l);
                            enumC9931l = EnumC9931l.f20222l;
                            if (zAdvert) {
                                c15685l2.loadAd(C6933l.admob);
                                c3654l = c3654l2;
                                if (c3654l.f7691l == enumC9931l) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    c6933l2 = C6933l.adcel;
                                } else {
                                    c6933l2 = C6933l.metrica;
                                }
                                c15685l2.loadAd(c6933l2);
                            } else {
                                c3654l = c3654l2;
                            }
                            if (ViewOnAttachStateChangeListenerC9659l.ad(c11601l)) {
                                c15685l2.loadAd(C6933l.subs);
                                if (c3654l.f7691l == enumC9931l) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    c6933l = C6933l.metrica;
                                } else {
                                    c6933l = C6933l.adcel;
                                }
                                c15685l2.loadAd(c6933l);
                            }
                        }
                    }
                    c11601l2 = (C11601l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.pro);
                    if (c11601l2 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (i8 >= 29) {
                        AbstractC0079l.amazon(c15685l2, c18666l3);
                    }
                    c15685l2.startapp((CharSequence) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC0424l.amazon));
                    if (AbstractC3292l.loadAd(c18666l3)) {
                        c7629l4 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.tapsense);
                        if (c7629l4 != null) {
                            c15685l2.loadAd(new C6933l(262144, c7629l4.yandex));
                            Unit unit11117 = Unit.INSTANCE;
                        }
                        c7629l5 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.Signature);
                        if (c7629l5 != null) {
                            c15685l2.loadAd(new C6933l(524288, c7629l5.yandex));
                            Unit unit11118 = Unit.INSTANCE;
                        }
                        c7629l6 = (C7629l) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC16601l.license);
                        if (c7629l6 != null) {
                            c15685l2.loadAd(new C6933l(1048576, c7629l6.yandex));
                            Unit unit11119 = Unit.INSTANCE;
                        }
                        c6264lVip = c18666l3.vip();
                        c4707l3 = AbstractC16601l.ad;
                        if (c6264lVip.f13225l.crashlytics(AbstractC16601l.ad)) {
                            list2 = (List) c18666l3.vip().mopub(c4707l3);
                            size2 = list2.size();
                            c16761l = ViewOnAttachStateChangeListenerC9659l.f19703l;
                            i9 = c16761l.loadAd;
                            if (size2 < i9) {
                                C8339l.smaato(AbstractC15560l.tapsense("Can't have more than ", i9, " custom actions for one widget"));
                                return null;
                            }
                            C18152l c18152l7 = new C18152l(0);
                            C7661l c7661lYandex4 = AbstractC4785l.yandex();
                            c18152l3 = c18152l2;
                            if (AbstractC4918l.loadAd(c18152l3.f35537l, i7, c18152l3.f35539l) < 0) {
                                z4 = false;
                            }
                            if (z4) {
                                iArr = c16761l.yandex;
                                i10 = c16761l.loadAd;
                                iArrCopyOf = new int[16];
                                i11 = 0;
                                i12 = 0;
                                while (i11 < i10) {
                                    int i49 = iArr[i11];
                                    char c5 = c;
                                    i13 = i12 + 1;
                                    int i410 = i10;
                                    if (iArrCopyOf.length < i13) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i12] = i49;
                                    i11++;
                                    i12 = i13;
                                    c = c5;
                                    i10 = i410;
                                }
                                arrayList = new ArrayList();
                                if (list2.size() <= 0) {
                                    AbstractC12589l.m3424strictfp(list2.get(0));
                                    throw null;
                                }
                                if (arrayList.size() > 0) {
                                    AbstractC12589l.m3424strictfp(arrayList.get(0));
                                    if (i12 > 0) {
                                        int i411 = iArrCopyOf[0];
                                        throw null;
                                    }
                                    AbstractC13082l.amazon("Index must be between 0 and size");
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                AbstractC12589l.m3424strictfp(list2.get(0));
                                c16761l.crashlytics(0);
                                throw null;
                            }
                            viewOnAttachStateChangeListenerC9659l.f19740l.purchase(i7, c18152l7);
                            c18152l3.purchase(i7, c7661lYandex4);
                        }
                    }
                    c15685l2.adcel(AbstractC3292l.crashlytics(c18666l3, resources));
                    iAmazon = viewOnAttachStateChangeListenerC9659l.f19729l.amazon(i7);
                    if (iAmazon != -1) {
                        androidViewsHandler2 = viewTreeObserverOnGlobalLayoutListenerC13840l2.getAndroidViewsHandler();
                        if (androidViewsHandler2 != null) {
                            abstractC0290lMopub2 = AbstractC4603l.mopub(androidViewsHandler2, iAmazon);
                        } else {
                            abstractC0290lMopub2 = null;
                        }
                        if (abstractC0290lMopub2 != null) {
                            accessibilityNodeInfo4.setTraversalBefore(abstractC0290lMopub2);
                            viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                            accessibilityNodeInfo4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC13840l, iAmazon);
                        }
                        viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19721l, null);
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC13840l = viewTreeObserverOnGlobalLayoutListenerC13840l2;
                    }
                    iAmazon2 = viewOnAttachStateChangeListenerC9659l.f19739l.amazon(i7);
                    if (iAmazon2 != -1) {
                        androidViewsHandler = viewTreeObserverOnGlobalLayoutListenerC13840l.getAndroidViewsHandler();
                        if (androidViewsHandler != null) {
                            abstractC0290lMopub = AbstractC4603l.mopub(androidViewsHandler, iAmazon2);
                        } else {
                            abstractC0290lMopub = null;
                        }
                        if (abstractC0290lMopub != null) {
                            accessibilityNodeInfo4.setTraversalAfter(abstractC0290lMopub);
                            viewOnAttachStateChangeListenerC9659l.isPro(i7, c15685l2, viewOnAttachStateChangeListenerC9659l.f19733l, null);
                        }
                    }
                    str3 = (String) AbstractC13831l.crashlytics(c18666l3.vip(), AbstractC1940l.loadAd);
                    if (str3 != null) {
                        c15685l2.isPro(str3);
                        Unit unit213 = Unit.INSTANCE;
                    }
                } else {
                    viewOnAttachStateChangeListenerC9659l = viewOnAttachStateChangeListenerC9659l2;
                    i7 = i;
                    c15685l2 = null;
                }
            }
        }
        if (viewOnAttachStateChangeListenerC9659l.f19726l) {
            if (i7 == viewOnAttachStateChangeListenerC9659l.f19736l) {
                viewOnAttachStateChangeListenerC9659l.f19708l = c15685l2;
            }
            if (i7 == viewOnAttachStateChangeListenerC9659l.f19732l) {
                viewOnAttachStateChangeListenerC9659l.f19738l = c15685l2;
            }
        }
        return c15685l2;
    }
}
