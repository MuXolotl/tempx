package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: lّؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0477l implements Handler.Callback, InterfaceC2417l, InterfaceC15310l {

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public static final long f1733l = AbstractC15323l.m3986try(10000);

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public int f1734l;

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public long f1735l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final boolean f1736l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public boolean f1737l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C17849l f1738l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long f1739l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public int f1740l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean[] f1741l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C7713l f1742l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public boolean f1743l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final long f1744l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C4705l f1745l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C14500l f1746l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public long f1747l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public long f1748l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public long f1749l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public boolean f1750l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C18527l f1751l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public boolean f1752l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public C5453l f1753l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C14500l f1754l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public boolean f1755l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC1091l[] f1756l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17424l[] f1757l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public C17361l f1758l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C5044l f1759l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C6788l f1760l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public boolean f1761l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public boolean f1762l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C17654l f1763l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public int f1764l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final boolean f1765l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Looper f1766l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public boolean f1767l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final ArrayList f1768l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C9598l f1769l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16717l f1770l;

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public boolean f1771l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public boolean f1772l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public boolean f1773l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public long f1774l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C13829l f1775l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C0498l f1776l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public boolean f1777l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C3904l f1778l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public C6817l f1779l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C17219l f1780l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C7865l f1781l;

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public float f1782l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C4322l f1783l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public C10749l f1784l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public int f1785l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C16990l f1786l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public C7534l f1787l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public boolean f1788l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public C6817l f1789l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C12031l f1790l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C17505l f1791l;

    public C0477l(Context context, AbstractC1091l[] abstractC1091lArr, AbstractC1091l[] abstractC1091lArr2, C16717l c16717l, C9598l c9598l, C7865l c7865l, C7713l c7713l, int i, boolean z, C17505l c17505l, C17654l c17654l, C4705l c4705l, long j, Looper looper, C18527l c18527l, C6788l c6788l, C17849l c17849l, final InterfaceC15310l interfaceC15310l, boolean z2) {
        C7534l c7534l = C7534l.yandex;
        this.f1735l = -9223372036854775807L;
        this.f1760l = c6788l;
        this.f1770l = c16717l;
        this.f1769l = c9598l;
        this.f1781l = c7865l;
        this.f1742l = c7713l;
        this.f1740l = i;
        this.f1755l = z;
        this.f1763l = c17654l;
        this.f1745l = c4705l;
        this.f1744l = j;
        this.f1777l = false;
        this.f1751l = c18527l;
        this.f1738l = c17849l;
        this.f1787l = c7534l;
        this.f1791l = c17505l;
        this.f1782l = 1.0f;
        this.f1775l = C13829l.loadAd;
        this.f1736l = z2;
        this.f1774l = -9223372036854775807L;
        this.f1749l = -9223372036854775807L;
        this.f1739l = c7865l.metrica;
        C6181l c6181l = AbstractC10759l.yandex;
        C10749l c10749lFirebase = C10749l.firebase(c9598l);
        this.f1784l = c10749lFirebase;
        this.f1753l = new C5453l(c10749lFirebase);
        this.f1756l = new AbstractC1091l[abstractC1091lArr.length];
        this.f1741l = new boolean[abstractC1091lArr.length];
        c16717l.getClass();
        this.f1757l = new C17424l[abstractC1091lArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < abstractC1091lArr.length; i2++) {
            AbstractC1091l abstractC1091l = abstractC1091lArr[i2];
            abstractC1091l.f3017l = i2;
            abstractC1091l.f3021l = c17849l;
            abstractC1091l.f3009l = c18527l;
            AbstractC1091l[] abstractC1091lArr3 = this.f1756l;
            abstractC1091l.getClass();
            abstractC1091lArr3[i2] = abstractC1091l;
            AbstractC1091l abstractC1091l2 = this.f1756l[i2];
            synchronized (abstractC1091l2.f3013l) {
                abstractC1091l2.f3024l = c16717l;
            }
            AbstractC1091l abstractC1091l3 = abstractC1091lArr2[i2];
            if (abstractC1091l3 != null) {
                abstractC1091l3.f3017l = i2;
                abstractC1091l3.f3021l = c17849l;
                abstractC1091l3.f3009l = c18527l;
                z3 = true;
            }
            C17424l[] c17424lArr = this.f1757l;
            AbstractC1091l abstractC1091l4 = abstractC1091lArr[i2];
            C17424l c17424l = new C17424l();
            c17424l.purchase = abstractC1091l4;
            c17424l.crashlytics = i2;
            c17424l.billing = abstractC1091l3;
            c17424l.amazon = 0;
            c17424l.yandex = false;
            c17424l.loadAd = false;
            c17424lArr[i2] = c17424l;
        }
        this.f1765l = z3;
        this.f1786l = new C16990l(this, c18527l);
        this.f1768l = new ArrayList();
        this.f1783l = new C4322l();
        this.f1778l = new C3904l();
        AbstractC12442l.subscription(c16717l.yandex == null);
        c16717l.yandex = this;
        c16717l.loadAd = c7713l;
        this.f1773l = true;
        C14500l c14500lYandex = c18527l.yandex(looper, null);
        this.f1754l = c14500lYandex;
        this.f1790l = new C12031l(c17505l, c14500lYandex, new C2683l(29, this));
        this.f1759l = new C5044l(this, c17505l, c14500lYandex, c17849l);
        C17219l c17219l = new C17219l();
        this.f1780l = c17219l;
        Looper looperM4282continue = c17219l.m4282continue();
        this.f1766l = looperM4282continue;
        C14500l c14500lYandex2 = c18527l.yandex(looperM4282continue, this);
        this.f1746l = c14500lYandex2;
        this.f1776l = new C0498l(context, looperM4282continue, this);
        c14500lYandex2.loadAd(35, new InterfaceC15310l() { // from class: lٌّۤ
            @Override // defpackage.InterfaceC15310l
            public final void loadAd(long j2, long j3, C5978l c5978l, MediaFormat mediaFormat) {
                interfaceC15310l.loadAd(j2, j3, c5978l, mediaFormat);
                this.f18803l.loadAd(j2, j3, c5978l, mediaFormat);
            }
        }).loadAd();
        c14500lYandex2.loadAd(39, new C15173l(this)).loadAd();
    }

    public static boolean advert(C12212l c12212l) {
        if (c12212l != null) {
            try {
                InterfaceC8782l interfaceC8782l = c12212l.yandex;
                if (c12212l.purchase) {
                    for (InterfaceC11759l interfaceC11759l : c12212l.crashlytics) {
                        if (interfaceC11759l != null) {
                            interfaceC11759l.firebase();
                        }
                    }
                } else {
                    interfaceC8782l.admob();
                }
                if ((!c12212l.purchase ? 0L : interfaceC8782l.billing()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static int m568continue(C4322l c4322l, C3904l c3904l, int i, boolean z, Object obj, AbstractC10759l abstractC10759l, AbstractC10759l abstractC10759l2) {
        AbstractC10759l abstractC10759l3 = abstractC10759l;
        Object obj2 = abstractC10759l3.remoteconfig(abstractC10759l3.mopub(obj, c3904l).crashlytics, c4322l, 0L).yandex;
        for (int i2 = 0; i2 < abstractC10759l2.metrica(); i2++) {
            if (abstractC10759l2.remoteconfig(i2, c4322l, 0L).yandex.equals(obj2)) {
                return i2;
            }
        }
        int iLoadAd = abstractC10759l3.loadAd(obj);
        int iAdmob = abstractC10759l3.admob();
        int iLoadAd2 = -1;
        int i3 = 0;
        while (i3 < iAdmob && iLoadAd2 == -1) {
            AbstractC10759l abstractC10759l4 = abstractC10759l3;
            int iAmazon = abstractC10759l4.amazon(iLoadAd, c3904l, c4322l, i, z);
            if (iAmazon == -1) {
                break;
            }
            iLoadAd2 = abstractC10759l2.loadAd(abstractC10759l4.smaato(iAmazon));
            i3++;
            abstractC10759l3 = abstractC10759l4;
            iLoadAd = iAmazon;
        }
        if (iLoadAd2 == -1) {
            return -1;
        }
        return abstractC10759l2.billing(iLoadAd2, c3904l, false).crashlytics;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static Pair m569switch(AbstractC10759l abstractC10759l, C6817l c6817l, boolean z, int i, boolean z2, C4322l c4322l, C3904l c3904l) {
        int iM568continue;
        AbstractC10759l abstractC10759l2 = c6817l.yandex;
        if (abstractC10759l.startapp()) {
            return null;
        }
        AbstractC10759l abstractC10759l3 = abstractC10759l2.startapp() ? abstractC10759l : abstractC10759l2;
        try {
            Pair pairSubs = abstractC10759l3.subs(c4322l, c3904l, c6817l.loadAd, c6817l.crashlytics);
            if (!abstractC10759l.equals(abstractC10759l3)) {
                if (abstractC10759l.loadAd(pairSubs.first) == -1) {
                    if (!z || (iM568continue = m568continue(c4322l, c3904l, i, z2, pairSubs.first, abstractC10759l3, abstractC10759l)) == -1) {
                        return null;
                    }
                    return abstractC10759l.subs(c4322l, c3904l, iM568continue, -9223372036854775807L);
                }
                if (abstractC10759l3.mopub(pairSubs.first, c3904l).billing && abstractC10759l3.remoteconfig(c3904l.crashlytics, c4322l, 0L).vip == abstractC10759l3.loadAd(pairSubs.first)) {
                    return abstractC10759l.subs(c4322l, c3904l, abstractC10759l.mopub(pairSubs.first, c3904l).crashlytics, c6817l.crashlytics);
                }
            }
            return pairSubs;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0232  */
    /* JADX WARN: Code duplicated, block: B:140:0x029c  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02df  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:169:0x030f  */
    /* JADX WARN: Code duplicated, block: B:177:0x032e  */
    /* JADX WARN: Code duplicated, block: B:257:0x042b  */
    /* JADX WARN: Code duplicated, block: B:258:0x042d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0446  */
    /* JADX WARN: Code duplicated, block: B:265:0x044c  */
    /* JADX WARN: Code duplicated, block: B:266:0x044e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0474  */
    /* JADX WARN: Code duplicated, block: B:275:0x048b  */
    /* JADX WARN: Code duplicated, block: B:276:0x048d  */
    /* JADX WARN: Code duplicated, block: B:279:0x049a  */
    /* JADX WARN: Code duplicated, block: B:281:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:283:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:284:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:288:0x04d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [lُؐۛ] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r2v10, types: [lُؐۛ] */
    /* JADX WARN: Type inference failed for: r2v15, types: [lُؐؗ] */
    /* JADX WARN: Type inference failed for: r2v31, types: [lؘِۖ] */
    /* JADX WARN: Type inference failed for: r45v0, types: [lّؑٞ] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [lُؐۛ] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Signature(AbstractC10759l abstractC10759l, boolean z) throws Throwable {
        long j;
        C4322l c4322l;
        Object obj;
        int iYandex;
        long jFirebase;
        boolean z2;
        boolean z3;
        boolean z4;
        AbstractC10759l abstractC10759l2;
        C3904l c3904l;
        boolean z5;
        AbstractC10759l abstractC10759l3;
        C3904l c3904l2;
        AbstractC10759l abstractC10759l4;
        long jLongValue;
        boolean z6;
        int i;
        int i2;
        long jMin;
        long j2;
        boolean z7;
        int i3;
        int i4;
        boolean z8;
        C2635l c2635l;
        int i5;
        long jLongValue2;
        boolean z9;
        int iYandex2;
        boolean z10;
        C3904l c3904l3;
        AbstractC10759l abstractC10759l5;
        ?? r11;
        C5019l c5019l;
        long j3;
        C5019l c5019l2;
        boolean z11;
        long j4;
        boolean z12;
        ?? r8;
        C12212l c12212l;
        long j5;
        C5019l c5019l3;
        boolean z13;
        long j6;
        C10749l c10749l = this.f1784l;
        C6817l c6817l = this.f1789l;
        C12031l c12031l = this.f1790l;
        int i6 = this.f1740l;
        boolean z14 = this.f1755l;
        C4322l c4322l2 = this.f1783l;
        C3904l c3904l4 = this.f1778l;
        if (abstractC10759l.startapp()) {
            C5019l c5019l4 = C10749l.Signature;
            boolean z15 = (c5019l4.equals(c10749l.loadAd) && c10749l.subscription == 0) ? false : true;
            C2635l c2635l2 = new C2635l(c5019l4, 0L, -9223372036854775807L, false, true, false, z15, z15 && z && !c10749l.yandex.startapp() && !c10749l.yandex.mopub(c10749l.loadAd.yandex, c3904l4).billing, 4);
            abstractC10759l5 = abstractC10759l;
            c2635l = c2635l2;
            c3904l3 = c3904l4;
        } else {
            C5019l c5019l5 = c10749l.loadAd;
            Object obj2 = c5019l5.yandex;
            AbstractC10759l abstractC10759l6 = c10749l.yandex;
            boolean z16 = abstractC10759l6.startapp() || abstractC10759l6.mopub(c5019l5.yandex, c3904l4).billing;
            long j7 = (c10749l.loadAd.loadAd() || z16) ? c10749l.crashlytics : c10749l.subscription;
            if (c6817l != null) {
                boolean z17 = true;
                j = 1;
                AbstractC10759l abstractC10759l7 = abstractC10759l;
                Pair pairM569switch = m569switch(abstractC10759l7, c6817l, true, i6, z14, c4322l2, c3904l4);
                if (pairM569switch == null) {
                    iYandex2 = abstractC10759l7.yandex(z14);
                    obj = obj2;
                    jLongValue2 = j7;
                    z9 = false;
                    z10 = false;
                } else {
                    long j8 = c6817l.crashlytics;
                    obj = pairM569switch.first;
                    if (j8 == -9223372036854775807L) {
                        iYandex2 = abstractC10759l7.mopub(obj, c3904l4).crashlytics;
                        obj = obj2;
                        jLongValue2 = j7;
                        z9 = false;
                    } else {
                        jLongValue2 = ((Long) pairM569switch.second).longValue();
                        z9 = true;
                        iYandex2 = -1;
                    }
                    z10 = c10749l.purchase == 4;
                    z17 = false;
                }
                j7 = jLongValue2;
                z4 = z9;
                z3 = z17;
                z2 = z10;
                iYandex = iYandex2;
                c4322l = c4322l2;
                abstractC10759l4 = abstractC10759l7;
                c3904l2 = c3904l4;
            } else {
                j = 1;
                AbstractC10759l abstractC10759l8 = abstractC10759l;
                if (c10749l.yandex.startapp()) {
                    iYandex = abstractC10759l8.yandex(z14);
                    c4322l = c4322l2;
                    obj = obj2;
                } else if (abstractC10759l8.loadAd(obj2) == -1) {
                    int iM568continue = m568continue(c4322l2, c3904l4, i6, z14, obj, c10749l.yandex, abstractC10759l8);
                    c4322l = c4322l2;
                    if (iM568continue == -1) {
                        obj = obj2;
                        abstractC10759l2 = abstractC10759l8;
                        c3904l = c3904l4;
                        iM568continue = abstractC10759l2.yandex(z14);
                        z5 = true;
                    } else {
                        obj = obj2;
                        abstractC10759l2 = abstractC10759l8;
                        c3904l = c3904l4;
                        z5 = false;
                    }
                    iYandex = iM568continue;
                    z3 = z5;
                    j7 = j7;
                    z2 = false;
                    abstractC10759l3 = abstractC10759l2;
                    z4 = false;
                    abstractC10759l4 = abstractC10759l3;
                    c3904l2 = c3904l;
                } else {
                    c4322l = c4322l2;
                    if (j7 == -9223372036854775807L) {
                        obj = obj2;
                        iYandex = abstractC10759l8.mopub(obj, c3904l4).crashlytics;
                    } else if (z16) {
                        c10749l.yandex.mopub(c5019l5.yandex, c3904l4);
                        if (c10749l.yandex.remoteconfig(c3904l4.crashlytics, c4322l, 0L).vip == c10749l.yandex.loadAd(c5019l5.yandex)) {
                            Pair pairSubs = abstractC10759l8.subs(c4322l, c3904l4, abstractC10759l8.mopub(obj, c3904l4).crashlytics, j7 + c3904l4.purchase);
                            obj = pairSubs.first;
                            jFirebase = ((Long) pairSubs.second).longValue();
                        } else {
                            jFirebase = abstractC10759l8.mopub(obj, c3904l4).amazon != -9223372036854775807L ? AbstractC15323l.firebase(j7, 0L, c3904l4.amazon - 1) : j7;
                        }
                        j7 = jFirebase;
                        iYandex = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        abstractC10759l4 = abstractC10759l8;
                        c3904l2 = c3904l4;
                    } else {
                        iYandex = -1;
                        z2 = false;
                        z3 = false;
                        abstractC10759l3 = abstractC10759l8;
                        c3904l = c3904l4;
                        z4 = false;
                        abstractC10759l4 = abstractC10759l3;
                        c3904l2 = c3904l;
                    }
                }
                z2 = false;
                z3 = false;
                abstractC10759l3 = abstractC10759l8;
                c3904l = c3904l4;
                z4 = false;
                abstractC10759l4 = abstractC10759l3;
                c3904l2 = c3904l;
            }
            if (iYandex != -1) {
                Pair pairSubs2 = abstractC10759l4.subs(c4322l, c3904l2, iYandex, -9223372036854775807L);
                obj = pairSubs2.first;
                jLongValue = ((Long) pairSubs2.second).longValue();
                j7 = -9223372036854775807L;
            } else {
                jLongValue = j7;
            }
            C5019l c5019lAdcel = c12031l.adcel(abstractC10759l4, obj, jLongValue);
            int i7 = c5019lAdcel.purchase;
            boolean z18 = i7 == -1 || ((i5 = c5019l5.purchase) != -1 && i7 >= i5);
            boolean zEquals = c5019l5.yandex.equals(obj);
            boolean z19 = zEquals && !c5019l5.loadAd() && !c5019lAdcel.loadAd() && z18;
            C3904l c3904lMopub = abstractC10759l4.mopub(obj, c3904l2);
            if (z16 || j7 != j7) {
                z6 = false;
            } else {
                Object obj3 = c5019l5.yandex;
                int i8 = c5019l5.crashlytics;
                int i9 = c5019l5.loadAd;
                if (obj3.equals(c5019lAdcel.yandex) && (!(c5019l5.loadAd() && c3904lMopub.admob(i9)) ? c5019lAdcel.loadAd() && c3904lMopub.admob(c5019lAdcel.loadAd) : !(c3904lMopub.purchase(i9, i8) == 4 || c3904lMopub.purchase(i9, i8) == 2))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (z19 || z6) {
                c5019lAdcel = c5019l5;
            }
            if (!c5019lAdcel.loadAd()) {
                if (zEquals && c5019l5.loadAd()) {
                    C8597l c8597lYandex = abstractC10759l4.mopub(obj, c3904l2).mopub.yandex(c5019l5.loadAd);
                    long j9 = c8597lYandex.isPro;
                    long j10 = c10749l.crashlytics;
                    if (j10 != -9223372036854775807L) {
                        long j11 = c8597lYandex.yandex;
                        if (j11 == Long.MIN_VALUE || j11 + j9 > j10) {
                            i = c8597lYandex.loadAd;
                            i2 = c5019l5.crashlytics;
                            if (i <= i2 && c8597lYandex.billing[i2] == 2) {
                                long j12 = abstractC10759l4.mopub(obj, c3904l2).amazon;
                                jMin = j12 != -9223372036854775807L ? Math.min(j12 - j, jLongValue + j9) : jLongValue + j9;
                                j2 = jMin;
                            }
                        }
                    } else {
                        i = c8597lYandex.loadAd;
                        i2 = c5019l5.crashlytics;
                        if (i <= i2) {
                        }
                    }
                }
                if (c5019lAdcel.equals(c10749l.loadAd) || jMin != c10749l.subscription) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (abstractC10759l4.loadAd(c10749l.loadAd.yandex) == -1) {
                    i3 = 4;
                } else {
                    i3 = 3;
                }
                if (c5019lAdcel.yandex.equals(c10749l.loadAd.yandex) || c5019lAdcel.loadAd == -1) {
                    i4 = i3;
                } else {
                    C8597l c8597lYandex2 = abstractC10759l4.mopub(c5019lAdcel.yandex, c3904l2).mopub.yandex(c5019lAdcel.loadAd);
                    int i10 = c5019lAdcel.crashlytics;
                    int[] iArr = c8597lYandex2.billing;
                    if (i10 >= iArr.length || iArr[i10] != 2) {
                        i4 = 0;
                    } else {
                        i4 = i3;
                    }
                }
                if (z7 || !z || c10749l.yandex.startapp() || c10749l.yandex.mopub(c10749l.loadAd.yandex, c3904l2).billing) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                c2635l = new C2635l(c5019lAdcel, jMin, j2, z2, z3, z4, z7, z8, i4);
                abstractC10759l5 = abstractC10759l4;
                c3904l3 = c3904l2;
            } else if (c5019lAdcel.equals(c5019l5)) {
                jLongValue = c10749l.subscription;
            } else {
                abstractC10759l4.mopub(c5019lAdcel.yandex, c3904l2);
                jLongValue = c5019lAdcel.crashlytics == c3904l2.billing(c5019lAdcel.loadAd) ? c3904l2.mopub.loadAd : 0L;
            }
            jMin = jLongValue;
            j2 = j7;
            if (c5019lAdcel.equals(c10749l.loadAd)) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (abstractC10759l4.loadAd(c10749l.loadAd.yandex) == -1) {
                i3 = 4;
            } else {
                i3 = 3;
            }
            if (c5019lAdcel.yandex.equals(c10749l.loadAd.yandex)) {
                i4 = i3;
            } else {
                i4 = i3;
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            c2635l = new C2635l(c5019lAdcel, jMin, j2, z2, z3, z4, z7, z8, i4);
            abstractC10759l5 = abstractC10759l4;
            c3904l3 = c3904l2;
        }
        C5019l c5019l6 = c2635l.yandex;
        long jM576default = c2635l.loadAd;
        try {
            if (c2635l.purchase) {
                z12 = true;
                if (this.f1784l.purchase != 1) {
                    m583implements(4);
                }
                m613throw(false, false, false, true);
            } else {
                z12 = true;
            }
            C17424l[] c17424lArr = this.f1757l;
            int length = c17424lArr.length;
            int i11 = 0;
            ?? r9 = c3904l3;
            while (i11 < length) {
                C17424l c17424l = c17424lArr[i11];
                AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.purchase;
                boolean zEquals2 = Objects.equals(abstractC1091l.f3011l, abstractC10759l5);
                if (!zEquals2) {
                    abstractC1091l.f3011l = abstractC10759l5;
                    abstractC1091l.license();
                }
                AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.billing;
                if (abstractC1091l2 != null && !Objects.equals(abstractC1091l2.f3011l, abstractC10759l5)) {
                    abstractC1091l2.f3011l = abstractC10759l5;
                    abstractC1091l2.license();
                }
                i11++;
                r9 = zEquals2;
            }
            try {
                if (c2635l.mopub) {
                    r9 = abstractC10759l5;
                    if (r9.startapp()) {
                        c5019l = c5019l6;
                    } else {
                        for (C12212l c12212l2 = this.f1790l.subs; c12212l2 != null; c12212l2 = c12212l2.remoteconfig) {
                            if (c12212l2.mopub.yandex.equals(c5019l6)) {
                                c12212l2.mopub = this.f1790l.subs(r9, c12212l2.mopub);
                                c12212l2.firebase();
                            }
                        }
                        boolean z20 = c2635l.amazon;
                        try {
                            C12031l c12031l2 = this.f1790l;
                            c5019l = c5019l6;
                            try {
                                jM576default = m576default(c5019l, jM576default, c12031l2.subs != c12031l2.isPro ? z12 : false, z20);
                            } catch (Throwable th) {
                                th = th;
                                jM576default = jM576default;
                                r8 = r9;
                                r11 = r8;
                                C10749l c10749l2 = this.f1784l;
                                AbstractC10759l abstractC10759l9 = c10749l2.yandex;
                                C5019l c5019l7 = c10749l2.loadAd;
                                if (c2635l.billing) {
                                    j3 = jM576default;
                                } else {
                                    j3 = -9223372036854775807L;
                                }
                                c5019l2 = c5019l;
                                m596l(r11, c5019l2, abstractC10759l9, c5019l7, j3, false);
                                if (c2635l.mopub) {
                                    long j13 = c2635l.crashlytics;
                                    z11 = c2635l.admob;
                                    if (z11) {
                                        j4 = jM576default;
                                    } else {
                                        j4 = this.f1784l.amazon;
                                    }
                                    this.f1784l = ad(c5019l2, jM576default, j13, j4, z11, c2635l.subs);
                                } else {
                                    long j14 = c2635l.crashlytics;
                                    z11 = c2635l.admob;
                                    if (z11) {
                                        j4 = jM576default;
                                    } else {
                                        j4 = this.f1784l.amazon;
                                    }
                                    this.f1784l = ad(c5019l2, jM576default, j14, j4, z11, c2635l.subs);
                                }
                                m573catch();
                                m572case(r11, this.f1784l.yandex);
                                this.f1784l = this.f1784l.isPro(r11);
                                if (!r11.startapp()) {
                                    this.f1789l = null;
                                }
                                tapsense(false);
                                this.f1746l.mopub(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c5019l = c5019l6;
                            r8 = r9;
                            r11 = r8;
                            C10749l c10749l3 = this.f1784l;
                            AbstractC10759l abstractC10759l10 = c10749l3.yandex;
                            C5019l c5019l8 = c10749l3.loadAd;
                            if (c2635l.billing) {
                                j3 = jM576default;
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            c5019l2 = c5019l;
                            m596l(r11, c5019l2, abstractC10759l10, c5019l8, j3, false);
                            if (c2635l.mopub) {
                                long j15 = c2635l.crashlytics;
                                z11 = c2635l.admob;
                                if (z11) {
                                    j4 = jM576default;
                                } else {
                                    j4 = this.f1784l.amazon;
                                }
                                this.f1784l = ad(c5019l2, jM576default, j15, j4, z11, c2635l.subs);
                            } else {
                                long j16 = c2635l.crashlytics;
                                z11 = c2635l.admob;
                                if (z11) {
                                    j4 = jM576default;
                                } else {
                                    j4 = this.f1784l.amazon;
                                }
                                this.f1784l = ad(c5019l2, jM576default, j16, j4, z11, c2635l.subs);
                            }
                            m573catch();
                            m572case(r11, this.f1784l.yandex);
                            this.f1784l = this.f1784l.isPro(r11);
                            if (!r11.startapp()) {
                                this.f1789l = null;
                            }
                            tapsense(false);
                            this.f1746l.mopub(2);
                            throw th;
                        }
                    }
                    C10749l c10749l4 = this.f1784l;
                    AbstractC10759l abstractC10759l11 = c10749l4.yandex;
                    C5019l c5019l9 = c10749l4.loadAd;
                    if (c2635l.billing) {
                        j5 = jM576default;
                    } else {
                        j5 = -9223372036854775807L;
                    }
                    c5019l3 = c5019l;
                    m596l(abstractC10759l, c5019l3, abstractC10759l11, c5019l9, j5, false);
                    if (c2635l.mopub) {
                        long j17 = c2635l.crashlytics;
                        z13 = c2635l.admob;
                        if (z13) {
                            j6 = jM576default;
                        } else {
                            j6 = this.f1784l.amazon;
                        }
                        this.f1784l = ad(c5019l3, jM576default, j17, j6, z13, c2635l.subs);
                    } else {
                        long j18 = c2635l.crashlytics;
                        z13 = c2635l.admob;
                        if (z13) {
                            j6 = jM576default;
                        } else {
                            j6 = this.f1784l.amazon;
                        }
                        this.f1784l = ad(c5019l3, jM576default, j18, j6, z13, c2635l.subs);
                    }
                    m573catch();
                    m572case(abstractC10759l, this.f1784l.yandex);
                    this.f1784l = this.f1784l.isPro(abstractC10759l);
                    if (!abstractC10759l.startapp()) {
                        this.f1789l = null;
                    }
                    tapsense(false);
                    this.f1746l.mopub(2);
                    return;
                }
                try {
                    C12212l c12212l3 = this.f1790l.isPro;
                    try {
                        try {
                            int iTapsense = this.f1790l.tapsense(abstractC10759l, this.f1748l, c12212l3 == null ? 0L : remoteconfig(c12212l3), (!purchase() || (c12212l = this.f1790l.firebase) == null) ? 0L : remoteconfig(c12212l));
                            if ((iTapsense & 1) != 0) {
                                m586interface(false);
                            } else if ((iTapsense & 2) != 0) {
                                mopub();
                            }
                            c5019l = c5019l6;
                            C10749l c10749l5 = this.f1784l;
                            AbstractC10759l abstractC10759l12 = c10749l5.yandex;
                            C5019l c5019l10 = c10749l5.loadAd;
                            if (c2635l.billing) {
                                j5 = jM576default;
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            c5019l3 = c5019l;
                            m596l(abstractC10759l, c5019l3, abstractC10759l12, c5019l10, j5, false);
                            if (c2635l.mopub || c2635l.crashlytics != this.f1784l.crashlytics) {
                                long j19 = c2635l.crashlytics;
                                z13 = c2635l.admob;
                                if (z13) {
                                    j6 = jM576default;
                                } else {
                                    j6 = this.f1784l.amazon;
                                }
                                this.f1784l = ad(c5019l3, jM576default, j19, j6, z13, c2635l.subs);
                            }
                            m573catch();
                            m572case(abstractC10759l, this.f1784l.yandex);
                            this.f1784l = this.f1784l.isPro(abstractC10759l);
                            if (!abstractC10759l.startapp()) {
                                this.f1789l = null;
                            }
                            tapsense(false);
                            this.f1746l.mopub(2);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            r9 = abstractC10759l;
                            c5019l = c5019l6;
                            r8 = r9;
                            r11 = r8;
                            C10749l c10749l6 = this.f1784l;
                            AbstractC10759l abstractC10759l13 = c10749l6.yandex;
                            C5019l c5019l11 = c10749l6.loadAd;
                            if (c2635l.billing) {
                                j3 = jM576default;
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            c5019l2 = c5019l;
                            m596l(r11, c5019l2, abstractC10759l13, c5019l11, j3, false);
                            if (c2635l.mopub) {
                                long j110 = c2635l.crashlytics;
                                z11 = c2635l.admob;
                                if (z11) {
                                    j4 = jM576default;
                                } else {
                                    j4 = this.f1784l.amazon;
                                }
                                this.f1784l = ad(c5019l2, jM576default, j110, j4, z11, c2635l.subs);
                            } else {
                                long j111 = c2635l.crashlytics;
                                z11 = c2635l.admob;
                                if (z11) {
                                    j4 = jM576default;
                                } else {
                                    j4 = this.f1784l.amazon;
                                }
                                this.f1784l = ad(c5019l2, jM576default, j111, j4, z11, c2635l.subs);
                            }
                            m573catch();
                            m572case(r11, this.f1784l.yandex);
                            this.f1784l = this.f1784l.isPro(r11);
                            if (!r11.startapp()) {
                                this.f1789l = null;
                            }
                            tapsense(false);
                            this.f1746l.mopub(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r9 = abstractC10759l;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r9 = abstractC10759l5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            r11 = abstractC10759l5;
            c5019l = c5019l6;
        }
        C10749l c10749l7 = this.f1784l;
        AbstractC10759l abstractC10759l14 = c10749l7.yandex;
        C5019l c5019l12 = c10749l7.loadAd;
        if (c2635l.billing) {
            j3 = jM576default;
        } else {
            j3 = -9223372036854775807L;
        }
        c5019l2 = c5019l;
        m596l(r11, c5019l2, abstractC10759l14, c5019l12, j3, false);
        if (c2635l.mopub || c2635l.crashlytics != this.f1784l.crashlytics) {
            long j112 = c2635l.crashlytics;
            z11 = c2635l.admob;
            if (z11) {
                j4 = jM576default;
            } else {
                j4 = this.f1784l.amazon;
            }
            this.f1784l = ad(c5019l2, jM576default, j112, j4, z11, c2635l.subs);
        }
        m573catch();
        m572case(r11, this.f1784l.yandex);
        this.f1784l = this.f1784l.isPro(r11);
        if (!r11.startapp()) {
            this.f1789l = null;
        }
        tapsense(false);
        this.f1746l.mopub(2);
        throw th;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m570abstract(C6428l c6428l) throws Throwable {
        this.f1753l.purchase(1);
        int i = c6428l.crashlytics;
        C12800l c12800l = c6428l.loadAd;
        ArrayList arrayList = c6428l.yandex;
        if (i != -1) {
            this.f1789l = new C6817l(new C12164l(arrayList, c12800l), c6428l.crashlytics, c6428l.amazon);
        }
        C5044l c5044l = this.f1759l;
        ArrayList arrayList2 = (ArrayList) c5044l.crashlytics;
        c5044l.subs(0, arrayList2.size());
        Signature(c5044l.yandex(arrayList2.size(), arrayList, c12800l), false);
    }

    public final C10749l ad(C5019l c5019l, long j, long j2, long j3, boolean z, int i) {
        C13708l c13708lMopub;
        boolean z2;
        this.f1773l = (!this.f1773l && j == this.f1784l.subscription && c5019l.equals(this.f1784l.loadAd)) ? false : true;
        m573catch();
        C10749l c10749l = this.f1784l;
        C8750l c8750l = c10749l.admob;
        C9598l c9598l = c10749l.subs;
        List list = c10749l.isPro;
        if (this.f1759l.yandex) {
            C12212l c12212l = this.f1790l.subs;
            c8750l = c12212l == null ? C8750l.amazon : c12212l.vip;
            c9598l = c12212l == null ? this.f1769l : c12212l.metrica;
            InterfaceC10376l[] interfaceC10376lArr = (InterfaceC10376l[]) c9598l.f19553l;
            C16971l c16971l = new C16971l(4);
            boolean z3 = false;
            for (InterfaceC10376l interfaceC10376l : interfaceC10376lArr) {
                if (interfaceC10376l != null) {
                    C7417l c7417l = interfaceC10376l.metrica(0).smaato;
                    if (c7417l == null) {
                        c16971l.crashlytics(new C7417l(new InterfaceC1525l[0]));
                    } else {
                        c16971l.crashlytics(c7417l);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                c13708lMopub = c16971l.mopub();
            } else {
                C9258l c9258l = AbstractC1186l.f3181l;
                c13708lMopub = C13708l.f26763l;
            }
            list = c13708lMopub;
            if (c12212l != null) {
                C11496l c11496l = c12212l.mopub;
                if (c11496l.amazon != j2) {
                    c12212l.mopub = c11496l.yandex(j2);
                }
            }
            C17424l[] c17424lArr = this.f1757l;
            C12031l c12031l = this.f1790l;
            C12212l c12212l2 = c12031l.subs;
            if (c12212l2 == c12031l.isPro && c12212l2 != null) {
                C9598l c9598l2 = c12212l2.metrica;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c17424lArr.length) {
                        z2 = true;
                        break;
                    }
                    if (c9598l2.premium(i2)) {
                        if (c17424lArr[i2].purchase() != 1) {
                            z2 = false;
                            break;
                        }
                        if (((C17614l[]) c9598l2.f19549l)[i2].yandex != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f1743l) {
                    this.f1743l = z5;
                    if (!z5 && this.f1784l.startapp) {
                        this.f1746l.mopub(2);
                    }
                }
            }
        } else if (!c5019l.equals(c10749l.loadAd)) {
            c8750l = C8750l.amazon;
            c9598l = this.f1769l;
            list = C13708l.f26763l;
        }
        C9598l c9598l3 = c9598l;
        List list2 = list;
        C8750l c8750l2 = c8750l;
        if (z) {
            C5453l c5453l = this.f1753l;
            if (!c5453l.purchase || c5453l.crashlytics == 5) {
                c5453l.amazon = true;
                c5453l.purchase = true;
                c5453l.crashlytics = i;
            } else {
                AbstractC12442l.admob(i == 5);
            }
        }
        C10749l c10749l2 = this.f1784l;
        return c10749l2.amazon(c5019l, j, j2, j3, metrica(c10749l2.adcel), c8750l2, c9598l3, list2);
    }

    public final void adcel() {
        m600l(this.f1782l);
    }

    public final void admob(int i) {
        C17424l[] c17424lArr = this.f1757l;
        int iCrashlytics = c17424lArr[i].crashlytics();
        C17424l c17424l = c17424lArr[i];
        AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.purchase;
        C16990l c16990l = this.f1786l;
        c17424l.yandex(abstractC1091l, c16990l);
        AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.billing;
        if (abstractC1091l2 != null) {
            boolean z = C17424l.subs(abstractC1091l2) && c17424l.amazon != 3;
            c17424l.yandex(abstractC1091l2, c16990l);
            c17424l.isPro(false);
            if (z) {
                AbstractC1091l abstractC1091l3 = (AbstractC1091l) c17424l.purchase;
                abstractC1091l2.getClass();
                abstractC1091l2.yandex(17, abstractC1091l3);
            }
        }
        c17424l.amazon = 0;
        m603package(i, false);
        this.f1785l -= iCrashlytics;
    }

    public final void ads(InterfaceC8782l interfaceC8782l) {
        C12031l c12031l = this.f1790l;
        C12212l c12212l = c12031l.smaato;
        if (c12212l != null && c12212l.yandex == interfaceC8782l) {
            c12031l.vip(this.f1748l);
            premium();
            return;
        }
        C12212l c12212l2 = c12031l.remoteconfig;
        if (c12212l2 == null || c12212l2.yandex != interfaceC8782l) {
            return;
        }
        applovin();
    }

    public final void amazon() {
        for (C17424l c17424l : this.f1757l) {
            C13829l c13829l = this.f1788l ? this.f1775l : null;
            ((AbstractC1091l) c17424l.purchase).yandex(18, c13829l);
            AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
            if (abstractC1091l != null) {
                abstractC1091l.yandex(18, c13829l);
            }
        }
    }

    public final void applovin() {
        C12031l c12031l = this.f1790l;
        c12031l.smaato();
        C12212l c12212l = c12031l.remoteconfig;
        if (c12212l != null) {
            InterfaceC8782l interfaceC8782l = c12212l.yandex;
            if ((!c12212l.amazon || c12212l.purchase) && !interfaceC8782l.amazon()) {
                AbstractC10759l abstractC10759l = this.f1784l.yandex;
                if (c12212l.purchase) {
                    interfaceC8782l.ads();
                }
                Iterator it = this.f1781l.adcel.values().iterator();
                while (it.hasNext()) {
                    if (((C2492l) it.next()).loadAd) {
                        return;
                    }
                }
                if (!c12212l.amazon) {
                    long j = c12212l.mopub.loadAd;
                    c12212l.amazon = true;
                    interfaceC8782l.vip(this, j);
                    return;
                }
                C7751l c7751l = new C7751l();
                c7751l.yandex = this.f1748l - c12212l.startapp;
                float f = this.f1786l.billing().yandex;
                AbstractC12442l.admob(f > 0.0f || f == -3.4028235E38f);
                c7751l.loadAd = f;
                long j2 = this.f1749l;
                AbstractC12442l.admob(j2 >= 0 || j2 == -9223372036854775807L);
                c7751l.crashlytics = j2;
                C11495l c11495l = new C11495l(c7751l);
                AbstractC12442l.subscription(c12212l.remoteconfig == null);
                interfaceC8782l.adcel(c11495l);
            }
        }
    }

    public final void appmetrica() {
        C5453l c5453l = this.f1753l;
        C10749l c10749l = this.f1784l;
        boolean z = c5453l.amazon | (((C10749l) c5453l.billing) != c10749l);
        c5453l.amazon = z;
        c5453l.billing = c10749l;
        if (z) {
            C17804l c17804l = this.f1760l.f14221l;
            c17804l.f34709l.amazon(new RunnableC0336l(c17804l, c5453l, 22));
            this.f1753l = new C5453l(this.f1784l);
        }
    }

    public final void billing() {
        m581for();
        m586interface(true);
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m571break(C13829l c13829l) {
        this.f1775l = c13829l;
        amazon();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m572case(AbstractC10759l abstractC10759l, AbstractC10759l abstractC10759l2) {
        if (abstractC10759l.startapp() && abstractC10759l2.startapp()) {
            return;
        }
        ArrayList arrayList = this.f1768l;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC12589l.m3424strictfp(arrayList.get(size));
            throw null;
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m573catch() {
        C12212l c12212l = this.f1790l.subs;
        this.f1750l = c12212l != null && c12212l.mopub.isPro && this.f1777l;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m574class(long j) {
        boolean z;
        if (this.f1788l) {
            this.f1775l.getClass();
            z = true;
        } else {
            z = false;
        }
        C10749l c10749l = this.f1784l;
        long jMin = 1000;
        long j2 = f1733l;
        if (z) {
            jMin = c10749l.purchase != 3 ? j2 : 1000L;
            for (C17424l c17424l : this.f1757l) {
                long j3 = this.f1748l;
                long j4 = this.f1747l;
                AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
                AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.purchase;
                long jPurchase = C17424l.subs(abstractC1091l2) ? abstractC1091l2.purchase(j3, j4) : Long.MAX_VALUE;
                if (abstractC1091l != null && C17424l.subs(abstractC1091l)) {
                    jPurchase = Math.min(jPurchase, abstractC1091l.purchase(j3, j4));
                }
                jMin = Math.min(jMin, AbstractC15323l.m3986try(jPurchase));
            }
            if (this.f1784l.remoteconfig()) {
                C12212l c12212l = this.f1790l.subs;
                C12212l c12212l2 = c12212l != null ? c12212l.remoteconfig : null;
                if (c12212l2 != null) {
                    if ((AbstractC15323l.m3962continue(jMin) * this.f1784l.metrica.yandex) + this.f1748l >= c12212l2.purchase()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (c10749l.purchase != 3 || m592l()) {
            jMin = j2;
        }
        this.f1746l.yandex.sendEmptyMessageAtTime(2, j + jMin);
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final void m575const(InterfaceC15310l interfaceC15310l) {
        for (C17424l c17424l : this.f1757l) {
            if (c17424l.purchase() == 2) {
                ((AbstractC1091l) c17424l.purchase).yandex(7, interfaceC15310l);
                AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
                if (abstractC1091l != null) {
                    abstractC1091l.yandex(7, interfaceC15310l);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC2417l
    public final void crashlytics(InterfaceC8782l interfaceC8782l) {
        this.f1746l.loadAd(8, interfaceC8782l).loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final long m576default(C5019l c5019l, long j, boolean z, boolean z2) {
        C12031l c12031l;
        m590l();
        boolean z3 = true;
        m588l(false, true);
        if (z2 || this.f1784l.purchase == 3) {
            m583implements(2);
        }
        C12212l c12212l = this.f1790l.subs;
        C12212l c12212l2 = c12212l;
        while (c12212l2 != null && !c5019l.equals(c12212l2.mopub.yandex)) {
            c12212l2 = c12212l2.remoteconfig;
        }
        if (z || c12212l != c12212l2 || (c12212l2 != null && c12212l2.startapp + j < 0)) {
            for (int i = 0; i < this.f1757l.length; i++) {
                admob(i);
            }
            this.f1735l = -9223372036854775807L;
            if (c12212l2 != null) {
                while (true) {
                    c12031l = this.f1790l;
                    if (c12031l.subs == c12212l2) {
                        break;
                    }
                    c12031l.yandex();
                }
                c12031l.metrica(c12212l2);
                c12212l2.startapp = 1000000000000L;
                firebase(this.f1790l.isPro.purchase(), new boolean[this.f1757l.length]);
                c12212l2.admob = true;
            }
        }
        mopub();
        if (this.f1788l) {
            for (C17424l c17424l : this.f1757l) {
                if (c17424l.admob() && (c17424l.purchase() == 2 || c17424l.purchase() == 4)) {
                    this.f1761l = true;
                    break;
                }
            }
        }
        C12031l c12031l2 = this.f1790l;
        if (c12212l2 != null) {
            c12031l2.metrica(c12212l2);
            if (!c12212l2.purchase) {
                c12212l2.mopub = c12212l2.mopub.loadAd(j, -9223372036854775807L);
            } else if (c12212l2.billing) {
                if (this.f1788l) {
                    this.f1775l.getClass();
                    if (this.f1784l.yandex.startapp() || !c12212l2.mopub.yandex.equals(this.f1784l.loadAd)) {
                        j = c12212l2.yandex.subs(j);
                        c12212l2.yandex.isPro(j - this.f1739l);
                    } else {
                        long j2 = c12212l2.startapp + j;
                        boolean z4 = true;
                        for (C17424l c17424l2 : this.f1757l) {
                            if (c17424l2.admob()) {
                                AbstractC1091l abstractC1091lAmazon = c17424l2.amazon(c12212l2);
                                z4 &= abstractC1091lAmazon != null && abstractC1091lAmazon.appmetrica(j2);
                            }
                        }
                        if (z4) {
                            InterfaceC8782l interfaceC8782l = c12212l2.yandex;
                            long j3 = this.f1784l.subscription;
                            C17654l c17654l = C17654l.crashlytics;
                            if (interfaceC8782l.mopub(j3, c17654l) == c12212l2.yandex.mopub(j, c17654l)) {
                                z3 = false;
                            } else {
                                j = c12212l2.yandex.subs(j);
                                c12212l2.yandex.isPro(j - this.f1739l);
                            }
                        } else {
                            j = c12212l2.yandex.subs(j);
                            c12212l2.yandex.isPro(j - this.f1739l);
                        }
                    }
                } else {
                    j = c12212l2.yandex.subs(j);
                    c12212l2.yandex.isPro(j - this.f1739l);
                }
            }
            m577else(j, z3);
            premium();
        } else {
            c12031l2.loadAd();
            m577else(j, true);
        }
        tapsense(false);
        this.f1746l.mopub(2);
        return j;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m577else(long j, boolean z) {
        C12212l c12212l = this.f1790l.subs;
        long j2 = j + (c12212l == null ? 1000000000000L : c12212l.startapp);
        this.f1748l = j2;
        ((C3071l) this.f1786l.f33117l).yandex(j2);
        for (C17424l c17424l : this.f1757l) {
            long j3 = this.f1748l;
            AbstractC1091l abstractC1091lAmazon = c17424l.amazon(c12212l);
            if (abstractC1091lAmazon != null) {
                abstractC1091lAmazon.isVip(j3, false, z);
            }
        }
        for (C12212l c12212l2 = r0.subs; c12212l2 != null; c12212l2 = c12212l2.remoteconfig) {
            for (InterfaceC10376l interfaceC10376l : (InterfaceC10376l[]) c12212l2.metrica.f19553l) {
                if (interfaceC10376l != null) {
                    interfaceC10376l.advert();
                }
            }
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m578extends(int i, int i2, C12800l c12800l) throws Throwable {
        this.f1753l.purchase(1);
        C5044l c5044l = this.f1759l;
        c5044l.getClass();
        AbstractC12442l.admob(i >= 0 && i <= i2 && i2 <= ((ArrayList) c5044l.crashlytics).size());
        c5044l.firebase = c12800l;
        c5044l.subs(i, i2);
        Signature(c5044l.crashlytics(), false);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m579final(C9087l c9087l) {
        c9087l.getClass();
        C14500l c14500l = this.f1746l;
        if (c9087l.purchase != this.f1766l) {
            c14500l.loadAd(15, c9087l).loadAd();
            return;
        }
        synchronized (c9087l) {
        }
        try {
            c9087l.yandex.yandex(c9087l.crashlytics, c9087l.amazon);
            c9087l.yandex(true);
            int i = this.f1784l.purchase;
            if (i == 3 || i == 2) {
                c14500l.mopub(2);
            }
        } catch (Throwable th) {
            c9087l.yandex(true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m580finally(C7534l c7534l) {
        this.f1787l = c7534l;
        AbstractC10759l abstractC10759l = this.f1784l.yandex;
        C12031l c12031l = this.f1790l;
        c12031l.getClass();
        c7534l.getClass();
        if (c12031l.adcel.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c12031l.adcel.size(); i++) {
            ((C12212l) c12031l.adcel.get(i)).subs();
        }
        c12031l.adcel = arrayList;
        c12031l.remoteconfig = null;
        c12031l.smaato();
    }

    public final void firebase(long j, boolean[] zArr) {
        C17424l[] c17424lArr;
        C0477l c0477l;
        long j2;
        C12212l c12212l = this.f1790l.isPro;
        C9598l c9598l = c12212l.metrica;
        int i = 0;
        while (true) {
            c17424lArr = this.f1757l;
            if (i >= c17424lArr.length) {
                break;
            }
            if (!c9598l.premium(i)) {
                c17424lArr[i].smaato();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < c17424lArr.length) {
            if (c9598l.premium(i2) && c17424lArr[i2].amazon(c12212l) == null) {
                c0477l = this;
                j2 = j;
                c0477l.isPro(c12212l, i2, zArr[i2], j2);
            } else {
                c0477l = this;
                j2 = j;
            }
            i2++;
            this = c0477l;
            j = j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m581for() {
        int i;
        int i2;
        float f = this.f1786l.billing().yandex;
        C12031l c12031l = this.f1790l;
        C12212l c12212l = c12031l.subs;
        C12212l c12212l2 = c12031l.isPro;
        C9598l c9598l = null;
        C12212l c12212l3 = c12212l;
        boolean z = true;
        while (c12212l3 != null && c12212l3.purchase) {
            C10749l c10749l = this.f1784l;
            C9598l c9598lIsPro = c12212l3.isPro(f, c10749l.yandex, c10749l.smaato);
            C9598l c9598l2 = c12212l3 == this.f1790l.subs ? c9598lIsPro : c9598l;
            C9598l c9598l3 = c12212l3.metrica;
            InterfaceC10376l[] interfaceC10376lArr = (InterfaceC10376l[]) c9598lIsPro.f19553l;
            if (c9598l3 != null && ((InterfaceC10376l[]) c9598l3.f19553l).length == interfaceC10376lArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= interfaceC10376lArr.length) {
                        if (c12212l3 == c12212l2) {
                            z = false;
                        }
                        c12212l3 = c12212l3.remoteconfig;
                        c9598l = c9598l2;
                    } else if (c9598lIsPro.signatures(c9598l3, i3)) {
                        i3++;
                    }
                }
            }
            C12031l c12031l2 = this.f1790l;
            if (!z) {
                i = 4;
                c12031l2.metrica(c12212l3);
                if (c12212l3.purchase) {
                    long jMax = Math.max(c12212l3.mopub.loadAd, this.f1748l - c12212l3.startapp);
                    if (this.f1765l && purchase() && this.f1790l.firebase == c12212l3) {
                        mopub();
                    }
                    i2 = 4;
                    c12212l3.yandex(c9598lIsPro, jMax, false, new boolean[c12212l3.isPro.length]);
                }
                tapsense(true);
                if (this.f1784l.purchase != i2) {
                    premium();
                    m595l();
                    this.f1746l.mopub(2);
                    return;
                }
                return;
            }
            C12212l c12212l4 = c12031l2.subs;
            boolean z2 = (c12031l2.metrica(c12212l4) & 1) != 0;
            boolean[] zArr = new boolean[this.f1757l.length];
            c9598l2.getClass();
            long jYandex = c12212l4.yandex(c9598l2, this.f1784l.subscription, z2, zArr);
            C10749l c10749l2 = this.f1784l;
            boolean z3 = (c10749l2.purchase == 4 || jYandex == c10749l2.subscription) ? false : true;
            C10749l c10749l3 = this.f1784l;
            i = 4;
            this.f1784l = ad(c10749l3.loadAd, jYandex, c10749l3.crashlytics, c10749l3.amazon, z3, 5);
            if (z3) {
                m577else(jYandex, true);
            }
            mopub();
            boolean[] zArr2 = new boolean[this.f1757l.length];
            int i4 = 0;
            while (true) {
                C17424l[] c17424lArr = this.f1757l;
                if (i4 >= c17424lArr.length) {
                    break;
                }
                int iCrashlytics = c17424lArr[i4].crashlytics();
                zArr2[i4] = this.f1757l[i4].admob();
                C17424l c17424l = this.f1757l[i4];
                InterfaceC11759l interfaceC11759l = c12212l4.crashlytics[i4];
                C16990l c16990l = this.f1786l;
                long j = this.f1748l;
                boolean z4 = zArr[i4];
                AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.purchase;
                if (C17424l.subs(abstractC1091l)) {
                    if (interfaceC11759l != abstractC1091l.f3020l) {
                        c17424l.yandex(abstractC1091l, c16990l);
                    } else if (z4) {
                        abstractC1091l.isVip(j, false, true);
                    }
                }
                AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.billing;
                if (abstractC1091l2 != null && C17424l.subs(abstractC1091l2)) {
                    if (interfaceC11759l != abstractC1091l2.f3020l) {
                        c17424l.yandex(abstractC1091l2, c16990l);
                    } else if (z4) {
                        abstractC1091l2.isVip(j, false, true);
                    }
                }
                if (iCrashlytics - this.f1757l[i4].crashlytics() > 0) {
                    m603package(i4, false);
                }
                this.f1785l -= iCrashlytics - this.f1757l[i4].crashlytics();
                i4++;
            }
            firebase(this.f1748l, zArr2);
            c12212l4.admob = true;
            i2 = i;
            tapsense(true);
            if (this.f1784l.purchase != i2) {
                premium();
                m595l();
                this.f1746l.mopub(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m582goto(C13736l c13736l, boolean z) {
        int i;
        C16717l c16717l = this.f1770l;
        if (!c16717l.subs.equals(c13736l)) {
            c16717l.subs = c13736l;
            c16717l.subs();
        }
        if (!z) {
            c13736l = null;
        }
        C0498l c0498l = this.f1776l;
        if (!Objects.equals(c0498l.amazon, c13736l)) {
            c0498l.amazon = c13736l;
            if (c13736l != null) {
                int i2 = c13736l.crashlytics;
                i = 3;
                switch (i2) {
                    case 0:
                        AbstractC6427l.vip("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i = 1;
                        break;
                    case 1:
                    case 14:
                        i = 1;
                        break;
                    case 2:
                    case 4:
                        i = 2;
                        break;
                    case 3:
                        i = 0;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        if (c13736l.yandex == 1) {
                            i = 2;
                        }
                        break;
                    case 15:
                    default:
                        AbstractC12900l.subscription("Unidentified audio usage: ", i2, "AudioFocusManager");
                        i = 0;
                        break;
                    case 16:
                        i = 4;
                        break;
                }
            } else {
                i = 0;
            }
            c0498l.billing = i;
            AbstractC12442l.subs(i == 1 || i == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        C10749l c10749l = this.f1784l;
        boolean z2 = c10749l.smaato;
        m589l(c0498l.amazon(c10749l.purchase, z2), c10749l.vip, c10749l.remoteconfig, z2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        C12212l c12212l;
        C5019l c5019l;
        C12212l c12212l2;
        int i2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.f1753l.purchase(1);
                    m589l(this.f1776l.amazon(this.f1784l.purchase, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    subs();
                    break;
                case 3:
                    m608static((C6817l) message.obj);
                    break;
                case 4:
                    m606public((C1372l) message.obj);
                    break;
                case 5:
                    m615transient((C17654l) message.obj);
                    break;
                case 6:
                    m591l(false, true);
                    break;
                case 7:
                    m601native((C5811l) message.obj);
                    return true;
                case 8:
                    license((InterfaceC8782l) message.obj);
                    break;
                case 9:
                    ads((InterfaceC8782l) message.obj);
                    break;
                case 10:
                    m581for();
                    break;
                case 11:
                    m612this(message.arg1);
                    break;
                case 12:
                    m605protected(message.arg1 != 0);
                    break;
                case 13:
                    m610super(message.arg1 != 0, (C5811l) message.obj);
                    break;
                case 14:
                    m579final((C9087l) message.obj);
                    break;
                case 15:
                    m602new((C9087l) message.obj);
                    break;
                case 16:
                    C1372l c1372l = (C1372l) message.obj;
                    pro(c1372l, c1372l.yandex, true, false);
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    m570abstract((C6428l) message.obj);
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    yandex((C6428l) message.obj, message.arg1);
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    m609strictfp((C9771l) message.obj);
                    break;
                case 20:
                    m578extends(message.arg1, message.arg2, (C12800l) message.obj);
                    break;
                case 21:
                    m618while((C12800l) message.obj);
                    break;
                case 22:
                    m611synchronized();
                    break;
                case 23:
                    m585instanceof(message.arg1 != 0);
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                default:
                    return false;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    billing();
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    m581for();
                    m586interface(true);
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    m594l(message.arg1, message.arg2, (List) message.obj);
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    m580finally((C7534l) message.obj);
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    m617volatile();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m607return(pair.first, (C5811l) pair.second);
                    break;
                case 31:
                    m582goto((C13736l) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    m600l(((Float) message.obj).floatValue());
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    startapp(message.arg1);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    adcel();
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    m575const((InterfaceC15310l) message.obj);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    m616try(((Boolean) message.obj).booleanValue());
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    this.f1761l = false;
                    C6817l c6817l = this.f1779l;
                    if (c6817l != null) {
                        m608static(c6817l);
                        this.f1779l = null;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    m571break((C13829l) message.obj);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    m584import((C15173l) message.obj);
                    break;
            }
        } catch (RuntimeException e) {
            C17361l c17361l = new C17361l(2, e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC6427l.subs("ExoPlayerImplInternal", "Playback error", c17361l);
            m591l(true, false);
            this.f1784l = this.f1784l.billing(c17361l);
        } catch (C0456l e2) {
            subscription(1002, e2);
        } catch (C4684l e3) {
            subscription(e3.f9521l, e3);
        } catch (C12126l e4) {
            subscription(e4.f24145l, e4);
        } catch (C17655l e5) {
            boolean z2 = e5.f34356l;
            int i5 = e5.f34355l;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                subscription(i3, e5);
            }
            i3 = i2;
            subscription(i3, e5);
        } catch (IOException e6) {
            subscription(2000, e6);
        } catch (C17361l e7) {
            e = e7;
            int i6 = e.f33825l;
            C12031l c12031l = this.f1790l;
            if (i6 == 1 && (c12212l2 = c12031l.isPro) != null && e.f33826l == null) {
                e = e.crashlytics(c12212l2.mopub.yandex);
            }
            int i7 = e.f33825l;
            C14500l c14500l = this.f1746l;
            if (i7 == 1 && (c5019l = e.f33826l) != null && isVip(e.f33827l, c5019l)) {
                this.f1771l = true;
                mopub();
                C12212l c12212lAdmob = c12031l.admob();
                C12212l c12212l3 = c12031l.subs;
                if (c12212l3 != c12212lAdmob) {
                    while (c12212l3 != null) {
                        C12212l c12212l4 = c12212l3.remoteconfig;
                        if (c12212l4 == c12212lAdmob) {
                            break;
                        }
                        c12212l3 = c12212l4;
                    }
                }
                c12031l.metrica(c12212l3);
                if (this.f1784l.purchase != 4) {
                    premium();
                    c14500l.mopub(2);
                }
            } else {
                C17361l c17361l2 = this.f1758l;
                if (c17361l2 != null) {
                    c17361l2.addSuppressed(e);
                    e = this.f1758l;
                }
                if (e.f33825l == 1 && c12031l.subs != c12031l.isPro) {
                    while (true) {
                        c12212l = c12031l.subs;
                        if (c12212l == c12031l.isPro) {
                            break;
                        }
                        c12031l.yandex();
                    }
                    AbstractC12442l.remoteconfig(c12212l);
                    appmetrica();
                    C11496l c11496l = c12212l.mopub;
                    C5019l c5019l2 = c11496l.yandex;
                    long j = c11496l.loadAd;
                    this.f1784l = ad(c5019l2, j, c11496l.amazon, j, true, 0);
                }
                if (e.f33824l && (this.f1758l == null || (i = e.f28797l) == 5004 || i == 5003)) {
                    AbstractC6427l.metrica("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f1758l == null) {
                        this.f1758l = e;
                    }
                    C3485l c3485lLoadAd = c14500l.loadAd(25, e);
                    Handler handler = c14500l.yandex;
                    Message message2 = c3485lLoadAd.yandex;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c3485lLoadAd.yandex();
                } else {
                    AbstractC6427l.subs("ExoPlayerImplInternal", "Playback error", e);
                    m591l(true, false);
                    this.f1784l = this.f1784l.billing(e);
                }
            }
        }
        appmetrica();
        return true;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m583implements(int i) {
        C10749l c10749l = this.f1784l;
        if (c10749l.purchase != i) {
            if (i != 2) {
                this.f1774l = -9223372036854775807L;
            }
            if (i != 3 && c10749l.startapp) {
                this.f1784l = c10749l.subs(false);
            }
            this.f1784l = this.f1784l.admob(i);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m584import(C15173l c15173l) {
        for (C17424l c17424l : this.f1757l) {
            if (c17424l.purchase() == 4) {
                ((AbstractC1091l) c17424l.purchase).yandex(23, c15173l);
                AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
                if (abstractC1091l != null) {
                    abstractC1091l.yandex(23, c15173l);
                }
            }
        }
    }

    public final void inmobi(int i) {
        C17424l c17424l = this.f1757l[i];
        try {
            C12212l c12212l = this.f1790l.subs;
            c12212l.getClass();
            AbstractC1091l abstractC1091lAmazon = c17424l.amazon(c12212l);
            abstractC1091lAmazon.getClass();
            InterfaceC11759l interfaceC11759l = abstractC1091lAmazon.f3020l;
            interfaceC11759l.getClass();
            interfaceC11759l.firebase();
        } catch (IOException | RuntimeException e) {
            int iPurchase = c17424l.purchase();
            if (iPurchase != 3 && iPurchase != 5) {
                throw e;
            }
            C9598l c9598l = this.f1790l.subs.metrica;
            AbstractC6427l.subs("ExoPlayerImplInternal", "Disabling track due to error: ".concat(C5978l.crashlytics(((InterfaceC10376l[]) c9598l.f19553l)[i].tapsense())), e);
            C9598l c9598l2 = new C9598l((C17614l[]) ((C17614l[]) c9598l.f19549l).clone(), (InterfaceC10376l[]) ((InterfaceC10376l[]) c9598l.f19553l).clone(), (C1047l) c9598l.f19552l, c9598l.f19554l);
            ((C17614l[]) c9598l2.f19549l)[i] = null;
            ((InterfaceC10376l[]) c9598l2.f19553l)[i] = null;
            admob(i);
            C12212l c12212l2 = this.f1790l.subs;
            c12212l2.yandex(c9598l2, this.f1784l.subscription, false, new boolean[c12212l2.isPro.length]);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m585instanceof(boolean z) {
        this.f1777l = z;
        m573catch();
        if (this.f1750l) {
            C12031l c12031l = this.f1790l;
            if (c12031l.isPro != c12031l.subs) {
                m586interface(true);
                tapsense(false);
            }
        }
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m586interface(boolean z) {
        C5019l c5019l = this.f1790l.subs.mopub.yandex;
        long jM576default = m576default(c5019l, this.f1784l.subscription, true, false);
        if (jM576default != this.f1784l.subscription) {
            C10749l c10749l = this.f1784l;
            this.f1784l = ad(c5019l, jM576default, c10749l.crashlytics, c10749l.amazon, z, 5);
        }
    }

    public final void isPro(C12212l c12212l, int i, boolean z, long j) {
        C17424l c17424l = this.f1757l[i];
        if (c17424l.admob()) {
            return;
        }
        boolean z2 = c12212l == this.f1790l.subs;
        C9598l c9598l = c12212l.metrica;
        C17614l c17614l = ((C17614l[]) c9598l.f19549l)[i];
        InterfaceC10376l interfaceC10376l = ((InterfaceC10376l[]) c9598l.f19553l)[i];
        boolean z3 = m592l() && this.f1784l.purchase == 3;
        boolean z4 = !z && z3;
        this.f1785l++;
        InterfaceC11759l interfaceC11759l = c12212l.crashlytics[i];
        long j2 = c12212l.startapp;
        C5019l c5019l = c12212l.mopub.yandex;
        AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.purchase;
        AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.billing;
        int length = interfaceC10376l != null ? interfaceC10376l.length() : 0;
        C5978l[] c5978lArr = new C5978l[length];
        for (int i2 = 0; i2 < length; i2++) {
            interfaceC10376l.getClass();
            c5978lArr[i2] = interfaceC10376l.metrica(i2);
        }
        int i3 = c17424l.amazon;
        C16990l c16990l = this.f1786l;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            c17424l.yandex = true;
            AbstractC12442l.subscription(abstractC1091l.f3010l == 0);
            abstractC1091l.f3018l = c17614l;
            abstractC1091l.f3014l = c5019l;
            abstractC1091l.f3010l = 1;
            abstractC1091l.metrica(z4, z2);
            abstractC1091l.advert(c5978lArr, interfaceC11759l, j, j2, c5019l);
            abstractC1091l.isVip(j, z4, true);
            c16990l.amazon(abstractC1091l);
        } else {
            c17424l.loadAd = true;
            abstractC1091l2.getClass();
            AbstractC12442l.subscription(abstractC1091l2.f3010l == 0);
            abstractC1091l2.f3018l = c17614l;
            abstractC1091l2.f3014l = c5019l;
            abstractC1091l2.f3010l = 1;
            abstractC1091l2.metrica(z4, z2);
            abstractC1091l2.advert(c5978lArr, interfaceC11759l, j, j2, c5019l);
            abstractC1091l2.isVip(j, z4, true);
            c16990l.amazon(abstractC1091l2);
        }
        C2865l c2865l = new C2865l(this);
        AbstractC1091l abstractC1091lAmazon = c17424l.amazon(c12212l);
        abstractC1091lAmazon.getClass();
        abstractC1091lAmazon.yandex(11, c2865l);
        if (z3 && z2) {
            c17424l.vip();
        }
    }

    public final boolean isVip(int i, C5019l c5019l) {
        C12031l c12031l = this.f1790l;
        C12212l c12212l = c12031l.firebase;
        if (c12212l != null && c12212l.mopub.yandex.equals(c5019l)) {
            C17424l c17424l = this.f1757l[i];
            C12212l c12212l2 = c12031l.firebase;
            int i2 = c17424l.amazon;
            boolean z = (i2 == 2 || i2 == 4) && c17424l.amazon(c12212l2) == ((AbstractC1091l) c17424l.purchase);
            boolean z2 = c17424l.amazon == 3 && c17424l.amazon(c12212l2) == ((AbstractC1091l) c17424l.billing);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void license(InterfaceC8782l interfaceC8782l) {
        C12212l c12212l;
        C0477l c0477l;
        C12031l c12031l = this.f1790l;
        C12212l c12212l2 = c12031l.smaato;
        C16990l c16990l = this.f1786l;
        if (c12212l2 != null && c12212l2.yandex == interfaceC8782l) {
            c12212l2.getClass();
            if (!c12212l2.purchase) {
                float f = c16990l.billing().yandex;
                C10749l c10749l = this.f1784l;
                c12212l2.billing(f, c10749l.yandex, c10749l.smaato);
            }
            m593l(c12212l2.mopub.yandex, c12212l2.metrica);
            if (c12212l2 == c12031l.subs) {
                m577else(c12212l2.mopub.loadAd, true);
                firebase(c12031l.isPro.purchase(), new boolean[this.f1757l.length]);
                c12212l2.admob = true;
                C10749l c10749l2 = this.f1784l;
                C5019l c5019l = c10749l2.loadAd;
                long j = c12212l2.mopub.loadAd;
                c0477l = this;
                c0477l.f1784l = ad(c5019l, j, c10749l2.crashlytics, j, false, 5);
            } else {
                c0477l = this;
            }
            c0477l.premium();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= c12031l.adcel.size()) {
                c12212l = null;
                break;
            }
            c12212l = (C12212l) c12031l.adcel.get(i);
            if (c12212l.yandex == interfaceC8782l) {
                break;
            } else {
                i++;
            }
        }
        if (c12212l != null) {
            AbstractC12442l.subscription(!c12212l.purchase);
            float f2 = c16990l.billing().yandex;
            C10749l c10749l3 = this.f1784l;
            c12212l.billing(f2, c10749l3.yandex, c10749l3.smaato);
            C12212l c12212l3 = c12031l.remoteconfig;
            if (c12212l3 == null || c12212l3.yandex != interfaceC8782l) {
                return;
            }
            applovin();
        }
    }

    @Override // defpackage.InterfaceC15310l
    public final void loadAd(long j, long j2, C5978l c5978l, MediaFormat mediaFormat) {
        if (this.f1761l) {
            this.f1746l.yandex(37).loadAd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02be  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:206:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:214:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:228:0x0406  */
    /* JADX WARN: Code duplicated, block: B:241:0x0428  */
    /* JADX WARN: Code duplicated, block: B:321:0x0559  */
    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final void m587l() {
        C12212l c12212l;
        C12212l c12212l2;
        C12212l c12212l3;
        boolean z;
        boolean z2;
        C9598l c9598l;
        C12212l c12212l4;
        C12212l c12212l5;
        C12212l c12212l6;
        C9598l c9598l2;
        int length;
        int i;
        AbstractC1091l abstractC1091l;
        boolean zPremium;
        AbstractC1091l abstractC1091l2;
        byte b;
        int i2;
        int i3;
        C12212l c12212l7;
        C12212l c12212l8;
        boolean z3;
        int i4;
        if (this.f1784l.yandex.startapp() || !this.f1759l.yandex) {
            return;
        }
        this.f1790l.vip(this.f1748l);
        C12031l c12031l = this.f1790l;
        C12212l c12212l9 = c12031l.smaato;
        long j = -9223372036854775807L;
        if (c12212l9 == null || (!c12212l9.mopub.firebase && c12212l9.mopub() && c12031l.smaato.mopub.billing != -9223372036854775807L && c12031l.vip < 100)) {
            C12031l c12031l2 = this.f1790l;
            long j2 = this.f1748l;
            C10749l c10749l = this.f1784l;
            C12212l c12212l10 = c12031l2.smaato;
            C11496l c11496lPurchase = c12212l10 == null ? c12031l2.purchase(c10749l.yandex, c10749l.loadAd, c10749l.crashlytics, c10749l.subscription, -9223372036854775807L) : c12031l2.amazon(c10749l.yandex, c12212l10, j2);
            if (c11496lPurchase != null) {
                C12031l c12031l3 = this.f1790l;
                C12212l c12212l11 = c12031l3.smaato;
                long j3 = c12212l11 == null ? 1000000000000L : (c12212l11.startapp + c12212l11.mopub.billing) - c11496lPurchase.loadAd;
                int i5 = 0;
                while (true) {
                    if (i5 >= c12031l3.adcel.size()) {
                        c12212l = null;
                        break;
                    }
                    C11496l c11496l = ((C12212l) c12031l3.adcel.get(i5)).mopub;
                    long j4 = c11496l.billing;
                    long j5 = c11496lPurchase.billing;
                    if ((j4 == -9223372036854775807L || j4 == j5) && c11496l.loadAd == c11496lPurchase.loadAd && c11496l.yandex.equals(c11496lPurchase.yandex)) {
                        c12212l = (C12212l) c12031l3.adcel.remove(i5);
                        break;
                    }
                    i5++;
                }
                if (c12212l == null) {
                    C0477l c0477l = (C0477l) c12031l3.purchase.f5813l;
                    AbstractC1091l[] abstractC1091lArr = c0477l.f1756l;
                    C16717l c16717l = c0477l.f1770l;
                    C7865l c7865l = c0477l.f1781l;
                    C17849l c17849l = c0477l.f1738l;
                    c7865l.getClass();
                    C0554l c0554l = new C0554l();
                    c0554l.f1956l = c7865l;
                    c0554l.f1958l = new HashMap();
                    c0554l.f1957l = c17849l;
                    C5044l c5044l = c0477l.f1759l;
                    C9598l c9598l3 = c0477l.f1769l;
                    c0477l.f1787l.getClass();
                    c12212l = new C12212l(abstractC1091lArr, j3, c16717l, c0554l, c5044l, c11496lPurchase, c9598l3);
                } else {
                    c12212l.mopub = c11496lPurchase;
                    c12212l.startapp = j3;
                }
                C12212l c12212l12 = c12031l3.smaato;
                if (c12212l12 == null) {
                    c12031l3.subs = c12212l;
                    c12031l3.isPro = c12212l;
                    c12031l3.firebase = c12212l;
                } else if (c12212l != c12212l12.remoteconfig) {
                    c12212l12.loadAd();
                    c12212l12.remoteconfig = c12212l;
                    c12212l12.crashlytics();
                }
                c12031l3.metrica = null;
                c12031l3.smaato = c12212l;
                c12031l3.vip++;
                c12031l3.remoteconfig();
                if (!c12212l.amazon) {
                    long j6 = c11496lPurchase.loadAd;
                    c12212l.amazon = true;
                    c12212l.yandex.vip(this, j6);
                } else if (c12212l.purchase) {
                    this.f1746l.loadAd(8, c12212l.yandex).loadAd();
                }
                if (this.f1790l.subs == c12212l) {
                    m577else(c11496lPurchase.loadAd, true);
                }
                tapsense(false);
            } else {
                j = -9223372036854775807L;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f1752l) {
            this.f1752l = advert(this.f1790l.smaato);
            m598l();
        } else {
            premium();
        }
        C12031l c12031l4 = this.f1790l;
        if (!this.f1750l && this.f1765l && !this.f1771l && !purchase() && (c12212l7 = c12031l4.firebase) != null && c12212l7 == c12031l4.isPro && (c12212l8 = c12212l7.remoteconfig) != null && (z3 = c12212l8.purchase)) {
            AbstractC12442l.subscription(z3);
            if (((long) ((c12212l8.purchase() - this.f1748l) / this.f1786l.billing().yandex)) <= 10000000) {
                C12212l c12212l13 = c12031l4.firebase;
                c12212l13.getClass();
                c12031l4.firebase = c12212l13.remoteconfig;
                c12031l4.remoteconfig();
                c12031l4.firebase.getClass();
                C17424l[] c17424lArr = this.f1757l;
                C12212l c12212l14 = c12031l4.firebase;
                if (c12212l14 != null) {
                    C9598l c9598l4 = c12212l14.metrica;
                    for (int i6 = 0; i6 < c17424lArr.length; i6++) {
                        if (c9598l4.premium(i6)) {
                            C17424l c17424l = c17424lArr[i6];
                            if (((AbstractC1091l) c17424l.billing) != null && !c17424l.mopub()) {
                                C17424l c17424l2 = c17424lArr[i6];
                                AbstractC12442l.subscription(!c17424l2.mopub());
                                if (C17424l.subs((AbstractC1091l) c17424l2.purchase)) {
                                    i4 = 3;
                                } else {
                                    AbstractC1091l abstractC1091l3 = (AbstractC1091l) c17424l2.billing;
                                    i4 = (abstractC1091l3 == null || !C17424l.subs(abstractC1091l3)) ? 2 : 4;
                                }
                                c17424l2.amazon = i4;
                                isPro(c12212l14, i6, false, c12212l14.purchase());
                            }
                        }
                    }
                    if (purchase()) {
                        this.f1735l = c12212l14.yandex.remoteconfig();
                        if (!c12212l14.mopub()) {
                            c12031l4.metrica(c12212l14);
                            tapsense(false);
                            premium();
                        }
                    }
                }
            }
        }
        boolean z4 = this.f1765l;
        C17424l[] c17424lArr2 = this.f1757l;
        C12031l c12031l5 = this.f1790l;
        C12212l c12212l15 = c12031l5.isPro;
        if (c12212l15 != null) {
            if (c12212l15.remoteconfig == null || this.f1750l) {
                if (c12212l15.mopub.firebase || this.f1750l) {
                    for (C17424l c17424l3 : c17424lArr2) {
                        if (c17424l3.amazon(c12212l15) != null) {
                            AbstractC1091l abstractC1091lAmazon = c17424l3.amazon(c12212l15);
                            abstractC1091lAmazon.getClass();
                            if (abstractC1091lAmazon.firebase()) {
                                long j7 = c12212l15.mopub.billing;
                                long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + c12212l15.startapp;
                                AbstractC1091l abstractC1091lAmazon2 = c17424l3.amazon(c12212l15);
                                abstractC1091lAmazon2.getClass();
                                C17424l.remoteconfig(abstractC1091lAmazon2, j8);
                            }
                        }
                    }
                }
            } else if (c12212l15.purchase) {
                int i7 = 0;
                while (true) {
                    if (i7 >= c17424lArr2.length) {
                        if (!purchase() || c12031l5.firebase != c12031l5.isPro) {
                            C12212l c12212l16 = c12212l15.remoteconfig;
                            if (!c12212l16.purchase && this.f1748l < c12212l16.purchase()) {
                                break;
                            }
                            C12212l c12212l17 = c12212l15.remoteconfig;
                            boolean z5 = c12212l17.purchase;
                            if (!z5) {
                                c9598l = c12212l15.metrica;
                                c12212l4 = c12031l5.firebase;
                                c12212l5 = c12031l5.isPro;
                                if (c12212l4 == c12212l5) {
                                    c12212l5.getClass();
                                    c12031l5.firebase = c12212l5.remoteconfig;
                                }
                                C12212l c12212l18 = c12031l5.isPro;
                                c12212l18.getClass();
                                c12031l5.isPro = c12212l18.remoteconfig;
                                c12031l5.remoteconfig();
                                c12212l6 = c12031l5.isPro;
                                c12212l6.getClass();
                                c9598l2 = c12212l6.metrica;
                                AbstractC10759l abstractC10759l = this.f1784l.yandex;
                                m596l(abstractC10759l, c12212l6.mopub.yandex, abstractC10759l, c12212l15.mopub.yandex, -9223372036854775807L, false);
                                if (c12212l6.purchase) {
                                    length = c17424lArr2.length;
                                    for (i = 0; i < length; i++) {
                                        C17424l c17424l4 = c17424lArr2[i];
                                        long jPurchase = c12212l6.purchase();
                                        abstractC1091l = (AbstractC1091l) c17424l4.purchase;
                                        int i8 = c17424l4.crashlytics;
                                        zPremium = c9598l.premium(i8);
                                        boolean zPremium2 = c9598l2.premium(i8);
                                        abstractC1091l2 = (AbstractC1091l) c17424l4.billing;
                                        if (abstractC1091l2 != null) {
                                            abstractC1091l = abstractC1091l2;
                                        }
                                        if (zPremium) {
                                            b = -2;
                                        } else {
                                            b = -2;
                                        }
                                    }
                                    break;
                                    break;
                                }
                                length = c17424lArr2.length;
                                while (i < length) {
                                    C17424l c17424l5 = c17424lArr2[i];
                                    long jPurchase2 = c12212l6.purchase();
                                    abstractC1091l = (AbstractC1091l) c17424l5.purchase;
                                    int i9 = c17424l5.crashlytics;
                                    zPremium = c9598l.premium(i9);
                                    boolean zPremium3 = c9598l2.premium(i9);
                                    abstractC1091l2 = (AbstractC1091l) c17424l5.billing;
                                    if (abstractC1091l2 != null) {
                                        abstractC1091l = abstractC1091l2;
                                    }
                                    if (zPremium) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            AbstractC12442l.subscription(z5);
                            if (((long) ((c12212l17.purchase() - this.f1748l) / this.f1786l.billing().yandex)) > 10000000) {
                                break;
                            }
                            c9598l = c12212l15.metrica;
                            c12212l4 = c12031l5.firebase;
                            c12212l5 = c12031l5.isPro;
                            if (c12212l4 == c12212l5) {
                                c12212l5.getClass();
                                c12031l5.firebase = c12212l5.remoteconfig;
                            }
                            C12212l c12212l19 = c12031l5.isPro;
                            c12212l19.getClass();
                            c12031l5.isPro = c12212l19.remoteconfig;
                            c12031l5.remoteconfig();
                            c12212l6 = c12031l5.isPro;
                            c12212l6.getClass();
                            c9598l2 = c12212l6.metrica;
                            AbstractC10759l abstractC10759l2 = this.f1784l.yandex;
                            m596l(abstractC10759l2, c12212l6.mopub.yandex, abstractC10759l2, c12212l15.mopub.yandex, -9223372036854775807L, false);
                            if (c12212l6.purchase && ((z4 && this.f1735l != j) || c12212l6.yandex.remoteconfig() != j)) {
                                this.f1735l = j;
                                boolean z6 = z4 && !this.f1771l;
                                if (z6) {
                                    for (int i10 = 0; i10 < c17424lArr2.length; i10++) {
                                        boolean zPremium4 = c9598l2.premium(i10);
                                        InterfaceC10376l[] interfaceC10376lArr = (InterfaceC10376l[]) c9598l2.f19553l;
                                        if (zPremium4 && c17424lArr2[i10].purchase() != -2 && !AbstractC3825l.yandex(interfaceC10376lArr[i10].tapsense().metrica, interfaceC10376lArr[i10].tapsense().firebase) && !c17424lArr2[i10].mopub()) {
                                            z6 = false;
                                            break;
                                        }
                                    }
                                }
                                if (!z6) {
                                    long jPurchase3 = c12212l6.purchase();
                                    for (C17424l c17424l6 : c17424lArr2) {
                                        AbstractC1091l abstractC1091l4 = (AbstractC1091l) c17424l6.billing;
                                        AbstractC1091l abstractC1091l5 = (AbstractC1091l) c17424l6.purchase;
                                        if (C17424l.subs(abstractC1091l5) && (i3 = c17424l6.amazon) != 4 && i3 != 2) {
                                            C17424l.remoteconfig(abstractC1091l5, jPurchase3);
                                        }
                                        if (abstractC1091l4 != null && C17424l.subs(abstractC1091l4) && c17424l6.amazon != 3) {
                                            C17424l.remoteconfig(abstractC1091l4, jPurchase3);
                                        }
                                    }
                                    if (!c12212l6.mopub()) {
                                        c12031l5.metrica(c12212l6);
                                        tapsense(false);
                                        premium();
                                        break;
                                    }
                                    break;
                                }
                                length = c17424lArr2.length;
                                while (i < length) {
                                    C17424l c17424l7 = c17424lArr2[i];
                                    long jPurchase4 = c12212l6.purchase();
                                    abstractC1091l = (AbstractC1091l) c17424l7.purchase;
                                    int i11 = c17424l7.crashlytics;
                                    zPremium = c9598l.premium(i11);
                                    boolean zPremium5 = c9598l2.premium(i11);
                                    abstractC1091l2 = (AbstractC1091l) c17424l7.billing;
                                    if (abstractC1091l2 != null) {
                                        abstractC1091l = abstractC1091l2;
                                    }
                                    if (zPremium) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            length = c17424lArr2.length;
                            while (i < length) {
                                C17424l c17424l8 = c17424lArr2[i];
                                long jPurchase5 = c12212l6.purchase();
                                abstractC1091l = (AbstractC1091l) c17424l8.purchase;
                                int i12 = c17424l8.crashlytics;
                                zPremium = c9598l.premium(i12);
                                boolean zPremium6 = c9598l2.premium(i12);
                                abstractC1091l2 = (AbstractC1091l) c17424l8.billing;
                                if (abstractC1091l2 != null && (i2 = c17424l8.amazon) != 3 && (i2 != 0 || !C17424l.subs(abstractC1091l))) {
                                    abstractC1091l = abstractC1091l2;
                                }
                                if (zPremium || abstractC1091l.f3023l) {
                                    b = -2;
                                } else {
                                    b = -2;
                                    boolean z7 = c17424l8.purchase() == -2;
                                    C17614l c17614l = ((C17614l[]) c9598l.f19549l)[i12];
                                    C17614l c17614l2 = ((C17614l[]) c9598l2.f19549l)[i12];
                                    if (!zPremium6 || !Objects.equals(c17614l2, c17614l) || z7 || c17424l8.mopub()) {
                                        C17424l.remoteconfig(abstractC1091l, jPurchase5);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    }
                    C17424l c17424l9 = c17424lArr2[i7];
                    if (!c17424l9.billing(c12212l15, (AbstractC1091l) c17424l9.purchase) || !c17424l9.billing(c12212l15, (AbstractC1091l) c17424l9.billing)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        C12031l c12031l6 = this.f1790l;
        C12212l c12212l20 = c12031l6.isPro;
        if (c12212l20 != null && c12031l6.subs != c12212l20 && !c12212l20.admob) {
            C17424l[] c17424lArr3 = this.f1757l;
            C9598l c9598l5 = c12212l20.metrica;
            boolean z8 = true;
            for (int i13 = 0; i13 < c17424lArr3.length; i13++) {
                int iCrashlytics = c17424lArr3[i13].crashlytics();
                C17424l c17424l10 = c17424lArr3[i13];
                C16990l c16990l = this.f1786l;
                int iFirebase = c17424l10.firebase((AbstractC1091l) c17424l10.purchase, c12212l20, c9598l5, c16990l);
                int iFirebase2 = c17424l10.firebase((AbstractC1091l) c17424l10.billing, c12212l20, c9598l5, c16990l);
                if (iFirebase == 1) {
                    iFirebase = iFirebase2;
                }
                if ((iFirebase & 2) != 0 && (z2 = this.f1743l) && z2) {
                    this.f1743l = false;
                    if (this.f1784l.startapp) {
                        this.f1746l.mopub(2);
                    }
                }
                this.f1785l -= iCrashlytics - c17424lArr3[i13].crashlytics();
                z8 &= (iFirebase & 1) != 0;
            }
            if (z8) {
                for (int i14 = 0; i14 < c17424lArr3.length; i14++) {
                    if (c9598l5.premium(i14)) {
                        if (!(c17424lArr3[i14].amazon(c12212l20) != null)) {
                            isPro(c12212l20, i14, false, c12212l20.purchase());
                        }
                    }
                }
            }
            if (z8) {
                c12031l6.isPro.admob = true;
            }
        }
        C17424l[] c17424lArr4 = this.f1757l;
        C12031l c12031l7 = this.f1790l;
        boolean z9 = false;
        while (m592l() && !this.f1750l && (c12212l2 = c12031l7.subs) != null && (c12212l3 = c12212l2.remoteconfig) != null && this.f1748l >= c12212l3.purchase() && c12212l3.admob) {
            if (z9) {
                appmetrica();
            }
            this.f1771l = false;
            C12212l c12212lYandex = c12031l7.yandex();
            c12212lYandex.getClass();
            if (this.f1784l.loadAd.yandex.equals(c12212lYandex.mopub.yandex.yandex)) {
                C5019l c5019l = this.f1784l.loadAd;
                if (c5019l.loadAd == -1) {
                    C5019l c5019l2 = c12212lYandex.mopub.yandex;
                    if (c5019l2.loadAd != -1 || c5019l.purchase == c5019l2.purchase) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            C11496l c11496l2 = c12212lYandex.mopub;
            boolean z10 = z;
            C5019l c5019l3 = c11496l2.yandex;
            long j9 = c11496l2.loadAd;
            this.f1784l = ad(c5019l3, j9, c11496l2.amazon, j9, !z10, 0);
            m573catch();
            m595l();
            if (purchase() && c12212lYandex == c12031l7.firebase) {
                for (C17424l c17424l11 : c17424lArr4) {
                    int i15 = c17424l11.amazon;
                    if (i15 == 3 || i15 == 4) {
                        boolean z11 = i15 == 4;
                        AbstractC1091l abstractC1091l6 = (AbstractC1091l) c17424l11.purchase;
                        AbstractC1091l abstractC1091l7 = (AbstractC1091l) c17424l11.billing;
                        if (z11) {
                            abstractC1091l7.getClass();
                            abstractC1091l7.yandex(17, abstractC1091l6);
                        } else {
                            abstractC1091l7.getClass();
                            abstractC1091l6.yandex(17, abstractC1091l7);
                        }
                        c17424l11.amazon = c17424l11.amazon == 4 ? 0 : 1;
                    } else if (i15 == 2) {
                        c17424l11.amazon = 0;
                    }
                }
            }
            if (this.f1784l.purchase == 3) {
                m597l();
            }
            C9598l c9598l6 = c12031l7.subs.metrica;
            for (int i16 = 0; i16 < c17424lArr4.length; i16++) {
                if (c9598l6.premium(i16)) {
                    C17424l c17424l12 = c17424lArr4[i16];
                    AbstractC1091l abstractC1091l8 = (AbstractC1091l) c17424l12.billing;
                    AbstractC1091l abstractC1091l9 = (AbstractC1091l) c17424l12.purchase;
                    if (C17424l.subs(abstractC1091l9)) {
                        abstractC1091l9.amazon();
                    } else if (abstractC1091l8 != null && C17424l.subs(abstractC1091l8)) {
                        abstractC1091l8.amazon();
                    }
                }
            }
            z9 = true;
        }
        this.f1787l.getClass();
    }

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final void m588l(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.f1737l = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f1751l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f1749l = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final void m589l(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.f1788l;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        C10749l c10749l = this.f1784l;
        if (c10749l.smaato == z2 && c10749l.vip == i2 && c10749l.remoteconfig == i3) {
            return;
        }
        this.f1784l = c10749l.purchase(i3, i2, z2);
        m588l(false, false);
        C12031l c12031l = this.f1790l;
        for (C12212l c12212l = c12031l.subs; c12212l != null; c12212l = c12212l.remoteconfig) {
            for (InterfaceC10376l interfaceC10376l : (InterfaceC10376l[]) c12212l.metrica.f19553l) {
                if (interfaceC10376l != null) {
                    interfaceC10376l.vip(z2);
                }
            }
        }
        if (!m592l()) {
            m590l();
            m595l();
            C10749l c10749l2 = this.f1784l;
            if (c10749l2.startapp) {
                this.f1784l = c10749l2.subs(false);
            }
            c12031l.vip(this.f1748l);
            return;
        }
        int i4 = this.f1784l.purchase;
        C14500l c14500l = this.f1746l;
        if (i4 != 3) {
            if (i4 == 2) {
                c14500l.mopub(2);
            }
        } else {
            C16990l c16990l = this.f1786l;
            c16990l.f33118l = true;
            ((C3071l) c16990l.f33117l).crashlytics();
            m597l();
            c14500l.mopub(2);
        }
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final void m590l() {
        C16990l c16990l = this.f1786l;
        c16990l.f33118l = false;
        C3071l c3071l = (C3071l) c16990l.f33117l;
        if (c3071l.f6604l) {
            c3071l.yandex(c3071l.mopub());
            c3071l.f6604l = false;
        }
        for (C17424l c17424l : this.f1757l) {
            AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
            AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.purchase;
            if (C17424l.subs(abstractC1091l2)) {
                C17424l.loadAd(abstractC1091l2);
            }
            if (abstractC1091l != null && C17424l.subs(abstractC1091l)) {
                C17424l.loadAd(abstractC1091l);
            }
        }
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final void m591l(boolean z, boolean z2) {
        m613throw(z || !this.f1772l, false, true, false);
        this.f1753l.purchase(z2 ? 1 : 0);
        C7865l c7865l = this.f1781l;
        ConcurrentHashMap concurrentHashMap = c7865l.adcel;
        C17849l c17849l = this.f1738l;
        C2492l c2492l = (C2492l) concurrentHashMap.get(c17849l);
        if (c2492l != null) {
            int i = c2492l.yandex - 1;
            c2492l.yandex = i;
            if (i == 0) {
                concurrentHashMap.remove(c17849l);
                c7865l.crashlytics();
            }
        }
        this.f1776l.amazon(1, this.f1784l.smaato);
        m583implements(1);
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final boolean m592l() {
        C10749l c10749l = this.f1784l;
        return c10749l.smaato && c10749l.vip == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final void m593l(C5019l c5019l, C9598l c9598l) {
        boolean z;
        C12212l c12212l = this.f1790l.smaato;
        c12212l.getClass();
        metrica(c12212l.amazon());
        if (m599l(this.f1784l.yandex, c12212l.mopub.yandex)) {
            long j = this.f1745l.admob;
        }
        AbstractC10759l abstractC10759l = this.f1784l.yandex;
        float f = this.f1786l.billing().yandex;
        boolean z2 = this.f1784l.smaato;
        InterfaceC10376l[] interfaceC10376lArr = (InterfaceC10376l[]) c9598l.f19553l;
        C7865l c7865l = this.f1781l;
        c7865l.getClass();
        AbstractC13675l abstractC13675l = c7865l.startapp;
        C17849l c17849l = this.f1738l;
        Integer num = (Integer) abstractC13675l.get(c17849l.yandex);
        int iIntValue = (num == null || num.intValue() == -1) ? c7865l.smaato : num.intValue();
        C2492l c2492l = (C2492l) c7865l.adcel.get(c17849l);
        c2492l.getClass();
        if (iIntValue == -1) {
            C17805l c17805l = abstractC10759l.remoteconfig(abstractC10759l.mopub(c5019l.yandex, c7865l.loadAd).crashlytics, c7865l.yandex, 0L).crashlytics.loadAd;
            if (c17805l == null) {
                z = false;
            } else {
                String scheme = c17805l.yandex.getScheme();
                if (TextUtils.isEmpty(scheme) || C7865l.subscription.contains(scheme)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int length = interfaceC10376lArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    InterfaceC10376l interfaceC10376l = interfaceC10376lArr[i];
                    if (interfaceC10376l != null) {
                        switch (interfaceC10376l.firebase().crashlytics) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = z ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                C11983l.crashlytics();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = AbstractC15323l.isPro(i2, 13107200, 210239488);
                }
            }
        }
        c2492l.crashlytics = iIntValue;
        c7865l.crashlytics();
    }

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final void m594l(int i, int i2, List list) throws Throwable {
        this.f1753l.purchase(1);
        C5044l c5044l = this.f1759l;
        c5044l.getClass();
        ArrayList arrayList = (ArrayList) c5044l.crashlytics;
        AbstractC12442l.admob(i >= 0 && i <= i2 && i2 <= arrayList.size());
        AbstractC12442l.admob(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C16548l) arrayList.get(i3)).yandex.subscription((C2427l) list.get(i3 - i));
        }
        Signature(c5044l.crashlytics(), false);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final void m595l() {
        C1372l c1372lBilling;
        long j;
        float f;
        C12212l c12212l = this.f1790l.subs;
        if (c12212l == null) {
            return;
        }
        long jRemoteconfig = c12212l.purchase ? c12212l.yandex.remoteconfig() : -9223372036854775807L;
        if (jRemoteconfig != -9223372036854775807L) {
            if (!c12212l.mopub()) {
                this.f1790l.metrica(c12212l);
                tapsense(false);
                premium();
            }
            m577else(jRemoteconfig, true);
            if (jRemoteconfig != this.f1784l.subscription) {
                C10749l c10749l = this.f1784l;
                this.f1784l = ad(c10749l.loadAd, jRemoteconfig, c10749l.crashlytics, jRemoteconfig, true, 5);
            }
        } else {
            C16990l c16990l = this.f1786l;
            boolean z = c12212l != this.f1790l.isPro;
            C3071l c3071l = (C3071l) c16990l.f33117l;
            AbstractC1091l abstractC1091l = (AbstractC1091l) c16990l.f33120l;
            if (abstractC1091l == null || abstractC1091l.smaato() || ((z && ((AbstractC1091l) c16990l.f33120l).f3010l != 2) || (!((AbstractC1091l) c16990l.f33120l).remoteconfig() && (z || ((AbstractC1091l) c16990l.f33120l).firebase())))) {
                c16990l.f33119l = true;
                if (c16990l.f33118l) {
                    c3071l.crashlytics();
                }
            } else {
                InterfaceC10666l interfaceC10666l = (InterfaceC10666l) c16990l.f33122l;
                interfaceC10666l.getClass();
                long jMopub = interfaceC10666l.mopub();
                if (!c16990l.f33119l) {
                    c3071l.yandex(jMopub);
                    c1372lBilling = interfaceC10666l.billing();
                    if (!c1372lBilling.equals((C1372l) c3071l.f6605l)) {
                        c3071l.loadAd(c1372lBilling);
                        ((C0477l) c16990l.f33121l).f1746l.loadAd(16, c1372lBilling).loadAd();
                    }
                } else if (jMopub >= c3071l.mopub()) {
                    c16990l.f33119l = false;
                    if (c16990l.f33118l) {
                        c3071l.crashlytics();
                    }
                    c3071l.yandex(jMopub);
                    c1372lBilling = interfaceC10666l.billing();
                    if (!c1372lBilling.equals((C1372l) c3071l.f6605l)) {
                        c3071l.loadAd(c1372lBilling);
                        ((C0477l) c16990l.f33121l).f1746l.loadAd(16, c1372lBilling).loadAd();
                    }
                } else if (c3071l.f6604l) {
                    c3071l.yandex(c3071l.mopub());
                    c3071l.f6604l = false;
                }
            }
            long jMopub2 = c16990l.mopub();
            this.f1748l = jMopub2;
            long j2 = jMopub2 - c12212l.startapp;
            long j3 = this.f1784l.subscription;
            if (!this.f1768l.isEmpty() && !this.f1784l.loadAd.loadAd()) {
                if (this.f1773l) {
                    this.f1773l = false;
                }
                C10749l c10749l2 = this.f1784l;
                c10749l2.yandex.loadAd(c10749l2.loadAd.yandex);
                int iMin = Math.min(this.f1764l, this.f1768l.size());
                if (iMin > 0 && this.f1768l.get(iMin - 1) != null) {
                    C18725l.loadAd();
                    return;
                } else {
                    if (iMin < this.f1768l.size() && this.f1768l.get(iMin) != null) {
                        C18725l.loadAd();
                        return;
                    }
                    this.f1764l = iMin;
                }
            }
            if (this.f1786l.admob()) {
                boolean z2 = !this.f1753l.purchase;
                C10749l c10749l3 = this.f1784l;
                this.f1784l = ad(c10749l3.loadAd, j2, c10749l3.crashlytics, j2, z2, 6);
            } else {
                C10749l c10749l4 = this.f1784l;
                c10749l4.subscription = j2;
                c10749l4.tapsense = SystemClock.elapsedRealtime();
            }
        }
        this.f1784l.adcel = this.f1790l.smaato.amazon();
        C10749l c10749l5 = this.f1784l;
        c10749l5.ads = metrica(c10749l5.adcel);
        C10749l c10749l6 = this.f1784l;
        if (c10749l6.smaato && c10749l6.purchase == 3 && m599l(c10749l6.yandex, c10749l6.loadAd)) {
            C10749l c10749l7 = this.f1784l;
            float f2 = 1.0f;
            if (c10749l7.metrica.yandex == 1.0f) {
                C4705l c4705l = this.f1745l;
                long jSmaato = smaato(c10749l7.yandex, c10749l7.loadAd.yandex, c10749l7.subscription);
                long j4 = this.f1784l.ads;
                if (c4705l.crashlytics != -9223372036854775807L) {
                    long j5 = jSmaato - j4;
                    long j6 = c4705l.remoteconfig;
                    if (j6 == -9223372036854775807L) {
                        c4705l.remoteconfig = j5;
                        c4705l.vip = 0L;
                    } else {
                        long jMax = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        c4705l.remoteconfig = jMax;
                        c4705l.vip = (long) ((9.999871E-4f * Math.abs(j5 - jMax)) + (c4705l.vip * 0.999f));
                    }
                    if (c4705l.smaato != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - c4705l.smaato < 1000) {
                            f2 = c4705l.firebase;
                        }
                    } else {
                        j = 1000;
                    }
                    c4705l.smaato = SystemClock.elapsedRealtime();
                    long j7 = (c4705l.vip * 3) + c4705l.remoteconfig;
                    if (c4705l.admob > j7) {
                        float fM3962continue = AbstractC15323l.m3962continue(j);
                        f = 1.0E-7f;
                        long[] jArr = {j7, c4705l.purchase, c4705l.admob - (((long) ((c4705l.firebase - 1.0f) * fM3962continue)) + ((long) ((c4705l.subs - 1.0f) * fM3962continue)))};
                        long j8 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j9 = jArr[i];
                            if (j9 > j8) {
                                j8 = j9;
                            }
                        }
                        c4705l.admob = j8;
                    } else {
                        f = 1.0E-7f;
                        long jFirebase = AbstractC15323l.firebase(jSmaato - ((long) (Math.max(0.0f, c4705l.firebase - 1.0f) / 1.0E-7f)), c4705l.admob, j7);
                        c4705l.admob = jFirebase;
                        long j10 = c4705l.mopub;
                        if (j10 != -9223372036854775807L && jFirebase > j10) {
                            c4705l.admob = j10;
                        }
                    }
                    long j11 = jSmaato - c4705l.admob;
                    if (Math.abs(j11) < c4705l.yandex) {
                        c4705l.firebase = 1.0f;
                    } else {
                        c4705l.firebase = AbstractC15323l.subs((f * j11) + 1.0f, c4705l.isPro, c4705l.subs);
                    }
                    f2 = c4705l.firebase;
                }
                if (this.f1786l.billing().yandex != f2) {
                    C1372l c1372l = new C1372l(f2, this.f1784l.metrica.loadAd);
                    this.f1746l.billing(16);
                    this.f1786l.loadAd(c1372l);
                    pro(this.f1784l.metrica, this.f1786l.billing().yandex, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final void m596l(AbstractC10759l abstractC10759l, C5019l c5019l, AbstractC10759l abstractC10759l2, C5019l c5019l2, long j, boolean z) {
        boolean zM599l = m599l(abstractC10759l, c5019l);
        Object obj = c5019l.yandex;
        if (!zM599l) {
            C1372l c1372l = c5019l.loadAd() ? C1372l.amazon : this.f1784l.metrica;
            C16990l c16990l = this.f1786l;
            if (c16990l.billing().equals(c1372l)) {
                return;
            }
            this.f1746l.billing(16);
            c16990l.loadAd(c1372l);
            pro(this.f1784l.metrica, c1372l.yandex, false, false);
            return;
        }
        C3904l c3904l = this.f1778l;
        int i = abstractC10759l.mopub(obj, c3904l).crashlytics;
        C4322l c4322l = this.f1783l;
        abstractC10759l.vip(i, c4322l);
        C7828l c7828l = c4322l.isPro;
        C4705l c4705l = this.f1745l;
        c4705l.getClass();
        c4705l.crashlytics = AbstractC15323l.m3962continue(c7828l.yandex);
        c4705l.billing = AbstractC15323l.m3962continue(c7828l.loadAd);
        c4705l.mopub = AbstractC15323l.m3962continue(c7828l.crashlytics);
        float f = c7828l.amazon;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c4705l.isPro = f;
        float f2 = c7828l.purchase;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        c4705l.subs = f2;
        if (f == 1.0f && f2 == 1.0f) {
            c4705l.crashlytics = -9223372036854775807L;
        }
        c4705l.yandex();
        if (j != -9223372036854775807L) {
            c4705l.amazon = smaato(abstractC10759l, obj, j);
            c4705l.yandex();
            return;
        }
        if (!Objects.equals(!abstractC10759l2.startapp() ? abstractC10759l2.remoteconfig(abstractC10759l2.mopub(c5019l2.yandex, c3904l).crashlytics, c4322l, 0L).yandex : null, c4322l.yandex) || z) {
            c4705l.amazon = -9223372036854775807L;
            c4705l.yandex();
        }
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void m597l() {
        C12212l c12212l = this.f1790l.subs;
        if (c12212l == null) {
            return;
        }
        C9598l c9598l = c12212l.metrica;
        int i = 0;
        while (true) {
            C17424l[] c17424lArr = this.f1757l;
            if (i >= c17424lArr.length) {
                return;
            }
            if (c9598l.premium(i)) {
                c17424lArr[i].vip();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final void m598l() {
        C12212l c12212l = this.f1790l.smaato;
        boolean z = this.f1752l || (c12212l != null && c12212l.yandex.amazon());
        C10749l c10749l = this.f1784l;
        if (z != c10749l.mopub) {
            this.f1784l = c10749l.loadAd(z);
        }
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final boolean m599l(AbstractC10759l abstractC10759l, C5019l c5019l) {
        if (c5019l.loadAd() || abstractC10759l.startapp()) {
            return false;
        }
        int i = abstractC10759l.mopub(c5019l.yandex, this.f1778l).crashlytics;
        C4322l c4322l = this.f1783l;
        abstractC10759l.vip(i, c4322l);
        return c4322l.yandex() && c4322l.subs && c4322l.billing != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void m600l(float f) {
        this.f1782l = f;
        float f2 = f * this.f1776l.mopub;
        for (C17424l c17424l : this.f1757l) {
            if (c17424l.purchase() == 1) {
                ((AbstractC1091l) c17424l.purchase).yandex(2, Float.valueOf(f2));
                AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
                if (abstractC1091l != null) {
                    abstractC1091l.yandex(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final long metrica(long j) {
        C12212l c12212l = this.f1790l.smaato;
        if (c12212l == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f1748l - c12212l.startapp));
    }

    public final void mopub() {
        AbstractC1091l abstractC1091l;
        if (this.f1765l && purchase()) {
            for (C17424l c17424l : this.f1757l) {
                int iCrashlytics = c17424l.crashlytics();
                C16990l c16990l = this.f1786l;
                if (c17424l.mopub()) {
                    int i = c17424l.amazon;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            abstractC1091l = (AbstractC1091l) c17424l.purchase;
                        } catch (RuntimeException e) {
                            AbstractC6427l.subs("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        abstractC1091l = (AbstractC1091l) c17424l.billing;
                        abstractC1091l.getClass();
                    }
                    c17424l.yandex(abstractC1091l, c16990l);
                    try {
                        c17424l.isPro(z);
                    } catch (RuntimeException e2) {
                        AbstractC6427l.subs("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    c17424l.amazon = i2;
                }
                this.f1785l -= iCrashlytics - c17424l.crashlytics();
            }
            this.f1735l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m601native(C5811l c5811l) {
        C17219l c17219l = this.f1780l;
        C14500l c14500l = this.f1746l;
        try {
            m613throw(true, false, true, false);
            m604private();
            C7865l c7865l = this.f1781l;
            C17849l c17849l = this.f1738l;
            ConcurrentHashMap concurrentHashMap = c7865l.adcel;
            C2492l c2492l = (C2492l) concurrentHashMap.get(c17849l);
            if (c2492l != null) {
                int i = c2492l.yandex - 1;
                c2492l.yandex = i;
                if (i == 0) {
                    concurrentHashMap.remove(c17849l);
                    c7865l.crashlytics();
                }
            }
            if (c7865l.adcel.isEmpty()) {
                c7865l.ads = -1L;
            }
            C0498l c0498l = this.f1776l;
            c0498l.crashlytics = null;
            c0498l.yandex();
            c0498l.crashlytics(0);
            this.f1770l.smaato();
            m583implements(1);
        } finally {
            c14500l.purchase();
            c17219l.m4281class();
            c5811l.amazon();
        }
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m602new(C9087l c9087l) {
        Looper looper = c9087l.purchase;
        if (looper.getThread().isAlive()) {
            this.f1751l.yandex(looper, null).amazon(new RunnableC11297l(this, c9087l));
        } else {
            AbstractC6427l.vip("TAG", "Trying to send message on a dead thread.");
            c9087l.yandex(false);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m603package(final int i, final boolean z) {
        boolean[] zArr = this.f1741l;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f1754l.amazon(new Runnable() { // from class: lؘؘٞ
                @Override // java.lang.Runnable
                public final void run() {
                    C0477l c0477l = this.f12334l;
                    C17505l c17505l = c0477l.f1791l;
                    C17424l[] c17424lArr = c0477l.f1757l;
                    final int i2 = i;
                    final int iPurchase = c17424lArr[i2].purchase();
                    final C5597l c5597lM4397goto = c17505l.m4397goto();
                    final boolean z2 = z;
                    c17505l.m4401super(c5597lM4397goto, 1033, new InterfaceC16975l() { // from class: lؕٝٚ
                        @Override // defpackage.InterfaceC16975l
                        public final void invoke(Object obj) {
                            ((InterfaceC5252l) obj).premium(c5597lM4397goto, i2, iPurchase, z2);
                        }
                    });
                }
            });
        }
    }

    public final void premium() {
        boolean zLoadAd;
        if (advert(this.f1790l.smaato)) {
            C12212l c12212l = this.f1790l.smaato;
            long jMetrica = metrica(!c12212l.purchase ? 0L : c12212l.yandex.billing());
            C12212l c12212l2 = this.f1790l.subs;
            long j = m599l(this.f1784l.yandex, c12212l.mopub.yandex) ? this.f1745l.admob : -9223372036854775807L;
            C17849l c17849l = this.f1738l;
            AbstractC10759l abstractC10759l = this.f1784l.yandex;
            C5019l c5019l = c12212l.mopub.yandex;
            float f = this.f1786l.billing().yandex;
            boolean z = this.f1784l.smaato;
            C12576l c12576l = new C12576l(c17849l, abstractC10759l, c5019l, jMetrica, f, this.f1737l, j);
            zLoadAd = this.f1781l.loadAd(c12576l);
            C12212l c12212l3 = this.f1790l.subs;
            if (!zLoadAd && c12212l3.purchase && jMetrica < 500000 && this.f1739l > 0) {
                c12212l3.yandex.isPro(this.f1784l.subscription);
                zLoadAd = this.f1781l.loadAd(c12576l);
            }
        } else {
            zLoadAd = false;
        }
        this.f1752l = zLoadAd;
        if (zLoadAd) {
            C12212l c12212l4 = this.f1790l.smaato;
            c12212l4.getClass();
            C7751l c7751l = new C7751l();
            c7751l.yandex = this.f1748l - c12212l4.startapp;
            float f2 = this.f1786l.billing().yandex;
            AbstractC12442l.admob(f2 > 0.0f || f2 == -3.4028235E38f);
            c7751l.loadAd = f2;
            long j2 = this.f1749l;
            AbstractC12442l.admob(j2 >= 0 || j2 == -9223372036854775807L);
            c7751l.crashlytics = j2;
            C11495l c11495l = new C11495l(c7751l);
            AbstractC12442l.subscription(c12212l4.remoteconfig == null);
            c12212l4.yandex.adcel(c11495l);
        }
        m598l();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m604private() {
        for (int i = 0; i < this.f1757l.length; i++) {
            AbstractC1091l abstractC1091l = this.f1756l[i];
            synchronized (abstractC1091l.f3013l) {
                abstractC1091l.f3024l = null;
            }
            C17424l c17424l = this.f1757l[i];
            AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.purchase;
            AbstractC12442l.subscription(abstractC1091l2.f3010l == 0);
            abstractC1091l2.adcel();
            c17424l.yandex = false;
            AbstractC1091l abstractC1091l3 = (AbstractC1091l) c17424l.billing;
            if (abstractC1091l3 != null) {
                AbstractC12442l.subscription(abstractC1091l3.f3010l == 0);
                abstractC1091l3.adcel();
                c17424l.loadAd = false;
            }
        }
    }

    public final void pro(C1372l c1372l, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f1753l.purchase(1);
            }
            this.f1784l = this.f1784l.mopub(c1372l);
        }
        float f2 = c1372l.yandex;
        C12212l c12212l = this.f1790l.subs;
        while (true) {
            i = 0;
            if (c12212l == null) {
                break;
            }
            InterfaceC10376l[] interfaceC10376lArr = (InterfaceC10376l[]) c12212l.metrica.f19553l;
            int length = interfaceC10376lArr.length;
            while (i < length) {
                InterfaceC10376l interfaceC10376l = interfaceC10376lArr[i];
                if (interfaceC10376l != null) {
                    interfaceC10376l.pro(f2);
                }
                i++;
            }
            c12212l = c12212l.remoteconfig;
        }
        C17424l[] c17424lArr = this.f1757l;
        int length2 = c17424lArr.length;
        while (i < length2) {
            C17424l c17424l = c17424lArr[i];
            float f3 = c1372l.yandex;
            ((AbstractC1091l) c17424l.purchase).signatures(f, f3);
            AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
            if (abstractC1091l != null) {
                abstractC1091l.signatures(f, f3);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m605protected(boolean z) {
        this.f1755l = z;
        AbstractC10759l abstractC10759l = this.f1784l.yandex;
        C12031l c12031l = this.f1790l;
        c12031l.admob = z;
        int iSubscription = c12031l.subscription(abstractC10759l);
        if ((iSubscription & 1) != 0) {
            m586interface(true);
        } else if ((iSubscription & 2) != 0) {
            mopub();
        }
        tapsense(false);
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m606public(C1372l c1372l) {
        this.f1746l.billing(16);
        C16990l c16990l = this.f1786l;
        c16990l.loadAd(c1372l);
        C1372l c1372lBilling = c16990l.billing();
        pro(c1372lBilling, c1372lBilling.yandex, true, true);
    }

    public final boolean purchase() {
        if (!this.f1765l) {
            return false;
        }
        for (C17424l c17424l : this.f1757l) {
            if (c17424l.mopub()) {
                return true;
            }
        }
        return false;
    }

    public final long remoteconfig(C12212l c12212l) {
        if (c12212l == null) {
            return 0L;
        }
        long jMax = c12212l.startapp;
        if (!c12212l.purchase) {
            return jMax;
        }
        int i = 0;
        while (true) {
            C17424l[] c17424lArr = this.f1757l;
            if (i >= c17424lArr.length) {
                return jMax;
            }
            if (c17424lArr[i].amazon(c12212l) != null) {
                AbstractC1091l abstractC1091lAmazon = c17424lArr[i].amazon(c12212l);
                Objects.requireNonNull(abstractC1091lAmazon);
                long j = abstractC1091lAmazon.f3007l;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j, jMax);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final void m607return(Object obj, C5811l c5811l) {
        for (C17424l c17424l : this.f1757l) {
            if (c17424l.purchase() == 2) {
                int i = c17424l.amazon;
                if (i == 4 || i == 1) {
                    AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
                    abstractC1091l.getClass();
                    abstractC1091l.yandex(1, obj);
                } else {
                    ((AbstractC1091l) c17424l.purchase).yandex(1, obj);
                }
            }
        }
        int i2 = this.f1784l.purchase;
        if (i2 == 3 || i2 == 2) {
            this.f1746l.mopub(2);
        }
        if (c5811l != null) {
            c5811l.amazon();
        }
    }

    public final boolean signatures() {
        C12212l c12212l = this.f1790l.subs;
        long j = c12212l.mopub.billing;
        if (c12212l.purchase) {
            return j == -9223372036854775807L || this.f1784l.subscription < j || !m592l();
        }
        return false;
    }

    public final long smaato(AbstractC10759l abstractC10759l, Object obj, long j) {
        C3904l c3904l = this.f1778l;
        int i = abstractC10759l.mopub(obj, c3904l).crashlytics;
        C4322l c4322l = this.f1783l;
        abstractC10759l.vip(i, c4322l);
        if (c4322l.billing != -9223372036854775807L && c4322l.yandex() && c4322l.subs) {
            return AbstractC15323l.m3962continue(AbstractC15323l.inmobi(c4322l.mopub) - c4322l.billing) - (j + c3904l.purchase);
        }
        return -9223372036854775807L;
    }

    public final void startapp(int i) {
        C10749l c10749l = this.f1784l;
        m589l(i, c10749l.vip, c10749l.remoteconfig, c10749l.smaato);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m608static(C6817l c6817l) throws Throwable {
        long jLongValue;
        long jMax;
        C5019l c5019lAdcel;
        long j;
        long j2;
        boolean z;
        long j3;
        boolean z2;
        long j4;
        long jMopub;
        C10749l c10749l;
        int i;
        long j5;
        int i2;
        long j6;
        C5019l c5019l;
        long j7;
        C0477l c0477l = this;
        if (c0477l.f1761l) {
            if (c0477l.f1779l != null) {
                c0477l.f1734l++;
                c0477l.f1753l.purchase(1);
            }
            c0477l.f1779l = c6817l;
            return;
        }
        c0477l.f1753l.purchase(1);
        Pair pairM569switch = m569switch(c0477l.f1784l.yandex, c6817l, true, c0477l.f1740l, c0477l.f1755l, c0477l.f1783l, c0477l.f1778l);
        if (pairM569switch == null) {
            Pair pairVip = c0477l.vip(c0477l.f1784l.yandex);
            c5019lAdcel = (C5019l) pairVip.first;
            jLongValue = ((Long) pairVip.second).longValue();
            z = !c0477l.f1784l.yandex.startapp();
            jMax = -9223372036854775807L;
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairM569switch.first;
            jLongValue = ((Long) pairM569switch.second).longValue();
            jMax = c6817l.crashlytics == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            c5019lAdcel = c0477l.f1790l.adcel(c0477l.f1784l.yandex, obj, jLongValue);
            if (c5019lAdcel.loadAd()) {
                c0477l.f1784l.yandex.mopub(c5019lAdcel.yandex, c0477l.f1778l);
                jLongValue = c0477l.f1778l.billing(c5019lAdcel.loadAd) == c5019lAdcel.crashlytics ? c0477l.f1778l.mopub.loadAd : 0L;
                C8597l c8597lYandex = c0477l.f1778l.mopub.yandex(c5019lAdcel.loadAd);
                j2 = 0;
                j = -9223372036854775807L;
                jMax = Math.max(jMax, c8597lYandex.yandex + c8597lYandex.isPro);
            } else {
                j = -9223372036854775807L;
                j2 = 0;
                if (c6817l.crashlytics != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (!c0477l.f1784l.yandex.startapp()) {
                    C10749l c10749l2 = c0477l.f1784l;
                    if (pairM569switch == null) {
                        if (c10749l2.purchase != 1) {
                            c0477l.m583implements(4);
                        }
                        c0477l.m613throw(false, true, false, true);
                    } else {
                        if (c5019lAdcel.equals(c10749l2.loadAd)) {
                            try {
                                C12212l c12212l = c0477l.f1790l.subs;
                                if (c12212l == null || !c12212l.purchase || jLongValue == j2) {
                                    jMopub = jLongValue;
                                } else {
                                    InterfaceC8782l interfaceC8782l = c12212l.yandex;
                                    long j8 = c0477l.f1783l.remoteconfig;
                                    if (c0477l.f1788l && j8 != j) {
                                        c0477l.f1775l.getClass();
                                    }
                                    jMopub = interfaceC8782l.mopub(jLongValue, c0477l.f1763l);
                                }
                                if (AbstractC15323l.m3986try(jMopub) == AbstractC15323l.m3986try(c0477l.f1784l.subscription) && ((i = (c10749l = c0477l.f1784l).purchase) == 2 || i == 3)) {
                                    j5 = c10749l.subscription;
                                    i2 = 2;
                                    j6 = j5;
                                    z2 = z;
                                    c5019l = c5019lAdcel;
                                    j7 = jMax;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z2 = z;
                                j4 = jLongValue;
                                j3 = jMax;
                                c0477l.f1784l = c0477l.ad(c5019lAdcel, j4, j3, j4, z2, 2);
                                throw th;
                            }
                        } else {
                            jMopub = jLongValue;
                        }
                        try {
                            boolean z3 = c0477l.f1784l.purchase == 4;
                            try {
                                C12031l c12031l = c0477l.f1790l;
                                long jM576default = c0477l.m576default(c5019lAdcel, jMopub, c12031l.subs != c12031l.isPro, z3);
                                z2 = (jLongValue != jM576default) | z;
                                try {
                                    C10749l c10749l3 = c0477l.f1784l;
                                    C5019l c5019l2 = c5019lAdcel;
                                    try {
                                        AbstractC10759l abstractC10759l = c10749l3.yandex;
                                        long j9 = jMax;
                                        try {
                                            c0477l.m596l(abstractC10759l, c5019l2, abstractC10759l, c10749l3.loadAd, j9, true);
                                            c5019l = c5019l2;
                                            j7 = j9;
                                            j5 = jM576default;
                                            i2 = 2;
                                            j6 = j5;
                                            c0477l = this;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c5019lAdcel = c5019l2;
                                            j3 = j9;
                                            j4 = jM576default;
                                            c0477l.f1784l = c0477l.ad(c5019lAdcel, j4, j3, j4, z2, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c5019lAdcel = c5019l2;
                                        j3 = jMax;
                                        j4 = jM576default;
                                        c0477l.f1784l = c0477l.ad(c5019lAdcel, j4, j3, j4, z2, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j3 = jMax;
                                z2 = z;
                                j4 = jLongValue;
                                c0477l.f1784l = c0477l.ad(c5019lAdcel, j4, j3, j4, z2, 2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    c0477l.f1784l = c0477l.ad(c5019l, j5, j7, j6, z2, i2);
                }
                c0477l.f1789l = c6817l;
                z2 = z;
                c5019l = c5019lAdcel;
                j5 = jLongValue;
                j7 = jMax;
                i2 = 2;
                j6 = j5;
                c0477l = this;
                c0477l.f1784l = c0477l.ad(c5019l, j5, j7, j6, z2, i2);
            } catch (Throwable th7) {
                th = th7;
                z2 = z;
            }
        } catch (Throwable th8) {
            th = th8;
            z = z;
            c5019lAdcel = c5019lAdcel;
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m609strictfp(C9771l c9771l) throws Throwable {
        AbstractC10759l abstractC10759lCrashlytics;
        this.f1753l.purchase(1);
        int i = c9771l.yandex;
        int i2 = c9771l.loadAd;
        int i3 = c9771l.crashlytics;
        C12800l c12800l = c9771l.amazon;
        C5044l c5044l = this.f1759l;
        ArrayList arrayList = (ArrayList) c5044l.crashlytics;
        AbstractC12442l.admob(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        c5044l.firebase = c12800l;
        if (i == i2 || i == i3) {
            abstractC10759lCrashlytics = c5044l.crashlytics();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iMetrica = ((C16548l) arrayList.get(iMin)).amazon;
            AbstractC15323l.m3981switch(arrayList, i, i2, i3);
            while (iMin <= iMax) {
                C16548l c16548l = (C16548l) arrayList.get(iMin);
                c16548l.amazon = iMetrica;
                iMetrica += c16548l.yandex.metrica.purchase.metrica();
                iMin++;
            }
            abstractC10759lCrashlytics = c5044l.crashlytics();
        }
        Signature(abstractC10759lCrashlytics, false);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:153:0x0252  */
    /* JADX WARN: Code duplicated, block: B:155:0x025f  */
    /* JADX WARN: Code duplicated, block: B:189:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:201:0x0301  */
    /* JADX WARN: Code duplicated, block: B:208:0x031c  */
    /* JADX WARN: Code duplicated, block: B:210:0x031f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0327  */
    /* JADX WARN: Code duplicated, block: B:213:0x0334  */
    /* JADX WARN: Code duplicated, block: B:214:0x033e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0354  */
    /* JADX WARN: Code duplicated, block: B:221:0x035d  */
    /* JADX WARN: Code duplicated, block: B:224:0x0362  */
    /* JADX WARN: Code duplicated, block: B:228:0x0369  */
    /* JADX WARN: Code duplicated, block: B:231:0x0370  */
    /* JADX WARN: Code duplicated, block: B:234:0x037b  */
    /* JADX WARN: Code duplicated, block: B:247:0x0396  */
    /* JADX WARN: Code duplicated, block: B:256:0x02fb A[EDGE_INSN: B:256:0x02fb->B:199:0x02fb BREAK  A[LOOP:1: B:190:0x02e3->B:198:0x02f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    public final void subs() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        boolean zSignatures;
        int i;
        boolean z5;
        long j2;
        C18527l c18527l;
        boolean z6;
        C10749l c10749l;
        int i2;
        int i3;
        C17424l[] c17424lArr;
        C10749l c10749l2;
        boolean z7;
        this.f1751l.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f1746l.billing(2);
        if (!this.f1736l) {
            m587l();
        }
        int i4 = this.f1784l.purchase;
        if (i4 == 1 || i4 == 4) {
            return;
        }
        if (this.f1736l) {
            m587l();
        }
        C12212l c12212l = this.f1790l.subs;
        if (c12212l == null) {
            m574class(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        m595l();
        if (c12212l.purchase) {
            this.f1751l.getClass();
            this.f1747l = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime());
            c12212l.yandex.isPro(this.f1784l.subscription - this.f1739l);
            z = true;
            z2 = true;
            int i5 = 0;
            while (true) {
                C17424l[] c17424lArr2 = this.f1757l;
                if (i5 >= c17424lArr2.length) {
                    break;
                }
                C17424l c17424l = c17424lArr2[i5];
                if (c17424l.crashlytics() == 0) {
                    m603package(i5, false);
                } else {
                    long j3 = this.f1748l;
                    long j4 = this.f1747l;
                    AbstractC1091l abstractC1091l = (AbstractC1091l) c17424l.billing;
                    AbstractC1091l abstractC1091l2 = (AbstractC1091l) c17424l.purchase;
                    if (C17424l.subs(abstractC1091l2)) {
                        abstractC1091l2.ad(j3, j4);
                    }
                    if (abstractC1091l != null && C17424l.subs(abstractC1091l)) {
                        abstractC1091l.ad(j3, j4);
                    }
                    if (z) {
                        AbstractC1091l abstractC1091l3 = (AbstractC1091l) c17424l.billing;
                        AbstractC1091l abstractC1091l4 = (AbstractC1091l) c17424l.purchase;
                        boolean zSmaato = C17424l.subs(abstractC1091l4) ? abstractC1091l4.smaato() : true;
                        if (abstractC1091l3 != null && C17424l.subs(abstractC1091l3)) {
                            zSmaato &= abstractC1091l3.smaato();
                        }
                        if (zSmaato) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    AbstractC1091l abstractC1091lAmazon = c17424l.amazon(c12212l);
                    boolean z8 = abstractC1091lAmazon == null || abstractC1091lAmazon.firebase() || abstractC1091lAmazon.remoteconfig() || abstractC1091lAmazon.smaato();
                    m603package(i5, z8);
                    z2 = z2 && z8;
                    if (!z8) {
                        inmobi(i5);
                    }
                }
                i5++;
            }
        } else {
            c12212l.yandex.admob();
            z = true;
            z2 = true;
        }
        long j5 = c12212l.mopub.billing;
        boolean z9 = z && c12212l.purchase && (j5 == -9223372036854775807L || j5 <= this.f1784l.subscription);
        if (z9 && this.f1750l) {
            this.f1750l = false;
            int i6 = this.f1784l.vip;
            this.f1753l.purchase(0);
            m589l(this.f1776l.amazon(this.f1784l.purchase, false), i6, 5, false);
        }
        if (!z9 || !c12212l.mopub.firebase) {
            C10749l c10749l3 = this.f1784l;
            if (c10749l3.purchase == 2) {
                C12031l c12031l = this.f1790l;
                if (this.f1785l != 0) {
                    if (!z2) {
                        zSignatures = false;
                    } else if (c10749l3.mopub) {
                        C12212l c12212l2 = c12031l.subs;
                        long j6 = m599l(c10749l3.yandex, c12212l2.mopub.yandex) ? this.f1745l.admob : -9223372036854775807L;
                        C12212l c12212l3 = c12031l.smaato;
                        boolean z10 = c12212l3.mopub() && c12212l3.mopub.firebase;
                        boolean z11 = c12212l3.mopub.yandex.loadAd() && !c12212l3.purchase;
                        if (z10 || z11) {
                            j = -9223372036854775807L;
                        } else {
                            long jMetrica = metrica(c12212l3.amazon());
                            C7865l c7865l = this.f1781l;
                            C17849l c17849l = this.f1738l;
                            j = -9223372036854775807L;
                            AbstractC10759l abstractC10759l = this.f1784l.yandex;
                            C5019l c5019l = c12212l2.mopub.yandex;
                            float f = this.f1786l.billing().yandex;
                            boolean z12 = this.f1784l.smaato;
                            boolean z13 = this.f1737l;
                            c7865l.getClass();
                            long j7 = j6;
                            C17805l c17805l = abstractC10759l.remoteconfig(abstractC10759l.mopub(c5019l.yandex, c7865l.loadAd).crashlytics, c7865l.yandex, 0L).crashlytics.loadAd;
                            if (c17805l == null) {
                                z4 = false;
                            } else {
                                String scheme = c17805l.yandex.getScheme();
                                if (TextUtils.isEmpty(scheme) || C7865l.subscription.contains(scheme)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            long jM3975package = AbstractC15323l.m3975package(f, jMetrica);
                            long jMin = z13 ? z4 ? c7865l.firebase : c7865l.isPro : z4 ? c7865l.subs : c7865l.admob;
                            if (j7 != -9223372036854775807L) {
                                jMin = Math.min(j7 / 2, jMin);
                            }
                            if (jMin > 0 && jM3975package < jMin) {
                                if (!(z4 ? c7865l.vip : c7865l.remoteconfig)) {
                                    C2492l c2492l = (C2492l) c7865l.adcel.get(c17849l);
                                    c2492l.getClass();
                                    synchronized (c2492l) {
                                        i = c2492l.amazon;
                                    }
                                    int i7 = i * c7865l.crashlytics.f26152l;
                                    C2492l c2492l2 = (C2492l) c7865l.adcel.get(c17849l);
                                    c2492l2.getClass();
                                    if (i7 >= c2492l2.crashlytics) {
                                    }
                                }
                                zSignatures = false;
                            }
                        }
                        zSignatures = true;
                    } else {
                        j = -9223372036854775807L;
                        zSignatures = true;
                    }
                    if (zSignatures) {
                        m583implements(3);
                        this.f1758l = null;
                        if (m592l()) {
                            m588l(false, false);
                            C16990l c16990l = this.f1786l;
                            z3 = true;
                            c16990l.f33118l = true;
                            ((C3071l) c16990l.f33117l).crashlytics();
                            m597l();
                        }
                    }
                    if (this.f1784l.purchase == 2) {
                        i3 = 0;
                        while (true) {
                            c17424lArr = this.f1757l;
                            if (i3 < c17424lArr.length) {
                                break;
                            }
                            if (c17424lArr[i3].amazon(c12212l) != null) {
                                z7 = z3;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                inmobi(i3);
                            }
                            i3++;
                        }
                        c10749l2 = this.f1784l;
                        if (c10749l2.mopub && c10749l2.ads < 500000 && advert(this.f1790l.smaato) && m592l()) {
                            z5 = z3;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        j2 = this.f1774l;
                        c18527l = this.f1751l;
                        if (j2 == -9223372036854775807L) {
                            c18527l.getClass();
                            this.f1774l = SystemClock.elapsedRealtime();
                        } else {
                            c18527l.getClass();
                            if (SystemClock.elapsedRealtime() - this.f1774l >= 4000) {
                                throw new C6240l(0, 4000);
                            }
                        }
                    } else {
                        this.f1774l = -9223372036854775807L;
                    }
                    if (m592l() || this.f1784l.purchase != 3) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (this.f1743l || !this.f1762l || !z6) {
                        z3 = false;
                    }
                    c10749l = this.f1784l;
                    if (c10749l.startapp != z3) {
                        this.f1784l = c10749l.subs(z3);
                    }
                    this.f1762l = false;
                    if (!z3 && (i2 = this.f1784l.purchase) != 4 && (z6 || i2 == 2 || (i2 == 3 && this.f1785l != 0))) {
                        m574class(jUptimeMillis);
                    }
                    Trace.endSection();
                }
                zSignatures = signatures();
                j = -9223372036854775807L;
                if (zSignatures) {
                    m583implements(3);
                    this.f1758l = null;
                    if (m592l()) {
                        m588l(false, false);
                        C16990l c16990l2 = this.f1786l;
                        z3 = true;
                        c16990l2.f33118l = true;
                        ((C3071l) c16990l2.f33117l).crashlytics();
                        m597l();
                    }
                }
                if (this.f1784l.purchase == 2) {
                    i3 = 0;
                    while (true) {
                        c17424lArr = this.f1757l;
                        if (i3 < c17424lArr.length) {
                            break;
                            break;
                        }
                        if (c17424lArr[i3].amazon(c12212l) != null) {
                            z7 = z3;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            inmobi(i3);
                        }
                        i3++;
                    }
                    c10749l2 = this.f1784l;
                    if (c10749l2.mopub) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    this.f1774l = -9223372036854775807L;
                } else {
                    j2 = this.f1774l;
                    c18527l = this.f1751l;
                    if (j2 == -9223372036854775807L) {
                        c18527l.getClass();
                        this.f1774l = SystemClock.elapsedRealtime();
                    } else {
                        c18527l.getClass();
                        if (SystemClock.elapsedRealtime() - this.f1774l >= 4000) {
                            throw new C6240l(0, 4000);
                        }
                    }
                }
                if (m592l()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (this.f1743l) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                c10749l = this.f1784l;
                if (c10749l.startapp != z3) {
                    this.f1784l = c10749l.subs(z3);
                }
                this.f1762l = false;
                if (!z3) {
                    m574class(jUptimeMillis);
                }
                Trace.endSection();
            }
            j = -9223372036854775807L;
            z3 = true;
            if (this.f1784l.purchase == 3 && (this.f1785l != 0 ? !z2 : !signatures())) {
                m588l(m592l(), false);
                m583implements(2);
                if (this.f1737l) {
                    for (C12212l c12212l4 = this.f1790l.subs; c12212l4 != null; c12212l4 = c12212l4.remoteconfig) {
                        for (InterfaceC10376l interfaceC10376l : (InterfaceC10376l[]) c12212l4.metrica.f19553l) {
                            if (interfaceC10376l != null) {
                                interfaceC10376l.isVip();
                            }
                        }
                    }
                    C4705l c4705l = this.f1745l;
                    long j8 = c4705l.admob;
                    if (j8 != j) {
                        long j9 = j8 + c4705l.loadAd;
                        c4705l.admob = j9;
                        long j10 = c4705l.mopub;
                        if (j10 != j && j9 > j10) {
                            c4705l.admob = j10;
                        }
                        c4705l.smaato = j;
                    }
                }
                m590l();
            }
            if (this.f1784l.purchase == 2) {
                i3 = 0;
                while (true) {
                    c17424lArr = this.f1757l;
                    if (i3 < c17424lArr.length) {
                        break;
                        break;
                    }
                    if (c17424lArr[i3].amazon(c12212l) != null) {
                        z7 = z3;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        inmobi(i3);
                    }
                    i3++;
                }
                c10749l2 = this.f1784l;
                if (c10749l2.mopub) {
                    z5 = false;
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            if (z5) {
                this.f1774l = -9223372036854775807L;
            } else {
                j2 = this.f1774l;
                c18527l = this.f1751l;
                if (j2 == -9223372036854775807L) {
                    c18527l.getClass();
                    this.f1774l = SystemClock.elapsedRealtime();
                } else {
                    c18527l.getClass();
                    if (SystemClock.elapsedRealtime() - this.f1774l >= 4000) {
                        throw new C6240l(0, 4000);
                    }
                }
            }
            if (m592l()) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (this.f1743l) {
                z3 = false;
            } else {
                z3 = false;
            }
            c10749l = this.f1784l;
            if (c10749l.startapp != z3) {
                this.f1784l = c10749l.subs(z3);
            }
            this.f1762l = false;
            if (!z3) {
                m574class(jUptimeMillis);
            }
            Trace.endSection();
        }
        m583implements(4);
        m590l();
        z3 = true;
        if (this.f1784l.purchase == 2) {
            i3 = 0;
            while (true) {
                c17424lArr = this.f1757l;
                if (i3 < c17424lArr.length) {
                    break;
                    break;
                }
                if (c17424lArr[i3].amazon(c12212l) != null) {
                    z7 = z3;
                } else {
                    z7 = false;
                }
                if (z7) {
                    inmobi(i3);
                }
                i3++;
            }
            c10749l2 = this.f1784l;
            if (c10749l2.mopub) {
                z5 = false;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z5) {
            this.f1774l = -9223372036854775807L;
        } else {
            j2 = this.f1774l;
            c18527l = this.f1751l;
            if (j2 == -9223372036854775807L) {
                c18527l.getClass();
                this.f1774l = SystemClock.elapsedRealtime();
            } else {
                c18527l.getClass();
                if (SystemClock.elapsedRealtime() - this.f1774l >= 4000) {
                    throw new C6240l(0, 4000);
                }
            }
        }
        if (m592l()) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (this.f1743l) {
            z3 = false;
        } else {
            z3 = false;
        }
        c10749l = this.f1784l;
        if (c10749l.startapp != z3) {
            this.f1784l = c10749l.subs(z3);
        }
        this.f1762l = false;
        if (!z3) {
            m574class(jUptimeMillis);
        }
        Trace.endSection();
    }

    public final void subscription(int i, IOException iOException) {
        C17361l c17361l = new C17361l(0, iOException, i);
        C12212l c12212l = this.f1790l.subs;
        if (c12212l != null) {
            c17361l = c17361l.crashlytics(c12212l.mopub.yandex);
        }
        AbstractC6427l.subs("ExoPlayerImplInternal", "Playback error", c17361l);
        m591l(false, false);
        this.f1784l = this.f1784l.billing(c17361l);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m610super(boolean z, C5811l c5811l) {
        if (this.f1772l != z) {
            this.f1772l = z;
            if (!z) {
                for (C17424l c17424l : this.f1757l) {
                    c17424l.smaato();
                }
            }
        }
        if (c5811l != null) {
            c5811l.amazon();
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m611synchronized() throws Throwable {
        Signature(this.f1759l.crashlytics(), true);
    }

    public final void tapsense(boolean z) {
        C12212l c12212l = this.f1790l.smaato;
        C5019l c5019l = c12212l == null ? this.f1784l.loadAd : c12212l.mopub.yandex;
        boolean zEquals = this.f1784l.firebase.equals(c5019l);
        if (!zEquals) {
            this.f1784l = this.f1784l.crashlytics(c5019l);
        }
        C10749l c10749l = this.f1784l;
        c10749l.adcel = c12212l == null ? c10749l.subscription : c12212l.amazon();
        C10749l c10749l2 = this.f1784l;
        c10749l2.ads = metrica(c10749l2.adcel);
        if ((!zEquals || z) && c12212l != null && c12212l.purchase) {
            m593l(c12212l.mopub.yandex, c12212l.metrica);
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m612this(int i) {
        this.f1740l = i;
        AbstractC10759l abstractC10759l = this.f1784l.yandex;
        C12031l c12031l = this.f1790l;
        c12031l.mopub = i;
        int iSubscription = c12031l.subscription(abstractC10759l);
        if ((iSubscription & 1) != 0) {
            m586interface(true);
        } else if ((iSubscription & 2) != 0) {
            mopub();
        }
        tapsense(false);
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x015b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x019a A[LOOP:3: B:80:0x0192->B:82:0x019a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4  */
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m613throw(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        AbstractC10759l c12164l;
        C5019l c5019l;
        C10749l c10749l;
        C17361l c17361l;
        C8750l c8750l;
        C9598l c9598l;
        List list;
        C12031l c12031l;
        int i;
        this.f1746l.billing(2);
        this.f1761l = false;
        if (this.f1779l != null) {
            this.f1753l.purchase(1);
            this.f1779l = null;
        }
        this.f1758l = null;
        m588l(false, true);
        C16990l c16990l = this.f1786l;
        c16990l.f33118l = false;
        C3071l c3071l = (C3071l) c16990l.f33117l;
        if (c3071l.f6604l) {
            c3071l.yandex(c3071l.mopub());
            c3071l.f6604l = false;
        }
        this.f1748l = 1000000000000L;
        for (int i2 = 0; i2 < this.f1757l.length; i2++) {
            try {
                admob(i2);
            } catch (RuntimeException e) {
                e = e;
                AbstractC6427l.subs("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (C17361l e2) {
                e = e2;
                AbstractC6427l.subs("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.f1735l = -9223372036854775807L;
        if (z) {
            for (C17424l c17424l : this.f1757l) {
                try {
                    c17424l.smaato();
                } catch (RuntimeException e3) {
                    AbstractC6427l.subs("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.f1785l = 0;
        C10749l c10749l2 = this.f1784l;
        C5019l c5019l2 = c10749l2.loadAd;
        long j4 = c10749l2.subscription;
        if (this.f1784l.loadAd.loadAd()) {
            j = this.f1784l.crashlytics;
        } else {
            C10749l c10749l3 = this.f1784l;
            C3904l c3904l = this.f1778l;
            C5019l c5019l3 = c10749l3.loadAd;
            AbstractC10759l abstractC10759l = c10749l3.yandex;
            if (abstractC10759l.startapp() || abstractC10759l.mopub(c5019l3.yandex, c3904l).billing) {
                j = this.f1784l.crashlytics;
            } else {
                j = this.f1784l.subscription;
            }
        }
        if (z2) {
            this.f1789l = null;
            Pair pairVip = vip(this.f1784l.yandex);
            c5019l2 = (C5019l) pairVip.first;
            long jLongValue = ((Long) pairVip.second).longValue();
            z5 = c5019l2.equals(this.f1784l.loadAd) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.f1790l.loadAd();
        this.f1752l = false;
        AbstractC10759l abstractC10759l2 = this.f1784l.yandex;
        if (z3 && (abstractC10759l2 instanceof C12164l)) {
            C12164l c12164l2 = (C12164l) abstractC10759l2;
            C12800l c12800l = (C12800l) this.f1759l.firebase;
            AbstractC10759l[] abstractC10759lArr = c12164l2.firebase;
            AbstractC10759l[] abstractC10759lArr2 = new AbstractC10759l[abstractC10759lArr.length];
            for (int i3 = 0; i3 < abstractC10759lArr.length; i3++) {
                abstractC10759lArr2[i3] = new C5797l(abstractC10759lArr[i3]);
            }
            c12164l = new C12164l(abstractC10759lArr2, c12164l2.smaato, c12800l);
            if (c5019l2.loadAd != -1) {
                c12164l.mopub(c5019l2.yandex, this.f1778l);
                int i4 = this.f1778l.crashlytics;
                C4322l c4322l = this.f1783l;
                c12164l.remoteconfig(i4, c4322l, 0L);
                if (c4322l.yandex()) {
                    c5019l = new C5019l(c5019l2.amazon, c5019l2.yandex);
                }
            }
            c10749l = this.f1784l;
            int i5 = c10749l.purchase;
            if (z4) {
                c17361l = null;
            } else {
                c17361l = c10749l.billing;
            }
            if (z5) {
                c8750l = C8750l.amazon;
            } else {
                c8750l = c10749l.admob;
            }
            C8750l c8750l2 = c8750l;
            if (z5) {
                c9598l = this.f1769l;
            } else {
                c9598l = c10749l.subs;
            }
            C9598l c9598l2 = c9598l;
            if (z5) {
                C9258l c9258l = AbstractC1186l.f3181l;
                list = C13708l.f26763l;
            } else {
                list = c10749l.isPro;
            }
            this.f1784l = new C10749l(c12164l, c5019l, j3, j2, i5, c17361l, false, c8750l2, c9598l2, list, c5019l, c10749l.smaato, c10749l.remoteconfig, c10749l.vip, c10749l.metrica, j2, 0L, j2, 0L, false);
            if (z3) {
                c12031l = this.f1790l;
                if (!c12031l.adcel.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i = 0; i < c12031l.adcel.size(); i++) {
                        ((C12212l) c12031l.adcel.get(i)).subs();
                    }
                    c12031l.adcel = arrayList;
                    c12031l.remoteconfig = null;
                    c12031l.smaato();
                }
                C5044l c5044l = this.f1759l;
                HashMap map = (HashMap) c5044l.billing;
                for (C16455l c16455l : map.values()) {
                    try {
                        c16455l.yandex.metrica(c16455l.loadAd);
                    } catch (RuntimeException e4) {
                        AbstractC6427l.subs("MediaSourceList", "Failed to release child source.", e4);
                    }
                    AbstractC14384l abstractC14384l = c16455l.yandex;
                    C7065l c7065l = c16455l.crashlytics;
                    abstractC14384l.ads(c7065l);
                    c16455l.yandex.adcel(c7065l);
                }
                map.clear();
                ((HashSet) c5044l.admob).clear();
                c5044l.yandex = false;
            }
        }
        c12164l = abstractC10759l2;
        c5019l = c5019l2;
        c10749l = this.f1784l;
        int i6 = c10749l.purchase;
        if (z4) {
            c17361l = null;
        } else {
            c17361l = c10749l.billing;
        }
        if (z5) {
            c8750l = C8750l.amazon;
        } else {
            c8750l = c10749l.admob;
        }
        C8750l c8750l3 = c8750l;
        if (z5) {
            c9598l = this.f1769l;
        } else {
            c9598l = c10749l.subs;
        }
        C9598l c9598l3 = c9598l;
        if (z5) {
            C9258l c9258l2 = AbstractC1186l.f3181l;
            list = C13708l.f26763l;
        } else {
            list = c10749l.isPro;
        }
        this.f1784l = new C10749l(c12164l, c5019l, j3, j2, i6, c17361l, false, c8750l3, c9598l3, list, c5019l, c10749l.smaato, c10749l.remoteconfig, c10749l.vip, c10749l.metrica, j2, 0L, j2, 0L, false);
        if (z3) {
            c12031l = this.f1790l;
            if (!c12031l.adcel.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i < c12031l.adcel.size()) {
                    ((C12212l) c12031l.adcel.get(i)).subs();
                }
                c12031l.adcel = arrayList2;
                c12031l.remoteconfig = null;
                c12031l.smaato();
            }
            C5044l c5044l2 = this.f1759l;
            HashMap map2 = (HashMap) c5044l2.billing;
            while (r4.hasNext()) {
                c16455l.yandex.metrica(c16455l.loadAd);
                AbstractC14384l abstractC14384l2 = c16455l.yandex;
                C7065l c7065l2 = c16455l.crashlytics;
                abstractC14384l2.ads(c7065l2);
                c16455l.yandex.adcel(c7065l2);
            }
            map2.clear();
            ((HashSet) c5044l2.admob).clear();
            c5044l2.yandex = false;
        }
    }

    @Override // defpackage.InterfaceC18266l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void mo614throws(InterfaceC3128l interfaceC3128l) {
        this.f1746l.loadAd(9, (InterfaceC8782l) interfaceC3128l).loadAd();
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m615transient(C17654l c17654l) {
        this.f1763l = c17654l;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m616try(boolean z) throws Throwable {
        if (!z) {
            C6817l c6817l = this.f1779l;
            C14500l c14500l = this.f1746l;
            if (c6817l != null && this.f1761l && !c14500l.yandex.hasMessages(37)) {
                this.f1734l++;
            }
            int i = this.f1734l;
            if (i > 0) {
                this.f1754l.amazon(new RunnableC9534l(this, i, 6));
            }
            this.f1734l = 0;
            this.f1761l = false;
            c14500l.billing(37);
            C6817l c6817l2 = this.f1779l;
            if (c6817l2 != null) {
                m608static(c6817l2);
                this.f1779l = null;
                this.f1761l = false;
            }
        }
        this.f1788l = z;
        amazon();
    }

    public final Pair vip(AbstractC10759l abstractC10759l) {
        if (abstractC10759l.startapp()) {
            return Pair.create(C10749l.Signature, 0L);
        }
        Pair pairSubs = abstractC10759l.subs(this.f1783l, this.f1778l, abstractC10759l.yandex(this.f1755l), -9223372036854775807L);
        C5019l c5019lAdcel = this.f1790l.adcel(abstractC10759l, pairSubs.first, 0L);
        long jLongValue = ((Long) pairSubs.second).longValue();
        if (c5019lAdcel.loadAd()) {
            Object obj = c5019lAdcel.yandex;
            C3904l c3904l = this.f1778l;
            abstractC10759l.mopub(obj, c3904l);
            jLongValue = c5019lAdcel.crashlytics == c3904l.billing(c5019lAdcel.loadAd) ? c3904l.mopub.loadAd : 0L;
        }
        return Pair.create(c5019lAdcel, Long.valueOf(jLongValue));
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m617volatile() {
        this.f1753l.purchase(1);
        m613throw(false, false, false, true);
        C7865l c7865l = this.f1781l;
        ConcurrentHashMap concurrentHashMap = c7865l.adcel;
        long id = Thread.currentThread().getId();
        long j = c7865l.ads;
        AbstractC12442l.ads("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        c7865l.ads = id;
        C17849l c17849l = this.f1738l;
        C2492l c2492l = (C2492l) concurrentHashMap.get(c17849l);
        if (c2492l == null) {
            C2492l c2492l2 = new C2492l();
            c2492l2.yandex = 1;
            concurrentHashMap.put(c17849l, c2492l2);
        } else {
            c2492l.yandex++;
        }
        C2492l c2492l3 = (C2492l) concurrentHashMap.get(c17849l);
        c2492l3.getClass();
        Integer num = (Integer) c7865l.startapp.get(c17849l.yandex);
        int iIntValue = (num == null || num.intValue() == -1) ? c7865l.smaato : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        c2492l3.crashlytics = iIntValue;
        c2492l3.loadAd = false;
        m583implements(this.f1784l.yandex.startapp() ? 4 : 2);
        C10749l c10749l = this.f1784l;
        boolean z = c10749l.smaato;
        m589l(this.f1776l.amazon(c10749l.purchase, z), c10749l.vip, c10749l.remoteconfig, z);
        C7713l c7713l = this.f1742l;
        c7713l.getClass();
        C5044l c5044l = this.f1759l;
        ArrayList arrayList = (ArrayList) c5044l.crashlytics;
        AbstractC12442l.subscription(!c5044l.yandex);
        c5044l.smaato = c7713l;
        for (int i = 0; i < arrayList.size(); i++) {
            C16548l c16548l = (C16548l) arrayList.get(i);
            c5044l.mopub(c16548l);
            ((HashSet) c5044l.admob).add(c16548l);
        }
        c5044l.yandex = true;
        this.f1746l.mopub(2);
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void m618while(C12800l c12800l) throws Throwable {
        this.f1753l.purchase(1);
        C5044l c5044l = this.f1759l;
        int size = ((ArrayList) c5044l.crashlytics).size();
        if (c12800l.loadAd.length != size) {
            c12800l = new C12800l(new Random(c12800l.yandex.nextLong())).yandex(0, size);
        }
        c5044l.firebase = c12800l;
        Signature(c5044l.crashlytics(), false);
    }

    public final void yandex(C6428l c6428l, int i) throws Throwable {
        this.f1753l.purchase(1);
        C5044l c5044l = this.f1759l;
        if (i == -1) {
            i = ((ArrayList) c5044l.crashlytics).size();
        }
        Signature(c5044l.yandex(i, c6428l.yandex, c6428l.loadAd), false);
    }
}
