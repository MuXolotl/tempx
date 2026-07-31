package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: renamed from: lّۣۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12946l extends AbstractC9446l {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC12946l> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C11788l unknownFields;

    public AbstractC12946l() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C11788l.billing;
    }

    public static Object billing(Method method, AbstractC12946l abstractC12946l, Object... objArr) {
        try {
            return method.invoke(abstractC12946l, objArr);
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

    public static void firebase(Class cls, AbstractC12946l abstractC12946l) {
        abstractC12946l.subs();
        defaultInstanceMap.put(cls, abstractC12946l);
    }

    public static final boolean mopub(AbstractC12946l abstractC12946l, boolean z) {
        byte bByteValue = ((Byte) abstractC12946l.amazon(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C10738l c10738l = C10738l.crashlytics;
        c10738l.getClass();
        boolean zCrashlytics = c10738l.yandex(abstractC12946l.getClass()).crashlytics(abstractC12946l);
        if (z) {
            abstractC12946l.amazon(2);
        }
        return zCrashlytics;
    }

    public static AbstractC12946l purchase(Class cls) {
        AbstractC12946l abstractC12946l = defaultInstanceMap.get(cls);
        if (abstractC12946l == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC12946l = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                C4875l.remoteconfig("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC12946l != null) {
            return abstractC12946l;
        }
        AbstractC12946l abstractC12946l2 = (AbstractC12946l) ((AbstractC12946l) AbstractC10176l.loadAd(cls)).amazon(6);
        if (abstractC12946l2 != null) {
            defaultInstanceMap.put(cls, abstractC12946l2);
            return abstractC12946l2;
        }
        C18073l.admob();
        return null;
    }

    public final boolean admob() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public abstract Object amazon(int i);

    public final AbstractC7858l crashlytics() {
        return (AbstractC7858l) amazon(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10738l c10738l = C10738l.crashlytics;
        c10738l.getClass();
        return c10738l.yandex(getClass()).subs(this, (AbstractC12946l) obj);
    }

    public final int hashCode() {
        if (admob()) {
            C10738l c10738l = C10738l.crashlytics;
            c10738l.getClass();
            return c10738l.yandex(getClass()).mopub(this);
        }
        if (this.memoizedHashCode == 0) {
            C10738l c10738l2 = C10738l.crashlytics;
            c10738l2.getClass();
            this.memoizedHashCode = c10738l2.yandex(getClass()).mopub(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC12946l isPro() {
        return (AbstractC12946l) amazon(4);
    }

    @Override // defpackage.AbstractC9446l
    public final int loadAd(InterfaceC9608l interfaceC9608l) {
        int iPurchase;
        int iPurchase2;
        if (admob()) {
            if (interfaceC9608l == null) {
                C10738l c10738l = C10738l.crashlytics;
                c10738l.getClass();
                iPurchase2 = c10738l.yandex(getClass()).purchase(this);
            } else {
                iPurchase2 = interfaceC9608l.purchase(this);
            }
            if (iPurchase2 >= 0) {
                return iPurchase2;
            }
            C8339l.smaato(AbstractC0653l.vip(iPurchase2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i & Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (interfaceC9608l == null) {
            C10738l c10738l2 = C10738l.crashlytics;
            c10738l2.getClass();
            iPurchase = c10738l2.yandex(getClass()).purchase(this);
        } else {
            iPurchase = interfaceC9608l.purchase(this);
        }
        smaato(iPurchase);
        return iPurchase;
    }

    public final void remoteconfig(AbstractC11078l abstractC11078l) {
        C10738l c10738l = C10738l.crashlytics;
        c10738l.getClass();
        InterfaceC9608l interfaceC9608lYandex = c10738l.yandex(getClass());
        C13161l c13161l = abstractC11078l.yandex;
        if (c13161l == null) {
            c13161l = new C13161l();
            Charset charset = AbstractC6320l.yandex;
            c13161l.f25776l = abstractC11078l;
            abstractC11078l.yandex = c13161l;
        }
        interfaceC9608lYandex.billing(c13161l, this);
    }

    public final void smaato(int i) {
        if (i < 0) {
            C8339l.smaato(AbstractC0653l.vip(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final void subs() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0792l.yandex;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0792l.crashlytics(this, sb, 0);
        return sb.toString();
    }
}
