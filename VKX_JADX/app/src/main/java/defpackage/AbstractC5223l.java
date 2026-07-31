package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؗۢؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5223l {
    public final C5128l crashlytics;
    public final C5128l loadAd;
    public final C5128l yandex;

    public AbstractC5223l(C5128l c5128l, C5128l c5128l2, C5128l c5128l3) {
        this.yandex = c5128l;
        this.loadAd = c5128l2;
        this.crashlytics = c5128l3;
    }

    public final InterfaceC12713l admob() {
        String string = ((C9890l) this).purchase.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC12713l) crashlytics(string).invoke(null, yandex());
        } catch (ClassNotFoundException e) {
            C11467l.metrica(e);
            return null;
        } catch (IllegalAccessException e2) {
            C11467l.metrica(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C11467l.metrica(e3);
            return null;
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C11467l.metrica(e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method amazon(Class cls) throws NoSuchMethodException {
        String name = cls.getName();
        C5128l c5128l = this.loadAd;
        Method method = (Method) c5128l.get(name);
        if (method != null) {
            return method;
        }
        Method declaredMethod = loadAd(cls).getDeclaredMethod("write", cls, AbstractC5223l.class);
        c5128l.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final int billing(int i, int i2) {
        return !purchase(i2) ? i : ((C9890l) this).purchase.readInt();
    }

    public final Method crashlytics(String str) throws NoSuchMethodException {
        C5128l c5128l = this.yandex;
        Method method = (Method) c5128l.get(str);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, false, AbstractC5223l.class.getClassLoader()).getDeclaredMethod("read", AbstractC5223l.class);
        c5128l.put(str, declaredMethod);
        return declaredMethod;
    }

    public final void firebase(Parcelable parcelable, int i) {
        subs(i);
        ((C9890l) this).purchase.writeParcelable(parcelable, 0);
    }

    public final void isPro(int i, int i2) {
        subs(i2);
        ((C9890l) this).purchase.writeInt(i);
    }

    public final Class loadAd(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C5128l c5128l = this.crashlytics;
        Class cls2 = (Class) c5128l.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c5128l.put(cls.getName(), cls3);
        return cls3;
    }

    public final Parcelable mopub(Parcelable parcelable, int i) {
        if (!purchase(i)) {
            return parcelable;
        }
        return ((C9890l) this).purchase.readParcelable(C9890l.class.getClassLoader());
    }

    public abstract boolean purchase(int i);

    public final void smaato(InterfaceC12713l interfaceC12713l) {
        if (interfaceC12713l == null) {
            ((C9890l) this).purchase.writeString(null);
            return;
        }
        try {
            ((C9890l) this).purchase.writeString(loadAd(interfaceC12713l.getClass()).getName());
            C9890l c9890lYandex = yandex();
            try {
                amazon(interfaceC12713l.getClass()).invoke(null, interfaceC12713l, c9890lYandex);
                Parcel parcel = c9890lYandex.purchase;
                int i = c9890lYandex.subs;
                if (i >= 0) {
                    int i2 = c9890lYandex.amazon.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                C11467l.metrica(e);
            } catch (IllegalAccessException e2) {
                C11467l.metrica(e2);
            } catch (NoSuchMethodException e3) {
                C11467l.metrica(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                C11467l.metrica(e4);
            }
        } catch (ClassNotFoundException e5) {
            C18073l.Signature(interfaceC12713l.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract void subs(int i);

    public abstract C9890l yandex();
}
