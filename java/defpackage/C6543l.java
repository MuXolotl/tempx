package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6543l extends AbstractC14971l implements InterfaceC16031l, InterfaceC1905l, InterfaceC18141l, InterfaceC8605l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public InterfaceC18327l f13654l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Integer f13655l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final Function2 f13656l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final int f13657l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f13658l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f13659l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f13660l;

    public C6543l(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.f13659l = z;
        this.f13656l = function2;
        this.f13657l = i;
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final C8604l m2022l() {
        C18289l c18289l;
        Object obj;
        if (!this.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l = this.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(this);
        loop0: while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 8388640) != 0) {
                while (abstractC14971l != null) {
                    int i = abstractC14971l.f29450l;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(abstractC14971l instanceof C8604l)) {
                                if (abstractC14971l instanceof AbstractC11340l) {
                                    abstractC14971l = null;
                                    for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971l).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                        if (abstractC14971l2 instanceof C8604l) {
                                            abstractC14971l = abstractC14971l2;
                                        }
                                    }
                                } else {
                                    abstractC14971l = null;
                                }
                            }
                            C8604l c8604l = (C8604l) abstractC14971l;
                            if (c8604l != null) {
                                return c8604l;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (abstractC14971l instanceof InterfaceC18141l) {
                                obj = abstractC14971l;
                            } else if (abstractC14971l instanceof AbstractC11340l) {
                                obj = null;
                                for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971l).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                    if (abstractC14971l3 instanceof InterfaceC18141l) {
                                        obj = abstractC14971l3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            InterfaceC18141l interfaceC18141l = (InterfaceC18141l) obj;
                            if (interfaceC18141l != null) {
                                AbstractC17195l abstractC17195lMo1499new = interfaceC18141l.mo1499new();
                                C5138l c5138l = AbstractC18440l.yandex;
                                if (abstractC17195lMo1499new.crashlytics(c5138l)) {
                                    return (C8604l) interfaceC18141l.mo1499new().billing(c5138l);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    abstractC14971l = abstractC14971l.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C15552l c15552l;
        int iOrdinal = m2028l().ordinal();
        if (iOrdinal == 0) {
            c15552l = (C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner();
            c15552l.loadAd(8, true, false);
            if (this.f13659l) {
                c15552l.yandex.m3776throws();
            }
            c15552l.amazon.yandex();
        } else if (iOrdinal == 1) {
            InterfaceC6497l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner();
            C6543l c6543lLoadAd = AbstractC11156l.loadAd(this);
            if (c6543lLoadAd != null && c6543lLoadAd.f13659l) {
                C15552l c15552l2 = (C15552l) focusOwner;
                c15552l2.yandex.m3776throws();
                c15552l2.amazon.yandex();
            }
        } else if (iOrdinal == 2) {
            c15552l = (C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner();
            c15552l.loadAd(8, true, false);
            if (this.f13659l) {
                c15552l.yandex.m3776throws();
            }
            c15552l.amazon.yandex();
        } else if (iOrdinal != 3) {
            C18725l.billing();
            return;
        }
        this.f13655l = null;
        InterfaceC18327l interfaceC18327l = this.f13654l;
        if (interfaceC18327l != null) {
            ((C5991l) interfaceC18327l).signatures();
        }
        this.f13654l = null;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final boolean m2023l(int i) {
        int iInmobi = AbstractC5020l.inmobi(AbstractC12225l.admob(this, i));
        if (iInmobi == 0) {
            return AbstractC12225l.subs(this);
        }
        if (iInmobi == 1) {
            return false;
        }
        if (iInmobi == 2) {
            return true;
        }
        if (iInmobi == 3) {
            return false;
        }
        C18725l.billing();
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        if (m2028l().loadAd()) {
            ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner()).loadAd(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public final C15468l m2024l() {
        boolean z;
        C18289l c18289l;
        C15468l c15468l = new C15468l();
        c15468l.yandex = true;
        C6523l c6523l = C6523l.loadAd;
        c15468l.loadAd = c6523l;
        c15468l.crashlytics = c6523l;
        c15468l.amazon = c6523l;
        c15468l.purchase = c6523l;
        c15468l.billing = c6523l;
        c15468l.mopub = c6523l;
        c15468l.admob = c6523l;
        c15468l.subs = c6523l;
        c15468l.isPro = C16274l.f31869l;
        c15468l.firebase = C16274l.f31861l;
        c15468l.smaato = C1083l.f2992l;
        int i = this.f13657l;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((C14505l) ((C8600l) ((InterfaceC15148l) AbstractC13402l.loadAd(this, AbstractC4751l.remoteconfig))).yandex.getValue()).yandex == 1);
        } else {
            if (i != 2) {
                C8339l.smaato("Unknown Focusability");
                return null;
            }
            z = false;
        }
        c15468l.yandex = z;
        AbstractC14971l abstractC14971l = this.f29454l;
        if (!abstractC14971l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l2 = this.f29454l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(this);
        loop0: while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 3072) != 0) {
                while (abstractC14971l2 != null) {
                    int i2 = abstractC14971l2.f29450l;
                    if ((i2 & 3072) != 0) {
                        if (abstractC14971l2 != abstractC14971l && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? c17893l = 0;
                            ?? LoadAd = abstractC14971l2;
                            while (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC3228l) {
                                    ((InterfaceC3228l) LoadAd).mo1299synchronized(c15468l);
                                } else if ((LoadAd.f29450l & 2048) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l3 = ((AbstractC11340l) LoadAd).f22875l;
                                    int i3 = 0;
                                    while (abstractC14971l3 != null) {
                                        if ((abstractC14971l3.f29450l & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                LoadAd = LoadAd;
                                                c17893l = c17893l;
                                                c17893l = c17893l;
                                                LoadAd = abstractC14971l3;
                                            } else {
                                                if (c17893l == 0) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l.crashlytics(abstractC14971l3);
                                            }
                                        } else {
                                            LoadAd = LoadAd;
                                            c17893l = c17893l;
                                        }
                                        abstractC14971l3 = abstractC14971l3.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                    if (i3 == 1) {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    } else {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                    }
                    abstractC14971l2 = abstractC14971l2.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l2 = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        return c15468l;
    }

    @Override // defpackage.InterfaceC18141l
    /* JADX INFO: renamed from: lؚْٟ */
    public final /* synthetic */ Object mo1496l(C5138l c5138l) {
        return AbstractC15560l.yandex(this, c5138l);
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m2025l() {
        int iOrdinal = m2028l().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C18725l.billing();
                return;
            }
        }
        C10700l c10700l = new C10700l();
        AbstractC3700l.admob(this, new C4307l(c10700l, this, 5));
        Object obj = c10700l.f21708l;
        if ((obj == null ? null : (InterfaceC1389l) obj).loadAd()) {
            return;
        }
        ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner()).loadAd(8, true, true);
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final boolean m2026l(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m2024l().yandex ? m2023l(i) : AbstractC11852l.mopub(this, i, new C15798l(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final void m2027l(EnumC11822l enumC11822l, EnumC11822l enumC11822l2) {
        C18289l c18289l;
        Function2 function2;
        C15552l c15552l = (C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner();
        C6543l c6543lBilling = c15552l.billing();
        if (!enumC11822l.equals(enumC11822l2) && (function2 = this.f13656l) != null) {
            function2.invoke(enumC11822l, enumC11822l2);
        }
        AbstractC14971l abstractC14971l = this.f29454l;
        if (!abstractC14971l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l2 = this.f29454l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(this);
        while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 5120) != 0) {
                while (abstractC14971l2 != null) {
                    int i = abstractC14971l2.f29450l;
                    if ((i & 5120) != 0) {
                        if (abstractC14971l2 != abstractC14971l && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? LoadAd = abstractC14971l2;
                            ?? c17893l = 0;
                            while (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC10653l) {
                                    InterfaceC10653l interfaceC10653l = (InterfaceC10653l) LoadAd;
                                    if (c6543lBilling == c15552l.billing()) {
                                        interfaceC10653l.mo1231native(enumC11822l2);
                                    }
                                } else if ((LoadAd.f29450l & 4096) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l3 = ((AbstractC11340l) LoadAd).f22875l;
                                    int i2 = 0;
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                    while (abstractC14971l3 != null) {
                                        if ((abstractC14971l3.f29450l & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c17893l = c17893l;
                                                LoadAd = abstractC14971l3;
                                            } else {
                                                if (c17893l == 0) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l.crashlytics(abstractC14971l3);
                                            }
                                        }
                                        abstractC14971l3 = abstractC14971l3.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                    }
                    abstractC14971l2 = abstractC14971l2.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l2 = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final EnumC11822l m2028l() {
        C6543l c6543lBilling;
        C18289l c18289l;
        if (this.f29462l && (c6543lBilling = ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner()).billing()) != null) {
            if (this == c6543lBilling) {
                return EnumC11822l.f23651l;
            }
            if (c6543lBilling.f29462l) {
                if (!c6543lBilling.f29454l.f29462l) {
                    AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
                }
                AbstractC14971l abstractC14971l = c6543lBilling.f29454l.f29456l;
                C3654l c3654lMetrica = AbstractC5573l.metrica(c6543lBilling);
                while (c3654lMetrica != null) {
                    if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 1024) != 0) {
                        while (abstractC14971l != null) {
                            if ((abstractC14971l.f29450l & 1024) != 0) {
                                AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                                C17893l c17893l = null;
                                while (abstractC14971lLoadAd != null) {
                                    if (abstractC14971lLoadAd instanceof C6543l) {
                                        if (this == ((C6543l) abstractC14971lLoadAd)) {
                                            return EnumC11822l.f23650l;
                                        }
                                    } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                        int i = 0;
                                        for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                            if ((abstractC14971l2.f29450l & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    abstractC14971lLoadAd = abstractC14971l2;
                                                } else {
                                                    if (c17893l == null) {
                                                        c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                    }
                                                    if (abstractC14971lLoadAd != null) {
                                                        c17893l.crashlytics(abstractC14971lLoadAd);
                                                        abstractC14971lLoadAd = null;
                                                    }
                                                    c17893l.crashlytics(abstractC14971l2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                                }
                            }
                            abstractC14971l = abstractC14971l.f29456l;
                        }
                    }
                    c3654lMetrica = c3654lMetrica.license();
                    abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
                }
            }
        }
        return EnumC11822l.f23653l;
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final C8896l m2029l(InterfaceC18212l interfaceC18212l) {
        C8896l c8896l = m2024l().smaato;
        if (c8896l != C1083l.f2992l) {
            return interfaceC18212l == null ? c8896l : c8896l.vip(interfaceC18212l.mo2589native(AbstractC5573l.vip(this), 0L, (6 & 4) != 0));
        }
        return interfaceC18212l != null ? interfaceC18212l.mo2592synchronized(AbstractC5573l.vip(this), false) : AbstractC7470l.isPro(0L, AbstractC14707l.mopub(AbstractC5573l.vip(this).f20590l));
    }

    @Override // defpackage.InterfaceC18141l
    /* JADX INFO: renamed from: new */
    public final /* synthetic */ AbstractC17195l mo1499new() {
        return C4761l.loadAd;
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        m2025l();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
    }
}
