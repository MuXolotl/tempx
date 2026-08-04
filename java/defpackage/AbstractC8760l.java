package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: lٌْٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8760l extends AbstractC1200l {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC8760l> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C0774l unknownFields;

    public AbstractC8760l() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C0774l.billing;
    }

    public static Object amazon(Method method, AbstractC8760l abstractC8760l, Object... objArr) {
        try {
            return method.invoke(abstractC8760l, objArr);
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

    public static AbstractC8760l crashlytics(Class cls) {
        AbstractC8760l abstractC8760l = defaultInstanceMap.get(cls);
        if (abstractC8760l == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC8760l = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                C4875l.remoteconfig("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC8760l != null) {
            return abstractC8760l;
        }
        AbstractC8760l abstractC8760l2 = (AbstractC8760l) ((AbstractC8760l) AbstractC0357l.amazon(cls)).loadAd(6);
        if (abstractC8760l2 != null) {
            defaultInstanceMap.put(cls, abstractC8760l2);
            return abstractC8760l2;
        }
        C18073l.admob();
        return null;
    }

    public static void isPro(Class cls, AbstractC8760l abstractC8760l) {
        abstractC8760l.admob();
        defaultInstanceMap.put(cls, abstractC8760l);
    }

    public static final boolean purchase(AbstractC8760l abstractC8760l, boolean z) {
        byte bByteValue = ((Byte) abstractC8760l.loadAd(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C16946l c16946l = C16946l.crashlytics;
        c16946l.getClass();
        boolean zCrashlytics = c16946l.yandex(abstractC8760l.getClass()).crashlytics(abstractC8760l);
        if (z) {
            abstractC8760l.loadAd(2);
        }
        return zCrashlytics;
    }

    public final void admob() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final boolean billing() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16946l c16946l = C16946l.crashlytics;
        c16946l.getClass();
        return c16946l.yandex(getClass()).purchase(this, (AbstractC8760l) obj);
    }

    public final void firebase(int i) {
        if (i < 0) {
            C8339l.smaato(AbstractC0653l.vip(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final int hashCode() {
        if (billing()) {
            C16946l c16946l = C16946l.crashlytics;
            c16946l.getClass();
            return c16946l.yandex(getClass()).billing(this);
        }
        if (this.memoizedHashCode == 0) {
            C16946l c16946l2 = C16946l.crashlytics;
            c16946l2.getClass();
            this.memoizedHashCode = c16946l2.yandex(getClass()).billing(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object loadAd(int i);

    public final void mopub() {
        C16946l c16946l = C16946l.crashlytics;
        c16946l.getClass();
        c16946l.yandex(getClass()).loadAd(this);
        admob();
    }

    public final void smaato(C10107l c10107l) {
        C16946l c16946l = C16946l.crashlytics;
        c16946l.getClass();
        InterfaceC5100l interfaceC5100lYandex = c16946l.yandex(getClass());
        C7972l c7972l = c10107l.yandex;
        if (c7972l == null) {
            c7972l = new C7972l(c10107l);
        }
        interfaceC5100lYandex.subs(this, c7972l);
    }

    public final AbstractC8760l subs() {
        return (AbstractC8760l) loadAd(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC5084l.yandex;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC5084l.crashlytics(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.AbstractC1200l
    public final int yandex(InterfaceC5100l interfaceC5100l) {
        int iAdmob;
        int iAdmob2;
        if (billing()) {
            if (interfaceC5100l == null) {
                C16946l c16946l = C16946l.crashlytics;
                c16946l.getClass();
                iAdmob2 = c16946l.yandex(getClass()).admob(this);
            } else {
                iAdmob2 = interfaceC5100l.admob(this);
            }
            if (iAdmob2 >= 0) {
                return iAdmob2;
            }
            C8339l.smaato(AbstractC0653l.vip(iAdmob2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i & Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (interfaceC5100l == null) {
            C16946l c16946l2 = C16946l.crashlytics;
            c16946l2.getClass();
            iAdmob = c16946l2.yandex(getClass()).admob(this);
        } else {
            iAdmob = interfaceC5100l.admob(this);
        }
        firebase(iAdmob);
        return iAdmob;
    }
}
