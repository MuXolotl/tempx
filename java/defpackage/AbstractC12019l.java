package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٞۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12019l {
    public static final C13206l yandex = new C13206l(7);
    public static final C17308l loadAd = new C17308l(new C11485l(23));

    public static InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, C15389l c15389l, EnumC7283l enumC7283l, boolean z, InterfaceC14745l interfaceC14745l) {
        return interfaceC17242l.premium(new C18168l(c15389l, enumC7283l, z, interfaceC14745l));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(Function0 function0, Function2 function2, AbstractC0283l abstractC0283l) {
        C16444l c16444l;
        if (abstractC0283l instanceof C16444l) {
            c16444l = (C16444l) abstractC0283l;
            int i = c16444l.f32159l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16444l.f32159l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16444l = new C16444l(abstractC0283l);
            }
        } else {
            c16444l = new C16444l(abstractC0283l);
        }
        Object obj = c16444l.f32160l;
        int i2 = c16444l.f32159l;
        InterfaceC14029l interfaceC14029l = null;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                C7641l c7641l = new C7641l(function0, function2, interfaceC14029l, 2);
                c16444l.f32159l = 1;
                Object objAdmob = AbstractC11990l.admob(c7641l, c16444l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAdmob == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
        } catch (C12345l unused) {
        }
        return Unit.INSTANCE;
    }

    public static final C18416l yandex(Function1 function1) {
        C0143l c0143l = new C0143l();
        function1.invoke(c0143l);
        float[] fArr = c0143l.loadAd;
        ArrayList arrayList = c0143l.yandex;
        int size = arrayList.size();
        AbstractC0622l.mopub(size, fArr.length);
        return new C18416l(arrayList, Arrays.copyOfRange(fArr, 0, size));
    }
}
