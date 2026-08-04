package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11727l extends AbstractC6641l {

    /* JADX INFO: renamed from: lًؕۥ, reason: contains not printable characters */
    public static final int[] f23465l = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: lؚ۟, reason: contains not printable characters */
    public static boolean f23466l;

    /* JADX INFO: renamed from: lَۢ۠, reason: contains not printable characters */
    public static boolean f23467l;

    /* JADX INFO: renamed from: lؑٔؑ, reason: contains not printable characters */
    public Surface f23468l;

    /* JADX INFO: renamed from: lٖؑؓ, reason: contains not printable characters */
    public final boolean f23469l;

    /* JADX INFO: renamed from: lٜؑۨ, reason: contains not printable characters */
    public int f23470l;

    /* JADX INFO: renamed from: lُؙؓ, reason: contains not printable characters */
    public C15074l f23471l;

    /* JADX INFO: renamed from: lًُؓ, reason: contains not printable characters */
    public boolean f23472l;

    /* JADX INFO: renamed from: lٕؓ۠, reason: contains not printable characters */
    public int f23473l;

    /* JADX INFO: renamed from: lْؕٚ, reason: contains not printable characters */
    public C5989l f23474l;

    /* JADX INFO: renamed from: lؕٛۤ, reason: contains not printable characters */
    public long f23475l;

    /* JADX INFO: renamed from: lٕؕٝ, reason: contains not printable characters */
    public final Context f23476l;

    /* JADX INFO: renamed from: lؘؐؕ, reason: contains not printable characters */
    public boolean f23477l;

    /* JADX INFO: renamed from: lؘؐۖ, reason: contains not printable characters */
    public int f23478l;

    /* JADX INFO: renamed from: lؘٓٞ, reason: contains not printable characters */
    public long f23479l;

    /* JADX INFO: renamed from: lٍؙ۟, reason: contains not printable characters */
    public final C0458l f23480l;

    /* JADX INFO: renamed from: lؙ۟ۧ, reason: contains not printable characters */
    public final long f23481l;

    /* JADX INFO: renamed from: lؙۤؖ, reason: contains not printable characters */
    public final C3535l f23482l;

    /* JADX INFO: renamed from: lؙۨۙ, reason: contains not printable characters */
    public C13214l f23483l;

    /* JADX INFO: renamed from: lؚؚٗ, reason: contains not printable characters */
    public int f23484l;

    /* JADX INFO: renamed from: lؚٓۘ, reason: contains not printable characters */
    public int f23485l;

    /* JADX INFO: renamed from: lًؚٚ, reason: contains not printable characters */
    public long f23486l;

    /* JADX INFO: renamed from: lؚۣؓ, reason: contains not printable characters */
    public List f23487l;

    /* JADX INFO: renamed from: lًؘؐ, reason: contains not printable characters */
    public final C8887l f23488l;

    /* JADX INFO: renamed from: lً۟ۛ, reason: contains not printable characters */
    public C15380l f23489l;

    /* JADX INFO: renamed from: lٌؗۢ, reason: contains not printable characters */
    public boolean f23490l;

    /* JADX INFO: renamed from: lٌؙُ, reason: contains not printable characters */
    public boolean f23491l;

    /* JADX INFO: renamed from: lٌٕۥ, reason: contains not printable characters */
    public C13829l f23492l;

    /* JADX INFO: renamed from: lٍٍؐ, reason: contains not printable characters */
    public long f23493l;

    /* JADX INFO: renamed from: lٍٗٛ, reason: contains not printable characters */
    public long f23494l;

    /* JADX INFO: renamed from: lٍؚٞ, reason: contains not printable characters */
    public boolean f23495l;

    /* JADX INFO: renamed from: lُۢۧ, reason: contains not printable characters */
    public final int f23496l;

    /* JADX INFO: renamed from: lِؗٚ, reason: contains not printable characters */
    public int f23497l;

    /* JADX INFO: renamed from: lُِۤ, reason: contains not printable characters */
    public final C7578l f23498l;

    /* JADX INFO: renamed from: lؙِۜ, reason: contains not printable characters */
    public int f23499l;

    /* JADX INFO: renamed from: lؙٓؔ, reason: contains not printable characters */
    public C15074l f23500l;

    /* JADX INFO: renamed from: lَٓؗ, reason: contains not printable characters */
    public boolean f23501l;

    /* JADX INFO: renamed from: lٓٔۙ, reason: contains not printable characters */
    public InterfaceC15310l f23502l;

    /* JADX INFO: renamed from: lٕٓۛ, reason: contains not printable characters */
    public int f23503l;

    /* JADX INFO: renamed from: lْٓٝ, reason: contains not printable characters */
    public long f23504l;

    /* JADX INFO: renamed from: lٟٓؗ, reason: contains not printable characters */
    public boolean f23505l;

    /* JADX INFO: renamed from: lٌٔؕ, reason: contains not printable characters */
    public InterfaceC9433l f23506l;

    /* JADX INFO: renamed from: lٔۚٗ, reason: contains not printable characters */
    public C2119l f23507l;

    /* JADX INFO: renamed from: lُٔۡ, reason: contains not printable characters */
    public final C13645l f23508l;

    /* JADX INFO: renamed from: lٔۨؐ, reason: contains not printable characters */
    public int f23509l;

    /* JADX INFO: renamed from: lٕٔۚ, reason: contains not printable characters */
    public final boolean f23510l;

    /* JADX INFO: renamed from: lٗۚؓ, reason: contains not printable characters */
    public int f23511l;

    /* JADX INFO: renamed from: l٘ۙۜ, reason: contains not printable characters */
    public final PriorityQueue f23512l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C11727l(C16265l c16265l) {
        Context context = c16265l.yandex;
        super(context.getApplicationContext(), 2, c16265l.crashlytics, c16265l.purchase, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f23476l = applicationContext;
        this.f23496l = c16265l.admob;
        this.f23506l = null;
        this.f23508l = new C13645l(c16265l.billing, c16265l.mopub);
        this.f23510l = this.f23506l == null;
        this.f23498l = new C7578l(applicationContext, this, c16265l.amazon);
        this.f23482l = new C3535l();
        this.f23469l = "NVIDIA".equals(Build.MANUFACTURER);
        this.f23474l = C5989l.crashlytics;
        this.f23473l = 1;
        this.f23503l = 0;
        this.f23500l = C15074l.amazon;
        this.f23478l = 0;
        this.f23471l = null;
        this.f23484l = -1000;
        this.f23479l = -9223372036854775807L;
        this.f23493l = -9223372036854775807L;
        this.f23480l = new C0458l(8);
        this.f23512l = new PriorityQueue();
        this.f23481l = -15000L;
        this.f23488l = new C8887l();
        this.f23492l = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public static int m3220l(C6403l c6403l, C5978l c5978l) {
        int i = c5978l.license;
        int i2 = c5978l.pro;
        if (i != -1 && i2 != -1) {
            String str = c5978l.metrica;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairLoadAd = AbstractC14501l.loadAd(c5978l);
                if (pairLoadAd == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairLoadAd.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c6403l.billing)))) {
                        return ((AbstractC15323l.mopub(i2, 16) * AbstractC15323l.mopub(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public static int m3221l(C6403l c6403l, C5978l c5978l) {
        int i = c5978l.startapp;
        List list = c5978l.ads;
        if (i == -1) {
            return m3220l(c6403l, c5978l);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return c5978l.startapp + length;
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public static List m3222l(Context context, C3010l c3010l, C5978l c5978l, boolean z, boolean z2) {
        String str = c5978l.metrica;
        if (str == null) {
            return C13708l.f26763l;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC5941l.ads(context)) {
            String strCrashlytics = AbstractC4727l.crashlytics(c5978l);
            List listYandex = strCrashlytics == null ? C13708l.f26763l : c3010l.yandex(strCrashlytics, z, z2);
            if (!listYandex.isEmpty()) {
                return listYandex;
            }
        }
        return AbstractC4727l.mopub(c3010l, c5978l, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public static boolean m3223l(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C11727l.class) {
            try {
                if (!f23467l) {
                    int i = Build.VERSION.SDK_INT;
                    byte b3 = 28;
                    if (i <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b3 = 3;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b3 = 4;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b3 = 5;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b3 = 6;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b3 = 7;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b3 = 8;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b3 = 9;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b3 = 10;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b3 = 11;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b3 = 12;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b3 = 13;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b3 = 14;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b3 = 15;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b3 = 16;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b3 = 17;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b3 = 18;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b3 = 19;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b3 = 20;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b3 = 21;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b3 = 22;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b3 = 23;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b3 = 24;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b3 = 25;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b3 = 26;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b3 = 27;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b3 = 29;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b3 = 30;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b3 = 31;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b3 = 32;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b3 = 33;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b3 = 34;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b3 = 35;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b3 = 36;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b3 = 37;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b3 = 38;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b3 = 39;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b3 = 40;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b3 = 41;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b3 = 42;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b3 = 43;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b3 = 44;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b3 = 45;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b3 = 46;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b3 = 47;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b3 = 48;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b3 = 49;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b3 = 50;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b3 = 51;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b3 = 52;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b3 = 53;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b3 = 54;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b3 = 55;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b3 = 56;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b3 = 57;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b3 = 58;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b3 = 59;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b3 = 60;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b3 = 61;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b3 = 62;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b3 = 63;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b3 = 64;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b3 = 65;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b3 = 66;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b3 = 67;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b3 = 68;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b3 = 69;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b3 = 70;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b3 = 71;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b3 = 72;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b3 = 73;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b3 = 74;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b3 = 75;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b3 = 76;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b3 = 77;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b3 = 78;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b3 = 79;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b3 = 80;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b3 = 81;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b3 = 82;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b3 = 83;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b3 = 84;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b3 = 85;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b3 = 86;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b3 = 87;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b3 = 88;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b3 = 89;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b3 = 90;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b3 = 91;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b3 = 92;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b3 = 93;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b3 = 94;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b3 = 95;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b3 = 96;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b3 = 97;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b3 = 98;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b3 = 99;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b3 = 100;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b3 = 101;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b3 = 102;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b3 = 103;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b3 = 104;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b3 = 105;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b3 = 106;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b3 = 107;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b3 = 108;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b3 = 109;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b3 = 110;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b3 = 111;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b3 = 112;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b3 = 113;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b3 = 114;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b3 = 115;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b3 = 116;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b3 = 117;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b3 = 118;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b3 = 119;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b3 = 120;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b3 = 121;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b3 = 122;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b3 = 123;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b3 = 124;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b3 = 125;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b3 = 126;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b3 = 127;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b3 = 128;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b3 = 129;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b3 = 130;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b3 = 131;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b3 = 132;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b3 = 133;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b3 = 134;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b3 = 135;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b3 = 136;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b3 = 137;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b3 = 138;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b3 = 139;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                                                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                    case 48:
                                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = 9;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = 10;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = 11;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = 12;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = 13;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = 14;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = 15;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = 16;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = 17;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = 18;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = 19;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = 20;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = 21;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = 22;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = 23;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = 24;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = 25;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = 26;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = 27;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = 29;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = 30;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = 31;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = 32;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = 33;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = 34;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = 35;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = 36;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = 37;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = 38;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = 39;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = 40;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = 41;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = 42;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = 43;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = 44;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = 45;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = 46;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = 47;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = 48;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = 49;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = 50;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = 51;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = 52;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = 53;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = 54;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = 55;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = 56;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = 57;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = 58;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = 59;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = 60;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = 61;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = 62;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = 63;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = 64;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = 65;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = 66;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = 67;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = 68;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = 69;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = 70;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = 71;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = 72;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = 73;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = 74;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = 75;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = 76;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = 77;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = 78;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = 79;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = 80;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = 81;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = 82;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = 83;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = 84;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = 85;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = 86;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = 87;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = 88;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = 89;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = 90;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = 91;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = 92;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = 93;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = 94;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = 95;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = 96;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = 97;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = 98;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = 99;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = 100;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = 101;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = 102;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = 103;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = 104;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = 105;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = 106;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = 107;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = 108;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = 109;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = 110;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = 111;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = 112;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = 113;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = 114;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = 115;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = 116;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = 117;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = 118;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = 119;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = 120;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = 121;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = 122;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = 123;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = 124;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = 125;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = 126;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = 127;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = 128;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = 129;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = 130;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = 131;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = 132;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = 133;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = 134;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = 135;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = 136;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = 137;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = 138;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = 139;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                        case 48:
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 139;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                        case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                        case Maneuver.TYPE_DESTINATION /* 39 */:
                                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                        case 48:
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    f23466l = z;
                    f23467l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f23466l;
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l
    public final void Signature(C5978l[] c5978lArr, long j, long j2, C5019l c5019l) {
        super.Signature(c5978lArr, j, j2, c5019l);
        m3228l(c5019l);
        C8887l c8887l = this.f23488l;
        if (c8887l != null) {
            c8887l.loadAd();
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: abstract */
    public final C7977l mo1629abstract(C10023l c10023l) {
        C7977l c7977lMo1629abstract = super.mo1629abstract(c10023l);
        C5978l c5978l = (C5978l) c10023l.f20418l;
        c5978l.getClass();
        C13645l c13645l = this.f23508l;
        Handler handler = (Handler) c13645l.f26671l;
        if (handler != null) {
            handler.post(new RunnableC15278l(c13645l, c5978l, c7977lMo1629abstract, 11));
        }
        C8887l c8887l = this.f23488l;
        if (c8887l != null) {
            c8887l.loadAd();
        }
        return c7977lMo1629abstract;
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l
    public final void ad(long j, long j2) throws C17361l {
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            try {
                interfaceC9433l.startapp(j, j2);
            } catch (C18714l e) {
                throw crashlytics(e, e.f36473l, false, 7001);
            }
        }
        super.ad(j, j2);
    }

    @Override // defpackage.AbstractC1091l
    public final void adcel() {
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l == null || !this.f23510l) {
            return;
        }
        interfaceC9433l.release();
    }

    @Override // defpackage.AbstractC1091l
    public final void ads() {
        try {
            try {
                this.f13902l = false;
                m2033const();
                m2060while();
                InterfaceC9655l interfaceC9655l = this.f13921l;
                if (interfaceC9655l != null) {
                    interfaceC9655l.amazon(null);
                }
                this.f13921l = null;
                this.f23505l = false;
                this.f23479l = -9223372036854775807L;
                C2119l c2119l = this.f23507l;
                if (c2119l != null) {
                    c2119l.release();
                    this.f23507l = null;
                }
            } catch (Throwable th) {
                InterfaceC9655l interfaceC9655l2 = this.f13921l;
                if (interfaceC9655l2 != null) {
                    interfaceC9655l2.amazon(null);
                }
                this.f13921l = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.f23505l = false;
            this.f23479l = -9223372036854775807L;
            C2119l c2119l2 = this.f23507l;
            if (c2119l2 != null) {
                c2119l2.release();
                this.f23507l = null;
            }
            throw th2;
        }
    }

    @Override // defpackage.AbstractC1091l
    public final void amazon() {
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l == null) {
            C7578l c7578l = this.f23498l;
            if (c7578l.purchase == 0) {
                c7578l.purchase = 1;
                return;
            }
            return;
        }
        int i = this.f23497l;
        if (i == 0 || i == 1) {
            this.f23497l = 0;
        } else {
            interfaceC9433l.license();
        }
    }

    @Override // defpackage.AbstractC1091l
    public final boolean appmetrica(long j) {
        if (this.f13953l == -9223372036854775807L || j < this.f23504l) {
            return false;
        }
        long j2 = this.f13962l;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: catch */
    public final ArrayList mo1630catch(C3010l c3010l, C5978l c5978l, boolean z) {
        boolean z2 = this.f23495l;
        Context context = this.f23476l;
        List listM3222l = m3222l(context, c3010l, c5978l, z, z2);
        HashMap map = AbstractC4727l.yandex;
        ArrayList arrayList = new ArrayList(listM3222l);
        Collections.sort(arrayList, new C9933l(1, new C5131l(context, c5978l, 20)));
        return arrayList;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: continue */
    public final void mo1631continue(C4136l c4136l) {
        if (this.f23472l) {
            ByteBuffer byteBuffer = c4136l.f8497l;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC17529l interfaceC17529l = this.f13920l;
                        interfaceC17529l.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC17529l.yandex(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: final */
    public final boolean mo2036final(C5978l c5978l) throws C17361l {
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l == null || interfaceC9433l.yandex()) {
            return true;
        }
        try {
            return this.f23506l.remoteconfig(c5978l);
        } catch (C18714l e) {
            throw crashlytics(e, c5978l, false, 7000);
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: finally */
    public final void mo2037finally(long j) {
        super.mo2037finally(j);
        if (this.f23495l) {
            return;
        }
        this.f23509l--;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: for */
    public final int mo2038for(C4136l c4136l) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f23492l == null && !this.f23495l) || c4136l.f8496l >= this.f3019l || m3235l(c4136l)) ? 0 : 32;
        }
        return 0;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: goto */
    public final void mo1633goto(String str, long j, long j2) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C13645l c13645l = this.f23508l;
        Handler handler = (Handler) c13645l.f26671l;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC1773l(c13645l, str2, j, j2, 2));
        } else {
            str2 = str;
        }
        this.f23501l = m3223l(str2);
        C6403l c6403l = this.f13966l;
        c6403l.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(c6403l.loadAd)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c6403l.amazon;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f23472l = z;
        m3231l();
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: implements */
    public final void mo1634implements() {
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            interfaceC9433l.subs();
        } else {
            long j = this.f13926l.billing;
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: import */
    public final void mo1635import(String str) {
        C13645l c13645l = this.f23508l;
        Handler handler = (Handler) c13645l.f26671l;
        if (handler != null) {
            handler.post(new RunnableC10311l(c13645l, str, 25));
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: instanceof */
    public final void mo1636instanceof(C5978l c5978l, MediaFormat mediaFormat) {
        int integer;
        int i;
        InterfaceC17529l interfaceC17529l = this.f13920l;
        if (interfaceC17529l != null) {
            interfaceC17529l.remoteconfig(this.f23473l);
        }
        if (this.f23495l) {
            i = c5978l.license;
            integer = c5978l.pro;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = c5978l.premium;
        int i2 = c5978l.signatures;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.f23500l = new C15074l(i, f, integer);
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l == null || !this.f23490l) {
            this.f23498l.billing(c5978l.isVip);
        } else {
            C12984l c12984lYandex = c5978l.yandex();
            c12984lYandex.Signature = i;
            c12984lYandex.license = integer;
            c12984lYandex.signatures = f;
            C5978l c5978l2 = new C5978l(c12984lYandex);
            int i4 = this.f23497l;
            List list = this.f23487l;
            if (list == null) {
                C9258l c9258l = AbstractC1186l.f3181l;
                list = C13708l.f26763l;
            }
            interfaceC9433l.purchase(c5978l2, this.f13926l.loadAd, i4, list);
            this.f23497l = 2;
        }
        this.f23490l = false;
    }

    @Override // defpackage.AbstractC1091l
    public final String isPro() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.AbstractC1091l
    public final void license() {
        C5019l c5019l = this.f3014l;
        if (c5019l != null) {
            m3228l(c5019l);
        }
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public final boolean m3224l(C6403l c6403l) {
        if (this.f23495l || m3223l(c6403l.yandex)) {
            return false;
        }
        return !c6403l.billing || C2119l.loadAd(this.f23476l);
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final boolean mo2042l(C6403l c6403l) {
        return m3234l(c6403l);
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final void m3225l(InterfaceC17529l interfaceC17529l, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC17529l.subs(i, j);
        Trace.endSection();
        this.f13942l.purchase++;
        this.f23470l = 0;
        if (this.f23506l == null) {
            C15074l c15074l = this.f23500l;
            boolean zEquals = c15074l.equals(C15074l.amazon);
            C13645l c13645l = this.f23508l;
            if (!zEquals && !c15074l.equals(this.f23471l)) {
                this.f23471l = c15074l;
                c13645l.appmetrica(c15074l);
            }
            C7578l c7578l = this.f23498l;
            boolean z = c7578l.purchase != 3;
            c7578l.purchase = 3;
            c7578l.smaato.getClass();
            c7578l.mopub = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f23468l) == null) {
                return;
            }
            Handler handler = (Handler) c13645l.f26671l;
            if (handler != null) {
                handler.post(new RunnableC3950l(2, SystemClock.elapsedRealtime(), c13645l, surface));
            }
            this.f23491l = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final boolean mo2043l() {
        boolean z;
        C5978l c5978l = this.f13906l;
        long j = this.f23493l;
        if (j != -9223372036854775807L) {
            if (this.f13918l + 1 + j > Long.MAX_VALUE - (this.f13926l.crashlytics + j)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.f23492l == null || this.f23477l || this.f23495l || (c5978l != null && c5978l.adcel > 0) || z || this.f13926l.billing != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final void m3226l(long j) {
        C9294l c9294l = this.f13942l;
        c9294l.firebase += j;
        c9294l.smaato++;
        this.f23486l += j;
        this.f23511l++;
    }

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final void m3227l(Object obj) throws C17361l {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f23468l;
        C13645l c13645l = this.f23508l;
        if (surface2 == surface) {
            if (surface != null) {
                C15074l c15074l = this.f23471l;
                if (c15074l != null) {
                    c13645l.appmetrica(c15074l);
                }
                Surface surface3 = this.f23468l;
                if (surface3 == null || !this.f23491l || (handler = (Handler) c13645l.f26671l) == null) {
                    return;
                }
                handler.post(new RunnableC3950l(2, SystemClock.elapsedRealtime(), c13645l, surface3));
                return;
            }
            return;
        }
        this.f23468l = surface;
        InterfaceC9433l interfaceC9433l = this.f23506l;
        C7578l c7578l = this.f23498l;
        if (interfaceC9433l == null) {
            c7578l.mopub(surface);
        }
        this.f23491l = false;
        int i = this.f3010l;
        InterfaceC17529l interfaceC17529l = this.f13920l;
        if (interfaceC17529l != null && this.f23506l == null) {
            C6403l c6403l = this.f13966l;
            c6403l.getClass();
            if (!m3234l(c6403l) || this.f23501l) {
                m2060while();
                m2054static();
            } else {
                Surface surfaceM3229l = m3229l(c6403l);
                if (surfaceM3229l != null) {
                    interfaceC17529l.metrica(surfaceM3229l);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        C18073l.admob();
                        return;
                    }
                    interfaceC17529l.admob();
                }
            }
        }
        if (surface != null) {
            C15074l c15074l2 = this.f23471l;
            if (c15074l2 != null) {
                c13645l.appmetrica(c15074l2);
            }
        } else {
            this.f23471l = null;
            InterfaceC9433l interfaceC9433l2 = this.f23506l;
            if (interfaceC9433l2 != null) {
                interfaceC9433l2.firebase();
            }
        }
        if (i == 2) {
            InterfaceC9433l interfaceC9433l3 = this.f23506l;
            if (interfaceC9433l3 != null) {
                interfaceC9433l3.adcel(true);
            } else {
                c7578l.crashlytics(true);
            }
        }
        m3231l();
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final void m3228l(C5019l c5019l) {
        AbstractC10759l abstractC10759l = this.f3011l;
        if (abstractC10759l.startapp()) {
            this.f23493l = -9223372036854775807L;
            return;
        }
        int iLoadAd = abstractC10759l.loadAd(c5019l.yandex);
        if (iLoadAd == -1) {
            this.f23493l = -9223372036854775807L;
        } else {
            this.f23493l = abstractC10759l.billing(iLoadAd, new C3904l(), false).amazon;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public final Surface m3229l(C6403l c6403l) {
        boolean z;
        HandlerThreadC18641l handlerThreadC18641l;
        int i;
        RuntimeException runtimeException;
        Error error;
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            return interfaceC9433l.getInputSurface();
        }
        Surface surface = this.f23468l;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && c6403l.admob) {
            return null;
        }
        AbstractC12442l.subscription(m3224l(c6403l));
        C2119l c2119l = this.f23507l;
        if (c2119l != null && c2119l.f4758l != c6403l.billing && c2119l != null) {
            c2119l.release();
            this.f23507l = null;
        }
        if (this.f23507l == null) {
            Context context = this.f23476l;
            boolean z2 = c6403l.billing;
            boolean z3 = false;
            if (z2) {
                if (!C2119l.loadAd(context)) {
                    z = false;
                }
                AbstractC12442l.subscription(z);
                handlerThreadC18641l = new HandlerThreadC18641l("ExoPlayer:PlaceholderSurface");
                if (z2) {
                    i = C2119l.f4755l;
                } else {
                    i = 0;
                }
                handlerThreadC18641l.start();
                Handler handler = new Handler(handlerThreadC18641l.getLooper(), handlerThreadC18641l);
                handlerThreadC18641l.f36428l = handler;
                handlerThreadC18641l.f36429l = new RunnableC4260l(handler);
                synchronized (handlerThreadC18641l) {
                    handlerThreadC18641l.f36428l.obtainMessage(1, i, 0).sendToTarget();
                    while (handlerThreadC18641l.f36430l == null && handlerThreadC18641l.f36431l == null && handlerThreadC18641l.f36427l == null) {
                        try {
                            handlerThreadC18641l.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC18641l.f36431l;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC18641l.f36427l;
                if (error == null) {
                    throw error;
                }
                C2119l c2119l2 = handlerThreadC18641l.f36430l;
                c2119l2.getClass();
                this.f23507l = c2119l2;
            } else {
                int i2 = C2119l.f4755l;
            }
            z = true;
            AbstractC12442l.subscription(z);
            handlerThreadC18641l = new HandlerThreadC18641l("ExoPlayer:PlaceholderSurface");
            if (z2) {
                i = C2119l.f4755l;
            } else {
                i = 0;
            }
            handlerThreadC18641l.start();
            Handler handler2 = new Handler(handlerThreadC18641l.getLooper(), handlerThreadC18641l);
            handlerThreadC18641l.f36428l = handler2;
            handlerThreadC18641l.f36429l = new RunnableC4260l(handler2);
            synchronized (handlerThreadC18641l) {
                handlerThreadC18641l.f36428l.obtainMessage(1, i, 0).sendToTarget();
                while (handlerThreadC18641l.f36430l == null) {
                    handlerThreadC18641l.wait();
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC18641l.f36431l;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC18641l.f36427l;
                if (error == null) {
                    throw error;
                }
                C2119l c2119l3 = handlerThreadC18641l.f36430l;
                c2119l3.getClass();
                this.f23507l = c2119l3;
            }
        }
        return this.f23507l;
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final void m3230l() {
        if (this.f23485l > 0) {
            this.f3009l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f23494l;
            int i = this.f23485l;
            C13645l c13645l = this.f23508l;
            Handler handler = (Handler) c13645l.f26671l;
            if (handler != null) {
                handler.post(new RunnableC13019l(c13645l, i, j));
            }
            this.f23485l = 0;
            this.f23494l = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final void m3231l() {
        InterfaceC17529l interfaceC17529l;
        if (this.f23495l && (interfaceC17529l = this.f13920l) != null) {
            this.f23483l = new C13214l(this, interfaceC17529l);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                interfaceC17529l.yandex(bundle);
            }
        }
    }

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public final boolean m3232l(long j, long j2, boolean z, boolean z2) throws C17361l {
        if (this.f23506l != null && this.f23510l) {
            j2 -= -this.f23479l;
        }
        if (j < -500000 && !z) {
            InterfaceC11759l interfaceC11759l = this.f3020l;
            interfaceC11759l.getClass();
            int iSmaato = interfaceC11759l.smaato(j2 - this.f3022l);
            if (iSmaato != 0) {
                this.f23504l = j2;
                C9294l c9294l = this.f13942l;
                PriorityQueue priorityQueue = this.f23512l;
                if (z2) {
                    int i = c9294l.amazon + iSmaato;
                    c9294l.amazon = i;
                    c9294l.billing += this.f23509l;
                    c9294l.amazon = priorityQueue.size() + i;
                } else {
                    c9294l.isPro++;
                    m3233l(priorityQueue.size() + iSmaato, this.f23509l);
                }
                if (this.f13920l != null) {
                    if (mo2047l()) {
                        m2060while();
                        m2054static();
                    } else if (mo2043l()) {
                        m2051private();
                    } else {
                        this.f13934l = true;
                    }
                }
                InterfaceC9433l interfaceC9433l = this.f23506l;
                if (interfaceC9433l != null) {
                    interfaceC9433l.vip(false);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final void m3233l(int i, int i2) {
        C9294l c9294l = this.f13942l;
        c9294l.admob += i;
        int i3 = i + i2;
        c9294l.mopub += i3;
        this.f23485l += i3;
        int i4 = this.f23470l + i3;
        this.f23470l = i4;
        c9294l.subs = Math.max(i4, c9294l.subs);
        int i5 = this.f23496l;
        if (i5 <= 0 || this.f23485l < i5) {
            return;
        }
        m3230l();
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final int mo1640l(C3010l c3010l, C5978l c5978l) {
        boolean z;
        int i = 0;
        if (!AbstractC3825l.remoteconfig(c5978l.metrica)) {
            return AbstractC4338l.ads(0, 0, 0, 0);
        }
        int i2 = 1;
        boolean z2 = c5978l.subscription != null;
        Context context = this.f23476l;
        List listM3222l = m3222l(context, c3010l, c5978l, z2, false);
        if (z2 && listM3222l.isEmpty()) {
            listM3222l = m3222l(context, c3010l, c5978l, false, false);
        }
        if (listM3222l.isEmpty()) {
            return AbstractC4338l.ads(1, 0, 0, 0);
        }
        int i3 = c5978l.f12614catch;
        if (i3 != 0 && i3 != 2) {
            return AbstractC4338l.ads(2, 0, 0, 0);
        }
        C6403l c6403l = (C6403l) listM3222l.get(0);
        boolean zPurchase = c6403l.purchase(context, c5978l);
        if (!zPurchase) {
            int i4 = 1;
            while (true) {
                if (i4 >= listM3222l.size()) {
                    z = true;
                    break;
                }
                C6403l c6403l2 = (C6403l) listM3222l.get(i4);
                if (c6403l2.purchase(context, c5978l)) {
                    z = false;
                    zPurchase = true;
                    c6403l = c6403l2;
                    break;
                }
                i4++;
            }
        } else {
            z = true;
            break;
        }
        int i5 = zPurchase ? 4 : 3;
        int i6 = c6403l.billing(c5978l) ? 16 : 8;
        int i7 = c6403l.mopub ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c5978l.metrica) && !AbstractC5941l.ads(context)) {
            i8 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (zPurchase) {
            List listM3222l2 = m3222l(context, c3010l, c5978l, z2, true);
            if (!listM3222l2.isEmpty()) {
                HashMap map = AbstractC4727l.yandex;
                ArrayList arrayList = new ArrayList(listM3222l2);
                Collections.sort(arrayList, new C9933l(i2, new C5131l(context, c5978l, 20)));
                C6403l c6403l3 = (C6403l) arrayList.get(0);
                if (c6403l3.purchase(context, c5978l) && c6403l3.billing(c5978l)) {
                    i = 32;
                }
            }
        }
        return i5 | i6 | i | i7 | i8;
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final boolean m3234l(C6403l c6403l) {
        if (this.f23506l != null) {
            return true;
        }
        Surface surface = this.f23468l;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && c6403l.admob) || m3224l(c6403l);
        }
        return true;
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final boolean m3235l(C4136l c4136l) {
        if (firebase() || c4136l.crashlytics(536870912)) {
            return true;
        }
        long j = this.f23493l;
        return j == -9223372036854775807L || j - (c4136l.f8496l - this.f13926l.crashlytics) <= 100000;
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public final void m3236l(InterfaceC17529l interfaceC17529l, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC17529l.billing(i);
        Trace.endSection();
        this.f13942l.billing++;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x0148  */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: lَٖؔ */
    public final boolean mo2046l(C4136l c4136l) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        C11121l c11121l;
        C14706l c14706l;
        boolean z2 = false;
        if (!m3235l(c4136l)) {
            long j = c4136l.f8496l;
            boolean z3 = j < this.f3019l;
            C8887l c8887l = this.f23488l;
            if (c8887l != null) {
                long j2 = c8887l.yandex;
                long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : (long) (((j - j2) * c8887l.crashlytics) + c8887l.loadAd);
                if (j3 == -9223372036854775807L || j3 >= this.f23481l) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !c4136l.crashlytics(268435456)) {
                if (!c4136l.crashlytics(67108864)) {
                    C0458l c0458l = this.f23480l;
                    if (c0458l != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) c0458l.f1691l;
                        C6403l c6403l = this.f13966l;
                        c6403l.getClass();
                        if (c6403l.loadAd.equals("video/av01") && (byteBuffer = c4136l.f8498l) != null) {
                            boolean z4 = z3 || this.f23499l <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                c0458l.m548catch(AbstractC14024l.advert(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListAdvert = AbstractC14024l.advert(byteBufferAsReadOnlyBuffer);
                            c0458l.m548catch(arrayListAdvert);
                            int size = arrayListAdvert.size() - 1;
                            int i = 0;
                            while (size >= 0) {
                                C6915l c6915l = (C6915l) arrayListAdvert.get(size);
                                int i2 = c6915l.yandex;
                                if (i2 != 2 && i2 != 15) {
                                    if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (c11121l = (C11121l) c0458l.f1690l) == null)) {
                                        break;
                                    }
                                    try {
                                        c14706l = new C14706l(c11121l, c6915l);
                                    } catch (C1886l unused) {
                                        c14706l = null;
                                    }
                                    if (c14706l == null || c14706l.f28767l) {
                                        break;
                                    }
                                }
                                if (((C6915l) arrayListAdvert.get(size)).yandex == 6 || ((C6915l) arrayListAdvert.get(size)).yandex == 3) {
                                    i++;
                                }
                                size--;
                            }
                            if (i > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((C6915l) arrayListAdvert.get(size)).loadAd.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                c4136l.remoteconfig();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                C15380l c15380l = this.f23489l;
                                c15380l.getClass();
                                if (c15380l.amazon + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !c4136l.crashlytics(1073741824)) {
                                    ByteBuffer byteBuffer3 = c4136l.f8498l;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (z3) {
                            this.f13942l.amazon++;
                        } else {
                            this.f23512l.add(Long.valueOf(c4136l.f8496l));
                            this.f23499l++;
                        }
                    }
                    return z2;
                }
                c4136l.remoteconfig();
                z2 = true;
                if (z2) {
                    if (z3) {
                        this.f13942l.amazon++;
                    } else {
                        this.f23512l.add(Long.valueOf(c4136l.f8496l));
                        this.f23499l++;
                    }
                }
                return z2;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: lَٖؕ */
    public final boolean mo2047l() {
        C6403l c6403l = this.f13966l;
        if (this.f23506l != null && c6403l != null) {
            String str = c6403l.yandex;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo2047l();
    }

    @Override // defpackage.AbstractC1091l
    public final void metrica(boolean z, boolean z2) {
        InterfaceC9433l interfaceC9433l;
        this.f13942l = new C9294l();
        C17614l c17614l = this.f3018l;
        c17614l.getClass();
        boolean z3 = c17614l.loadAd;
        int i = 0;
        AbstractC12442l.subscription((z3 && this.f23478l == 0) ? false : true);
        if (this.f23495l != z3) {
            this.f23495l = z3;
            m2060while();
        }
        C9294l c9294l = this.f13942l;
        C13645l c13645l = this.f23508l;
        Handler handler = (Handler) c13645l.f26671l;
        if (handler != null) {
            handler.post(new RunnableC11367l(c13645l, c9294l, i));
        }
        boolean z4 = this.f23505l;
        C7578l c7578l = this.f23498l;
        if (!z4) {
            if (this.f23487l != null && this.f23506l == null) {
                C9904l c9904l = new C9904l(this.f23476l, c7578l);
                c9904l.amazon = true;
                long j = this.f23481l;
                c9904l.mopub = j != -9223372036854775807L ? -j : -9223372036854775807L;
                C18527l c18527l = this.f3009l;
                c18527l.getClass();
                c9904l.purchase = c18527l;
                AbstractC12442l.subscription(!c9904l.billing);
                if (c9904l.crashlytics == null) {
                    c9904l.crashlytics = new C16174l();
                }
                C14600l c14600l = new C14600l(c9904l);
                c9904l.billing = true;
                if (1 >= c14600l.startapp) {
                    c14600l.startapp = 1;
                }
                SparseArray sparseArray = c14600l.crashlytics;
                if (AbstractC15323l.smaato(sparseArray, 0)) {
                    interfaceC9433l = (InterfaceC9433l) sparseArray.get(0);
                } else {
                    C2793l c2793l = new C2793l(c14600l, c14600l.yandex);
                    c14600l.mopub.add(c2793l);
                    sparseArray.put(0, c2793l);
                    interfaceC9433l = c2793l;
                }
                this.f23506l = interfaceC9433l;
            }
            this.f23505l = true;
        }
        InterfaceC9433l interfaceC9433l2 = this.f23506l;
        if (interfaceC9433l2 == null) {
            C18527l c18527l2 = this.f3009l;
            c18527l2.getClass();
            c7578l.smaato = c18527l2;
            c7578l.purchase(!z2 ? 1 : 0);
            return;
        }
        interfaceC9433l2.mopub(new C10685l(this));
        InterfaceC15310l interfaceC15310l = this.f23502l;
        if (interfaceC15310l != null) {
            this.f23506l.subscription(interfaceC15310l);
        }
        if (this.f23468l != null && !this.f23474l.equals(C5989l.crashlytics)) {
            this.f23506l.Signature(this.f23468l, this.f23474l);
        }
        this.f23506l.isPro(this.f23503l);
        this.f23506l.crashlytics(this.f13904l);
        List list = this.f23487l;
        if (list != null) {
            this.f23506l.metrica(list);
        }
        this.f23497l = !z2 ? 1 : 0;
        this.f13961l = true;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: new */
    public final void mo1642new(Exception exc) {
        AbstractC6427l.subs("MediaCodecVideoRenderer", "Video codec error", exc);
        C13645l c13645l = this.f23508l;
        Handler handler = (Handler) c13645l.f26671l;
        if (handler != null) {
            handler.post(new RunnableC10311l(c13645l, exc, 24));
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: package */
    public final C7977l mo1643package(C6403l c6403l, C5978l c5978l, C5978l c5978l2, boolean z) {
        int i;
        C7977l c7977lLoadAd = c6403l.loadAd(c5978l, c5978l2);
        float f = c5978l.isVip;
        float f2 = c5978l2.isVip;
        int i2 = c7977lLoadAd.purchase;
        C15380l c15380l = this.f23489l;
        c15380l.getClass();
        if (c5978l2.license > c15380l.loadAd || c5978l2.pro > c15380l.crashlytics) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (m3221l(c6403l, c5978l2) > c15380l.amazon) {
            i2 |= 64;
        }
        if (this.f23503l != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!c6403l.billing || !z))) {
            float fMax = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                i2 |= 65536;
            }
        }
        int i3 = i2;
        return new C7977l(c6403l.yandex, c5978l, c5978l2, i3 != 0 ? 0 : c7977lLoadAd.amazon, i3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // defpackage.AbstractC1091l
    public final boolean remoteconfig() {
        boolean zYandex;
        boolean z = false;
        if (this.f13954l != null) {
            if (firebase()) {
                zYandex = this.f3023l;
            } else {
                InterfaceC11759l interfaceC11759l = this.f3020l;
                interfaceC11759l.getClass();
                zYandex = interfaceC11759l.yandex();
            }
            if (zYandex) {
                z = true;
            } else {
                if (this.f13950l >= 0) {
                    z = true;
                } else if (this.f13941l != -9223372036854775807L) {
                    this.f3009l.getClass();
                    if (SystemClock.elapsedRealtime() < this.f13941l) {
                        z = true;
                    }
                }
            }
        }
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            return interfaceC9433l.ads(z);
        }
        if (z && (this.f13920l == null || this.f23495l)) {
            return true;
        }
        return this.f23498l.loadAd(z);
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: return */
    public final void mo2053return() {
        super.mo2053return();
        this.f23512l.clear();
        this.f23509l = 0;
        this.f23499l = 0;
        this.f23477l = false;
        C0458l c0458l = this.f23480l;
        if (c0458l != null) {
            c0458l.f1690l = null;
            ByteBuffer byteBuffer = (ByteBuffer) c0458l.f1691l;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l
    public final void signatures(float f, float f2) throws C17361l {
        super.signatures(f, f2);
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            interfaceC9433l.crashlytics(f);
        } else {
            this.f23498l.admob(f);
        }
        C8887l c8887l = this.f23488l;
        if (c8887l != null) {
            c8887l.crashlytics(f);
        }
    }

    @Override // defpackage.AbstractC1091l
    public final boolean smaato() {
        if (!this.f13925l) {
            return false;
        }
        InterfaceC9433l interfaceC9433l = this.f23506l;
        return interfaceC9433l == null || interfaceC9433l.admob();
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l
    public final void startapp(long j, boolean z, boolean z2) {
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null && !z) {
            interfaceC9433l.vip(true);
        }
        if (z2) {
            this.f23504l = j;
        }
        super.startapp(j, z, z2);
        InterfaceC9433l interfaceC9433l2 = this.f23506l;
        C7578l c7578l = this.f23498l;
        if (interfaceC9433l2 == null) {
            c7578l.loadAd.loadAd();
            c7578l.admob = -9223372036854775807L;
            c7578l.billing = -9223372036854775807L;
            c7578l.purchase = Math.min(c7578l.purchase, 1);
            c7578l.subs = -9223372036854775807L;
            c7578l.vip = false;
        }
        C8887l c8887l = this.f23488l;
        if (c8887l != null) {
            c8887l.loadAd();
        }
        if (z) {
            InterfaceC9433l interfaceC9433l3 = this.f23506l;
            if (interfaceC9433l3 != null) {
                interfaceC9433l3.adcel(false);
            } else {
                c7578l.crashlytics(false);
            }
        }
        m3231l();
        this.f23470l = 0;
    }

    @Override // defpackage.AbstractC1091l
    public final void subscription() {
        this.f23485l = 0;
        this.f3009l.getClass();
        this.f23494l = SystemClock.elapsedRealtime();
        this.f23486l = 0L;
        this.f23511l = 0;
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            interfaceC9433l.amazon();
        } else {
            this.f23498l.amazon();
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: super */
    public final void mo1645super(C5536l c5536l) {
        C13645l c13645l = this.f23508l;
        Handler handler = (Handler) c13645l.f26671l;
        if (handler != null) {
            handler.post(new RunnableC10311l(c13645l, c5536l, 22));
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013d, please report this as an issue */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: switch */
    public final C1424l mo1646switch(C6403l c6403l, C5978l c5978l, MediaCrypto mediaCrypto, float f) {
        C1591l c1591l;
        int i;
        C15380l c15380l;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        boolean z;
        Pair pairLoadAd;
        int iM3220l;
        String str = c6403l.crashlytics;
        C5978l[] c5978lArr = this.f3015l;
        c5978lArr.getClass();
        int i2 = c5978l.license;
        float f2 = c5978l.isVip;
        C1591l c1591l2 = c5978l.inmobi;
        int i3 = c5978l.pro;
        int iM3221l = m3221l(c6403l, c5978l);
        if (c5978lArr.length == 1) {
            if (iM3221l != -1 && (iM3220l = m3220l(c6403l, c5978l)) != -1) {
                iM3221l = Math.min((int) (iM3221l * 1.5f), iM3220l);
            }
            c15380l = new C15380l(i2, i3, iM3221l, 5);
            c1591l = c1591l2;
            i = i3;
        } else {
            int length = c5978lArr.length;
            int iMax = i2;
            int iMax2 = i3;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                C5978l c5978l2 = c5978lArr[i4];
                C5978l[] c5978lArr2 = c5978lArr;
                if (c1591l2 != null && c5978l2.inmobi == null) {
                    C12984l c12984lYandex = c5978l2.yandex();
                    c12984lYandex.appmetrica = c1591l2;
                    c5978l2 = new C5978l(c12984lYandex);
                }
                C7977l c7977lLoadAd = c6403l.loadAd(c5978l, c5978l2);
                int i5 = length;
                int i6 = c5978l2.pro;
                if (c7977lLoadAd.amazon != 0) {
                    int i7 = c5978l2.license;
                    b = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM3221l = Math.max(iM3221l, m3221l(c6403l, c5978l2));
                } else {
                    b = -1;
                }
                length = i5;
                i4++;
                c5978lArr = c5978lArr2;
            }
            if (z2) {
                AbstractC6427l.vip("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                boolean z4 = z3;
                int i9 = z3 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    c1591l = c1591l2;
                    if (i10 < 9) {
                        int i11 = f23465l[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            if (!z4) {
                                i13 = i11;
                            }
                            if (!z4) {
                                i11 = i13;
                            }
                            int i14 = i9;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c6403l.amazon;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(AbstractC15323l.mopub(i13, widthAlignment) * widthAlignment, AbstractC15323l.mopub(i11, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i = i3;
                                if (c6403l.mopub(f2, point.x, point.y)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            c1591l2 = c1591l;
                            i9 = i14;
                            i8 = i8;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            C12984l c12984lYandex2 = c5978l.yandex();
                            c12984lYandex2.Signature = iMax;
                            c12984lYandex2.license = iMax2;
                            iM3221l = Math.max(iM3221l, m3220l(c6403l, new C5978l(c12984lYandex2)));
                            AbstractC6427l.vip("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        C12984l c12984lYandex3 = c5978l.yandex();
                        c12984lYandex3.Signature = iMax;
                        c12984lYandex3.license = iMax2;
                        iM3221l = Math.max(iM3221l, m3220l(c6403l, new C5978l(c12984lYandex3)));
                        AbstractC6427l.vip("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                c1591l = c1591l2;
                i = i3;
            }
            c15380l = new C15380l(iMax, iMax2, iM3221l, 5);
        }
        this.f23489l = c15380l;
        int i15 = this.f23495l ? this.f23478l : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        AbstractC0837l.billing(mediaFormat, c5978l.ads);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        AbstractC0837l.purchase(mediaFormat, "rotation-degrees", c5978l.signatures);
        if (c1591l != null) {
            C1591l c1591l3 = c1591l;
            AbstractC0837l.purchase(mediaFormat, "color-transfer", c1591l3.crashlytics);
            AbstractC0837l.purchase(mediaFormat, "color-standard", c1591l3.yandex);
            AbstractC0837l.purchase(mediaFormat, "color-range", c1591l3.loadAd);
            byte[] bArr = c1591l3.amazon;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c5978l.metrica) && (pairLoadAd = AbstractC14501l.loadAd(c5978l)) != null) {
            AbstractC0837l.purchase(mediaFormat, "profile", ((Integer) pairLoadAd.first).intValue());
        }
        mediaFormat.setInteger("max-width", c15380l.loadAd);
        mediaFormat.setInteger("max-height", c15380l.crashlytics);
        AbstractC0837l.purchase(mediaFormat, "max-input-size", c15380l.amazon);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.f23469l) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f23484l));
        }
        inmobi(mediaFormat);
        Surface surfaceM3229l = m3229l(c6403l);
        if (this.f23506l != null && !AbstractC15323l.m3984throw(this.f23476l)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C1424l(c6403l, mediaFormat, c5978l, surfaceM3229l, mediaCrypto, (Object) null);
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: synchronized */
    public final C18406l mo2056synchronized(IllegalStateException illegalStateException, C6403l c6403l) {
        Surface surface = this.f23468l;
        C15554l c15554l = new C15554l(illegalStateException, c6403l);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c15554l;
    }

    @Override // defpackage.AbstractC1091l
    public final void tapsense() {
        m3230l();
        int i = this.f23511l;
        if (i != 0) {
            long j = this.f23486l;
            C13645l c13645l = this.f23508l;
            Handler handler = (Handler) c13645l.f26671l;
            if (handler != null) {
                handler.post(new RunnableC13019l(c13645l, j, i));
            }
            this.f23486l = 0L;
            this.f23511l = 0;
        }
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            interfaceC9433l.loadAd();
        } else {
            C7578l c7578l = this.f23498l;
            c7578l.amazon = false;
            c7578l.subs = -9223372036854775807L;
            C7048l c7048l = c7578l.loadAd;
            c7048l.amazon = false;
            AbstractC16097l abstractC16097l = c7048l.crashlytics;
            if (abstractC16097l != null) {
                abstractC16097l.loadAd();
            }
            c7048l.yandex();
        }
        C8887l c8887l = this.f23488l;
        if (c8887l != null) {
            c8887l.loadAd();
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: this */
    public final void mo1647this() {
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            interfaceC9433l.subs();
            if (this.f23479l == -9223372036854775807L) {
                this.f23479l = this.f13926l.loadAd;
            }
            this.f23506l.billing(-this.f23479l);
        } else {
            this.f23498l.purchase(2);
        }
        this.f23490l = true;
        m3231l();
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: throw */
    public final float mo1648throw(float f, C5978l c5978l, C5978l[] c5978lArr) {
        C6403l c6403l;
        float fMax = -1.0f;
        for (C5978l c5978l2 : c5978lArr) {
            float f2 = c5978l2.isVip;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.f23492l == null || (c6403l = this.f13966l) == null) {
            return f3;
        }
        int i = c5978l.license;
        int i2 = c5978l.pro;
        float f4 = -3.4028235E38f;
        if (c6403l.subs) {
            float f5 = c6403l.smaato;
            if (f5 != -3.4028235E38f && c6403l.isPro == i && c6403l.firebase == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!c6403l.mopub(1024.0d, i, i2)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        if (c6403l.mopub(f8, i, i2)) {
                            f6 = f8;
                        } else {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                c6403l.smaato = f4;
                c6403l.isPro = i;
                c6403l.firebase = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: transient */
    public final boolean mo1649transient(long j, long j2, InterfaceC17529l interfaceC17529l, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C5978l c5978l) {
        int i4;
        interfaceC17529l.getClass();
        long j4 = j3 - this.f13926l.crashlytics;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f23512l;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        m3233l(i5, 0);
        InterfaceC9433l interfaceC9433l = this.f23506l;
        if (interfaceC9433l != null) {
            if (!z || z2) {
                return interfaceC9433l.smaato(j3, new C9809l(this, interfaceC17529l, i, j4));
            }
            m3236l(interfaceC17529l, i);
            return true;
        }
        int iYandex = this.f23498l.yandex(j3, j, j2, this.f13926l.loadAd, z, z2, this.f23482l);
        C3535l c3535l = this.f23482l;
        C8887l c8887l = this.f23488l;
        if (c8887l != null && iYandex != 5 && iYandex != 4) {
            c8887l.yandex(j3, c3535l.yandex);
        }
        if (iYandex == 0) {
            this.f3009l.getClass();
            long jNanoTime = System.nanoTime();
            InterfaceC15310l interfaceC15310l = this.f23502l;
            if (interfaceC15310l != null) {
                interfaceC15310l.loadAd(j4, jNanoTime, c5978l, this.f13924l);
            }
            m3225l(interfaceC17529l, i, jNanoTime);
            m3226l(c3535l.yandex);
            return true;
        }
        if (iYandex == 1) {
            long j5 = c3535l.loadAd;
            long j6 = c3535l.yandex;
            if (j5 == this.f23475l) {
                m3236l(interfaceC17529l, i);
            } else {
                InterfaceC15310l interfaceC15310l2 = this.f23502l;
                if (interfaceC15310l2 != null) {
                    i4 = i;
                    interfaceC15310l2.loadAd(j4, j5, c5978l, this.f13924l);
                } else {
                    i4 = i;
                }
                m3225l(interfaceC17529l, i4, j5);
            }
            m3226l(j6);
            this.f23475l = j5;
            return true;
        }
        if (iYandex == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC17529l.billing(i);
            Trace.endSection();
            m3233l(0, 1);
            m3226l(c3535l.yandex);
            return true;
        }
        if (iYandex == 3) {
            m3236l(interfaceC17529l, i);
            m3226l(c3535l.yandex);
            return true;
        }
        if (iYandex != 4 && iYandex != 5) {
            C8339l.smaato(String.valueOf(iYandex));
        }
        return false;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: try */
    public final void mo2058try(C4136l c4136l) {
        ByteBuffer byteBuffer;
        C0458l c0458l = this.f23480l;
        if (c0458l != null) {
            C6403l c6403l = this.f13966l;
            c6403l.getClass();
            if (c6403l.loadAd.equals("video/av01") && c4136l.crashlytics(1) && (byteBuffer = c4136l.f8498l) != null) {
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, iPosition + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) c0458l.f1691l;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }
        this.f23499l = 0;
        int iMo2038for = mo2038for(c4136l);
        if ((Build.VERSION.SDK_INT < 34 || (iMo2038for & 32) == 0) && !this.f23495l) {
            this.f23509l++;
        }
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l
    public final void vip() {
        C13645l c13645l = this.f23508l;
        this.f23471l = null;
        this.f23493l = -9223372036854775807L;
        m3231l();
        this.f23491l = false;
        this.f23483l = null;
        int i = 1;
        this.f23477l = true;
        try {
            super.vip();
            C9294l c9294l = this.f13942l;
            c13645l.getClass();
            synchronized (c9294l) {
            }
            Handler handler = (Handler) c13645l.f26671l;
            if (handler != null) {
                handler.post(new RunnableC11367l(c13645l, c9294l, i));
            }
        } finally {
            c13645l.subscription(this.f13942l);
            c13645l.appmetrica(C15074l.amazon);
        }
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l, defpackage.InterfaceC3184l
    public final void yandex(int i, Object obj) throws C17361l {
        if (i == 1) {
            m3227l(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC15310l interfaceC15310l = (InterfaceC15310l) obj;
            this.f23502l = interfaceC15310l;
            InterfaceC9433l interfaceC9433l = this.f23506l;
            if (interfaceC9433l != null) {
                interfaceC9433l.subscription(interfaceC15310l);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f23478l != iIntValue) {
                this.f23478l = iIntValue;
                if (this.f23495l) {
                    m2060while();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f23473l = iIntValue2;
            InterfaceC17529l interfaceC17529l = this.f13920l;
            if (interfaceC17529l != null) {
                interfaceC17529l.remoteconfig(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f23503l = iIntValue3;
            InterfaceC9433l interfaceC9433l2 = this.f23506l;
            if (interfaceC9433l2 != null) {
                interfaceC9433l2.isPro(iIntValue3);
                return;
            }
            C7048l c7048l = this.f23498l.loadAd;
            if (c7048l.isPro == iIntValue3) {
                return;
            }
            c7048l.isPro = iIntValue3;
            c7048l.amazon(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC16569l.yandex)) {
                InterfaceC9433l interfaceC9433l3 = this.f23506l;
                if (interfaceC9433l3 == null || !interfaceC9433l3.yandex()) {
                    return;
                }
                this.f23506l.tapsense();
                return;
            }
            this.f23487l = list;
            InterfaceC9433l interfaceC9433l4 = this.f23506l;
            if (interfaceC9433l4 != null) {
                interfaceC9433l4.metrica(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            C5989l c5989l = (C5989l) obj;
            if (c5989l.yandex == 0 || c5989l.loadAd == 0) {
                return;
            }
            this.f23474l = c5989l;
            InterfaceC9433l interfaceC9433l5 = this.f23506l;
            if (interfaceC9433l5 != null) {
                Surface surface = this.f23468l;
                surface.getClass();
                interfaceC9433l5.Signature(surface, c5989l);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f23484l = ((Integer) obj).intValue();
                InterfaceC17529l interfaceC17529l2 = this.f13920l;
                if (interfaceC17529l2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f23484l));
                    interfaceC17529l2.yandex(bundle);
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Surface surface2 = this.f23468l;
                m3227l(null);
                obj.getClass();
                ((C11727l) obj).yandex(1, surface2);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                boolean z = this.f23492l != null;
                C13829l c13829l = (C13829l) obj;
                this.f23492l = c13829l;
                if (z != (c13829l != null)) {
                    m2040l(this.f13906l);
                }
                break;
            default:
                super.yandex(i, obj);
                break;
        }
    }
}
