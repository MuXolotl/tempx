package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ٚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18020l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C11359l f35225l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f35226l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f35227l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18020l(C11359l c11359l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f35226l = i;
        this.f35225l = c11359l;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object objCrashlytics;
        int i = this.f35226l;
        C11359l c11359l = this.f35225l;
        Object obj2 = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f35227l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13434l c13434l = C13434l.yandex;
                    this.f35227l = 1;
                    c13434l.getClass();
                    C11362l c11362l = C13434l.purchase;
                    ListIterator listIterator = c11362l.listIterator();
                    int i3 = 0;
                    while (true) {
                        C13376l c13376l = (C13376l) listIterator;
                        if (!c13376l.hasNext()) {
                            i3 = -1;
                        } else if (!AbstractC8576l.yandex(((C11359l) c13376l.next()).yandex, c11359l.yandex)) {
                            i3++;
                        }
                    }
                    Integer num = new Integer(i3);
                    Integer num2 = num.intValue() >= 0 ? num : null;
                    if (num2 != null) {
                        c11362l.remove(num2.intValue());
                        C13434l.yandex.getClass();
                        objCrashlytics = C13434l.crashlytics(this);
                        if (objCrashlytics != obj2) {
                            objCrashlytics = Unit.INSTANCE;
                        }
                    } else {
                        objCrashlytics = Unit.INSTANCE;
                    }
                    if (objCrashlytics == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f35227l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13434l c13434l2 = C13434l.yandex;
                    this.f35227l = 1;
                    c13434l2.getClass();
                    if (C13434l.purchase(c11359l, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i5 = this.f35227l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13434l c13434l3 = C13434l.yandex;
                    this.f35227l = 1;
                    c13434l3.getClass();
                    C13434l.purchase.add(c11359l);
                    Object objCrashlytics2 = C13434l.crashlytics(this);
                    if (objCrashlytics2 != obj2) {
                        objCrashlytics2 = Unit.INSTANCE;
                    }
                    if (objCrashlytics2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i6 = this.f35227l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13434l c13434l4 = C13434l.yandex;
                    this.f35227l = 1;
                    c13434l4.getClass();
                    C13434l.purchase.add(c11359l);
                    Object objCrashlytics3 = C13434l.crashlytics(this);
                    if (objCrashlytics3 != obj2) {
                        objCrashlytics3 = Unit.INSTANCE;
                    }
                    if (objCrashlytics3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f35226l;
        C11359l c11359l = this.f35225l;
        switch (i) {
            case 0:
                return new C18020l(c11359l, interfaceC14029l, 0);
            case 1:
                return new C18020l(c11359l, interfaceC14029l, 1);
            case 2:
                return new C18020l(c11359l, interfaceC14029l, 2);
            default:
                return new C18020l(c11359l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f35226l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C18020l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
