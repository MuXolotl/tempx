package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.security.GeneralSecurityException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖۜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16655l {
    public static final C4733l yandex = new C4733l(C10257l.class, new C11467l(25));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.KmsAeadKey", new C11467l(26));
    public static final C5773l crashlytics = new C5773l(C14993l.class, new C11467l(27));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.KmsAeadKey", new C11467l(28));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable admob(InterfaceC15829l interfaceC15829l, AbstractC0283l abstractC0283l) {
        C3487l c3487l;
        if (abstractC0283l instanceof C3487l) {
            c3487l = (C3487l) abstractC0283l;
            int i = c3487l.f7372l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3487l.f7372l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3487l = new C3487l(abstractC0283l);
            }
        } else {
            c3487l = new C3487l(abstractC0283l);
        }
        Object objFirebase = c3487l.f7373l;
        int i2 = c3487l.f7372l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = interfaceC15829l.yandex();
            c3487l.f7372l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c3487l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return ((C13939l) objFirebase).f27228l;
    }

    public static void amazon(int i, byte[] bArr, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = crashlytics(i2 * 4, bArr);
        }
    }

    public static void billing(int i, byte[] bArr, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            purchase(iArr[i2], i2 * 4, bArr);
        }
    }

    public static int crashlytics(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable firebase(InterfaceC15829l interfaceC15829l, AbstractC0283l abstractC0283l) {
        C4712l c4712l;
        if (abstractC0283l instanceof C4712l) {
            c4712l = (C4712l) abstractC0283l;
            int i = c4712l.f9569l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4712l.f9569l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4712l = new C4712l(abstractC0283l);
            }
        } else {
            c4712l = new C4712l(abstractC0283l);
        }
        Object objFirebase = c4712l.f9570l;
        int i2 = c4712l.f9569l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = interfaceC15829l.yandex();
            c4712l.f9569l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c4712l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return ((C13939l) objFirebase).f27229l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable isPro(InterfaceC15829l interfaceC15829l, AbstractC0283l abstractC0283l) {
        C8825l c8825l;
        if (abstractC0283l instanceof C8825l) {
            c8825l = (C8825l) abstractC0283l;
            int i = c8825l.f18117l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8825l.f18117l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8825l = new C8825l(abstractC0283l);
            }
        } else {
            c8825l = new C8825l(abstractC0283l);
        }
        Object objFirebase = c8825l.f18118l;
        int i2 = c8825l.f18117l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = interfaceC15829l.yandex();
            c8825l.f18117l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c8825l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return ((C13939l) objFirebase).f27230l;
    }

    public static int loadAd(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static void mopub(long j, byte[] bArr, int i) {
        purchase((int) j, i, bArr);
        int i2 = (int) (j >>> 32);
        bArr[i + 4] = (byte) i2;
        bArr[i + 5] = (byte) (i2 >>> 8);
        bArr[i + 6] = (byte) (i2 >>> 16);
    }

    public static void purchase(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static C9358l remoteconfig(C11534l c11534l) {
        if (c11534l == C11534l.f23192l) {
            return C9358l.crashlytics;
        }
        if (c11534l == C11534l.f23197l) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c11534l)));
    }

    public static final void smaato(C11154l c11154l, Function1 function1) {
        C11154l c11154l2 = new C11154l(999);
        int i = c11154l.f11161l;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            c11154l2.put(c11154l.billing(i2), c11154l.subs(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                function1.invoke(c11154l2);
                c11154l2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            function1.invoke(c11154l2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object subs(InterfaceC15829l interfaceC15829l, String str, AbstractC0283l abstractC0283l) {
        C17293l c17293l;
        if (abstractC0283l instanceof C17293l) {
            c17293l = (C17293l) abstractC0283l;
            int i = c17293l.f33562l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17293l.f33562l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17293l = new C17293l(abstractC0283l);
            }
        } else {
            c17293l = new C17293l(abstractC0283l);
        }
        Object objFirebase = c17293l.f33560l;
        int i2 = c17293l.f33562l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = interfaceC15829l.yandex();
            c17293l.f33561l = str;
            c17293l.f33562l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c17293l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = c17293l.f33561l;
            AbstractC2829l.crashlytics(objFirebase);
        }
        return ((C13939l) objFirebase).f27227l.get(str);
    }

    public static AbstractC4350l yandex(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                C18073l.license(AbstractC0653l.startapp(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                return (AbstractC4350l) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e) {
                C18073l.Signature(AbstractC0653l.startapp(cls, "Cannot create an instance of "), e);
                return null;
            } catch (InstantiationException e2) {
                C18073l.Signature(AbstractC0653l.startapp(cls, "Cannot create an instance of "), e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            C18073l.Signature(AbstractC0653l.startapp(cls, "Cannot create an instance of "), e3);
            return null;
        }
    }
}
