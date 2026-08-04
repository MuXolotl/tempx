package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14569l extends AbstractC11340l implements InterfaceC13202l, InterfaceC16036l, InterfaceC3703l, InterfaceC16031l, InterfaceC1905l, InterfaceC17612l, InterfaceC0421l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C12951l f28512l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public String f28513l = "idle";

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f28514l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C6402l f28515l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public String f28516l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public boolean f28517l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C12044l f28518l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f28519l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C2403l f28520l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final C18730l f28521l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public InterfaceC8605l f28522l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public InterfaceC2186l f28523l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C7504l f28524l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C12951l f28525l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C18395l f28526l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public long f28527l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public C2403l f28528l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C0261l f28529l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public InterfaceC2186l f28530l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public Function0 f28531l;

    public AbstractC14569l(C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z, boolean z2, String str, C6402l c6402l, Function0 function0) {
        this.f28520l = c2403l;
        this.f28530l = interfaceC2186l;
        this.f28519l = z;
        this.f28516l = str;
        this.f28515l = c6402l;
        this.f28514l = z2;
        this.f28531l = function0;
        this.f28518l = new C12044l(c2403l, 0, new C2176l(1, this, AbstractC14569l.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 13));
        C18730l c18730l = AbstractC17774l.yandex;
        this.f28521l = new C18730l();
        this.f28527l = 0L;
        C2403l c2403l2 = this.f28520l;
        this.f28528l = c2403l2;
        this.f28517l = c2403l2 == null;
    }

    public void appmetrica(C9185l c9185l, EnumC9065l enumC9065l, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.f28527l = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        m3868l();
        if (this.f28514l) {
            if (this.f28526l == null) {
                C18395l c18395l = new C18395l(this);
                m3069l(c18395l);
                this.f28526l = c18395l;
            }
            if (enumC9065l == EnumC9065l.f18653l) {
                int i = c9185l.billing;
                int i2 = 0;
                InterfaceC14029l interfaceC14029l = null;
                if (i == 4) {
                    AbstractC10999l.mopub(m3914l(), null, 0, new C8219l(this, interfaceC14029l, i2), 3);
                } else if (i == 5) {
                    AbstractC10999l.mopub(m3914l(), null, 0, new C8219l(this, interfaceC14029l, 1), 3);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC0421l
    /* JADX INFO: renamed from: interface */
    public final String mo531interface() {
        return this.f28513l;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        C6402l c6402l = this.f28515l;
        if (c6402l != null) {
            AbstractC3668l.remoteconfig(interfaceC17593l, c6402l.yandex);
        }
        String str = this.f28516l;
        C9506l c9506l = new C9506l(this, 1);
        InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
        interfaceC17593l.amazon(AbstractC16601l.loadAd, new C7629l(str, c9506l));
        if (this.f28514l) {
            this.f28518l.isPro(interfaceC17593l);
        } else {
            AbstractC3668l.yandex(interfaceC17593l);
        }
        mo1507l(interfaceC17593l);
    }

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final boolean m3862l() {
        C10700l c10700l = new C10700l();
        AbstractC13359l.mopub(this, C18395l.f35931l, new C0786l(4, new C10489l(c10700l, 0)));
        if (c10700l.f21708l != null) {
            return true;
        }
        int i = AbstractC1587l.loadAd;
        ViewParent parent = AbstractC1068l.billing(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public final void m3863l(C15730l c15730l) {
        C2403l c2403l = this.f28520l;
        if (c2403l != null) {
            C12951l c12951l = new C12951l(c15730l.crashlytics);
            InterfaceC14029l interfaceC14029l = null;
            if (m3862l()) {
                this.f28524l = AbstractC10999l.mopub(m3914l(), null, 0, new C4405l(c2403l, c12951l, this, interfaceC14029l, 1), 3);
            } else {
                this.f28525l = c12951l;
                AbstractC10999l.mopub(m3914l(), null, 0, new C11290l(c2403l, c12951l, interfaceC14029l, 2), 3);
            }
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final boolean mo491l() {
        return true;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        m3871l();
        if (this.f28528l == null) {
            this.f28520l = null;
        }
        InterfaceC8605l interfaceC8605l = this.f28522l;
        if (interfaceC8605l != null) {
            m3073l(interfaceC8605l);
        }
        this.f28522l = null;
        C18395l c18395l = this.f28526l;
        if (c18395l != null) {
            m3073l(c18395l);
        }
        this.f28526l = null;
    }

    /* JADX INFO: renamed from: lؓۚ۟ */
    public abstract void mo1978l(KeyEvent keyEvent);

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        mo540while();
        if (!this.f28517l) {
            m3868l();
        }
        if (this.f28514l) {
            m3069l(this.f28518l);
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        mo1500throw();
    }

    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public final void m3864l() {
        InterfaceC4206l interfaceC4206l = (InterfaceC4206l) AbstractC13402l.loadAd(this, AbstractC4751l.license);
        if (interfaceC4206l != null) {
            interfaceC4206l.yandex();
        }
        this.f28531l.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public final void m3865l(C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z, boolean z2, String str, C6402l c6402l, Function0 function0) {
        boolean z3;
        boolean z4;
        InterfaceC8605l interfaceC8605l;
        if (AbstractC8576l.yandex(this.f28528l, c2403l)) {
            z3 = false;
        } else {
            m3871l();
            this.f28528l = c2403l;
            this.f28520l = c2403l;
            z3 = true;
        }
        if (!AbstractC8576l.yandex(this.f28530l, interfaceC2186l)) {
            this.f28530l = interfaceC2186l;
            z3 = true;
        }
        if (this.f28519l != z) {
            this.f28519l = z;
            if (z) {
                mo540while();
            }
            z3 = true;
        }
        boolean z5 = this.f28514l;
        C12044l c12044l = this.f28518l;
        if (z5 != z2) {
            if (z2) {
                m3069l(c12044l);
            } else {
                m3073l(c12044l);
                m3871l();
            }
            AbstractC18037l.purchase(this);
            if (!z2) {
                InterfaceC8605l interfaceC8605l2 = this.f28526l;
                if (interfaceC8605l2 != null) {
                    m3073l(interfaceC8605l2);
                }
                this.f28526l = null;
                this.f28513l = "idle";
            }
            this.f28514l = z2;
        }
        if (!AbstractC8576l.yandex(this.f28516l, str)) {
            this.f28516l = str;
            AbstractC18037l.purchase(this);
        }
        if (!AbstractC8576l.yandex(this.f28515l, c6402l)) {
            this.f28515l = c6402l;
            AbstractC18037l.purchase(this);
        }
        this.f28531l = function0;
        boolean z6 = this.f28517l;
        C2403l c2403l2 = this.f28528l;
        if (z6 != (c2403l2 == null)) {
            boolean z7 = c2403l2 == null;
            this.f28517l = z7;
            z4 = (z7 || this.f28522l != null) ? z3 : true;
        }
        if (z4 && ((interfaceC8605l = this.f28522l) != null || !this.f28517l)) {
            if (interfaceC8605l != null) {
                m3073l(interfaceC8605l);
            }
            this.f28522l = null;
            m3868l();
        }
        c12044l.m3354l(this.f28520l);
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public final void m3866l(long j, boolean z) {
        C2403l c2403l = this.f28520l;
        if (c2403l != null) {
            C7504l c7504l = this.f28524l;
            if (c7504l == null || !c7504l.mopub()) {
                C12951l c12951l = z ? this.f28512l : this.f28525l;
                if (c12951l != null) {
                    AbstractC10999l.mopub(m3914l(), null, 0, new C11290l(c12951l, c2403l, null), 3);
                }
            } else {
                c7504l.ads(null);
                AbstractC10999l.mopub(m3914l(), null, 0, new C11287l(c7504l, j, c2403l, (InterfaceC14029l) null, 0), 3);
            }
            if (z) {
                this.f28512l = null;
            } else {
                this.f28525l = null;
            }
        }
    }

    /* JADX INFO: renamed from: lُٔۨ */
    public abstract boolean mo1983l(KeyEvent keyEvent);

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final /* synthetic */ boolean mo1497l() {
        return false;
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public final void m3867l(C14153l c14153l) {
        C2403l c2403l = this.f28520l;
        if (c2403l != null) {
            C12951l c12951l = new C12951l(c14153l.crashlytics);
            InterfaceC14029l interfaceC14029l = null;
            if (m3862l()) {
                this.f28524l = AbstractC10999l.mopub(m3914l(), null, 0, new C4405l(c2403l, c12951l, this, interfaceC14029l, 0), 3);
            } else {
                this.f28512l = c12951l;
                AbstractC10999l.mopub(m3914l(), null, 0, new C11290l(c2403l, c12951l, interfaceC14029l, 1), 3);
            }
        }
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final void mo1498l() {
        mo1500throw();
    }

    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public final void m3868l() {
        if (this.f28522l != null) {
            return;
        }
        InterfaceC2186l interfaceC2186l = this.f28519l ? this.f28523l : this.f28530l;
        if (interfaceC2186l != null) {
            if (this.f28520l == null) {
                this.f28520l = new C2403l();
            }
            this.f28518l.m3354l(this.f28520l);
            InterfaceC8605l interfaceC8605lLoadAd = interfaceC2186l.loadAd(this.f28520l);
            m3069l(interfaceC8605lLoadAd);
            this.f28522l = interfaceC8605lLoadAd;
        }
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final long m3869l(long j) {
        long jMo869l = AbstractC5573l.metrica(this).f7668l.mo869l(((InterfaceC3114l) AbstractC13402l.loadAd(this, AbstractC4751l.tapsense)).amazon());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo869l >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo869l & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final void m3870l(boolean z) {
        C2403l c2403l = this.f28520l;
        if (c2403l != null) {
            C7504l c7504l = this.f28524l;
            InterfaceC14029l interfaceC14029l = null;
            if (c7504l == null || !c7504l.mopub()) {
                C12951l c12951l = z ? this.f28512l : this.f28525l;
                if (c12951l != null) {
                    C10129l c10129l = new C10129l(c12951l);
                    InterfaceC7042l interfaceC7042l = (InterfaceC7042l) ((C18662l) m3914l()).f36440l.mo245l(C1083l.f2996l);
                    AbstractC10999l.mopub(m3914l(), null, 0, new C7641l(c2403l, c10129l, interfaceC7042l != null ? interfaceC7042l.mo2154l(new C0464l(c2403l, c10129l, 3)) : null, interfaceC14029l, 0), 3);
                }
            } else {
                C7504l c7504l2 = this.f28524l;
                if (c7504l2 != null) {
                    c7504l2.ads(null);
                }
            }
            if (z) {
                this.f28512l = null;
            } else {
                this.f28525l = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m3871l() {
        C2403l c2403l = this.f28520l;
        C18730l c18730l = this.f28521l;
        if (c2403l != null) {
            C12951l c12951l = this.f28525l;
            if (c12951l != null) {
                c2403l.loadAd(new C10129l(c12951l));
            }
            C12951l c12951l2 = this.f28512l;
            if (c12951l2 != null) {
                c2403l.loadAd(new C10129l(c12951l2));
            }
            C0261l c0261l = this.f28529l;
            if (c0261l != null) {
                c2403l.loadAd(new C12134l(c0261l));
            }
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
                                c2403l.loadAd(new C10129l((C12951l) objArr[(i << 3) + i3]));
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
        }
        this.f28525l = null;
        this.f28512l = null;
        this.f28529l = null;
        c18730l.yandex();
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
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
    @Override // defpackage.InterfaceC16036l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo1515strictfp(KeyEvent keyEvent) {
        boolean z;
        m3868l();
        long jAmazon = AbstractC16422l.amazon(keyEvent);
        boolean z2 = this.f28514l;
        int i = 3;
        InterfaceC14029l interfaceC14029l = null;
        C18730l c18730l = this.f28521l;
        if (z2) {
            int i2 = 2;
            if (AbstractC16422l.purchase(keyEvent) == 2 && AbstractC9151l.subs(keyEvent)) {
                if (c18730l.loadAd(jAmazon)) {
                    z = false;
                } else {
                    C12951l c12951l = new C12951l(this.f28527l);
                    c18730l.subs(jAmazon, c12951l);
                    if (this.f28520l != null) {
                        AbstractC10999l.mopub(m3914l(), null, 0, new C18030l(this, c12951l, interfaceC14029l, i2), 3);
                    }
                    z = true;
                }
                if (mo1983l(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.f28514l && AbstractC16422l.purchase(keyEvent) == 1 && AbstractC9151l.subs(keyEvent)) {
            C12951l c12951l2 = (C12951l) c18730l.mopub(jAmazon);
            if (c12951l2 != null) {
                if (this.f28520l != null) {
                    AbstractC10999l.mopub(m3914l(), null, 0, new C18030l(this, c12951l2, interfaceC14029l, i), 3);
                }
                mo1978l(keyEvent);
            }
            if (c12951l2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC13202l
    public final long tapsense() {
        return AbstractC10549l.yandex;
    }

    @Override // defpackage.InterfaceC16036l
    public final boolean vip(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        if (this.f28519l) {
            AbstractC3700l.admob(this, new C9506l(this, 0));
        }
    }

    @Override // defpackage.InterfaceC13202l
    /* JADX INFO: renamed from: class */
    public final /* synthetic */ void mo1493class() {
    }

    /* JADX INFO: renamed from: lؚؚؔ */
    public void mo1982l() {
    }

    /* JADX INFO: renamed from: l٘ۦۢ */
    public void mo1507l(InterfaceC17593l interfaceC17593l) {
    }
}
