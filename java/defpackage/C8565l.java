package defpackage;

import android.graphics.PointF;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8565l implements InterfaceC4446l, InterfaceC15270l, InterfaceC18477l, InterfaceC13540l, InterfaceC5404l, InterfaceC3501l, InterfaceC5304l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C8565l f17661l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17675l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C8565l f17655l = new C8565l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C8565l f17667l = new C8565l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8565l f17666l = new C8565l(3);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C8565l f17670l = new C8565l(4);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C8565l f17656l = new C8565l(5);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C8565l f17659l = new C8565l(6);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C8565l f17669l = new C8565l(7);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C8565l f17664l = new C8565l(8);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C8565l f17671l = new C8565l(10);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C15067l f17668l = new C15067l(null, null, null, null, null);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C8565l f17654l = new C8565l(11);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C8565l f17672l = new C8565l(12);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C8565l f17665l = new C8565l(13);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C8565l f17660l = new C8565l(14);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C8565l f17663l = new C8565l(15);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C8565l f17673l = new C8565l(16);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C8565l f17662l = new C8565l(18);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C8565l f17658l = new C8565l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C8565l f17657l = new C8565l(20);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C8565l f17653l = new C8565l(21);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C8565l f17674l = new C8565l(22);

    public /* synthetic */ C8565l(int i) {
        this.f17675l = i;
    }

    public static C3624l ad(C2312l c2312l) {
        return new C3624l(c2312l.loadAd(), c2312l.yandex.mopub());
    }

    public static C3624l adcel(String str, boolean z) {
        String strAdvert;
        int iM3321extends = AbstractC12024l.m3321extends(str, '`', 0, 6);
        if (iM3321extends == -1) {
            iM3321extends = str.length();
        }
        int iM3314case = AbstractC12024l.m3314case(iM3321extends, 4, str, "/");
        String str2 = "";
        if (iM3314case == -1) {
            strAdvert = AbstractC16648l.advert(str, "`", "", false);
        } else {
            String strReplace = str.substring(0, iM3314case).replace('/', '.');
            strAdvert = AbstractC16648l.advert(str.substring(iM3314case + 1), "`", "", false);
            str2 = strReplace;
        }
        return new C3624l(new C2312l(str2), new C2312l(strAdvert), z);
    }

    public static void billing(String str, StringBuilder sb) {
        sb.append(AbstractC3324l.billing(C3498l.purchase(str)));
    }

    public static synchronized void isVip() {
        if (f17661l == null) {
            f17661l = new C8565l(0);
        }
    }

    public static /* synthetic */ String license(InterfaceC13012l interfaceC13012l) {
        return tapsense(interfaceC13012l, false);
    }

    public static boolean premium(int i, C12676l c12676l, Object obj) throws C9893l {
        AbstractC9284l abstractC9284l = (AbstractC9284l) c12676l.purchase;
        int i2 = c12676l.loadAd;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c12676l.m3459l(0);
            ((C10096l) obj).amazon(i3 << 3, Long.valueOf(abstractC9284l.mo1074else()));
            return true;
        }
        if (i4 == 1) {
            c12676l.m3459l(1);
            ((C10096l) obj).amazon((i3 << 3) | 1, Long.valueOf(abstractC9284l.mo1090switch()));
            return true;
        }
        if (i4 == 2) {
            ((C10096l) obj).amazon((i3 << 3) | 2, c12676l.m3462l());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                C11586l.admob("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                C11586l.mopub();
                return false;
            }
            c12676l.m3459l(5);
            ((C10096l) obj).amazon(5 | (i3 << 3), Integer.valueOf(abstractC9284l.mo1072continue()));
            return true;
        }
        C10096l c10096lYandex = C10096l.yandex();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            C11586l.admob("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (c12676l.m3460l() != Integer.MAX_VALUE && premium(i6, c12676l, c10096lYandex)) {
        }
        if ((i5 | 4) != c12676l.loadAd) {
            C11586l.admob("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (c10096lYandex.purchase) {
            c10096lYandex.purchase = false;
        }
        ((C10096l) obj).amazon(i5 | 3, c10096lYandex);
        return true;
    }

    public static void pro(StringBuilder sb, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            AbstractC16901l.m4216else(list, sb2, null, "<", ">", new C11203l(z2), 50);
        }
        if (z) {
            sb2.append("?");
        }
    }

    public static void purchase(StringBuilder sb, InterfaceC6902l interfaceC6902l) throws IOException {
        List parameters = interfaceC6902l.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((AbstractC9707l) obj).premium() == 2) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC16901l.m4216else(arrayList, sb, null, "context(", ") ", C1490l.f3725l, 50);
    }

    public static C1351l remoteconfig(long j, long j2, long j3, long j4, long j5, long j6, long j7, C8620l c8620l, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, C6956l c6956l, int i, int i2) {
        long j23 = (i & 2) != 0 ? C9735l.firebase : j2;
        long j24 = (i & 4) != 0 ? C9735l.firebase : j3;
        long j25 = C9735l.firebase;
        return vip(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, (C8620l) c6956l.isPro(AbstractC4524l.yandex)).loadAd(j, j23, j24, j25, (i & 16) != 0 ? j25 : j4, (i & 32) != 0 ? j25 : j5, (i & 64) != 0 ? j25 : j6, j25, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? j25 : j7, j25, (i & 1024) != 0 ? null : c8620l, j25, j25, j25, j25, (32768 & i) != 0 ? j25 : j8, (65536 & i) != 0 ? j25 : j9, (131072 & i) != 0 ? j25 : j10, j25, (524288 & i) != 0 ? j25 : j11, (1048576 & i) != 0 ? j25 : j12, (2097152 & i) != 0 ? j25 : j13, j25, j25, j25, j25, j25, (134217728 & i) != 0 ? j25 : j14, (268435456 & i) != 0 ? j25 : j15, (i & 536870912) != 0 ? j25 : j16, j25, j25, j25, j25, j25, (i2 & 16) != 0 ? j25 : j17, (i2 & 32) != 0 ? j25 : j18, (i2 & 64) != 0 ? j25 : j19, j25, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? j25 : j20, (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? j25 : j21, (i2 & 1024) != 0 ? j25 : j22, j25);
    }

    public static /* bridge */ C10096l signatures(Object obj) {
        AbstractC0288l abstractC0288l = (AbstractC0288l) obj;
        C10096l c10096l = abstractC0288l.zzc;
        if (c10096l != C10096l.billing) {
            return c10096l;
        }
        C10096l c10096lYandex = C10096l.yandex();
        abstractC0288l.zzc = c10096lYandex;
        return c10096lYandex;
    }

    public static C1351l smaato(C6956l c6956l) {
        return vip(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, (C8620l) c6956l.isPro(AbstractC4524l.yandex));
    }

    public static void subs(StringBuilder sb, InterfaceC6902l interfaceC6902l) {
        List listAdmob = ((InterfaceC18672l) interfaceC6902l).admob();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAdmob) {
            AbstractC9707l abstractC9707l = (AbstractC9707l) obj;
            if (abstractC9707l.premium() == 1 || abstractC9707l.premium() == 3) {
                arrayList.add(obj);
            }
        }
        AbstractC9707l abstractC9707l2 = (AbstractC9707l) AbstractC16901l.m4220for(0, arrayList);
        if (abstractC9707l2 != null) {
            sb.append(tapsense(abstractC9707l2.mo1109synchronized(), false));
            sb.append(".");
        }
        AbstractC9707l abstractC9707l3 = (AbstractC9707l) AbstractC16901l.m4220for(1, arrayList);
        if (abstractC9707l3 != null) {
            sb.append("(");
            sb.append(tapsense(abstractC9707l3.mo1109synchronized(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0050  */
    public static void subscription(StringBuilder sb, InterfaceC1388l interfaceC1388l, C16781l c16781l, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        boolean z3;
        if (interfaceC1388l.getTypeParameters().size() < list.size()) {
            InterfaceC13937l interfaceC13937l = (InterfaceC13937l) interfaceC1388l;
            if (interfaceC13937l.mo1730private().getDeclaringClass() != null) {
                sb2 = sb;
                z3 = z2;
                subscription(sb2, AbstractC18202l.yandex.loadAd(interfaceC13937l.mo1730private().getDeclaringClass()), c16781l.purchase(), AbstractC16901l.m4233package(interfaceC1388l.getTypeParameters().size(), list), false, z3);
                sb2.append(".");
                sb2.append(AbstractC3324l.billing(c16781l.mopub()));
            } else {
                sb2 = sb;
                z3 = z2;
                sb2.append(AbstractC3324l.admob(C16781l.billing(c16781l)));
            }
        } else {
            sb2 = sb;
            z3 = z2;
            sb2.append(AbstractC3324l.admob(C16781l.billing(c16781l)));
        }
        pro(sb2, AbstractC16901l.m4247try(list, interfaceC1388l.getTypeParameters().size()), z, z3);
    }

    public static String tapsense(InterfaceC13012l interfaceC13012l, boolean z) throws IOException {
        C16781l c16781l;
        AbstractC6786l abstractC6786l = (AbstractC6786l) interfaceC13012l;
        if (abstractC6786l.mo1770synchronized()) {
            return tapsense(abstractC6786l.mo1767extends(), true);
        }
        AbstractC6786l abstractC6786lMo1767extends = abstractC6786l.mo1767extends();
        AbstractC6786l abstractC6786lMo1765catch = abstractC6786l.mo1765catch();
        if (abstractC6786lMo1767extends != null && abstractC6786lMo1765catch != null) {
            String strLicense = license(abstractC6786lMo1767extends);
            String strLicense2 = license(abstractC6786lMo1765catch);
            if (AbstractC8576l.yandex(strLicense, AbstractC16648l.advert(strLicense2, "?", "", false))) {
                return AbstractC16648l.advert(strLicense2, "?", "!", false);
            }
            if (AbstractC16648l.Signature(strLicense2, "?", false)) {
                if ((strLicense + '?').equals(strLicense2)) {
                    return strLicense + '!';
                }
            }
            if (("(" + strLicense + ")?").equals(strLicense2)) {
                return AbstractC15560l.Signature("(", strLicense, ")!");
            }
            String strMopub = AbstractC3324l.mopub(strLicense, strLicense2, new C8362l(strLicense, 4), new C8362l(strLicense, 5), C12844l.f25254l);
            if (strMopub != null) {
                return strMopub;
            }
            return "(" + strLicense + ".." + strLicense2 + ')';
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC13012l interfaceC13012lSubs = abstractC6786l.subs();
        if (interfaceC13012lSubs != null) {
            sb.append(interfaceC13012lSubs);
            sb.append(" /* = ");
        }
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        if (interfaceC1122lMo1616package instanceof AbstractC11726l) {
            billing(((AbstractC11726l) interfaceC1122lMo1616package).crashlytics(), sb);
            if (interfaceC13012l.Signature()) {
                sb.append("?");
            } else if (abstractC6786l.pro()) {
                sb.append(" & Any");
            }
        } else if (interfaceC1122lMo1616package instanceof InterfaceC1388l) {
            InterfaceC1388l interfaceC1388l = (InterfaceC1388l) interfaceC1122lMo1616package;
            if (abstractC6786l.premium()) {
                c16781l = AbstractC3333l.loadAd;
            } else {
                InterfaceC1388l interfaceC1388lRemoteconfig = abstractC6786l.remoteconfig();
                if (interfaceC1388lRemoteconfig == null) {
                    interfaceC1388lRemoteconfig = interfaceC1388l;
                }
                String strBilling = interfaceC1388lRemoteconfig.billing();
                c16781l = strBilling != null ? new C16781l(strBilling) : null;
            }
            if (c16781l == null) {
                c16781l = new C16781l(((C5160l) interfaceC1388l).f11212l.getName());
            }
            if (c16781l.admob(AbstractC3974l.isPro) && AbstractC8576l.yandex(AbstractC10000l.mopub(c16781l), C1015l.amazon) && !interfaceC13012l.mo1617throws().contains(C0861l.crashlytics)) {
                if (abstractC6786l.Signature()) {
                    sb.append("(");
                }
                if (abstractC6786l.mo1769private()) {
                    sb.append("suspend ");
                }
                AbstractC16901l.m4216else(AbstractC16901l.m4242synchronized(1, abstractC6786l.mo1617throws()), sb, null, "(", ") -> ", null, 114);
                sb.append(AbstractC16901l.m4214continue(abstractC6786l.mo1617throws()));
                if (abstractC6786l.Signature()) {
                    sb.append(")?");
                }
            } else {
                subscription(sb, interfaceC1388l, c16781l, interfaceC13012l.mo1617throws(), interfaceC13012l.Signature(), z);
            }
        } else if (interfaceC1122lMo1616package instanceof C13194l) {
            C16781l c16781l2 = ((C13194l) interfaceC1122lMo1616package).f25805l.yandex;
            c16781l2.getClass();
            AbstractC16901l.m4216else(C16781l.billing(c16781l2), sb, ".", null, null, C12844l.f25261l, 60);
            sb = sb;
            pro(sb, interfaceC13012l.mo1617throws(), interfaceC13012l.Signature(), z);
        } else {
            sb.append("???");
        }
        if (abstractC6786l.subs() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public static C1351l vip(C0764l c0764l, C8620l c8620l) {
        C1351l c1351l = c0764l.f2305l;
        if (c1351l == null) {
            C1351l c1351l2 = new C1351l(AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 18), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.amazon(c0764l, 39), AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 2), c8620l, AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 26), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 2), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 19)), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 19)), AbstractC15038l.amazon(c0764l, 19));
            c0764l.f2305l = c1351l2;
            return c1351l2;
        }
        if (AbstractC8576l.yandex(c1351l.firebase, c8620l)) {
            return c1351l;
        }
        C1351l c1351lLoadAd = c1351l.loadAd(c1351l.yandex, c1351l.loadAd, c1351l.crashlytics, c1351l.amazon, c1351l.purchase, c1351l.billing, c1351l.mopub, c1351l.admob, c1351l.subs, c1351l.isPro, c8620l, c1351l.smaato, c1351l.remoteconfig, c1351l.vip, c1351l.metrica, c1351l.startapp, c1351l.adcel, c1351l.ads, c1351l.subscription, c1351l.tapsense, c1351l.Signature, c1351l.license, c1351l.pro, c1351l.ad, c1351l.advert, c1351l.isVip, c1351l.signatures, c1351l.premium, c1351l.applovin, c1351l.appmetrica, c1351l.inmobi, c1351l.f3469throws, c1351l.f3464package, c1351l.f3467synchronized, c1351l.f3466strictfp, c1351l.f3470volatile, c1351l.f3463native, c1351l.f3465private, c1351l.f3461extends, c1351l.f3462for, c1351l.f3468throw, c1351l.f3459catch, c1351l.f3460else);
        c0764l.f2305l = c1351lLoadAd;
        return c1351lLoadAd;
    }

    @Override // defpackage.InterfaceC5404l
    public void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        if (enumC9931l == EnumC9931l.f20223l) {
            AbstractC8313l.loadAd(i, iArr, iArr2, false);
        } else {
            AbstractC8313l.loadAd(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.InterfaceC15270l
    public byte[] admob(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int iMopub = AbstractC16784l.mopub(bigInteger);
        byte[] bArr = new byte[iMopub * 2];
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            C8339l.metrica("Value out of range");
            return null;
        }
        byte[] byteArray = bigInteger2.toByteArray();
        int iMax = Math.max(0, byteArray.length - iMopub);
        int length = byteArray.length - iMax;
        int i = iMopub - length;
        Arrays.fill(bArr, 0, i, (byte) 0);
        System.arraycopy(byteArray, iMax, bArr, i, length);
        if (bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            C8339l.metrica("Value out of range");
            return null;
        }
        byte[] byteArray2 = bigInteger3.toByteArray();
        int iMax2 = Math.max(0, byteArray2.length - iMopub);
        int length2 = byteArray2.length - iMax2;
        int i2 = (iMopub - length2) + iMopub;
        Arrays.fill(bArr, iMopub, i2, (byte) 0);
        System.arraycopy(byteArray2, iMax2, bArr, i2, length2);
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[PHI: r12
  0x0088: PHI (r12v20 java.lang.Object) = (r12v19 java.lang.Object), (r12v1 java.lang.Object) binds: [B:33:0x0085, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac A[PHI: r12
  0x00ac: PHI (r12v27 java.lang.Object) = (r12v26 java.lang.Object), (r12v1 java.lang.Object) binds: [B:41:0x00a9, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[Catch: Exception -> 0x0033, TRY_ENTER, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002e, B:48:0x00c6, B:50:0x00cc, B:52:0x00d0, B:54:0x00d8, B:56:0x00dc, B:57:0x00e5, B:59:0x00eb, B:61:0x00fa, B:62:0x00fe, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:70:0x0123, B:73:0x012a, B:74:0x012c, B:75:0x0139, B:77:0x013f, B:81:0x014e, B:85:0x0154, B:86:0x015b, B:45:0x00b4), top: B:97:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if (r12 == r5) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v43, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r12v49, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object ads(defpackage.AbstractC0283l r13) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8565l.ads(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object advert(C11610l c11610l, String str, AbstractC0283l abstractC0283l) throws Throwable {
        C4488l c4488l;
        if (abstractC0283l instanceof C4488l) {
            c4488l = (C4488l) abstractC0283l;
            int i = c4488l.f9119l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4488l.f9119l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4488l = new C4488l(this, abstractC0283l);
            }
        } else {
            c4488l = new C4488l(this, abstractC0283l);
        }
        Object objFirebase = c4488l.f9118l;
        int i2 = c4488l.f9119l;
        InterfaceC14029l interfaceC14029l = null;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objFirebase);
                C16552l c16552l = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                C4781l c4781l = new C4781l(c11610l, str, interfaceC14029l, 4);
                c4488l.f9119l = 1;
                objFirebase = AbstractC10999l.firebase(executorC6708l, c4781l, c4488l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(objFirebase);
            }
            Boolean bool = (Boolean) objFirebase;
            bool.getClass();
            return bool;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // defpackage.InterfaceC5404l
    public float amazon() {
        return 0.0f;
    }

    public void crashlytics(final String str, final Function2 function2, final boolean z, final C2403l c2403l, final Function2 function3, final Function2 function4, final Function2 function5, final InterfaceC6347l interfaceC6347l, final C1351l c1351l, final C17253l c17253l, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        Function2 function6;
        Function2 function7;
        C10754l c10754l = C15718l.f30873l;
        c6956l.m2133new(1806980801);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function6 = function2;
            i2 |= c6956l.admob(function6) ? 32 : 16;
        } else {
            function6 = function2;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.mopub(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(c10754l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.billing(c2403l) ? 131072 : 65536;
        }
        int i3 = 14155776 | i2;
        if ((100663296 & i) == 0) {
            function7 = function3;
            i3 |= c6956l.admob(function7) ? 67108864 : 33554432;
        } else {
            function7 = function3;
        }
        if ((805306368 & i) == 0) {
            i3 |= c6956l.admob(function4) ? 536870912 : 268435456;
        }
        int i4 = 8192;
        int i5 = (c6956l.admob(function5) ? 4 : 2) | 113249712;
        if (c6956l.billing(interfaceC6347l)) {
            i4 = 16384;
        }
        int i6 = i5 | i4 | (c6956l.billing(c1351l) ? 131072 : 65536) | (c6956l.billing(c17253l) ? 1048576 : 524288);
        if (c6956l.m2127for(i3 & 1, ((i3 & 306783379) == 306783378 && (38347923 & i6) == 38347922) ? false : true)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objM2132native = c6956l.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                objM2132native = new C4991l(new C3625l(str), C16313l.yandex);
                c6956l.m2147try(objM2132native);
            }
            String str2 = ((C4991l) objM2132native).yandex.f7563l;
            C10871l c10871l = new C10871l();
            c6956l.m2123default(-1353189719);
            c6956l.startapp(false);
            int i7 = i3 >> 12;
            AbstractC15042l.loadAd(str2, function6, c10871l, null, function7, function4, function5, null, null, true, z, false, c2403l, c17253l, c1351l, c15578l, c6956l, (i3 & 112) | (i7 & 57344) | (i7 & 458752) | ((i6 << 18) & 3670016) | 918552576, (i7 & 896) | ((i3 >> 9) & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 7168) | ((i6 >> 6) & 57344) | (i6 & 458752) | 1572864);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؙٟۜ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    this.f13981l.crashlytics(str, function2, z, c2403l, function3, function4, function5, interfaceC6347l, c1351l, c17253l, c15578l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r8 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Enum firebase(defpackage.C11610l r7, defpackage.AbstractC0283l r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C0818l
            if (r0 == 0) goto L13
            r0 = r8
            lؒؕؐ r0 = (defpackage.C0818l) r0
            int r1 = r0.f2452l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2452l = r1
            goto L18
        L13:
            lؒؕؐ r0 = new lؒؕؐ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f2453l
            int r1 = r0.f2452l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L31:
            lِؕؖ r7 = r0.f2454l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L47
        L37:
            defpackage.AbstractC2829l.crashlytics(r8)
            r0.f2454l = r7
            r0.f2452l = r4
            java.lang.String r8 = "https://api.vk.com/ping.txt"
            java.lang.Object r8 = r6.advert(r7, r8, r0)
            if (r8 != r5) goto L47
            goto L5e
        L47:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L52
            lٌ۠ۤ r6 = defpackage.EnumC9109l.f18708l
            return r6
        L52:
            r0.f2454l = r2
            r0.f2452l = r3
            java.lang.String r8 = "https://api.vk.ru/ping.txt"
            java.lang.Object r8 = r6.advert(r7, r8, r0)
            if (r8 != r5) goto L5f
        L5e:
            return r5
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 == 0) goto L6a
            lٌ۠ۤ r6 = defpackage.EnumC9109l.f18707l
            return r6
        L6a:
            lٌ۠ۤ r6 = defpackage.EnumC9109l.f18706l
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8565l.firebase(lِؕؖ, lّؑۧ):java.lang.Enum");
    }

    @Override // defpackage.InterfaceC5304l
    public InterfaceC17215l isPro(C5978l c5978l) {
        String str = c5978l.metrica;
        List list = c5978l.ads;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C15615l(list);
                case "application/pgs":
                    return new C12014l(20);
                case "application/x-mp4-vtt":
                    return new C5008l(16);
                case "text/vtt":
                    return new C5633l(2);
                case "application/x-quicktime-tx3g":
                    return new C6781l(list);
                case "text/x-ssa":
                    return new C14774l(list);
                case "application/vobsub":
                    return new C13076l(list);
                case "application/x-subrip":
                    return new C16982l();
                case "application/ttml+xml":
                    return new C8085l();
            }
        }
        C8339l.metrica(AbstractC14814l.startapp("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.InterfaceC4446l
    public PointF loadAd(C5071l c5071l, int i) {
        return new PointF(c5071l.yandex, c5071l.loadAd);
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Object mo2330l() {
        return f17668l;
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public Object mo2331l(InputStream inputStream) throws C16916l {
        try {
            C15913l c15913l = AbstractC8237l.amazon;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
            AbstractC11036l.purchase(inputStream, byteArrayOutputStream);
            String strAds = AbstractC16648l.ads(byteArrayOutputStream.toByteArray());
            c15913l.getClass();
            return (C15067l) c15913l.loadAd(C15067l.Companion.serializer(), strAds);
        } catch (Exception e) {
            throw new C16916l("Cannot parse session configs", e);
        }
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public Unit mo2332l(OutputStream outputStream, Object obj) throws IOException {
        outputStream.write(AbstractC8237l.amazon.crashlytics(C15067l.Companion.serializer(), (C15067l) obj).getBytes(AbstractC9050l.yandex));
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5304l
    public int metrica(C5978l c5978l) {
        String str = c5978l.metrica;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        C8339l.metrica(AbstractC14814l.startapp("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // defpackage.InterfaceC5304l
    public boolean mopub(C5978l c5978l) {
        String str = c5978l.metrica;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.InterfaceC3501l
    public void startapp(InterfaceC13490l interfaceC13490l, int i, int[] iArr, int[] iArr2) {
        AbstractC8313l.loadAd(i, iArr, iArr2, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C5510l c5510l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C13271l c13271l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C1834l c1834l;
        InterfaceC13012l interfaceC13012lYandex;
        int i = this.f17675l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C5510l) {
                    c5510l = (C5510l) abstractC0283l;
                    int i2 = c5510l.f11777l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5510l.f11777l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5510l = new C5510l(this, abstractC0283l);
                    }
                } else {
                    c5510l = new C5510l(this, abstractC0283l);
                }
                Object objYandex = c5510l.f11778l;
                int i3 = c5510l.f11777l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C18292l.class)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c5510l.f11777l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c5510l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C13271l) {
                    c13271l = (C13271l) abstractC0283l;
                    int i4 = c13271l.f26056l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13271l.f26056l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13271l = new C13271l(this, abstractC0283l);
                    }
                } else {
                    c13271l = new C13271l(this, abstractC0283l);
                }
                Object objYandex2 = c13271l.f26057l;
                int i5 = c13271l.f26056l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C8206l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c13271l.f26056l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c13271l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C1834l) {
                    c1834l = (C1834l) abstractC0283l;
                    int i6 = c1834l.f4237l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1834l.f4237l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1834l = new C1834l(this, abstractC0283l);
                    }
                } else {
                    c1834l = new C1834l(this, abstractC0283l);
                }
                Object objYandex3 = c1834l.f4238l;
                int i7 = c1834l.f4237l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C4324l.class);
                try {
                    interfaceC13012lYandex = AbstractC18202l.yandex(C4324l.class);
                } catch (Throwable unused3) {
                    interfaceC13012lYandex = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lYandex);
                c1834l.f4237l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c1834l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return new C0951l((C4324l) objYandex3);
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.auth.AnonymTokenResponseDto");
                return null;
        }
    }

    public String toString() {
        switch (this.f17675l) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC15270l
    public BigInteger[] yandex(BigInteger bigInteger, byte[] bArr) {
        int iMopub = AbstractC16784l.mopub(bigInteger);
        if (bArr.length != iMopub * 2) {
            C8339l.metrica("Encoding has incorrect length");
            return null;
        }
        BigInteger bigInteger2 = new BigInteger(1, AbstractC14024l.vip(0, iMopub, bArr));
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            C8339l.metrica("Value out of range");
            return null;
        }
        BigInteger bigInteger3 = new BigInteger(1, AbstractC14024l.vip(iMopub, iMopub + iMopub, bArr));
        if (bigInteger3.signum() >= 0 && bigInteger3.compareTo(bigInteger) < 0) {
            return new BigInteger[]{bigInteger2, bigInteger3};
        }
        C8339l.metrica("Value out of range");
        return null;
    }
}
