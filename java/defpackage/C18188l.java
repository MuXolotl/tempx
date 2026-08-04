package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ۚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18188l {
    public static final C18188l yandex = new C18188l();
    public static final C4910l loadAd = AbstractC8618l.yandex();
    public static final LinkedHashMap crashlytics = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(Context context, C15656l c15656l, String str, Function2 function2, AbstractC0283l abstractC0283l) throws Throwable {
        C5953l c5953l;
        if (abstractC0283l instanceof C5953l) {
            c5953l = (C5953l) abstractC0283l;
            int i = c5953l.f12557l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5953l.f12557l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5953l = new C5953l(this, abstractC0283l);
            }
        } else {
            c5953l = new C5953l(this, abstractC0283l);
        }
        Object objLoadAd = c5953l.f12558l;
        int i2 = c5953l.f12557l;
        Object obj = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            c5953l.f12559l = function2;
            c5953l.f12557l = 1;
            objLoadAd = loadAd(context, c15656l, str, c5953l);
            if (objLoadAd != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objLoadAd);
                return objLoadAd;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        function2 = (Function2) c5953l.f12559l;
        AbstractC2829l.crashlytics(objLoadAd);
        c5953l.f12559l = null;
        c5953l.f12557l = 2;
        Object objLoadAd2 = ((InterfaceC15829l) objLoadAd).loadAd(function2, c5953l);
        return objLoadAd2 == obj ? obj : objLoadAd2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(Context context, C15656l c15656l, String str, AbstractC0283l abstractC0283l) {
        C2575l c2575l;
        if (abstractC0283l instanceof C2575l) {
            c2575l = (C2575l) abstractC0283l;
            int i = c2575l.f5610l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2575l.f5610l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2575l = new C2575l(this, abstractC0283l);
            }
        } else {
            c2575l = new C2575l(this, abstractC0283l);
        }
        Object objLoadAd = c2575l.f5609l;
        int i2 = c2575l.f5610l;
        Object obj = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            c2575l.f5610l = 1;
            objLoadAd = loadAd(context, c15656l, str, c2575l);
            if (objLoadAd != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objLoadAd);
                return objLoadAd;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(objLoadAd);
        InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) objLoadAd).yandex();
        c2575l.f5610l = 2;
        Object objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c2575l);
        return objFirebase == obj ? obj : objFirebase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(Context context, C15656l c15656l, String str, AbstractC0283l abstractC0283l) throws Throwable {
        C13337l c13337l;
        C4910l c4910l;
        InterfaceC1601l interfaceC1601l;
        Throwable th;
        Object obj;
        C0360l c0360lIsPro;
        String str2;
        Map map;
        if (abstractC0283l instanceof C13337l) {
            c13337l = (C13337l) abstractC0283l;
            int i = c13337l.f26182l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13337l.f26182l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13337l = new C13337l(this, abstractC0283l);
            }
        } else {
            c13337l = new C13337l(this, abstractC0283l);
        }
        Object obj2 = c13337l.f26181l;
        int i2 = c13337l.f26182l;
        int i3 = 2;
        int i4 = 1;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj2);
                c13337l.f26184l = context;
                c13337l.f26183l = c15656l;
                c13337l.f26186l = str;
                c4910l = loadAd;
                c13337l.f26180l = c4910l;
                c13337l.f26182l = 1;
                if (c4910l.yandex(c13337l) != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = c13337l.f26186l;
                map = (Map) c13337l.f26183l;
                interfaceC1601l = (InterfaceC1601l) c13337l.f26184l;
                try {
                    AbstractC2829l.crashlytics(obj2);
                    obj = (InterfaceC15829l) obj2;
                    map.put(str2, obj);
                    InterfaceC15829l interfaceC15829l = (InterfaceC15829l) obj;
                    interfaceC1601l.billing(null);
                    return interfaceC15829l;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC1601l.billing(null);
                    throw th;
                }
            }
            C4910l c4910l2 = c13337l.f26180l;
            str = c13337l.f26186l;
            c15656l = (C15656l) c13337l.f26183l;
            Context context2 = (Context) c13337l.f26184l;
            AbstractC2829l.crashlytics(obj2);
            c4910l = c4910l2;
            context = context2;
            LinkedHashMap linkedHashMap = crashlytics;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                c13337l.f26184l = c4910l;
                c13337l.f26183l = linkedHashMap;
                c13337l.f26186l = str;
                c13337l.f26180l = null;
                c13337l.f26182l = 2;
                switch (c15656l.yandex) {
                    case 0:
                        c0360lIsPro = C11140l.isPro(C11982l.f23891l, new C15245l(i4, context, str));
                        break;
                    case 1:
                        c0360lIsPro = C11140l.isPro(C14479l.f28348l, new C15245l(i3, context, str));
                        break;
                    default:
                        c0360lIsPro = C11140l.isPro(C11140l.f22376l, new C15245l(4, context, str));
                        break;
                }
                if (c0360lIsPro != enumC9342l) {
                    String str3 = str;
                    interfaceC1601l = c4910l;
                    obj2 = c0360lIsPro;
                    str2 = str3;
                    map = linkedHashMap;
                    obj = (InterfaceC15829l) obj2;
                    map.put(str2, obj);
                }
                return enumC9342l;
            }
            interfaceC1601l = c4910l;
            InterfaceC15829l interfaceC15829l2 = (InterfaceC15829l) obj;
            interfaceC1601l.billing(null);
            return interfaceC15829l2;
        } catch (Throwable th3) {
            interfaceC1601l = c4910l;
            th = th3;
            interfaceC1601l.billing(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(Context context, C15656l c15656l, String str, AbstractC0283l abstractC0283l) {
        C8587l c8587l;
        C4910l c4910l;
        File fileAmazon;
        if (abstractC0283l instanceof C8587l) {
            c8587l = (C8587l) abstractC0283l;
            int i = c8587l.f17702l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8587l.f17702l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8587l = new C8587l(this, abstractC0283l);
            }
        } else {
            c8587l = new C8587l(this, abstractC0283l);
        }
        Object obj = c8587l.f17701l;
        int i2 = c8587l.f17702l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c8587l.f17704l = context;
            c8587l.f17703l = c15656l;
            c8587l.f17706l = str;
            c4910l = loadAd;
            c8587l.f17700l = c4910l;
            c8587l.f17702l = 1;
            Object objYandex = c4910l.yandex(c8587l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4910l c4910l2 = c8587l.f17700l;
            str = c8587l.f17706l;
            c15656l = c8587l.f17703l;
            Context context2 = c8587l.f17704l;
            AbstractC2829l.crashlytics(obj);
            c4910l = c4910l2;
            context = context2;
        }
        try {
            crashlytics.remove(str);
            switch (c15656l.yandex) {
                case 0:
                    fileAmazon = AbstractC2632l.amazon(context, str);
                    break;
                case 1:
                    fileAmazon = AbstractC2632l.amazon(context, str);
                    break;
                default:
                    fileAmazon = AbstractC2632l.amazon(context, str);
                    break;
            }
            fileAmazon.delete();
            return Unit.INSTANCE;
        } finally {
            c4910l.billing(null);
        }
    }
}
