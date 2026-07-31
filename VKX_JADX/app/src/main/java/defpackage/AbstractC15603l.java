package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: lؘُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15603l extends AbstractC1251l {
    private static final Map zzb = new ConcurrentHashMap();
    protected C2886l zzc;
    private int zzd;

    public AbstractC15603l() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C2886l.billing;
    }

    public static void admob(Class cls, AbstractC15603l abstractC15603l) {
        abstractC15603l.mopub();
        zzb.put(cls, abstractC15603l);
    }

    public static Object billing(Method method, AbstractC15603l abstractC15603l, Object... objArr) {
        try {
            return method.invoke(abstractC15603l, objArr);
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

    public static final boolean isPro(AbstractC15603l abstractC15603l, boolean z) {
        byte bByteValue = ((Byte) abstractC15603l.remoteconfig(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zLoadAd = C13940l.crashlytics.yandex(abstractC15603l.getClass()).loadAd(abstractC15603l);
        if (z) {
            abstractC15603l.remoteconfig(2, true == zLoadAd ? abstractC15603l : null);
        }
        return zLoadAd;
    }

    public static AbstractC15603l purchase(Class cls) {
        Map map = zzb;
        AbstractC15603l abstractC15603l = (AbstractC15603l) map.get(cls);
        if (abstractC15603l == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC15603l = (AbstractC15603l) map.get(cls);
            } catch (ClassNotFoundException e) {
                C4875l.remoteconfig("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC15603l != null) {
            return abstractC15603l;
        }
        AbstractC15603l abstractC15603l2 = (AbstractC15603l) ((AbstractC15603l) AbstractC10611l.mopub(cls)).remoteconfig(6, null);
        if (abstractC15603l2 != null) {
            map.put(cls, abstractC15603l2);
            return abstractC15603l2;
        }
        C18073l.admob();
        return null;
    }

    public final AbstractC7986l amazon() {
        return (AbstractC7986l) remoteconfig(5, null);
    }

    public final int crashlytics() {
        if (firebase()) {
            int iAdmob = C13940l.crashlytics.yandex(getClass()).admob(this);
            if (iAdmob >= 0) {
                return iAdmob;
            }
            C8339l.smaato(AbstractC0653l.vip(iAdmob, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iAdmob2 = C13940l.crashlytics.yandex(getClass()).admob(this);
        if (iAdmob2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | iAdmob2;
            return iAdmob2;
        }
        C8339l.smaato(AbstractC0653l.vip(iAdmob2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C13940l.crashlytics.yandex(getClass()).purchase(this, (AbstractC15603l) obj);
    }

    public final boolean firebase() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final int hashCode() {
        if (firebase()) {
            return C13940l.crashlytics.yandex(getClass()).crashlytics(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iCrashlytics = C13940l.crashlytics.yandex(getClass()).crashlytics(this);
        this.zza = iCrashlytics;
        return iCrashlytics;
    }

    @Override // defpackage.AbstractC1251l
    public final int loadAd(InterfaceC12353l interfaceC12353l) {
        if (firebase()) {
            int iAdmob = interfaceC12353l.admob(this);
            if (iAdmob >= 0) {
                return iAdmob;
            }
            C8339l.smaato(AbstractC0653l.vip(iAdmob, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iAdmob2 = interfaceC12353l.admob(this);
        if (iAdmob2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | iAdmob2;
            return iAdmob2;
        }
        C8339l.smaato(AbstractC0653l.vip(iAdmob2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void mopub() {
        this.zzd &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public abstract Object remoteconfig(int i, AbstractC15603l abstractC15603l);

    public final void smaato(C9747l c9747l) {
        InterfaceC12353l interfaceC12353lYandex = C13940l.crashlytics.yandex(getClass());
        C0770l c0770l = c9747l.yandex;
        if (c0770l == null) {
            c0770l = new C0770l(c9747l);
        }
        interfaceC12353lYandex.subs(this, c0770l);
    }

    public final void subs() {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC3620l.yandex;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC3620l.crashlytics(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC16189l
    public final boolean yandex() {
        return isPro(this, true);
    }
}
