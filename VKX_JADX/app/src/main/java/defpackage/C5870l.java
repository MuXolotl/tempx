package defpackage;

import android.database.sqlite.SQLiteDatabase;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٟۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5870l implements InterfaceC12352l, InterfaceC17053l {
    public final C15802l yandex;

    public C5870l(C15802l c15802l) {
        this.yandex = c15802l;
    }

    @Override // defpackage.InterfaceC12352l
    public final Object amazon(AbstractC5563l abstractC5563l) {
        return Boolean.valueOf(this.yandex.f31025l.isVip());
    }

    @Override // defpackage.InterfaceC17053l
    public final InterfaceC0684l crashlytics() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC2679l
    public final Object loadAd(String str, Function1 function1, AbstractC0283l abstractC0283l) {
        AbstractC15114l abstractC15114lMo668l = this.yandex.mo668l(str);
        try {
            Object objInvoke = function1.invoke(abstractC15114lMo668l);
            AbstractC1214l.yandex(abstractC15114lMo668l, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(abstractC15114lMo668l, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object purchase(EnumC18674l enumC18674l, Function2 function2, AbstractC0283l abstractC0283l) throws Throwable {
        C9327l c9327l;
        C5870l c5870l;
        C11442l c11442l;
        if (abstractC0283l instanceof C9327l) {
            c9327l = (C9327l) abstractC0283l;
            int i = c9327l.f19141l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9327l.f19141l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9327l = new C9327l(this, abstractC0283l);
            }
        } else {
            c9327l = new C9327l(this, abstractC0283l);
        }
        Object obj = c9327l.f19144l;
        int i2 = c9327l.f19141l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C11442l c11442l2 = this.yandex.f31025l;
            c11442l2.isVip();
            int iOrdinal = enumC18674l.ordinal();
            if (iOrdinal == 0) {
                SQLiteDatabase sQLiteDatabase = c11442l2.f23028l;
                InterfaceC1220l interfaceC1220l = C11442l.f23026l;
                if (((Method) interfaceC1220l.getValue()) != null) {
                    InterfaceC1220l interfaceC1220l2 = C11442l.f23027l;
                    if (((Method) interfaceC1220l2.getValue()) != null) {
                        Method method = (Method) interfaceC1220l.getValue();
                        Object objInvoke = ((Method) interfaceC1220l2.getValue()).invoke(sQLiteDatabase, null);
                        if (objInvoke != null) {
                            method.invoke(objInvoke, 0, null, 0, null);
                        } else {
                            C8339l.smaato("Required value was null.");
                        }
                    } else {
                        c11442l2.yandex();
                    }
                } else {
                    c11442l2.yandex();
                }
            } else if (iOrdinal == 1) {
                c11442l2.billing();
            } else {
                if (iOrdinal != 2) {
                    C18725l.billing();
                    return null;
                }
                c11442l2.yandex();
            }
            try {
                C10595l c10595l = new C10595l(1, this);
                c9327l.f19143l = this;
                c9327l.f19142l = c11442l2;
                c9327l.f19141l = 1;
                Object objInvoke2 = function2.invoke(c10595l, c9327l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objInvoke2 == enumC9342l) {
                    return enumC9342l;
                }
                c5870l = this;
                c11442l = c11442l2;
                obj = objInvoke2;
            } catch (Throwable th) {
                th = th;
                c5870l = this;
                c11442l = c11442l2;
                c11442l.vip();
                if (!c11442l.isVip()) {
                    c5870l.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c11442l = c9327l.f19142l;
            c5870l = c9327l.f19143l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th2) {
                th = th2;
                c11442l.vip();
                if (!c11442l.isVip()) {
                    c5870l.getClass();
                }
                throw th;
            }
        }
        c11442l.signatures();
        c11442l.vip();
        if (!c11442l.isVip()) {
            c5870l.getClass();
        }
        return obj;
    }

    @Override // defpackage.InterfaceC12352l
    public final Object yandex(EnumC18674l enumC18674l, Function2 function2, AbstractC5563l abstractC5563l) {
        return purchase(enumC18674l, function2, abstractC5563l);
    }
}
