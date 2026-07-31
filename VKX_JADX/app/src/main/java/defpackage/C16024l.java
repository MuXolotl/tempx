package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16024l extends AbstractC18657l {
    public static final /* synthetic */ InterfaceC13922l[] ad = {new C0544l(C16024l.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new C0544l(C16024l.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new C0544l(C16024l.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new C0544l(C16024l.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new C0544l(C16024l.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new C0544l(C16024l.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new C0544l(C16024l.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new C0544l(C16024l.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new C0544l(C16024l.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "inheritedNonStaticMembers_k1Impl", "getInheritedNonStaticMembers_k1Impl()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "inheritedStaticMembers_k1Impl", "getInheritedStaticMembers_k1Impl()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new C0544l(C16024l.class, "fakeOverrideMembers", "getFakeOverrideMembers$kotlin_reflection()Lkotlin/reflect/jvm/internal/FakeOverrideMembers;", 0)};
    public final C2343l Signature;
    public final C2343l adcel;
    public final C2343l admob;
    public final C2343l ads;
    public final C2343l amazon;
    public final C2343l billing;
    public final InterfaceC1220l crashlytics;
    public final C2343l firebase;
    public final C2343l isPro;
    public final C2343l license;
    public final C2343l metrica;
    public final C2343l mopub;
    public final /* synthetic */ C5160l pro;
    public final C2343l purchase;
    public final InterfaceC1220l remoteconfig;
    public final C2343l smaato;
    public final C2343l startapp;
    public final InterfaceC1220l subs;
    public final C2343l subscription;
    public final C2343l tapsense;
    public final C2343l vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16024l(C5160l c5160l) {
        super(c5160l);
        this.pro = c5160l;
        int i = 0;
        int i2 = 2;
        this.crashlytics = AbstractC9968l.crashlytics(2, new C17204l(c5160l, this, i));
        int i3 = 5;
        this.amazon = AbstractC3124l.loadAd(null, new C6462l(c5160l, i3));
        int i4 = 7;
        AbstractC3124l.loadAd(null, new C6462l(c5160l, this, i4));
        int i5 = 8;
        this.purchase = AbstractC3124l.loadAd(null, new C6462l(c5160l, this, i5));
        int i6 = 9;
        this.billing = AbstractC3124l.loadAd(null, new C6462l(c5160l, i6));
        this.mopub = AbstractC3124l.loadAd(null, new C17204l(c5160l, this, i3));
        int i7 = 6;
        this.admob = AbstractC3124l.loadAd(null, new C17204l(this, c5160l, i7));
        this.subs = AbstractC9968l.crashlytics(2, new C17204l(this, c5160l, i4));
        this.isPro = AbstractC3124l.loadAd(null, new C17204l(this, c5160l, i5));
        this.firebase = AbstractC3124l.loadAd(null, new C17204l(this, c5160l, i6));
        int i8 = 1;
        this.smaato = AbstractC3124l.loadAd(null, new C17204l(c5160l, this, i8));
        AbstractC3124l.loadAd(null, new C17204l(c5160l, this, i2));
        int i9 = 3;
        this.remoteconfig = AbstractC9968l.crashlytics(2, new C17204l(this, c5160l, i9));
        this.vip = AbstractC3124l.loadAd(null, new C6462l(c5160l, i8));
        this.metrica = AbstractC3124l.loadAd(null, new C6462l(c5160l, i2));
        this.startapp = AbstractC3124l.loadAd(null, new C6462l(c5160l, i9));
        int i10 = 4;
        this.adcel = AbstractC3124l.loadAd(null, new C6462l(c5160l, i10));
        this.ads = AbstractC3124l.loadAd(null, new C17017l(this, i));
        this.subscription = AbstractC3124l.loadAd(null, new C17017l(this, i8));
        this.tapsense = AbstractC3124l.loadAd(null, new C17017l(this, i2));
        this.Signature = AbstractC3124l.loadAd(null, new C17204l(this, c5160l, i10));
        this.license = AbstractC3124l.loadAd(null, new C6462l(c5160l, i7));
    }

    public final boolean amazon() {
        if (!AbstractC0367l.loadAd || AbstractC0367l.yandex) {
            return true;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(Iterable.class);
        C5160l c5160l = this.pro;
        return AbstractC7741l.isPro(c5160l, interfaceC1388lLoadAd) || AbstractC7741l.isPro(c5160l, c2336l.loadAd(Map.class)) || AbstractC7741l.isPro(c5160l, c2336l.loadAd(CharSequence.class)) || AbstractC7741l.isPro(c5160l, c2336l.loadAd(Number.class));
    }

    public final C12843l crashlytics() {
        InterfaceC13922l interfaceC13922l = ad[7];
        return (C12843l) this.firebase.invoke();
    }

    public final C9095l loadAd() {
        return (C9095l) this.crashlytics.getValue();
    }

    public final InterfaceC17477l yandex() {
        InterfaceC13922l interfaceC13922l = ad[0];
        return (InterfaceC17477l) this.amazon.invoke();
    }
}
