package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6727l implements InterfaceC5470l {
    public static final /* synthetic */ InterfaceC13922l[] admob = {new C0544l(C6727l.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new C0544l(C6727l.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new C0544l(C6727l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final C2278l amazon;
    public final C2278l billing;
    public final C9004l crashlytics;
    public final C8673l loadAd;
    public final boolean mopub;
    public final C11197l purchase;
    public final C10038l yandex;

    public C6727l(C10038l c10038l, C8673l c8673l, boolean z) {
        this.yandex = c10038l;
        this.loadAd = c8673l;
        C7757l c7757l = (C7757l) c10038l.f20463l;
        C16412l c16412l = c7757l.yandex;
        C17014l c17014l = new C17014l(this, 0);
        c16412l.getClass();
        this.crashlytics = new C9004l(c16412l, c17014l);
        C17014l c17014l2 = new C17014l(this, 1);
        c16412l.getClass();
        this.amazon = new C2278l(c16412l, c17014l2);
        this.purchase = c7757l.isPro.startapp(c8673l);
        C17014l c17014l3 = new C17014l(this, 2);
        c16412l.getClass();
        this.billing = new C2278l(c16412l, c17014l3);
        this.mopub = z;
    }

    @Override // defpackage.InterfaceC1910l
    public final Map admob() {
        InterfaceC13922l interfaceC13922l = admob[2];
        return (Map) this.billing.invoke();
    }

    @Override // defpackage.InterfaceC1910l
    public final InterfaceC5706l billing() {
        return this.purchase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0757l loadAd(InterfaceC0808l interfaceC0808l) {
        InterfaceC8657l c12681l;
        AbstractC18041l abstractC18041lSubs;
        if (interfaceC0808l instanceof C13013l) {
            return C1083l.subs(null, ((C13013l) interfaceC0808l).loadAd);
        }
        if (interfaceC0808l instanceof C15917l) {
            Enum r6 = ((C15917l) interfaceC0808l).loadAd;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            return new C17452l(AbstractC1845l.yandex(enclosingClass), C3498l.purchase(r6.name()));
        }
        boolean z = interfaceC0808l instanceof C12325l;
        C10038l c10038l = this.yandex;
        if (z) {
            C12325l c12325l = (C12325l) interfaceC0808l;
            C3498l c3498l = c12325l.yandex;
            if (c3498l == null) {
                c3498l = AbstractC6830l.loadAd;
            }
            ArrayList arrayListYandex = c12325l.yandex();
            InterfaceC13922l interfaceC13922l = admob[1];
            if (!AbstractC11748l.subs((AbstractC15211l) this.amazon.invoke())) {
                C17538l c17538lPurchase = AbstractC11621l.purchase(c3498l, AbstractC3759l.amazon(this));
                if (c17538lPurchase == null || (abstractC18041lSubs = c17538lPurchase.yandex()) == null) {
                    abstractC18041lSubs = ((C7757l) c10038l.f20463l).metrica.subs().subs(C8741l.loadAd(EnumC5123l.f11149l, new String[0]));
                }
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListYandex, 10));
                Iterator it = arrayListYandex.iterator();
                while (it.hasNext()) {
                    AbstractC0757l abstractC0757lLoadAd = loadAd((InterfaceC0808l) it.next());
                    if (abstractC0757lLoadAd == null) {
                        abstractC0757lLoadAd = new C4868l(null);
                    }
                    arrayList.add(abstractC0757lLoadAd);
                }
                return new C1691l(arrayList, abstractC18041lSubs);
            }
        } else {
            if (interfaceC0808l instanceof C15808l) {
                return new C18438l(new C6727l(c10038l, new C8673l(((C15808l) interfaceC0808l).loadAd), false));
            }
            if (interfaceC0808l instanceof C5652l) {
                Class cls = ((C5652l) interfaceC0808l).loadAd;
                if (cls.isPrimitive()) {
                    c12681l = new C13064l(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    c12681l = new C12681l(cls);
                } else {
                    c12681l = cls instanceof WildcardType ? new C6962l((WildcardType) cls) : new C5637l(cls);
                }
                AbstractC18041l abstractC18041lM4556this = ((C18449l) c10038l.f20465l).m4556this(c12681l, AbstractC1135l.purchase(2, false, null, 7));
                if (!AbstractC11748l.subs(abstractC18041lM4556this)) {
                    AbstractC18041l abstractC18041lLoadAd = abstractC18041lM4556this;
                    int i = 0;
                    while (AbstractC16860l.advert(abstractC18041lLoadAd)) {
                        abstractC18041lLoadAd = ((AbstractC4946l) AbstractC16901l.m4208abstract(abstractC18041lLoadAd.inmobi())).loadAd();
                        i++;
                    }
                    InterfaceC15234l interfaceC15234lPro = abstractC18041lLoadAd.mo1339native().pro();
                    if (interfaceC15234lPro instanceof InterfaceC17477l) {
                        C3624l c3624lBilling = AbstractC3759l.billing(interfaceC15234lPro);
                        return c3624lBilling == null ? new C16634l(new C4180l(abstractC18041lM4556this)) : new C16634l(c3624lBilling, i);
                    }
                    if (interfaceC15234lPro instanceof InterfaceC16902l) {
                        C2312l c2312lSubs = AbstractC3333l.yandex.subs();
                        return new C16634l(new C3624l(c2312lSubs.loadAd(), c2312lSubs.yandex.mopub()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC1910l
    public final C2312l mopub() {
        InterfaceC13922l interfaceC13922l = admob[0];
        return (C2312l) this.crashlytics.invoke();
    }

    public final String toString() {
        return C10822l.crashlytics.pro(this, null);
    }

    @Override // defpackage.InterfaceC1910l
    public final AbstractC18041l yandex() {
        InterfaceC13922l interfaceC13922l = admob[1];
        return (AbstractC15211l) this.amazon.invoke();
    }
}
