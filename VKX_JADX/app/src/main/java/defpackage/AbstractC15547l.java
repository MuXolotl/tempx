package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚٕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15547l {
    public static final C13698l Signature;
    public static final C13698l ad;
    public static final C13698l adcel;
    public static final C10038l admob;
    public static final C10038l ads;
    public static final C13698l advert;
    public static final C10038l amazon;
    public static final C13698l billing;
    public static final C10038l crashlytics;
    public static final C13698l firebase;
    public static final C13698l isPro;
    public static final C13698l license;
    public static final C10038l loadAd;
    public static final C10038l metrica;
    public static final C10038l mopub;
    public static final C13698l pro;
    public static final C13698l purchase;
    public static final C13698l remoteconfig;
    public static final C13698l smaato;
    public static final C13698l startapp;
    public static final C13698l subs;
    public static final C13698l subscription;
    public static final C13698l tapsense;
    public static final C10038l vip;
    public static final /* synthetic */ InterfaceC13922l[] yandex = {new C0114l(AbstractC15547l.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new C0114l(AbstractC15547l.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new C0114l(AbstractC15547l.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new C0114l(AbstractC15547l.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new C0114l(AbstractC15547l.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1), new C0114l(AbstractC15547l.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1), new C0114l(AbstractC15547l.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1), new C0114l(AbstractC15547l.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new C0114l(AbstractC15547l.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1), new C0114l(AbstractC15547l.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new C0114l(AbstractC15547l.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new C0114l(AbstractC15547l.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/ReturnValueStatus;", 1), new C0114l(AbstractC15547l.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1), new C0114l(AbstractC15547l.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1), new C0114l(AbstractC15547l.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1), new C0114l(AbstractC15547l.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new C0114l(AbstractC15547l.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/ReturnValueStatus;", 1), new C0114l(AbstractC15547l.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1), new C0114l(AbstractC15547l.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1), new C0114l(AbstractC15547l.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1), new C0114l(AbstractC15547l.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new C0114l(AbstractC15547l.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/ReturnValueStatus;", 1), new C0114l(AbstractC15547l.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1), new C0114l(AbstractC15547l.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1), new C0114l(AbstractC15547l.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new C0114l(AbstractC15547l.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new C0114l(AbstractC15547l.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new C0114l(AbstractC15547l.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new C0114l(AbstractC15547l.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new C0114l(AbstractC15547l.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new C0114l(AbstractC15547l.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new C0114l(AbstractC15547l.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1), new C0114l(AbstractC15547l.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new C0114l(AbstractC15547l.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new C0114l(AbstractC15547l.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new C0114l(AbstractC15547l.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new C0114l(AbstractC15547l.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};

    static {
        int i = 0;
        C2989l c2989l = AbstractC1305l.crashlytics;
        AbstractC13743l.loadAd(new C5950l(c2989l, 1));
        C5950l c5950l = new C5950l(c2989l, 1);
        int i2 = C3494l.f7382l;
        if (c5950l.loadAd != 1) {
            C10754l.license(c5950l, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        AbstractC13743l.billing(new C5950l(c2989l, 1));
        AbstractC13743l.isPro(new C5950l(c2989l, 1));
        C5950l c5950l2 = new C5950l(c2989l, 1);
        C5336l c5336l = C5336l.f11472l;
        if (c5950l2.loadAd != 1 || c5950l2.crashlytics != 1) {
            C10754l.license(c5950l2, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        C5950l c5950l3 = new C5950l(c2989l, 1);
        C13403l c13403l = C13403l.f26308l;
        if (c5950l3.loadAd != 1 || c5950l3.crashlytics != 1) {
            C10754l.license(c5950l3, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        C5950l c5950l4 = new C5950l(c2989l, 1);
        if (c5950l4.loadAd != 1) {
            C10754l.license(c5950l4, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        loadAd = AbstractC13743l.subs(C7097l.f14860l);
        crashlytics = AbstractC13743l.smaato(C16608l.f32584l);
        C13780l c13780l = C13780l.f26897l;
        C4130l c4130l = AbstractC1305l.billing;
        C14092l c14092l = EnumC18401l.f35943l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14092l, 10));
        C11521l c11521l = new C11521l(i, c14092l);
        while (c11521l.hasNext()) {
            arrayList.add(((EnumC18401l) c11521l.next()).f35948l);
        }
        amazon = new C10038l(c13780l, c4130l, c14092l, arrayList, 13);
        purchase = AbstractC13743l.loadAd(new C5950l(AbstractC1305l.mopub, 1));
        AbstractC13743l.loadAd(new C5950l(AbstractC1305l.admob, 1));
        AbstractC13743l.loadAd(new C5950l(AbstractC1305l.subs, 1));
        AbstractC13743l.loadAd(new C5950l(AbstractC1305l.isPro, 1));
        billing = AbstractC13743l.loadAd(new C5950l(AbstractC1305l.firebase, 1));
        AbstractC13743l.loadAd(new C5950l(AbstractC1305l.smaato, 1));
        AbstractC13743l.loadAd(new C5950l(AbstractC1305l.remoteconfig, 1));
        mopub = AbstractC13743l.smaato(C18543l.f36204l);
        C5950l c5950l5 = new C5950l(AbstractC1305l.vip, 1);
        int i3 = C3494l.f7382l;
        if (c5950l5.loadAd != 1) {
            C10754l.license(c5950l5, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        C5950l c5950l6 = new C5950l(AbstractC1305l.metrica, 1);
        if (c5950l6.loadAd != 1) {
            C10754l.license(c5950l6, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        AbstractC13743l.firebase(C8240l.f17129l, AbstractC1305l.startapp);
        AbstractC13743l.admob(C16739l.f32748l);
        AbstractC13743l.smaato(C14923l.f29376l);
        admob = AbstractC13743l.subs(C10646l.f21618l);
        subs = AbstractC13743l.billing(new C5950l(AbstractC1305l.ads, 1));
        isPro = AbstractC13743l.billing(new C5950l(AbstractC1305l.subscription, 1));
        firebase = AbstractC13743l.billing(new C5950l(AbstractC1305l.tapsense, 1));
        AbstractC13743l.billing(new C5950l(AbstractC1305l.Signature, 1));
        smaato = AbstractC13743l.billing(new C5950l(AbstractC1305l.license, 1));
        remoteconfig = AbstractC13743l.billing(new C5950l(AbstractC1305l.pro, 1));
        AbstractC13743l.billing(new C5950l(AbstractC1305l.ad, 1));
        AbstractC13743l.billing(new C5950l(AbstractC1305l.advert, 1));
        AbstractC13743l.firebase(C5938l.f12505l, AbstractC1305l.isVip);
        vip = AbstractC13743l.smaato(C1825l.f4232l);
        metrica = AbstractC13743l.subs(C16085l.f31530l);
        AbstractC13743l.admob(C5794l.f12207l);
        startapp = AbstractC13743l.isPro(new C5950l(AbstractC1305l.signatures, 1));
        AbstractC13743l.isPro(new C5950l(AbstractC1305l.appmetrica, 1));
        AbstractC13743l.isPro(new C5950l(AbstractC1305l.inmobi, 1));
        AbstractC13743l.isPro(new C5950l(AbstractC1305l.f3396throws, 1));
        AbstractC13743l.isPro(new C5950l(AbstractC1305l.f3390package, 1));
        adcel = AbstractC13743l.isPro(new C5950l(AbstractC1305l.f3394synchronized, 1));
        AbstractC13743l.isPro(new C5950l(AbstractC1305l.f3392strictfp, 1));
        AbstractC13743l.firebase(C9605l.f19571l, AbstractC1305l.f3397volatile);
        AbstractC13743l.smaato(C16379l.f32032l);
        ads = AbstractC13743l.subs(C12116l.f24095l);
        C5950l c5950l7 = new C5950l(AbstractC1305l.f3388for, 1);
        C5336l c5336l2 = C5336l.f11472l;
        if (c5950l7.loadAd != 1 || c5950l7.crashlytics != 1) {
            C10754l.license(c5950l7, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        subscription = new C13698l(c5336l2, new C5950l(AbstractC1305l.f3395throw, 1));
        tapsense = new C13698l(c5336l2, new C5950l(AbstractC1305l.f3385catch, 1));
        C5950l c5950l8 = new C5950l(0, 1, 1);
        C12993l c12993l = C12993l.f25463l;
        Signature = new C13698l(c12993l, c5950l8);
        C2989l c2989l2 = AbstractC1305l.yandex;
        license = new C13698l(c12993l, new C5950l(c2989l2.loadAd + 1, c2989l2.crashlytics, 1));
        C2989l c2989l3 = AbstractC1305l.loadAd;
        pro = new C13698l(c12993l, new C5950l(c2989l3.loadAd + 1, c2989l3.crashlytics, 1));
        ad = new C13698l(C9518l.f19406l, new C5950l(0, 1, 1));
        AbstractC13743l.smaato(C12129l.f24147l);
        advert = new C13698l(C13403l.f26308l, new C5950l(AbstractC1305l.f3389native, 1));
        C5950l c5950l9 = new C5950l(AbstractC1305l.f3391private, 1);
        if (c5950l9.loadAd != 1 || c5950l9.crashlytics != 1) {
            C10754l.license(c5950l9, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        C5950l c5950l10 = new C5950l(AbstractC1305l.f3387extends, 1);
        if (c5950l10.loadAd != 1 || c5950l10.crashlytics != 1) {
            C10754l.license(c5950l10, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        C5950l c5950l11 = new C5950l(AbstractC1305l.f3386else, 1);
        if (c5950l11.loadAd != 1) {
            C10754l.license(c5950l11, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            return;
        }
        C5950l c5950l12 = new C5950l(AbstractC1305l.f3384case, 1);
        if (c5950l12.loadAd == 1) {
            return;
        }
        C10754l.license(c5950l12, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
    }

    public static final EnumC18401l yandex(C9095l c9095l) {
        InterfaceC13922l interfaceC13922l = yandex[9];
        return (EnumC18401l) amazon.m2845finally(c9095l);
    }
}
