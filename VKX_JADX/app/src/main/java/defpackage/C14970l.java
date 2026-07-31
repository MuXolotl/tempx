package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔٙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14970l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f29447l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29448l;

    public /* synthetic */ C14970l(int i, Object obj) {
        this.f29448l = i;
        this.f29447l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:87:0x013d  */
    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        C6855l c6855l;
        Iterator it;
        int i;
        C1995l c1995l;
        C10412l c10412l;
        Throwable th;
        C4877l c4877l;
        int i2 = this.f29448l;
        int i3 = 5;
        int i4 = 0;
        InterfaceC14029l interfaceC14029l2 = null;
        Object obj = EnumC9342l.f19165l;
        Object obj2 = this.f29447l;
        switch (i2) {
            case 0:
                Object objYandex = ((C6783l) obj2).yandex(new C13790l(interfaceC9427l, i4), interfaceC14029l);
                return objYandex == obj ? objYandex : Unit.INSTANCE;
            case 1:
                Object objYandex2 = ((C2347l) obj2).yandex(new C8242l(interfaceC9427l, i3), interfaceC14029l);
                return objYandex2 == obj ? objYandex2 : Unit.INSTANCE;
            case 2:
                Object objYandex3 = ((C2347l) obj2).yandex(new C8242l(interfaceC9427l, 7), interfaceC14029l);
                return objYandex3 == obj ? objYandex3 : Unit.INSTANCE;
            case 3:
                C4647l c4647l = new C4647l((C1640l) obj2, interfaceC9427l, interfaceC14029l2, 15);
                C16063l c16063l = new C16063l(interfaceC14029l.metrica(), interfaceC14029l, i4);
                Object objBilling = AbstractC1163l.billing(c16063l, true, c16063l, c4647l);
                return objBilling == obj ? objBilling : Unit.INSTANCE;
            case 4:
                if (interfaceC14029l instanceof C6855l) {
                    c6855l = (C6855l) interfaceC14029l;
                    int i5 = c6855l.f14329l;
                    if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6855l.f14329l = i5 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6855l = new C6855l(this, interfaceC14029l);
                    }
                } else {
                    c6855l = new C6855l(this, interfaceC14029l);
                }
                Object obj3 = c6855l.f14330l;
                int i6 = c6855l.f14329l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj3);
                    it = ((Iterable) obj2).iterator();
                    i = 0;
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = c6855l.f14328l;
                    int i8 = c6855l.f14331l;
                    it = c6855l.f14327l;
                    InterfaceC9427l interfaceC9427l2 = c6855l.f14326l;
                    AbstractC2829l.crashlytics(obj3);
                    i = i7;
                    interfaceC9427l = interfaceC9427l2;
                    i4 = i8;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c6855l.f14326l = interfaceC9427l;
                    c6855l.f14327l = it;
                    c6855l.f14331l = i4;
                    c6855l.f14328l = i;
                    c6855l.f14329l = 1;
                    if (interfaceC9427l.isPro(next, c6855l) == obj) {
                        return obj;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                Object objIsPro = interfaceC9427l.isPro(obj2, interfaceC14029l);
                return objIsPro == obj ? objIsPro : Unit.INSTANCE;
            case 6:
                Object objYandex4 = ((C6783l) obj2).yandex(new C8242l(interfaceC9427l, 29), interfaceC14029l);
                return objYandex4 == obj ? objYandex4 : Unit.INSTANCE;
            case 7:
                Object objYandex5 = ((C2606l) obj2).yandex(new C6332l(interfaceC9427l, i3), interfaceC14029l);
                return objYandex5 == obj ? objYandex5 : Unit.INSTANCE;
            case 8:
                if (interfaceC14029l instanceof C1995l) {
                    c1995l = (C1995l) interfaceC14029l;
                    int i9 = c1995l.f4511l;
                    if ((i9 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1995l.f4511l = i9 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1995l = new C1995l(this, interfaceC14029l);
                    }
                } else {
                    c1995l = new C1995l(this, interfaceC14029l);
                }
                Object obj4 = c1995l.f4512l;
                int i10 = c1995l.f4511l;
                if (i10 != 0) {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c10412l = c1995l.f4513l;
                    try {
                        AbstractC2829l.crashlytics(obj4);
                        c10412l.license();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        c10412l.license();
                        throw th;
                    }
                }
                AbstractC2829l.crashlytics(obj4);
                C10412l c10412l2 = new C10412l(interfaceC9427l, c1995l.f1295l);
                try {
                    c1995l.f4513l = c10412l2;
                    c1995l.f4511l = 1;
                    Object objInvoke = ((Function2) obj2).invoke(c10412l2, c1995l);
                    if (objInvoke != obj) {
                        objInvoke = Unit.INSTANCE;
                        break;
                    }
                    if (objInvoke == obj) {
                        return obj;
                    }
                    c10412l = c10412l2;
                    c10412l.license();
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    c10412l = c10412l2;
                    th = th3;
                    c10412l.license();
                    throw th;
                }
            case 9:
                Object objYandex6 = ((C14194l) obj2).yandex(new C6332l(interfaceC9427l, 19), interfaceC14029l);
                return objYandex6 == obj ? objYandex6 : Unit.INSTANCE;
            case 10:
                Object objYandex7 = ((C14194l) obj2).yandex(new C6332l(interfaceC9427l, 20), interfaceC14029l);
                return objYandex7 == obj ? objYandex7 : Unit.INSTANCE;
            case 11:
                Object objYandex8 = ((C14194l) obj2).yandex(new C6332l(interfaceC9427l, 24), interfaceC14029l);
                return objYandex8 == obj ? objYandex8 : Unit.INSTANCE;
            case 12:
                if (interfaceC14029l instanceof C4877l) {
                    c4877l = (C4877l) interfaceC14029l;
                    int i11 = c4877l.f9945l;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4877l.f9945l = i11 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4877l = new C4877l(this, interfaceC14029l);
                    }
                } else {
                    c4877l = new C4877l(this, interfaceC14029l);
                }
                Object obj5 = c4877l.f9946l;
                int i12 = c4877l.f9945l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj5);
                    C15215l c15215l = new C15215l(new C9122l(), interfaceC9427l, 13);
                    c4877l.f9945l = 1;
                    ((C6930l) obj2).yandex(c15215l, c4877l);
                    return obj;
                }
                if (i12 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj5);
                C17132l.firebase();
                return null;
            default:
                InterfaceC6942l[] interfaceC6942lArr = (InterfaceC6942l[]) obj2;
                Object objYandex9 = AbstractC6968l.yandex(interfaceC14029l, interfaceC9427l, new C8467l(16, interfaceC6942lArr), new C7306l(3, interfaceC14029l2, 14), interfaceC6942lArr);
                return objYandex9 == obj ? objYandex9 : Unit.INSTANCE;
        }
    }
}
