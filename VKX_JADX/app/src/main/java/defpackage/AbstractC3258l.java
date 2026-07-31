package defpackage;

/* JADX INFO: renamed from: lؚۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3258l extends AbstractC8702l implements InterfaceC14626l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f6975l = {new C0544l(AbstractC3258l.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C2343l f6976l = AbstractC3124l.loadAd(null, new C16259l(this, 0));

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC1220l f6977l = AbstractC9968l.crashlytics(2, new C16259l(this, 1));

    @Override // defpackage.AbstractC8702l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final InterfaceC10138l mo1311catch() {
        InterfaceC13922l interfaceC13922l = f6975l[0];
        return (C11425l) this.f6976l.invoke();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC3258l) && AbstractC8576l.yandex(mo700else(), ((AbstractC3258l) obj).mo700else());
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: extends */
    public final InterfaceC0207l mo818extends() {
        InterfaceC13922l interfaceC13922l = f6975l[0];
        return (C11425l) this.f6976l.invoke();
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return AbstractC2812l.tapsense(new StringBuilder("<get-"), mo700else().f5868l, '>');
    }

    public final int hashCode() {
        return mo700else().hashCode();
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l isPro() {
        return (InterfaceC16148l) this.f6977l.getValue();
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: private */
    public final C5380l mo820private() {
        return (C5380l) mo700else().smaato();
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: throw */
    public final AbstractC1112l mo822throw(C4233l c4233l) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public final String toString() {
        return "getter of " + mo700else();
    }
}
