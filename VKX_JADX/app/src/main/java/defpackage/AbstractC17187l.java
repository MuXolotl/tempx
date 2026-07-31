package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: lٗٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17187l extends AbstractC6909l {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected C6378l zzc;

    public AbstractC17187l() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = C6378l.purchase;
    }

    public static Object admob(Method method, AbstractC17187l abstractC17187l, Object... objArr) {
        try {
            return method.invoke(abstractC17187l, objArr);
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

    public static AbstractC17187l billing(Class cls) {
        Map map = zzd;
        AbstractC17187l abstractC17187l = (AbstractC17187l) map.get(cls);
        if (abstractC17187l == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC17187l = (AbstractC17187l) map.get(cls);
            } catch (ClassNotFoundException e) {
                C4875l.remoteconfig("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC17187l != null) {
            return abstractC17187l;
        }
        AbstractC17187l abstractC17187l2 = (AbstractC17187l) ((AbstractC17187l) AbstractC1851l.purchase(cls)).subs(6, null);
        if (abstractC17187l2 != null) {
            map.put(cls, abstractC17187l2);
            return abstractC17187l2;
        }
        C18073l.admob();
        return null;
    }

    public static void mopub(Class cls, AbstractC17187l abstractC17187l) {
        abstractC17187l.firebase();
        zzd.put(cls, abstractC17187l);
    }

    public final void amazon() {
        this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final AbstractC1506l crashlytics() {
        return (AbstractC1506l) subs(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C12765l.crashlytics.yandex(getClass()).amazon(this, (AbstractC17187l) obj);
    }

    public final void firebase() {
        this.zzb &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final int hashCode() {
        if (isPro()) {
            return C12765l.crashlytics.yandex(getClass()).purchase(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iPurchase = C12765l.crashlytics.yandex(getClass()).purchase(this);
        this.zza = iPurchase;
        return iPurchase;
    }

    public final boolean isPro() {
        return (this.zzb & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final int purchase() {
        if (isPro()) {
            int iLoadAd = C12765l.crashlytics.yandex(getClass()).loadAd(this);
            if (iLoadAd >= 0) {
                return iLoadAd;
            }
            C11586l.loadAd(String.valueOf(iLoadAd).length() + 42, iLoadAd);
            return 0;
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iLoadAd2 = C12765l.crashlytics.yandex(getClass()).loadAd(this);
        if (iLoadAd2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | iLoadAd2;
            return iLoadAd2;
        }
        C11586l.loadAd(String.valueOf(iLoadAd2).length() + 42, iLoadAd2);
        return 0;
    }

    public abstract Object subs(int i, AbstractC17187l abstractC17187l);

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC16969l.yandex;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC16969l.loadAd(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.AbstractC6909l
    public final int yandex(InterfaceC0101l interfaceC0101l) {
        if (isPro()) {
            int iLoadAd = interfaceC0101l.loadAd(this);
            if (iLoadAd >= 0) {
                return iLoadAd;
            }
            C11586l.loadAd(String.valueOf(iLoadAd).length() + 42, iLoadAd);
            return 0;
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iLoadAd2 = interfaceC0101l.loadAd(this);
        if (iLoadAd2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | iLoadAd2;
            return iLoadAd2;
        }
        C11586l.loadAd(String.valueOf(iLoadAd2).length() + 42, iLoadAd2);
        return 0;
    }
}
