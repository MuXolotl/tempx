package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: lؗۧٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5301l implements InterfaceC16588l {
    public final InterfaceC1220l amazon;
    public Object crashlytics;
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public C5301l(Object obj, String str) {
        this.yandex = 1;
        this.loadAd = obj;
        this.crashlytics = C2580l.f5619l;
        this.amazon = AbstractC9968l.crashlytics(2, new C9810l(str, this, 26));
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        switch (this.yandex) {
            case 0:
                Enum r5 = (Enum) obj;
                Enum[] enumArr = (Enum[]) this.loadAd;
                int iM2398catch = AbstractC8669l.m2398catch(r5, enumArr);
                if (iM2398catch != -1) {
                    interfaceC17739l.vip(purchase(), iM2398catch);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String strYandex = purchase().yandex();
                String string = Arrays.toString(enumArr);
                sb.append(" is not a valid enum ");
                sb.append(strYandex);
                sb.append(", must be one of ");
                sb.append(string);
                throw new C14747l(sb.toString());
            default:
                interfaceC17739l.crashlytics(purchase()).yandex(purchase());
                return;
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int iSignature = interfaceC10726l.Signature(purchase());
                if (iSignature >= 0 && iSignature < enumArr.length) {
                    return enumArr[iSignature];
                }
                throw new C14747l(iSignature + " is not among valid " + purchase().yandex() + " enum values, values size is " + enumArr.length);
            default:
                InterfaceC18035l interfaceC18035lPurchase = purchase();
                InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035lPurchase);
                int iAdmob = interfaceC14988lCrashlytics.admob(purchase());
                if (iAdmob != -1) {
                    C6541l.firebase(AbstractC0653l.vip(iAdmob, "Unexpected index "));
                    return null;
                }
                Unit unit = Unit.INSTANCE;
                interfaceC14988lCrashlytics.yandex(interfaceC18035lPurchase);
                return obj;
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        switch (this.yandex) {
            case 0:
                return (InterfaceC18035l) ((C8688l) this.amazon).getValue();
            default:
                return (InterfaceC18035l) this.amazon.getValue();
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + purchase().yandex() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5301l(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        this.yandex = 1;
        this.crashlytics = Arrays.asList(annotationArr);
    }

    public C5301l(String str, Enum[] enumArr) {
        this.yandex = 0;
        this.loadAd = enumArr;
        this.amazon = new C8688l(new C12242l(this, str, 15));
    }
}
