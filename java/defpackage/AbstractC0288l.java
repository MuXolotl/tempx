package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: lؙْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0288l extends AbstractC12570l {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected C10096l zzc;

    public AbstractC0288l() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = C10096l.billing;
    }

    public static final boolean adcel(AbstractC0288l abstractC0288l, boolean z) {
        byte bByteValue = ((Byte) abstractC0288l.subscription(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zPurchase = C8307l.crashlytics.yandex(abstractC0288l.getClass()).purchase(abstractC0288l);
        if (z) {
            abstractC0288l.subscription(2);
        }
        return zPurchase;
    }

    public static void ads(AbstractC0288l abstractC0288l) throws C9893l {
        if (abstractC0288l != null && !adcel(abstractC0288l, true)) {
            throw new C1408l().yandex();
        }
    }

    public static void metrica(Class cls, AbstractC0288l abstractC0288l) {
        abstractC0288l.admob();
        zze.put(cls, abstractC0288l);
    }

    public static AbstractC0288l purchase(AbstractC0288l abstractC0288l, byte[] bArr, C11337l c11337l) throws C9893l {
        int length = bArr.length;
        if (length != 0) {
            AbstractC0288l abstractC0288lSubs = abstractC0288l.subs();
            try {
                InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex(abstractC0288lSubs.getClass());
                interfaceC12940lYandex.billing(abstractC0288lSubs, bArr, 0, length, new C16292l(c11337l));
                interfaceC12940lYandex.loadAd(abstractC0288lSubs);
                abstractC0288l = abstractC0288lSubs;
            } catch (IndexOutOfBoundsException unused) {
                C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (C1408l e) {
                throw e.yandex();
            } catch (C9893l e2) {
                if (e2.f20129l) {
                    throw new C9893l(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof C9893l) {
                    throw ((C9893l) e3.getCause());
                }
                throw new C9893l(e3.getMessage(), e3);
            }
        }
        ads(abstractC0288l);
        return abstractC0288l;
    }

    public static Object startapp(Method method, AbstractC0288l abstractC0288l, Object... objArr) {
        try {
            return method.invoke(abstractC0288l, objArr);
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

    public static AbstractC0288l vip(Class cls) {
        Map map = zze;
        AbstractC0288l abstractC0288l = (AbstractC0288l) map.get(cls);
        if (abstractC0288l == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0288l = (AbstractC0288l) map.get(cls);
            } catch (ClassNotFoundException e) {
                C4875l.remoteconfig("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC0288l != null) {
            return abstractC0288l;
        }
        AbstractC0288l abstractC0288l2 = (AbstractC0288l) ((AbstractC0288l) AbstractC1823l.amazon(cls)).subscription(6);
        if (abstractC0288l2 != null) {
            map.put(cls, abstractC0288l2);
            return abstractC0288l2;
        }
        C18073l.admob();
        return null;
    }

    public final void admob() {
        this.zzb &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final void billing(AbstractC10908l abstractC10908l) {
        InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex(getClass());
        C15714l c15714l = abstractC10908l.yandex;
        if (c15714l == null) {
            c15714l = new C15714l();
            c15714l.f30857l = abstractC10908l;
            abstractC10908l.yandex = c15714l;
        }
        interfaceC12940lYandex.crashlytics(this, c15714l);
    }

    @Override // defpackage.AbstractC12570l
    public final int crashlytics(InterfaceC12940l interfaceC12940l) {
        if (mopub()) {
            int iAmazon = interfaceC12940l.amazon(this);
            if (iAmazon >= 0) {
                return iAmazon;
            }
            C11586l.loadAd(String.valueOf(iAmazon).length() + 42, iAmazon);
            return 0;
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iAmazon2 = interfaceC12940l.amazon(this);
        if (iAmazon2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | iAmazon2;
            return iAmazon2;
        }
        C11586l.loadAd(String.valueOf(iAmazon2).length() + 42, iAmazon2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C8307l.crashlytics.yandex(getClass()).subs(this, (AbstractC0288l) obj);
    }

    public final AbstractC10050l firebase() {
        AbstractC10050l abstractC10050l = (AbstractC10050l) subscription(5);
        abstractC10050l.purchase(this);
        return abstractC10050l;
    }

    public final int hashCode() {
        if (mopub()) {
            return C8307l.crashlytics.yandex(getClass()).mopub(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMopub = C8307l.crashlytics.yandex(getClass()).mopub(this);
        this.zza = iMopub;
        return iMopub;
    }

    public final AbstractC10050l isPro() {
        return (AbstractC10050l) subscription(5);
    }

    public final boolean mopub() {
        return (this.zzb & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final int remoteconfig() {
        if (mopub()) {
            int iAmazon = C8307l.crashlytics.yandex(getClass()).amazon(this);
            if (iAmazon >= 0) {
                return iAmazon;
            }
            C11586l.loadAd(String.valueOf(iAmazon).length() + 42, iAmazon);
            return 0;
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iAmazon2 = C8307l.crashlytics.yandex(getClass()).amazon(this);
        if (iAmazon2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | iAmazon2;
            return iAmazon2;
        }
        C11586l.loadAd(String.valueOf(iAmazon2).length() + 42, iAmazon2);
        return 0;
    }

    public final void smaato() {
        this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final AbstractC0288l subs() {
        return (AbstractC0288l) subscription(4);
    }

    public abstract Object subscription(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC17135l.yandex;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC17135l.loadAd(this, sb, 0);
        return sb.toString();
    }
}
