package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ۗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18135l implements InterfaceC5305l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f35447l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f35448l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f35449l;

    public AbstractC18135l(InterfaceC12932l interfaceC12932l, int i, int i2) {
        this.f35449l = interfaceC12932l;
        this.f35448l = i;
        this.f35447l = i2;
    }

    public InterfaceC6942l admob() {
        return null;
    }

    public abstract Object amazon(C12428l c12428l, InterfaceC14029l interfaceC14029l);

    public String crashlytics() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // defpackage.InterfaceC5305l
    public final InterfaceC6942l loadAd(InterfaceC12932l interfaceC12932l, int i, int i2) {
        InterfaceC12932l interfaceC12932l2 = this.f35449l;
        InterfaceC12932l interfaceC12932lMo246l = interfaceC12932l.mo246l(interfaceC12932l2);
        int i3 = this.f35447l;
        int i4 = this.f35448l;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i == -3) {
                    i = i4;
                } else if (i4 != -2) {
                    if (i == -2) {
                        i = i4;
                    } else {
                        i += i4;
                        if (i < 0) {
                            i = Alert.DURATION_SHOW_INDEFINITELY;
                        }
                    }
                }
            }
            i2 = i3;
        }
        return (AbstractC8576l.yandex(interfaceC12932lMo246l, interfaceC12932l2) && i == i4 && i2 == i3) ? this : purchase(interfaceC12932lMo246l, i, i2);
    }

    public abstract AbstractC18135l purchase(InterfaceC12932l interfaceC12932l, int i, int i2);

    public InterfaceC14592l subs(InterfaceC2262l interfaceC2262l) {
        int i = this.f35448l;
        if (i == -3) {
            i = -2;
        }
        Function2 c5163l = new C5163l(this, null, 27);
        C12428l c12428l = new C12428l(AbstractC14425l.smaato(interfaceC2262l, this.f35449l), AbstractC12098l.yandex(i, this.f35447l, null, 4));
        c12428l.m3751l(3, c12428l, c5163l);
        return c12428l;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strCrashlytics = crashlytics();
        if (strCrashlytics != null) {
            arrayList.add(strCrashlytics);
        }
        C17218l c17218l = C17218l.f33421l;
        InterfaceC12932l interfaceC12932l = this.f35449l;
        if (interfaceC12932l != c17218l) {
            arrayList.add("context=" + interfaceC12932l);
        }
        int i = this.f35448l;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.f35447l;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(AbstractC12900l.advert(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC2812l.tapsense(sb, AbstractC16901l.m4210case(arrayList, ", ", null, null, null, 62), ']');
    }

    @Override // defpackage.InterfaceC6942l
    public Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        Object objAdmob = AbstractC11990l.admob(new C7641l(interfaceC9427l, this, null, 22), interfaceC14029l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }
}
