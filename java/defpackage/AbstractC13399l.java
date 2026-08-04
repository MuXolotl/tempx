package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: lْٕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13399l extends AbstractC15944l {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC13399l> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C7565l unknownFields;

    public AbstractC13399l() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C7565l.billing;
    }

    public static AbstractC13399l Signature(AbstractC13399l abstractC13399l, AbstractC15029l abstractC15029l, C7597l c7597l) throws C2297l {
        AbstractC13399l abstractC13399lAds = abstractC13399l.ads();
        try {
            C17073l c17073l = C17073l.crashlytics;
            c17073l.getClass();
            InterfaceC0060l interfaceC0060lYandex = c17073l.yandex(abstractC13399lAds.getClass());
            C12676l c12676l = (C12676l) abstractC15029l.f29554l;
            if (c12676l == null) {
                c12676l = new C12676l(abstractC15029l, (byte) 0);
            }
            interfaceC0060lYandex.purchase(abstractC13399lAds, c12676l, c7597l);
            interfaceC0060lYandex.loadAd(abstractC13399lAds);
            return abstractC13399lAds;
        } catch (IOException e) {
            if (e.getCause() instanceof C2297l) {
                throw ((C2297l) e.getCause());
            }
            throw new C2297l(e.getMessage(), e);
        } catch (C14816l e2) {
            throw new C2297l(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C2297l) {
                throw ((C2297l) e3.getCause());
            }
            throw e3;
        } catch (C2297l e4) {
            if (e4.f4988l) {
                throw new C2297l(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    public static AbstractC13399l isPro(Class cls) {
        AbstractC13399l abstractC13399l = defaultInstanceMap.get(cls);
        if (abstractC13399l == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC13399l = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                C4875l.remoteconfig("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC13399l != null) {
            return abstractC13399l;
        }
        AbstractC13399l abstractC13399lLoadAd = ((AbstractC13399l) AbstractC1900l.loadAd(cls)).loadAd();
        if (abstractC13399lLoadAd != null) {
            defaultInstanceMap.put(cls, abstractC13399lLoadAd);
            return abstractC13399lLoadAd;
        }
        C18073l.admob();
        return null;
    }

    public static void license(Class cls, AbstractC13399l abstractC13399l) {
        abstractC13399l.startapp();
        defaultInstanceMap.put(cls, abstractC13399l);
    }

    public static void mopub(AbstractC13399l abstractC13399l) throws C2297l {
        if (abstractC13399l != null && !vip(abstractC13399l, true)) {
            throw new C2297l(new C14816l().getMessage());
        }
    }

    public static Object remoteconfig(Method method, AbstractC13399l abstractC13399l, Object... objArr) {
        try {
            return method.invoke(abstractC13399l, objArr);
        } catch (IllegalAccessException e) {
            C18073l.Signature("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C18073l.Signature("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static AbstractC13399l subscription(AbstractC13399l abstractC13399l, AbstractC15257l abstractC15257l, C7597l c7597l) throws C2297l {
        C14809l c14809l = (C14809l) abstractC15257l;
        C2268l c2268lIsPro = AbstractC15029l.isPro(c14809l.f28972l, c14809l.smaato(), c14809l.size(), true);
        AbstractC13399l abstractC13399lSignature = Signature(abstractC13399l, c2268lIsPro, c7597l);
        c2268lIsPro.loadAd(0);
        mopub(abstractC13399lSignature);
        return abstractC13399lSignature;
    }

    public static AbstractC13399l tapsense(AbstractC13399l abstractC13399l, byte[] bArr, C7597l c7597l) throws C2297l {
        int length = bArr.length;
        if (length != 0) {
            AbstractC13399l abstractC13399lAds = abstractC13399l.ads();
            try {
                C17073l c17073l = C17073l.crashlytics;
                c17073l.getClass();
                InterfaceC0060l interfaceC0060lYandex = c17073l.yandex(abstractC13399lAds.getClass());
                C16292l c16292l = new C16292l();
                c7597l.getClass();
                interfaceC0060lYandex.mopub(abstractC13399lAds, bArr, 0, length, c16292l);
                interfaceC0060lYandex.loadAd(abstractC13399lAds);
                abstractC13399l = abstractC13399lAds;
            } catch (IndexOutOfBoundsException unused) {
                throw C2297l.mopub();
            } catch (C2297l e) {
                if (e.f4988l) {
                    throw new C2297l(e.getMessage(), e);
                }
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof C2297l) {
                    throw ((C2297l) e2.getCause());
                }
                throw new C2297l(e2.getMessage(), e2);
            } catch (C14816l e3) {
                throw new C2297l(e3.getMessage());
            }
        }
        mopub(abstractC13399l);
        return abstractC13399l;
    }

    public static final boolean vip(AbstractC13399l abstractC13399l, boolean z) {
        byte bByteValue = ((Byte) abstractC13399l.subs(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C17073l c17073l = C17073l.crashlytics;
        c17073l.getClass();
        boolean zCrashlytics = c17073l.yandex(abstractC13399l.getClass()).crashlytics(abstractC13399l);
        if (z) {
            abstractC13399l.subs(2);
        }
        return zCrashlytics;
    }

    public final AbstractC9397l ad() {
        AbstractC9397l abstractC9397l = (AbstractC9397l) subs(5);
        abstractC9397l.billing(this);
        return abstractC9397l;
    }

    @Override // defpackage.AbstractC15944l
    /* JADX INFO: renamed from: adcel, reason: merged with bridge method [inline-methods] */
    public final AbstractC9397l amazon() {
        return (AbstractC9397l) subs(5);
    }

    public final AbstractC9397l admob() {
        return (AbstractC9397l) subs(5);
    }

    public final AbstractC13399l ads() {
        return (AbstractC13399l) subs(4);
    }

    public final void advert(AbstractC15335l abstractC15335l) {
        C17073l c17073l = C17073l.crashlytics;
        c17073l.getClass();
        InterfaceC0060l interfaceC0060lYandex = c17073l.yandex(getClass());
        C5138l c5138l = abstractC15335l.yandex;
        if (c5138l == null) {
            c5138l = new C5138l(abstractC15335l);
        }
        interfaceC0060lYandex.isPro(c5138l, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C17073l c17073l = C17073l.crashlytics;
        c17073l.getClass();
        return c17073l.yandex(getClass()).admob(this, (AbstractC13399l) obj);
    }

    @Override // defpackage.InterfaceC0974l
    /* JADX INFO: renamed from: firebase, reason: merged with bridge method [inline-methods] */
    public final AbstractC13399l loadAd() {
        return (AbstractC13399l) subs(6);
    }

    public final int hashCode() {
        if (metrica()) {
            C17073l c17073l = C17073l.crashlytics;
            c17073l.getClass();
            return c17073l.yandex(getClass()).subs(this);
        }
        if (this.memoizedHashCode == 0) {
            C17073l c17073l2 = C17073l.crashlytics;
            c17073l2.getClass();
            this.memoizedHashCode = c17073l2.yandex(getClass()).subs(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean metrica() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void pro(int i) {
        if (i < 0) {
            C8339l.smaato(AbstractC0653l.vip(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final InterfaceC14781l smaato() {
        return (InterfaceC14781l) subs(7);
    }

    public final void startapp() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public abstract Object subs(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC6674l.yandex;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC6674l.crashlytics(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.AbstractC15944l
    public final int yandex(InterfaceC0060l interfaceC0060l) {
        int iBilling;
        int iBilling2;
        if (metrica()) {
            if (interfaceC0060l == null) {
                C17073l c17073l = C17073l.crashlytics;
                c17073l.getClass();
                iBilling2 = c17073l.yandex(getClass()).billing(this);
            } else {
                iBilling2 = interfaceC0060l.billing(this);
            }
            if (iBilling2 >= 0) {
                return iBilling2;
            }
            C8339l.smaato(AbstractC0653l.vip(iBilling2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i & Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (interfaceC0060l == null) {
            C17073l c17073l2 = C17073l.crashlytics;
            c17073l2.getClass();
            iBilling = c17073l2.yandex(getClass()).billing(this);
        } else {
            iBilling = interfaceC0060l.billing(this);
        }
        pro(iBilling);
        return iBilling;
    }
}
