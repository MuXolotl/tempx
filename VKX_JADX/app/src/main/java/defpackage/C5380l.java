package defpackage;

import java.lang.reflect.Array;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5380l extends AbstractC6786l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f11511l = {new C0544l(C5380l.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new C0544l(C5380l.class, "arguments", "getArguments()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f11512l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC18041l f11513l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2343l f11514l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2343l f11515l;

    public C5380l(AbstractC18041l abstractC18041l, Function0 function0, boolean z) {
        super(function0);
        this.f11513l = abstractC18041l;
        this.f11512l = z;
        this.f11515l = AbstractC3124l.loadAd(null, new C5139l(this, 0));
        this.f11514l = AbstractC3124l.loadAd(null, new C0340l(this, function0, false, 14));
    }

    @Override // defpackage.InterfaceC13012l
    public final boolean Signature() {
        return this.f11513l.mo1342throw();
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final AbstractC6786l mo1765catch() {
        AbstractC14318l abstractC14318lMo3847class = this.f11513l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            return new C5380l(((AbstractC4317l) abstractC14318lMo3847class).f8856l);
        }
        return null;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final InterfaceC1122l m1766else(AbstractC18041l abstractC18041l) {
        AbstractC0601l abstractC0601lIsPro;
        Class cls;
        C9539l c9539l;
        InterfaceC0965l interfaceC0965lIsPro;
        AbstractC18041l abstractC18041lLoadAd;
        if (this.f11512l) {
            InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
            C8153l c8153l = interfaceC15234lPro instanceof C8153l ? (C8153l) interfaceC15234lPro : null;
            if (c8153l != null) {
                return new C13194l(AbstractC3759l.mopub(c8153l));
            }
        }
        InterfaceC15234l interfaceC15234lPro2 = abstractC18041l.mo1339native().pro();
        if (interfaceC15234lPro2 instanceof InterfaceC17477l) {
            Class clsMetrica = AbstractC5592l.metrica((InterfaceC17477l) interfaceC15234lPro2);
            if (clsMetrica != null) {
                if (!AbstractC16860l.advert(abstractC18041l)) {
                    if (AbstractC12008l.purchase(abstractC18041l)) {
                        return new C5160l(clsMetrica);
                    }
                    Class cls2 = (Class) AbstractC1845l.loadAd.get(clsMetrica);
                    if (cls2 != null) {
                        clsMetrica = cls2;
                    }
                    return new C5160l(clsMetrica);
                }
                AbstractC4946l abstractC4946l = (AbstractC4946l) AbstractC16901l.m4236public(abstractC18041l.inmobi());
                if (abstractC4946l == null || (abstractC18041lLoadAd = abstractC4946l.loadAd()) == null) {
                    return new C5160l(clsMetrica);
                }
                InterfaceC1122l interfaceC1122lM1766else = m1766else(AbstractC12008l.mopub(abstractC18041lLoadAd, true));
                if (interfaceC1122lM1766else != null) {
                    return new C5160l(Array.newInstance((Class<?>) AbstractC16131l.mopub(AbstractC7370l.mopub(interfaceC1122lM1766else)), 0).getClass());
                }
                C11467l.Signature(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (interfaceC15234lPro2 instanceof InterfaceC16902l) {
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) interfaceC15234lPro2;
            InterfaceC8371l interfaceC8371lSignature = interfaceC16902l.Signature();
            if (interfaceC8371lSignature instanceof InterfaceC17477l) {
                interfaceC0965lIsPro = AbstractC18296l.isPro((InterfaceC17477l) interfaceC8371lSignature);
            } else if (interfaceC8371lSignature instanceof InterfaceC0207l) {
                InterfaceC8371l interfaceC8371lSignature2 = ((InterfaceC0207l) interfaceC8371lSignature).Signature();
                if (interfaceC8371lSignature2 instanceof InterfaceC17477l) {
                    abstractC0601lIsPro = AbstractC18296l.isPro((InterfaceC17477l) interfaceC8371lSignature2);
                } else {
                    InterfaceC13847l interfaceC13847l = interfaceC8371lSignature instanceof InterfaceC13847l ? (InterfaceC13847l) interfaceC8371lSignature : null;
                    if (interfaceC13847l == null) {
                        C11467l.Signature(interfaceC8371lSignature, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    InterfaceC8850l interfaceC8850lMo684try = interfaceC13847l.mo684try();
                    if (interfaceC8850lMo684try instanceof C8269l) {
                        C5222l c5222l = ((C8269l) interfaceC8850lMo684try).f17171l;
                        C5222l c5222l2 = c5222l instanceof C5222l ? c5222l : null;
                        if (c5222l2 == null || (cls = c5222l2.yandex) == null || (c9539l = (C9539l) AbstractC18202l.yandex.crashlytics(cls)) == null) {
                            C17132l.adcel("Container of top-level deserialized member is not resolved: ", interfaceC13847l, " (", c5222l);
                            return null;
                        }
                        abstractC0601lIsPro = c9539l;
                    } else if (interfaceC8850lMo684try instanceof C1228l) {
                        abstractC0601lIsPro = ((C1228l) interfaceC8850lMo684try).f3266l;
                    } else {
                        if (!(interfaceC8850lMo684try instanceof C12006l)) {
                            C11467l.Signature(interfaceC13847l, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        abstractC0601lIsPro = C8575l.f17692l;
                    }
                }
                interfaceC0965lIsPro = (InterfaceC0965l) interfaceC8371lSignature.mo1008import(new C0458l(abstractC0601lIsPro), Unit.INSTANCE);
            } else {
                C11467l.Signature(interfaceC8371lSignature, "Unknown type parameter container: ");
            }
            return new C9243l(interfaceC0965lIsPro, interfaceC16902l);
        }
        return null;
    }

    @Override // defpackage.AbstractC6786l
    public final boolean equals(Object obj) {
        if (!AbstractC0367l.yandex) {
            return super.equals(obj);
        }
        if (!(obj instanceof C5380l)) {
            return false;
        }
        C5380l c5380l = (C5380l) obj;
        return AbstractC8576l.yandex(this.f11513l, c5380l.f11513l) && AbstractC8576l.yandex(mo1616package(), c5380l.mo1616package()) && mo1617throws().equals(c5380l.mo1617throws());
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final AbstractC6786l mo1767extends() {
        AbstractC14318l abstractC14318lMo3847class = this.f11513l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            return new C5380l(((AbstractC4317l) abstractC14318lMo3847class).f8857l);
        }
        return null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final AbstractC6786l mo1768for(boolean z) {
        AbstractC18041l abstractC18041lTapsense;
        AbstractC18041l abstractC18041l = this.f11513l;
        if (z) {
            abstractC18041lTapsense = C1083l.tapsense(abstractC18041l.mo3847class(), true);
            if (abstractC18041lTapsense == null) {
                return this;
            }
        } else {
            C15110l c15110l = abstractC18041l instanceof C15110l ? (C15110l) abstractC18041l : null;
            if (c15110l == null || (abstractC18041lTapsense = c15110l.f29644l) == null) {
                return this;
            }
        }
        return new C5380l(abstractC18041lTapsense);
    }

    @Override // defpackage.InterfaceC6017l
    public final List getAnnotations() {
        return AbstractC5592l.crashlytics(this.f11513l);
    }

    @Override // defpackage.AbstractC6786l
    public final int hashCode() {
        if (!AbstractC0367l.yandex) {
            return super.hashCode();
        }
        int iHashCode = this.f11513l.hashCode() * 31;
        InterfaceC1122l interfaceC1122lMo1616package = mo1616package();
        return mo1617throws().hashCode() + ((iHashCode + (interfaceC1122lMo1616package != null ? interfaceC1122lMo1616package.hashCode() : 0)) * 31);
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: package */
    public final InterfaceC1122l mo1616package() {
        InterfaceC13922l interfaceC13922l = f11511l[0];
        return (InterfaceC1122l) this.f11515l.invoke();
    }

    @Override // defpackage.AbstractC6786l
    public final boolean premium() {
        AbstractC18041l abstractC18041l = this.f11513l;
        if (abstractC18041l != null) {
            C3498l c3498l = AbstractC16860l.purchase;
            return AbstractC16860l.signatures(abstractC18041l, AbstractC3333l.loadAd);
        }
        AbstractC16860l.yandex(138);
        throw null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final boolean mo1769private() {
        InterfaceC15234l interfaceC15234lPro = this.f11513l.mo1339native().pro();
        AbstractC1514l abstractC1514lMopub = null;
        if (interfaceC15234lPro != null && (interfaceC15234lPro instanceof InterfaceC17477l) && AbstractC16860l.m4205strictfp(interfaceC15234lPro)) {
            int i = AbstractC3759l.yandex;
            abstractC1514lMopub = AbstractC10000l.mopub(AbstractC11125l.billing(interfaceC15234lPro));
        }
        return AbstractC8576l.yandex(abstractC1514lMopub, C9392l.amazon);
    }

    @Override // defpackage.AbstractC6786l
    public final boolean pro() {
        return this.f11513l.mo3847class() instanceof C15110l;
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC1388l remoteconfig() {
        InterfaceC15234l interfaceC15234lPro = this.f11513l.mo1339native().pro();
        InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
        if (interfaceC17477l != null) {
            String str = C4632l.yandex;
            if (C4632l.isPro.containsKey(AbstractC11125l.billing(interfaceC17477l))) {
                return AbstractC0367l.yandex ? new C9959l((InterfaceC1388l) mo1616package(), AbstractC3759l.mopub(interfaceC17477l).yandex.yandex, new C15332l(interfaceC17477l, 0), new C15332l(interfaceC17477l, 1)) : AbstractC15788l.amazon(AbstractC3759l.mopub(interfaceC17477l), (InterfaceC1388l) mo1616package());
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC13012l subs() {
        AbstractC14318l abstractC14318lMo3847class = this.f11513l.mo3847class();
        Cabstract cabstract = abstractC14318lMo3847class instanceof Cabstract ? (Cabstract) abstractC14318lMo3847class : null;
        AbstractC15211l abstractC15211l = cabstract != null ? cabstract.f0l : null;
        if (abstractC15211l != null) {
            return new C5380l(abstractC15211l, this.f14215l, true);
        }
        return null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean mo1770synchronized() {
        return this.f11513l instanceof C6530l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final AbstractC6786l mo1771throw(boolean z) {
        AbstractC18041l abstractC18041l = this.f11513l;
        return ((abstractC18041l.mo3847class() instanceof AbstractC4317l) || abstractC18041l.mo1342throw() != z) ? new C5380l(AbstractC12008l.mopub(abstractC18041l, z)) : this;
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: throws */
    public final List mo1617throws() {
        InterfaceC13922l interfaceC13922l = f11511l[1];
        return (List) this.f11514l.invoke();
    }

    public C5380l(AbstractC18041l abstractC18041l) {
        this(abstractC18041l, null, false);
    }
}
