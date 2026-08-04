package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؑ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0205l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C18730l f1154l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public InterfaceC13515l f1158l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public InterfaceC2262l f1159l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11611l f1163l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f1164l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC1234l f1168l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public InterfaceC18212l f1170l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Function1 f1172l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C1187l f1173l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public InterfaceC9988l f1175l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f1176l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10086l f1162l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f1156l = AbstractC8020l.smaato(Boolean.TRUE);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Function1 f1169l = new C15531l(this, 7);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10715l f1157l = new C10715l();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C6523l f1160l = new C6523l();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C10086l f1171l = AbstractC8020l.smaato(Boolean.FALSE);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C8610l f1166l = AbstractC8020l.mopub(new C1120l(this, 3));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C10086l f1155l = new C10086l(Unit.INSTANCE, C18450l.f36015l);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C10086l f1174l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C10086l f1167l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C10086l f1161l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f1165l = AbstractC8020l.smaato(null);

    public C0205l(C11611l c11611l) {
        this.f1163l = c11611l;
        C18730l c18730l = AbstractC17774l.yandex;
        this.f1154l = new C18730l();
        c11611l.purchase = new C15531l(this, 8);
        c11611l.billing = new C4508l(12, this);
        c11611l.mopub = new C17169l(this);
        c11611l.admob = new C1120l(this, 4);
        c11611l.subs = new C15531l(this, 1);
        c11611l.isPro = new C15531l(this, 2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    public final void adcel() {
        C18730l c18730l = this.f1154l;
        Object[] objArr = c18730l.crashlytics;
        long[] jArr = c18730l.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((C15920l) objArr[(i << 3) + i3]).loadAd();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c18730l.yandex();
    }

    public final EnumC1826l admob() {
        return (EnumC1826l) this.f1161l.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    public final void ads() {
        long j;
        C1187l c1187l;
        long jYandex;
        C1187l c1187l2;
        C15812l c15812l;
        C15812l c15812l2;
        C3242l c3242lSubs = subs();
        InterfaceC18212l interfaceC18212l = this.f1170l;
        C1187l c1187l3 = null;
        C18329l c18329lBilling = (c3242lSubs == null || (c15812l2 = c3242lSubs.yandex) == null) ? null : billing(c15812l2);
        C18329l c18329lBilling2 = (c3242lSubs == null || (c15812l = c3242lSubs.loadAd) == null) ? null : billing(c15812l);
        InterfaceC18212l interfaceC18212lCrashlytics = c18329lBilling != null ? c18329lBilling.crashlytics() : null;
        InterfaceC18212l interfaceC18212lCrashlytics2 = c18329lBilling2 != null ? c18329lBilling2.crashlytics() : null;
        C10086l c10086l = this.f1167l;
        C10086l c10086l2 = this.f1174l;
        if (c3242lSubs == null || interfaceC18212l == null || !interfaceC18212l.mopub() || (interfaceC18212lCrashlytics == null && interfaceC18212lCrashlytics2 == null)) {
            c10086l2.setValue(null);
            c10086l.setValue(null);
            return;
        }
        C8896l c8896lAdmob = AbstractC2044l.admob(interfaceC18212l);
        if (interfaceC18212lCrashlytics != null) {
            j = 9205357640488583168L;
            long jYandex2 = c18329lBilling.yandex(c3242lSubs, true);
            if ((jYandex2 & 9223372034707292159L) != 9205357640488583168L) {
                long jMo2593throws = interfaceC18212l.mo2593throws(interfaceC18212lCrashlytics, jYandex2);
                c1187l = new C1187l(jMo2593throws);
                if (admob() != EnumC1826l.f4234l && !AbstractC2044l.loadAd(jMo2593throws, c8896lAdmob)) {
                }
            }
            c10086l2.setValue(c1187l);
            if (interfaceC18212lCrashlytics2 != null) {
                jYandex = c18329lBilling2.yandex(c3242lSubs, false);
                if ((jYandex & 9223372034707292159L) != j) {
                    long jMo2593throws2 = interfaceC18212l.mo2593throws(interfaceC18212lCrashlytics2, jYandex);
                    c1187l2 = new C1187l(jMo2593throws2);
                    if (admob() != EnumC1826l.f4233l || AbstractC2044l.loadAd(jMo2593throws2, c8896lAdmob)) {
                        c1187l3 = c1187l2;
                    }
                }
            }
            c10086l.setValue(c1187l3);
        }
        j = 9205357640488583168L;
        c1187l = null;
        c10086l2.setValue(c1187l);
        if (interfaceC18212lCrashlytics2 != null) {
            jYandex = c18329lBilling2.yandex(c3242lSubs, false);
            if ((jYandex & 9223372034707292159L) != j) {
                long jMo2593throws3 = interfaceC18212l.mo2593throws(interfaceC18212lCrashlytics2, jYandex);
                c1187l2 = new C1187l(jMo2593throws3);
                if (admob() != EnumC1826l.f4233l) {
                    c1187l3 = c1187l2;
                } else {
                    c1187l3 = c1187l2;
                }
            }
        }
        c10086l.setValue(c1187l3);
    }

    public final long amazon(InterfaceC18212l interfaceC18212l, long j) {
        InterfaceC18212l interfaceC18212l2 = this.f1170l;
        if (interfaceC18212l2 == null || !interfaceC18212l2.mopub()) {
            return 9205357640488583168L;
        }
        return remoteconfig().mo2593throws(interfaceC18212l, j);
    }

    public final C18329l billing(C15812l c15812l) {
        return (C18329l) this.f1163l.crashlytics.purchase(c15812l.crashlytics);
    }

    public final boolean firebase() {
        C3242l c3242lSubs = subs();
        if (c3242lSubs != null) {
            C15812l c15812l = c3242lSubs.loadAd;
            C15812l c15812l2 = c3242lSubs.yandex;
            if (!AbstractC8576l.yandex(c15812l2, c15812l)) {
                if (c15812l2.crashlytics == c15812l.crashlytics) {
                    return true;
                }
                InterfaceC18212l interfaceC18212lRemoteconfig = remoteconfig();
                C11611l c11611l = this.f1163l;
                ArrayList arrayListPurchase = c11611l.purchase(interfaceC18212lRemoteconfig);
                int size = arrayListPurchase.size();
                for (int i = 0; i < size; i++) {
                    C3242l c3242l = (C3242l) c11611l.yandex().purchase(((C18329l) arrayListPurchase.get(i)).yandex);
                    if (c3242l != null && c3242l.yandex.loadAd != c3242l.loadAd.loadAd) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isPro() {
        return ((Boolean) this.f1156l.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        adcel();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void metrica(C3242l c3242l) {
        long j;
        char c;
        long j2;
        long j3;
        C18329l c18329l;
        C15920l c15920l;
        long j4;
        char c2;
        long j5;
        C10086l c10086l = this.f1162l;
        if (AbstractC8576l.yandex(c10086l.getValue(), c3242l)) {
            return;
        }
        c10086l.setValue(c3242l);
        if (c3242l != null) {
            ads();
        }
        C18730l c18730l = this.f1154l;
        long[] jArr = c18730l.yandex;
        int length = jArr.length - 2;
        long j6 = 255;
        char c3 = 7;
        C11611l c11611l = this.f1163l;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j8 = jArr[i];
                j3 = 128;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j8 & j6) < 128) {
                            j4 = j6;
                            int i4 = (i << 3) + i3;
                            c2 = c3;
                            j5 = j7;
                            long j9 = c18730l.loadAd[i4];
                            C15920l c15920l2 = (C15920l) c18730l.crashlytics[i4];
                            boolean zLoadAd = c11611l.yandex().loadAd(j9);
                            if (!zLoadAd) {
                                c15920l2.loadAd();
                            }
                            if (!zLoadAd) {
                                c18730l.admob(i4);
                            }
                        } else {
                            j4 = j6;
                            c2 = c3;
                            j5 = j7;
                        }
                        j8 >>= 8;
                        i3++;
                        c3 = c2;
                        j6 = j4;
                        j7 = j5;
                    }
                    j = j6;
                    c = c3;
                    j2 = j7;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    j = j6;
                    c = c3;
                    j2 = j7;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
                j6 = j;
                j7 = j2;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        C18730l c18730lYandex = c11611l.yandex();
        long[] jArr2 = c18730lYandex.loadAd;
        Object[] objArr = c18730lYandex.crashlytics;
        long[] jArr3 = c18730lYandex.yandex;
        int length2 = jArr3.length - 2;
        if (length2 < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j10 = jArr3[i5];
            if ((((~j10) << c) & j10 & j2) != j2) {
                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((j10 & j) < j3) {
                        int i8 = (i5 << 3) + i7;
                        long j11 = jArr2[i8];
                        C3242l c3242l2 = (C3242l) objArr[i8];
                        if (c3242l2.yandex.loadAd != c3242l2.loadAd.loadAd && (c18329l = (C18329l) c11611l.crashlytics.purchase(j11)) != null && (c15920l = (C15920l) c18329l.amazon.invoke()) != null && !c18730l.loadAd(j11)) {
                            c15920l.yandex();
                            c18730l.subs(j11, c15920l);
                        }
                    }
                    j10 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length2) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final C8195l mopub() {
        int iNextIndex;
        int iMopub;
        int length;
        if (subs() == null) {
            return null;
        }
        C11611l c11611l = this.f1163l;
        if (c11611l.loadAd.isEmpty()) {
            return null;
        }
        C18734l c18734l = new C18734l();
        ArrayList arrayListPurchase = c11611l.purchase(remoteconfig());
        ListIterator listIterator = arrayListPurchase.listIterator(arrayListPurchase.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            C3242l c3242l = (C3242l) c11611l.yandex().purchase(((C18329l) listIterator.previous()).yandex);
            if (c3242l != null && c3242l.yandex.loadAd != c3242l.loadAd.loadAd) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListPurchase.size();
            iMopub = -1;
            length = -1;
            int i = 0;
            while (i < size) {
                C18329l c18329l = (C18329l) arrayListPurchase.get(i);
                C3242l c3242l2 = (C3242l) c11611l.yandex().purchase(c18329l.yandex);
                if (c3242l2 != null) {
                    C3625l c3625lPurchase = c18329l.purchase();
                    long jLoadAd = AbstractC2296l.loadAd(c3242l2.yandex.loadAd, c3242l2.loadAd.loadAd);
                    boolean z = i >= iNextIndex;
                    if (iMopub == -1) {
                        iMopub = C12814l.mopub(jLoadAd);
                        c18734l.loadAd(c3625lPurchase, 0, C12814l.mopub(jLoadAd));
                    }
                    c18734l.loadAd(c3625lPurchase, C12814l.mopub(jLoadAd), C12814l.billing(jLoadAd));
                    StringBuilder sb = c18734l.f36518l;
                    if (z) {
                        length = sb.length();
                        c18734l.loadAd(c3625lPurchase, C12814l.billing(jLoadAd), c3625lPurchase.f7563l.length());
                    } else {
                        sb.append('\n');
                    }
                }
                i++;
            }
        } else {
            iMopub = -1;
            length = -1;
        }
        C3625l c3625lBilling = c18734l.billing();
        if (iMopub == -1 || length == -1) {
            return null;
        }
        return new C8195l(c3625lBilling, new C12814l(AbstractC2296l.loadAd(iMopub, length)));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    public final void purchase() {
        C3625l c3625lBilling;
        Function1 function1;
        int iNextIndex;
        if (subs() != null) {
            C11611l c11611l = this.f1163l;
            if (c11611l.yandex().purchase == 0) {
                c3625lBilling = null;
            } else {
                C18734l c18734l = new C18734l();
                ArrayList arrayListPurchase = c11611l.purchase(remoteconfig());
                ListIterator listIterator = arrayListPurchase.listIterator(arrayListPurchase.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    C3242l c3242l = (C3242l) c11611l.yandex().purchase(((C18329l) listIterator.previous()).yandex);
                    if (c3242l != null && c3242l.yandex.loadAd != c3242l.loadAd.loadAd) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    int size = arrayListPurchase.size();
                    int i = 0;
                    while (i < size) {
                        C18329l c18329l = (C18329l) arrayListPurchase.get(i);
                        C3242l c3242l2 = (C3242l) c11611l.yandex().purchase(c18329l.yandex);
                        if (c3242l2 != null) {
                            C3625l c3625lPurchase = c18329l.purchase();
                            long jLoadAd = AbstractC2296l.loadAd(c3242l2.yandex.loadAd, c3242l2.loadAd.loadAd);
                            boolean z = i >= iNextIndex;
                            c18734l.loadAd(c3625lPurchase, C12814l.mopub(jLoadAd), C12814l.billing(jLoadAd));
                            if (!z) {
                                c18734l.f36518l.append('\n');
                            }
                        }
                        i++;
                    }
                }
                c3625lBilling = c18734l.billing();
            }
        } else {
            c3625lBilling = null;
        }
        if (c3625lBilling != null) {
            C3625l c3625l = c3625lBilling.f7563l.length() > 0 ? c3625lBilling : null;
            if (c3625l == null || (function1 = this.f1172l) == null) {
                return;
            }
            function1.invoke(c3625l);
        }
    }

    public final InterfaceC18212l remoteconfig() {
        InterfaceC18212l interfaceC18212l = this.f1170l;
        if (interfaceC18212l == null) {
            throw AbstractC1757l.m1043volatile("null coordinates");
        }
        if (!interfaceC18212l.mopub()) {
            AbstractC14825l.yandex("unattached coordinates");
        }
        return interfaceC18212l;
    }

    public final void smaato() {
        InterfaceC1234l interfaceC1234l;
        this.f1163l.firebase.setValue(AbstractC17774l.yandex);
        startapp(false);
        this.f1175l = null;
        if (subs() != null) {
            this.f1169l.invoke(null);
            if (!isPro() || (interfaceC1234l = this.f1168l) == null) {
                return;
            }
            ((C9421l) interfaceC1234l).yandex(9);
        }
    }

    public final void startapp(boolean z) {
        this.f1176l = z;
        tapsense();
    }

    public final C3242l subs() {
        return (C3242l) this.f1162l.getValue();
    }

    public final boolean subscription(long j, long j2, boolean z, C11379l c11379l) {
        ArrayList arrayList;
        InterfaceC9988l c2159l;
        C11611l c11611l;
        InterfaceC18212l interfaceC18212lCrashlytics;
        C1739l c1739l;
        C1187l c1187l;
        C0327l c0327l;
        long j3;
        int iYandex;
        int i;
        int i2;
        C6218l c6218l;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C15812l c15812l;
        int i9;
        C15812l c15812l2;
        this.f1161l.setValue(z ? EnumC1826l.f4234l : EnumC1826l.f4233l);
        C1187l c1187l2 = new C1187l(j);
        C10086l c10086l = this.f1165l;
        c10086l.setValue(c1187l2);
        InterfaceC18212l interfaceC18212lRemoteconfig = remoteconfig();
        C11611l c11611l2 = this.f1163l;
        ArrayList arrayListPurchase = c11611l2.purchase(interfaceC18212lRemoteconfig);
        int i10 = AbstractC7401l.yandex;
        C17248l c17248l = new C17248l(6);
        int size = arrayListPurchase.size();
        for (int i11 = 0; i11 < size; i11++) {
            c17248l.purchase(i11, ((C18329l) arrayListPurchase.get(i11)).yandex);
        }
        long j4 = j2 & 9223372034707292159L;
        C6218l c6218l2 = new C6218l(j, j2, interfaceC18212lRemoteconfig, z, j4 == 9205357640488583168L ? null : subs(), j4 == 9205357640488583168L ? null : this.f1175l, new C0323l(5, c17248l));
        int size2 = arrayListPurchase.size();
        int i12 = 0;
        while (true) {
            arrayList = c6218l2.subs;
            if (i12 >= size2) {
                break;
            }
            C18329l c18329l = (C18329l) arrayListPurchase.get(i12);
            InterfaceC18212l interfaceC18212lCrashlytics2 = c18329l.crashlytics();
            if (interfaceC18212lCrashlytics2 == null || (c0327l = (C0327l) c18329l.crashlytics.invoke()) == null) {
                c11611l2 = c11611l2;
                c6218l = c6218l2;
                size2 = size2;
                i12 = i12;
                c10086l = c10086l;
                arrayListPurchase = arrayListPurchase;
            } else {
                long jMo2593throws = c6218l2.crashlytics.mo2593throws(interfaceC18212lCrashlytics2, 0L);
                long jAdmob = C1187l.admob(c6218l2.yandex, jMo2593throws);
                InterfaceC9988l interfaceC9988l = c6218l2.billing;
                C3737l c3737lCrashlytics = interfaceC9988l != null ? interfaceC9988l.crashlytics(c18329l.yandex) : null;
                boolean z2 = c6218l2.amazon;
                int iAmazon = c3737lCrashlytics != null ? z2 ? c3737lCrashlytics.crashlytics : c3737lCrashlytics.amazon : -1;
                long j5 = c6218l2.loadAd;
                long jAdmob2 = (j5 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : C1187l.admob(j5, jMo2593throws);
                long j6 = c18329l.yandex;
                long j7 = c0327l.crashlytics;
                float f = (int) (j7 >> 32);
                float f2 = (int) (j7 & 4294967295L);
                int i13 = (int) (jAdmob >> 32);
                int i14 = Float.intBitsToFloat(i13) < 0.0f ? 1 : Float.intBitsToFloat(i13) > f ? 3 : 2;
                int i15 = (int) (jAdmob & 4294967295L);
                int i16 = Float.intBitsToFloat(i15) < 0.0f ? 1 : Float.intBitsToFloat(i15) > f2 ? 3 : 2;
                C3242l c3242l = c6218l2.purchase;
                if (z2) {
                    C6218l c6218l3 = c6218l2;
                    j3 = j6;
                    iYandex = AbstractC9637l.yandex(i14, i16, c6218l3, j3, c3242l != null ? c3242l.loadAd : null);
                    i = i14;
                    i3 = i16;
                    i2 = i3;
                    c6218l = c6218l3;
                    i4 = i;
                    i5 = iYandex;
                    i6 = i5;
                } else {
                    C6218l c6218l4 = c6218l2;
                    j3 = j6;
                    iYandex = AbstractC9637l.yandex(i14, i16, c6218l4, j3, c3242l != null ? c3242l.yandex : null);
                    i = i14;
                    i2 = i16;
                    c6218l = c6218l4;
                    i3 = iYandex;
                    i4 = i3;
                    i5 = i;
                    i6 = i2;
                }
                int iAmazon2 = AbstractC15450l.amazon(i, i2);
                if (iAmazon2 == 2 || iAmazon2 != iYandex) {
                    int length = c0327l.yandex.yandex.f7563l.length();
                    C0323l c0323l = c6218l.mopub;
                    if (z2) {
                        int iAmazon3 = AbstractC9637l.amazon(jAdmob, c0327l);
                        if (c3242l == null || (c15812l2 = c3242l.loadAd) == null) {
                            length = iAmazon3;
                        } else {
                            int iCompare = c0323l.compare(Long.valueOf(c15812l2.crashlytics), Long.valueOf(j3));
                            if (iCompare < 0) {
                                length = 0;
                            } else if (iCompare <= 0) {
                                length = c15812l2.loadAd;
                            }
                        }
                        i8 = length;
                        i7 = iAmazon3;
                    } else {
                        int iAmazon4 = AbstractC9637l.amazon(jAdmob, c0327l);
                        if (c3242l == null || (c15812l = c3242l.yandex) == null) {
                            length = iAmazon4;
                        } else {
                            int iCompare2 = c0323l.compare(Long.valueOf(c15812l.crashlytics), Long.valueOf(j3));
                            if (iCompare2 < 0) {
                                length = 0;
                            } else if (iCompare2 <= 0) {
                                length = c15812l.loadAd;
                            }
                        }
                        i7 = length;
                        i8 = iAmazon4;
                    }
                    if (iAmazon != -1) {
                        i9 = iAmazon;
                    } else if ((jAdmob2 & 9223372034707292159L) == 9205357640488583168L) {
                        i9 = -1;
                    } else {
                        iAmazon = AbstractC9637l.amazon(jAdmob2, c0327l);
                        i9 = iAmazon;
                    }
                    int i17 = c6218l.smaato + 2;
                    c6218l.smaato = i17;
                    long j8 = j3;
                    C3737l c3737l = new C3737l(j8, i17, i7, i8, i9, c0327l);
                    c6218l.isPro = c6218l.yandex(c6218l.isPro, i4, i3);
                    c6218l.firebase = c6218l.yandex(c6218l.firebase, i5, i6);
                    c6218l.admob.purchase(arrayList.size(), j8);
                    arrayList.add(c3737l);
                }
            }
            i12++;
            c6218l2 = c6218l;
            size2 = size2;
            c10086l = c10086l;
            arrayListPurchase = arrayListPurchase;
            c11611l2 = c11611l2;
        }
        C11611l c11611l3 = c11611l2;
        C10086l c10086l2 = c10086l;
        int i18 = c6218l2.smaato + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            c2159l = null;
        } else if (size3 != 1) {
            int i19 = c6218l2.isPro;
            int i20 = i19 == -1 ? i18 : i19;
            int i21 = c6218l2.firebase;
            c2159l = new C8023l(c6218l2.admob, arrayList, i20, i21 == -1 ? i18 : i21, c6218l2.amazon, c6218l2.purchase);
        } else {
            C3737l c3737l2 = (C3737l) AbstractC16901l.m4208abstract(arrayList);
            int i22 = c6218l2.isPro;
            int i23 = i22 == -1 ? i18 : i22;
            int i24 = c6218l2.firebase;
            c2159l = new C2159l(c6218l2.amazon, i23, i24 == -1 ? i18 : i24, c6218l2.purchase, c3737l2);
        }
        if (c2159l == null) {
            return false;
        }
        boolean zRemoteconfig = c2159l.remoteconfig(this.f1175l);
        if (zRemoteconfig) {
            C3242l c3242lYandex = c11379l.yandex(c2159l);
            if (AbstractC8576l.yandex(c3242lYandex, subs())) {
                c11611l = c11611l3;
            } else {
                if (isPro()) {
                    c11611l = c11611l3;
                    ArrayList arrayList2 = c11611l.loadAd;
                    int size4 = arrayList2.size();
                    for (int i25 = 0; i25 < size4; i25++) {
                        if (((C18329l) arrayList2.get(i25)).purchase().f7563l.length() > 0) {
                            InterfaceC1234l interfaceC1234l = this.f1168l;
                            if (interfaceC1234l == null) {
                                break;
                            }
                            ((C9421l) interfaceC1234l).yandex(9);
                            break;
                        }
                    }
                } else {
                    c11611l = c11611l3;
                }
                c11611l.firebase.setValue(c2159l.vip(c3242lYandex));
                this.f1169l.invoke(c3242lYandex);
                this.f1164l = false;
            }
            this.f1175l = c2159l;
        } else {
            c11611l = c11611l3;
        }
        InterfaceC9988l interfaceC9988l2 = this.f1175l;
        if (interfaceC9988l2 != null) {
            C3737l c3737lLoadAd = interfaceC9988l2.loadAd();
            C18329l c18329l2 = (C18329l) c11611l.crashlytics.purchase(c3737lLoadAd.yandex);
            if (c18329l2 != null && (interfaceC18212lCrashlytics = c18329l2.crashlytics()) != null && (c1739l = c18329l2.purchase) != null && (c1187l = (C1187l) c10086l2.getValue()) != null) {
                long jMo2593throws2 = interfaceC18212lCrashlytics.mo2593throws(remoteconfig(), c1187l.yandex);
                C10700l c10700l = new C10700l();
                c10700l.f21708l = AbstractC7470l.isPro(jMo2593throws2, 0L);
                if (isPro()) {
                    C8896l c8896lCrashlytics = c3737lLoadAd.billing.crashlytics(interfaceC9988l2.yandex() ? c3737lLoadAd.crashlytics : c3737lLoadAd.amazon);
                    C8896l c8896l = (C8896l) c10700l.f21708l;
                    c10700l.f21708l = new C8896l(Math.min(c8896l.yandex, c8896lCrashlytics.yandex), Math.min(c8896l.loadAd, c8896lCrashlytics.loadAd), Math.max(c8896l.crashlytics, c8896lCrashlytics.crashlytics), Math.max(c8896l.amazon, c8896lCrashlytics.amazon));
                }
                C8896l c8896l2 = (C8896l) c10700l.f21708l;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC8576l.amazon(Float.intBitsToFloat((int) (jMo2593throws2 & 4294967295L)), 0.0f, (int) (interfaceC18212lCrashlytics.smaato() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC8576l.amazon(Float.intBitsToFloat((int) (jMo2593throws2 >> 32)), 0.0f, (int) (interfaceC18212lCrashlytics.smaato() >> 32)))) << 32);
                int i26 = (int) (jFloatToRawIntBits >> 32);
                int i27 = (int) (jFloatToRawIntBits & 4294967295L);
                c10700l.f21708l = new C8896l(Math.min(c8896l2.yandex, Float.intBitsToFloat(i26)), Math.min(c8896l2.loadAd, Float.intBitsToFloat(i27)), Math.max(c8896l2.crashlytics, Float.intBitsToFloat(i26)), Math.max(c8896l2.amazon, Float.intBitsToFloat(i27)));
                InterfaceC2262l interfaceC2262l = this.f1159l;
                if (interfaceC2262l != null) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 4, new C7226l(c1739l, c10700l, null, 23), 1);
                }
            }
        }
        return zRemoteconfig;
    }

    public final void tapsense() {
        C7504l c7504l;
        if (((Boolean) this.f1171l.getValue()).booleanValue()) {
            boolean z = this.f1176l;
            C10715l c10715l = this.f1157l;
            if (z && isPro()) {
                if (((C8896l) this.f1166l.getValue()) == null) {
                    return;
                }
                c10715l.yandex();
            } else {
                C4451l c4451l = c10715l.yandex;
                if (c4451l == null || (c7504l = c4451l.f9058l) == null) {
                    return;
                }
                c7504l.ads(null);
                c4451l.f9058l = null;
            }
        }
    }

    public final void vip(boolean z) {
        C10086l c10086l = this.f1156l;
        if (((Boolean) c10086l.getValue()).booleanValue() != z) {
            c10086l.setValue(Boolean.valueOf(z));
            tapsense();
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        adcel();
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
    }
}
