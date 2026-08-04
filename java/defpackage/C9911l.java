package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: lٍۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9911l implements InterfaceC18162l {

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static final /* synthetic */ InterfaceC13922l[] f20154final = {new C0114l(C9911l.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new C0114l(C9911l.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new C0114l(C9911l.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new C0114l(C9911l.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new C0114l(C9911l.class, "startFromName", "getStartFromName()Z", 0), new C0114l(C9911l.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new C0114l(C9911l.class, "debugMode", "getDebugMode()Z", 0), new C0114l(C9911l.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new C0114l(C9911l.class, "verbose", "getVerbose()Z", 0), new C0114l(C9911l.class, "unitReturnType", "getUnitReturnType()Z", 0), new C0114l(C9911l.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new C0114l(C9911l.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new C0114l(C9911l.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new C0114l(C9911l.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new C0114l(C9911l.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new C0114l(C9911l.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new C0114l(C9911l.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new C0114l(C9911l.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new C0114l(C9911l.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new C0114l(C9911l.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new C0114l(C9911l.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new C0114l(C9911l.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new C0114l(C9911l.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new C0114l(C9911l.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new C0114l(C9911l.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new C0114l(C9911l.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new C0114l(C9911l.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new C0114l(C9911l.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new C0114l(C9911l.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new C0114l(C9911l.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new C0114l(C9911l.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new C0114l(C9911l.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new C0114l(C9911l.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new C0114l(C9911l.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new C0114l(C9911l.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new C0114l(C9911l.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new C0114l(C9911l.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new C0114l(C9911l.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new C0114l(C9911l.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new C0114l(C9911l.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new C0114l(C9911l.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new C0114l(C9911l.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new C0114l(C9911l.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new C0114l(C9911l.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new C0114l(C9911l.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new C0114l(C9911l.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new C0114l(C9911l.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new C0114l(C9911l.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new C0114l(C9911l.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new C0114l(C9911l.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};
    public final C17838l Signature;
    public final C17838l ad;
    public final C17838l adcel;
    public final C17838l admob;
    public final C17838l ads;
    public final C17838l advert;
    public final C17838l amazon;
    public final C17838l applovin;
    public final C17838l appmetrica;
    public final C17838l billing;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final C17838l f20155case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final C17838l f20156catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final C17838l f20157class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final C17838l f20158continue;
    public final C17838l crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final C17838l f20159default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final C17838l f20160else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final C17838l f20161extends;
    public final C17838l firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final C17838l f20162for;
    public final C17838l inmobi;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final C17838l f20163interface;
    public final C17838l isPro;
    public final C17838l isVip;
    public final C17838l license;
    public final C17838l loadAd = new C17838l(C13594l.amazon, this, 2);
    public final C17838l metrica;
    public final C17838l mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final C17838l f20164native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C17838l f20165package;
    public final C17838l premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C17838l f20166private;
    public final C17838l pro;
    public final C17838l purchase;
    public final C17838l remoteconfig;
    public final C17838l signatures;
    public final C17838l smaato;
    public final C17838l startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final C17838l f20167static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C17838l f20168strictfp;
    public final C17838l subs;
    public final C17838l subscription;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C17838l f20169switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C17838l f20170synchronized;
    public final C17838l tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final C17838l f20171throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C17838l f20172throws;
    public final C17838l vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final C17838l f20173volatile;
    public boolean yandex;

    public C9911l() {
        Boolean bool = Boolean.TRUE;
        this.crashlytics = new C17838l(bool, this, 2);
        this.amazon = new C17838l(bool, this, 2);
        this.purchase = new C17838l(EnumC1382l.f3520l, this, 2);
        Boolean bool2 = Boolean.FALSE;
        this.billing = new C17838l(bool2, this, 2);
        this.mopub = new C17838l(bool2, this, 2);
        this.admob = new C17838l(bool2, this, 2);
        this.subs = new C17838l(bool2, this, 2);
        this.isPro = new C17838l(bool2, this, 2);
        this.firebase = new C17838l(bool, this, 2);
        this.smaato = new C17838l(bool2, this, 2);
        this.remoteconfig = new C17838l(bool2, this, 2);
        this.vip = new C17838l(bool2, this, 2);
        this.metrica = new C17838l(bool, this, 2);
        this.startapp = new C17838l(bool, this, 2);
        this.adcel = new C17838l(bool2, this, 2);
        this.ads = new C17838l(bool2, this, 2);
        this.subscription = new C17838l(bool2, this, 2);
        this.tapsense = new C17838l(bool2, this, 2);
        this.Signature = new C17838l(bool2, this, 2);
        this.license = new C17838l(null, this, 2);
        this.pro = new C17838l(bool2, this, 2);
        this.ad = new C17838l(bool2, this, 2);
        this.advert = new C17838l(C2100l.f4709l, this, 2);
        this.isVip = new C17838l(C2100l.f4725l, this, 2);
        this.signatures = new C17838l(bool, this, 2);
        this.premium = new C17838l(EnumC1957l.f4457l, this, 2);
        this.applovin = new C17838l(C0769l.yandex, this, 2);
        this.appmetrica = new C17838l(EnumC12530l.f24692l, this, 2);
        this.inmobi = new C17838l(EnumC5714l.f12096l, this, 2);
        this.f20172throws = new C17838l(bool2, this, 2);
        this.f20165package = new C17838l(bool2, this, 2);
        this.f20170synchronized = new C17838l(EnumC3401l.f7249l, this, 2);
        this.f20168strictfp = new C17838l(bool2, this, 2);
        this.f20173volatile = new C17838l(bool2, this, 2);
        this.f20164native = new C17838l(C5746l.f12138l, this, 2);
        this.f20166private = new C17838l(AbstractC15633l.yandex, this, 2);
        this.f20161extends = new C17838l(null, this, 2);
        this.f20162for = new C17838l(EnumC2437l.NO_ARGUMENTS, this, 2);
        this.f20171throw = new C17838l(bool2, this, 2);
        this.f20156catch = new C17838l(bool, this, 2);
        this.f20160else = new C17838l(bool, this, 2);
        this.f20155case = new C17838l(bool2, this, 2);
        this.f20169switch = new C17838l(bool2, this, 2);
        this.f20158continue = new C17838l(bool, this, 2);
        this.f20157class = new C17838l(bool, this, 2);
        this.f20163interface = new C17838l(bool2, this, 2);
        this.f20167static = new C17838l(bool2, this, 2);
        this.f20159default = new C17838l(bool, this, 2);
    }

    @Override // defpackage.InterfaceC18162l
    public final void admob(C13594l c13594l) {
        this.loadAd.crashlytics(f20154final[0], c13594l);
    }

    @Override // defpackage.InterfaceC18162l
    public final void amazon(Set set) {
        this.purchase.crashlytics(f20154final[3], set);
    }

    @Override // defpackage.InterfaceC18162l
    public final void billing() {
        this.pro.crashlytics(f20154final[21], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC18162l
    public final void crashlytics() {
        this.f20165package.crashlytics(f20154final[31], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC18162l
    public final Set firebase() {
        InterfaceC13922l interfaceC13922l = f20154final[36];
        return (Set) this.f20166private.yandex;
    }

    @Override // defpackage.InterfaceC18162l
    public final void isPro() {
        this.crashlytics.crashlytics(f20154final[1], Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC18162l
    public final void loadAd() {
        this.admob.crashlytics(f20154final[6], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC18162l
    public final void mopub(EnumC5714l enumC5714l) {
        this.inmobi.crashlytics(f20154final[29], enumC5714l);
    }

    @Override // defpackage.InterfaceC18162l
    public final void purchase(LinkedHashSet linkedHashSet) {
        this.f20166private.crashlytics(f20154final[36], linkedHashSet);
    }

    @Override // defpackage.InterfaceC18162l
    public final void remoteconfig() {
        this.ad.crashlytics(f20154final[22], Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC18162l
    public final void smaato() {
        this.appmetrica.crashlytics(f20154final[28], EnumC12530l.f24691l);
    }

    @Override // defpackage.InterfaceC18162l
    public final void subs() {
        this.billing.crashlytics(f20154final[4], Boolean.TRUE);
    }

    public final boolean vip() {
        InterfaceC13922l interfaceC13922l = f20154final[6];
        return ((Boolean) this.admob.yandex).booleanValue();
    }

    @Override // defpackage.InterfaceC18162l
    public final void yandex() {
        this.f20172throws.crashlytics(f20154final[30], Boolean.TRUE);
    }
}
