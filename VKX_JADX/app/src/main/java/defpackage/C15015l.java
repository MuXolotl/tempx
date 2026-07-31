package defpackage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* JADX INFO: renamed from: lٔٛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15015l extends AbstractC1112l implements InterfaceC18660l, Function0, Function1, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function2, Function20, Function21, Function22, Function3, Function4, Function5, Function6, Function7, Function8, Function9, InterfaceC6902l, InterfaceC7763l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f29531l = {new C0544l(C15015l.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AbstractC0601l f29532l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f29533l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C2343l f29534l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final InterfaceC1220l f29535l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Object f29536l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC1220l f29537l;

    public C15015l(AbstractC0601l abstractC0601l, String str, String str2, InterfaceC4884l interfaceC4884l, Object obj, C4233l c4233l) {
        super(c4233l);
        this.f29532l = abstractC0601l;
        this.f29533l = str2;
        this.f29536l = obj;
        this.f29534l = AbstractC3124l.loadAd(interfaceC4884l, new C0340l(this, str, false, 13));
        this.f29537l = AbstractC9968l.crashlytics(2, new C14551l(this, 0 == true ? 1 : 0));
        this.f29535l = AbstractC9968l.crashlytics(2, new C14551l(this, 1));
    }

    @Override // defpackage.InterfaceC18672l
    public final AbstractC0601l ad() {
        return this.f29532l;
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: case, reason: not valid java name and merged with bridge method [inline-methods] */
    public final InterfaceC4884l mo818extends() {
        InterfaceC13922l interfaceC13922l = f29531l[0];
        return (InterfaceC4884l) this.f29534l.invoke();
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final AbstractC9640l m3917catch(Constructor constructor, InterfaceC4884l interfaceC4884l, boolean z) {
        if (!z) {
            C5786l c5786l = interfaceC4884l instanceof C5786l ? (C5786l) interfaceC4884l : null;
            if (c5786l != null) {
                C5786l c5786l2 = c5786l;
                if (!AbstractC6004l.purchase(c5786l2.admob()) && !AbstractC6245l.loadAd(c5786l.m1857l()) && !AbstractC11125l.metrica(c5786l.m1857l())) {
                    List listMo1007finally = c5786l2.mo1007finally();
                    if (!listMo1007finally.isEmpty()) {
                        Iterator it = listMo1007finally.iterator();
                        while (it.hasNext()) {
                            if (AbstractC0714l.admob(((C17538l) it.next()).yandex())) {
                                return AbstractC7572l.admob(this) ? new C13670l(constructor, AbstractC7572l.purchase(this), 0) : new C1692l(constructor, 0);
                            }
                        }
                    }
                }
            }
        }
        return AbstractC7572l.admob(this) ? new C13670l(constructor, AbstractC7572l.purchase(this), 1) : new C1692l(constructor, 1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final AbstractC3432l m3918else(Method method, boolean z) {
        boolean z2;
        boolean z3;
        if (!AbstractC7572l.admob(this)) {
            return new C14041l(2, method);
        }
        C7073l c7073lMo1480transient = mo818extends().mo1480transient();
        if (c7073lMo1480transient != null) {
            AbstractC18041l abstractC18041lYandex = c7073lMo1480transient.yandex();
            int i = AbstractC6245l.yandex;
            InterfaceC15234l interfaceC15234lPro = abstractC18041lYandex.mo1339native().pro();
            if (interfaceC15234lPro != null ? AbstractC6245l.yandex(interfaceC15234lPro) : false) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            Class cls = (Class) AbstractC8669l.m2412private(method.getParameterTypes());
            z3 = cls != null && cls.isInterface();
        }
        return new C5654l(method, z, z3 ? this.f29536l : AbstractC7572l.purchase(this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final boolean equals(Object obj) {
        InterfaceC7763l interfaceC7763l;
        C2312l c2312l = AbstractC5592l.yandex;
        if (obj instanceof InterfaceC7763l) {
            interfaceC7763l = (InterfaceC7763l) obj;
        } else if (obj instanceof C1538l) {
            InterfaceC6902l interfaceC6902lSubs = ((C1538l) obj).subs();
            if (interfaceC6902lSubs instanceof InterfaceC7763l) {
                interfaceC7763l = (InterfaceC7763l) interfaceC6902lSubs;
            } else {
                interfaceC7763l = null;
            }
        } else {
            interfaceC7763l = null;
        }
        return interfaceC7763l != null && AbstractC8576l.yandex(this.f29532l, interfaceC7763l.ad()) && getName().equals(interfaceC7763l.getName()) && AbstractC8576l.yandex(this.f29533l, interfaceC7763l.loadAd()) && AbstractC8576l.yandex(this.f29536l, interfaceC7763l.inmobi());
    }

    @Override // defpackage.InterfaceC6902l, defpackage.InterfaceC5059l
    public final boolean firebase() {
        return mo818extends().firebase();
    }

    @Override // defpackage.InterfaceC18660l
    public final int getArity() {
        return AbstractC17943l.loadAd(isPro());
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return ((AbstractC2775l) mo818extends()).getName().loadAd();
    }

    public final int hashCode() {
        return this.f29533l.hashCode() + ((getName().hashCode() + (this.f29532l.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC18672l
    public final Object inmobi() {
        return this.f29536l;
    }

    @Override // kotlin.jvm.functions.Function22
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l isPro() {
        return (InterfaceC16148l) this.f29537l.getValue();
    }

    @Override // defpackage.InterfaceC7763l
    public final String loadAd() {
        return this.f29533l;
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: private */
    public final C5380l mo820private() {
        return new C5380l(mo818extends().smaato(), new C14551l(this, 2), false);
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean purchase() {
        return this.f3046l.admob || mo818extends().purchase();
    }

    @Override // defpackage.InterfaceC6679l
    public final GenericDeclaration remoteconfig() {
        return AbstractC9498l.purchase(this.f29532l, this.f29533l);
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean signatures() {
        return this.f3046l.mopub || mo818extends().signatures();
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l startapp() {
        return (InterfaceC16148l) this.f29535l.getValue();
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean tapsense() {
        return this.f3046l.billing || mo818extends().tapsense();
    }

    @Override // defpackage.AbstractC1112l
    /* JADX INFO: renamed from: throw */
    public final AbstractC1112l mo822throw(C4233l c4233l) {
        return new C15015l(this.f29532l, mo818extends(), c4233l);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        C8565l.purchase(sb, this);
        sb.append("fun ");
        C8565l.subs(sb, this);
        C8565l.billing(getName(), sb);
        AbstractC16901l.m4216else(AbstractC0825l.mopub(this), sb, ", ", "(", ")", C1490l.f3732l, 48);
        sb.append(": ");
        sb.append(C8565l.tapsense(smaato(), false));
        return sb.toString();
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean vip() {
        return this.f3046l.purchase || mo818extends().vip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15015l(AbstractC0601l abstractC0601l, InterfaceC4884l interfaceC4884l, C4233l c4233l) {
        this(abstractC0601l, ((AbstractC2775l) interfaceC4884l).getName().loadAd(), AbstractC1653l.crashlytics(interfaceC4884l).loadAd(), interfaceC4884l, C11128l.f22339l, c4233l);
    }

    public C15015l(AbstractC0601l abstractC0601l, InterfaceC4884l interfaceC4884l) {
        this(abstractC0601l, interfaceC4884l, C4233l.subs);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return pro(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return pro(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return pro(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return pro(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return pro(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.jvm.functions.Function9
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kotlin.jvm.functions.Function10
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.jvm.functions.Function11
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // kotlin.jvm.functions.Function12
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.jvm.functions.Function13
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.jvm.functions.Function14
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // kotlin.jvm.functions.Function16
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // kotlin.jvm.functions.Function17
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // kotlin.jvm.functions.Function18
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // kotlin.jvm.functions.Function19
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // kotlin.jvm.functions.Function20
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // kotlin.jvm.functions.Function21
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return pro(new Object[0]);
    }
}
