package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؗۛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5160l extends AbstractC0601l implements InterfaceC6679l, InterfaceC1388l, InterfaceC0965l, InterfaceC2224l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final HashSet f11210l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1220l f11211l = AbstractC9968l.crashlytics(2, new C6462l(this, 0));

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Class f11212l;

    static {
        LinkedHashSet linkedHashSet = AbstractC2721l.yandex;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((C3624l) it.next()).yandex().yandex.toString());
        }
        f11210l = hashSet;
    }

    public C5160l(Class cls) {
        this.f11212l = cls;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static C5188l m1725goto(C3624l c3624l, C8603l c8603l) {
        C0511l c0511l = c8603l.yandex;
        C12406l c12406l = new C12406l((InterfaceC11865l) c0511l.loadAd, c3624l.yandex, 0);
        C3498l c3498lBilling = c3624l.billing();
        List listSingletonList = Collections.singletonList(((InterfaceC11865l) c0511l.loadAd).subs().firebase("Any").ad());
        C16412l c16412l = (C16412l) c0511l.yandex;
        C5188l c5188l = new C5188l(c12406l, c3498lBilling, 1, 1, listSingletonList, c16412l);
        c5188l.inmobi(new C15822l(c16412l, c5188l, 1), C5746l.f12138l, null);
        return c5188l;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final List m1726new(C5160l c5160l, InterfaceC7637l interfaceC7637l, int i) {
        AbstractC1112l abstractC1112l;
        c5160l.getClass();
        C5772l c5772l = new C5772l(c5160l, 0);
        Collection<InterfaceC8371l> collectionLoadAd = AbstractC6968l.loadAd(interfaceC7637l, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8371l interfaceC8371l : collectionLoadAd) {
            if (interfaceC8371l instanceof InterfaceC0207l) {
                InterfaceC0207l interfaceC0207l = (InterfaceC0207l) interfaceC8371l;
                if (AbstractC8576l.yandex(interfaceC0207l.admob(), AbstractC6004l.admob)) {
                    abstractC1112l = null;
                } else {
                    if (i == 0) {
                        throw null;
                    }
                    if ((interfaceC0207l.mo367while() != 2) == (i == 1)) {
                        abstractC1112l = (AbstractC1112l) interfaceC8371l.mo1008import(c5772l, Unit.INSTANCE);
                    } else {
                        abstractC1112l = null;
                    }
                }
            } else {
                abstractC1112l = null;
            }
            if (abstractC1112l != null) {
                arrayList.add(abstractC1112l);
            }
        }
        return AbstractC16901l.m4213const(arrayList);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final InterfaceC17477l m1727abstract() {
        return ((C16024l) this.f11211l.getValue()).yandex();
    }

    @Override // defpackage.InterfaceC1388l
    public final Collection adcel() {
        C2343l c2343l = ((C16024l) this.f11211l.getValue()).mopub;
        InterfaceC13922l interfaceC13922l = C16024l.ad[4];
        return (Collection) c2343l.invoke();
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean ads() {
        C9095l c9095lM1729instanceof = m1729instanceof();
        if (c9095lM1729instanceof == null) {
            return false;
        }
        C13698l c13698l = AbstractC15547l.billing;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[14];
        return c13698l.m3679package(c9095lM1729instanceof);
    }

    @Override // defpackage.InterfaceC1388l
    public final Object advert() {
        return ((C16024l) this.f11211l.getValue()).subs.getValue();
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean applovin() {
        C9095l c9095lM1729instanceof = m1729instanceof();
        return (c9095lM1729instanceof != null ? AbstractC15547l.yandex(c9095lM1729instanceof) : null) == EnumC18401l.COMPANION_OBJECT;
    }

    @Override // defpackage.InterfaceC1388l
    public final String billing() {
        C2343l c2343l = ((C16024l) this.f11211l.getValue()).billing;
        InterfaceC13922l interfaceC13922l = C16024l.ad[3];
        return (String) c2343l.invoke();
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: case */
    public final Collection mo654case() {
        return m1727abstract().adcel();
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: class */
    public final C6084l mo656class(int i) {
        ArrayList arrayList;
        C9095l c9095lM1729instanceof = m1729instanceof();
        if (c9095lM1729instanceof == null || (arrayList = AbstractC10565l.purchase(c9095lM1729instanceof).yandex) == null) {
            return null;
        }
        return (C6084l) AbstractC16901l.m4220for(i, arrayList);
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: continue */
    public final InterfaceC10696l mo657continue(int i) {
        C13146l c13146l;
        InterfaceC17477l interfaceC17477lM1727abstract = m1727abstract();
        C11296l c11296l = interfaceC17477lM1727abstract instanceof C11296l ? (C11296l) interfaceC17477lM1727abstract : null;
        if (c11296l == null || (c13146l = (C13146l) AbstractC0714l.crashlytics(c11296l.f22762l, AbstractC8450l.admob, i)) == null) {
            return null;
        }
        C1228l c1228l = new C1228l(this);
        C7644l c7644l = c11296l.f22763l;
        return (InterfaceC10696l) AbstractC5592l.purchase(this.f11212l, c1228l, c13146l, (InterfaceC3588l) c7644l.f15737l, (C14965l) c7644l.f15740l, c11296l.f22765l, C15460l.f30236l);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5160l) && AbstractC16131l.mopub(this).equals(AbstractC16131l.mopub((InterfaceC1388l) obj));
    }

    @Override // defpackage.InterfaceC1388l
    public final List getTypeParameters() {
        C2343l c2343l = ((C16024l) this.f11211l.getValue()).isPro;
        InterfaceC13922l interfaceC13922l = C16024l.ad[6];
        return (List) c2343l.invoke();
    }

    @Override // defpackage.InterfaceC1388l
    public final int hashCode() {
        return AbstractC16131l.mopub(this).hashCode();
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final EnumC18401l m1728import() {
        EnumC18401l enumC18401lYandex;
        C9095l c9095lM1729instanceof = m1729instanceof();
        if (c9095lM1729instanceof != null && (enumC18401lYandex = AbstractC15547l.yandex(c9095lM1729instanceof)) != null) {
            return enumC18401lYandex;
        }
        Class cls = this.f11212l;
        if (cls.isAnnotation()) {
            return EnumC18401l.ANNOTATION_CLASS;
        }
        if (cls.isInterface()) {
            return EnumC18401l.INTERFACE;
        }
        if (cls.isEnum()) {
            return EnumC18401l.ENUM_CLASS;
        }
        return cls.getSuperclass().isEnum() ? EnumC18401l.ENUM_ENTRY : EnumC18401l.CLASS;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final C9095l m1729instanceof() {
        return ((C16024l) this.f11211l.getValue()).loadAd();
    }

    @Override // defpackage.InterfaceC1388l
    public final String license() {
        C2343l c2343l = ((C16024l) this.f11211l.getValue()).purchase;
        InterfaceC13922l interfaceC13922l = C16024l.ad[2];
        return (String) c2343l.invoke();
    }

    @Override // defpackage.InterfaceC1388l
    public final Collection mopub() {
        C2343l c2343l = ((C16024l) this.f11211l.getValue()).admob;
        InterfaceC13922l interfaceC13922l = C16024l.ad[5];
        return (Collection) c2343l.invoke();
    }

    @Override // defpackage.InterfaceC1388l
    /* JADX INFO: renamed from: native */
    public final Collection mo885native() {
        C2343l c2343l = ((C16024l) this.f11211l.getValue()).Signature;
        InterfaceC13922l interfaceC13922l = C16024l.ad[17];
        return (Collection) c2343l.invoke();
    }

    @Override // defpackage.InterfaceC13937l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final Class mo1730private() {
        return this.f11212l;
    }

    @Override // defpackage.InterfaceC6679l
    public final GenericDeclaration remoteconfig() {
        return this.f11212l;
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: static */
    public final Collection mo661static(C3498l c3498l) {
        InterfaceC7637l interfaceC7637lMo1341public = m1727abstract().ad().mo1341public();
        EnumC11300l enumC11300l = EnumC11300l.f22776l;
        return AbstractC16901l.m4232new(interfaceC7637lMo1341public.billing(c3498l, enumC11300l), m1727abstract().mo756new().billing(c3498l, enumC11300l));
    }

    @Override // defpackage.InterfaceC1388l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo886strictfp(Object obj) {
        Map map = AbstractC1845l.amazon;
        Class cls = this.f11212l;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return AbstractC9464l.firebase(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC1845l.crashlytics.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean subscription() {
        C9095l c9095lM1729instanceof = m1729instanceof();
        if (c9095lM1729instanceof == null) {
            Class cls = this.f11212l;
            return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        }
        C13698l c13698l = AbstractC15547l.purchase;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[10];
        return c13698l.m3679package(c9095lM1729instanceof);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final C3624l m1731super() {
        EnumC15893l enumC15893lCrashlytics;
        C3624l c3624l = AbstractC1653l.yandex;
        Class cls = this.f11212l;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            enumC15893lCrashlytics = componentType.isPrimitive() ? EnumC17708l.loadAd(componentType.getSimpleName()).crashlytics() : null;
            if (enumC15893lCrashlytics != null) {
                return new C3624l(AbstractC3974l.firebase, enumC15893lCrashlytics.f31170l);
            }
            C2312l c2312lSubs = AbstractC3333l.mopub.subs();
            return new C3624l(c2312lSubs.loadAd(), c2312lSubs.yandex.mopub());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC1653l.yandex;
        }
        enumC15893lCrashlytics = cls.isPrimitive() ? EnumC17708l.loadAd(cls.getSimpleName()).crashlytics() : null;
        if (enumC15893lCrashlytics != null) {
            return new C3624l(AbstractC3974l.firebase, enumC15893lCrashlytics.f31171l);
        }
        C3624l c3624lYandex = AbstractC1845l.yandex(cls);
        if (!c3624lYandex.crashlytics) {
            String str = C4632l.yandex;
            C3624l c3624lMopub = C4632l.mopub(c3624lYandex.yandex());
            if (c3624lMopub != null) {
                return c3624lMopub;
            }
        }
        return c3624lYandex;
    }

    @Override // defpackage.AbstractC0601l
    /* JADX INFO: renamed from: switch */
    public final Collection mo662switch(C3498l c3498l) {
        InterfaceC7637l interfaceC7637lMo1341public = m1727abstract().ad().mo1341public();
        EnumC11300l enumC11300l = EnumC11300l.f22776l;
        return AbstractC16901l.m4232new(interfaceC7637lMo1341public.yandex(c3498l, enumC11300l), m1727abstract().mo756new().yandex(c3498l, enumC11300l));
    }

    public final String toString() {
        C3624l c3624lM1731super = m1731super();
        C2312l c2312l = c3624lM1731super.yandex;
        return "class ".concat((c2312l.yandex.crashlytics() ? "" : AbstractC2812l.tapsense(new StringBuilder(), c2312l.yandex.yandex, '.')).concat(c3624lM1731super.loadAd.yandex.yandex.replace('.', '$')));
    }

    @Override // defpackage.InterfaceC1388l
    public final List yandex() {
        C2343l c2343l = ((C16024l) this.f11211l.getValue()).smaato;
        InterfaceC13922l interfaceC13922l = C16024l.ad[8];
        return (List) c2343l.invoke();
    }
}
