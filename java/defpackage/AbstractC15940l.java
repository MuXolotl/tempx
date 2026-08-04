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

/* JADX INFO: renamed from: lٕۛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15940l extends AbstractC6242l implements InterfaceC18660l, Function0, Function1, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function2, Function20, Function21, Function22, Function3, Function4, Function5, Function6, Function7, Function8, Function9, InterfaceC6902l, InterfaceC7763l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f31299l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC0601l f31302l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f31304l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC1220l f31303l = AbstractC9968l.crashlytics(2, new C13164l(this, 0));

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC1220l f31305l = AbstractC9968l.crashlytics(2, new C13164l(this, 1));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC1220l f31300l = AbstractC9968l.crashlytics(2, new C13164l(this, 2));

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC1220l f31301l = AbstractC9968l.crashlytics(2, new C13164l(this, 3));

    public AbstractC15940l(AbstractC0601l abstractC0601l, String str, Object obj) {
        this.f31302l = abstractC0601l;
        this.f31299l = str;
        this.f31304l = obj;
    }

    @Override // defpackage.InterfaceC18672l
    public final AbstractC0601l ad() {
        return this.f31302l;
    }

    @Override // defpackage.InterfaceC18672l
    public final List admob() {
        return (List) this.f31303l.getValue();
    }

    /* JADX INFO: renamed from: case */
    public abstract List mo2439case();

    /* JADX INFO: renamed from: catch */
    public abstract C1559l mo2440catch();

    /* JADX INFO: renamed from: else */
    public abstract C12843l mo2441else();

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
        return interfaceC7763l != null && AbstractC8576l.yandex(this.f31302l, interfaceC7763l.ad()) && AbstractC8576l.yandex(getName(), interfaceC7763l.getName()) && AbstractC8576l.yandex(this.f31299l, interfaceC7763l.loadAd()) && AbstractC8576l.yandex(this.f31304l, interfaceC7763l.inmobi());
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final AbstractC3432l m4123extends(Method method, boolean z) {
        if (!AbstractC7572l.admob(this)) {
            return new C14041l(2, method);
        }
        if (this.f31302l instanceof C9539l) {
            return new C5654l(method, z, AbstractC7572l.purchase(this));
        }
        C8936l.smaato(this, "Only top-level functions are supported for now: ");
        return null;
    }

    /* JADX INFO: renamed from: for */
    public abstract List mo2442for();

    @Override // defpackage.InterfaceC18660l
    public final int getArity() {
        return AbstractC17943l.loadAd(isPro());
    }

    @Override // defpackage.InterfaceC6902l
    public final List getParameters() {
        return (List) this.f31305l.getValue();
    }

    @Override // defpackage.InterfaceC6902l
    public final List getTypeParameters() {
        return mo2441else().yandex;
    }

    public final int hashCode() {
        return this.f31299l.hashCode() + ((getName().hashCode() + (this.f31302l.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC18672l
    public final Object inmobi() {
        return this.f31304l;
    }

    @Override // kotlin.jvm.functions.Function22
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l isPro() {
        return (InterfaceC16148l) this.f31300l.getValue();
    }

    @Override // defpackage.InterfaceC7763l
    public final String loadAd() {
        return this.f31299l;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final AbstractC9640l m4124private(Constructor constructor, boolean z) {
        List parameters;
        if (!z && (this instanceof C13981l)) {
            C13981l c13981l = (C13981l) this;
            C10038l c10038l = AbstractC15547l.mopub;
            InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[17];
            if (AbstractC10392l.startapp((EnumC11212l) c10038l.m2845finally(c13981l.f27280l)) != 4 && ((parameters = c13981l.getParameters()) == null || !parameters.isEmpty())) {
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    InterfaceC1388l interfaceC1388lAdmob = AbstractC7370l.admob(((AbstractC9707l) it.next()).mo1109synchronized());
                    if (interfaceC1388lAdmob.ads() && !interfaceC1388lAdmob.equals(AbstractC18202l.yandex.loadAd(C1171l.class))) {
                        return AbstractC7572l.admob(this) ? new C13670l(constructor, AbstractC7572l.purchase(this), 0) : new C1692l(constructor, 0);
                    }
                }
            }
        }
        return AbstractC7572l.admob(this) ? new C13670l(constructor, AbstractC7572l.purchase(this), 1) : new C1692l(constructor, 1);
    }

    @Override // defpackage.InterfaceC6679l
    public final GenericDeclaration remoteconfig() {
        return AbstractC9498l.purchase(this.f31302l, this.f31299l);
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l startapp() {
        return (InterfaceC16148l) this.f31301l.getValue();
    }

    /* JADX INFO: renamed from: throw */
    public abstract C4258l mo2443throw();

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
