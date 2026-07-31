package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1668l extends AbstractC11754l implements InterfaceC6357l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public LinkedHashMap f4023l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C7661l f4025l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final AbstractC18026l f4026l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public InterfaceC17792l f4027l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public long f4024l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C9083l f4022l = new C9083l(this);

    public AbstractC1668l(AbstractC18026l abstractC18026l) {
        this.f4026l = abstractC18026l;
        C7661l c7661l = AbstractC4785l.yandex;
        this.f4025l = new C7661l();
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public static final void m990l(AbstractC1668l abstractC1668l, InterfaceC17792l interfaceC17792l) {
        LinkedHashMap linkedHashMap;
        if (interfaceC17792l != null) {
            abstractC1668l.m2887default((((long) interfaceC17792l.loadAd()) & 4294967295L) | (((long) interfaceC17792l.purchase()) << 32));
        } else {
            abstractC1668l.m2887default(0L);
        }
        if (!AbstractC8576l.yandex(abstractC1668l.f4027l, interfaceC17792l) && interfaceC17792l != null && ((((linkedHashMap = abstractC1668l.f4023l) != null && !linkedHashMap.isEmpty()) || !interfaceC17792l.yandex().isEmpty()) && !AbstractC8576l.yandex(interfaceC17792l.yandex(), abstractC1668l.f4023l))) {
            abstractC1668l.f4026l.f35281l.f7667l.adcel.f8272l.billing();
            LinkedHashMap linkedHashMap2 = abstractC1668l.f4023l;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC1668l.f4023l = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC17792l.yandex());
        }
        abstractC1668l.f4027l = interfaceC17792l;
    }

    @Override // defpackage.AbstractC10113l, defpackage.InterfaceC6357l
    public final Object Signature() {
        return this.f4026l.Signature();
    }

    @Override // defpackage.InterfaceC12822l
    public final EnumC9931l getLayoutDirection() {
        return this.f4026l.f35281l.f7691l;
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final boolean mo991implements() {
        return this.f4027l != null;
    }

    @Override // defpackage.AbstractC11754l, defpackage.InterfaceC12822l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final boolean mo992import() {
        return true;
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: interface */
    public final void mo883interface(long j, float f, Function1 function1) {
        m995l(j);
        if (this.f23554l) {
            return;
        }
        mo994l();
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f4026l.loadAd();
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final long m993l(AbstractC1668l abstractC1668l, boolean z) {
        long jAmazon = 0;
        while (!AbstractC8576l.yandex(this, abstractC1668l)) {
            if (!this.f23550l || !z) {
                jAmazon = C5177l.amazon(jAmazon, this.f4024l);
            }
            this = this.f4026l.f35294l.mo2645l();
        }
        return jAmazon;
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public void mo994l() {
        mo1000l().crashlytics();
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public final void m995l(long j) {
        if (!C5177l.loadAd(this.f4024l, j)) {
            this.f4024l = j;
            AbstractC18026l abstractC18026l = this.f4026l;
            C4020l c4020l = abstractC18026l.f35281l.f7667l.adcel;
            if (c4020l != null) {
                c4020l.m1468try();
            }
            AbstractC11754l.m3243l(abstractC18026l);
        }
        if (this.f23549l) {
            return;
        }
        m3249try(mo1000l());
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final AbstractC11754l mo996l() {
        AbstractC18026l abstractC18026l = this.f4026l.f35294l;
        if (abstractC18026l != null) {
            return abstractC18026l.mo2645l();
        }
        return null;
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final void mo997l() {
        mo883interface(this.f4024l, 0.0f, null);
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final long m998l() {
        return (((long) this.f20592l) << 32) | (((long) this.f20591l) & 4294967295L);
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final long mo999l() {
        return this.f4024l;
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final InterfaceC17792l mo1000l() {
        InterfaceC17792l interfaceC17792l = this.f4027l;
        if (interfaceC17792l != null) {
            return interfaceC17792l;
        }
        throw AbstractC5020l.metrica("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final AbstractC11754l mo1001protected() {
        AbstractC18026l abstractC18026l = this.f4026l.f35271l;
        if (abstractC18026l != null) {
            return abstractC18026l.mo2645l();
        }
        return null;
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final C3654l mo1002return() {
        return this.f4026l.f35281l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f4026l.mo873super();
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final InterfaceC18212l mo1003while() {
        return this.f4022l;
    }
}
