package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: lًؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7847l implements InterfaceC10162l, InterfaceC11545l, InterfaceC10377l, InterfaceC16013l, InterfaceC1953l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f16369l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f16370l;

    public C7847l(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f16370l = new Messenger(iBinder);
            this.f16369l = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f16369l = new C1882l(iBinder);
            this.f16370l = null;
        }
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C2350l c2350l = (C2350l) obj2;
        C16014l c16014l = (C16014l) this.f16370l;
        String str = (String) this.f16369l;
        C4184l c4184l = (C4184l) obj;
        AbstractC1051l.firebase("Not connected to device", c16014l.f31393throws == 3);
        C10567l c10567l = (C10567l) c4184l.metrica();
        C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
        Parcel parcelM743l = c10567l.m743l();
        parcelM743l.writeString(str);
        AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
        c10567l.m747l(parcelM743l, 5);
        synchronized (c16014l.subscription) {
            try {
                if (c16014l.startapp != null) {
                    c2350l.yandex(AbstractC5578l.amazon(new Status(2001, null, null, null)));
                } else {
                    c16014l.startapp = c2350l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        if ((exc instanceof C3890l) && ((C3890l) exc).f8033l.f584l == 8003) {
            return;
        }
        ((C1062l) this.f16369l).firebase((String) this.f16370l);
    }

    public void crashlytics(C7502l c7502l, C12418l c12418l) {
        C1599l c1599l = new C1599l(c12418l);
        TreeMap treeMap = (TreeMap) this.f16370l;
        for (Integer num : treeMap.keySet()) {
            C17235l c17235lYandex = ((C17235l) c12418l.f24518l).clone();
            InterfaceC2167l interfaceC2167lYandex = ((C2118l) treeMap.get(num)).yandex(c7502l, Collections.singletonList(c1599l));
            int iFirebase = interfaceC2167lYandex instanceof C14259l ? AbstractC13831l.firebase(((C14259l) interfaceC2167lYandex).f27857l.doubleValue()) : -1;
            if (iFirebase == 2 || iFirebase == -1) {
                c12418l.f24518l = c17235lYandex;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f16369l;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC2167l interfaceC2167lYandex2 = ((C2118l) treeMap2.get((Integer) it.next())).yandex(c7502l, Collections.singletonList(c1599l));
            if (interfaceC2167lYandex2 instanceof C14259l) {
                AbstractC13831l.firebase(((C14259l) interfaceC2167lYandex2).f27857l.doubleValue());
            }
        }
    }

    public String loadAd() {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) this.f16370l;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                C8339l.metrica("Invalid application ID: ".concat(str));
                return null;
            }
            sb.append("/");
            sb.append(upperCase);
        }
        Collection<String> collection = (Collection) this.f16369l;
        boolean z = false;
        if (collection != null) {
            if (collection.isEmpty()) {
                C8339l.metrica("Must specify at least one namespace");
                return null;
            }
            boolean z2 = str != null;
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z3 = true;
            for (String string : collection) {
                AbstractC15091l.loadAd(string);
                if (!z3) {
                    sb.append(",");
                }
                if (!AbstractC15091l.yandex.matcher(string).matches()) {
                    StringBuilder sb2 = new StringBuilder(string.length());
                    for (int i = 0; i < string.length(); i++) {
                        char cCharAt = string.charAt(i);
                        if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                z3 = false;
            }
            z = z2;
        } else if (str != null) {
            z = true;
        }
        if (true != z && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        ((Map) ((C5633l) this.f16369l).f11985l).remove((C2350l) this.f16370l);
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        boolean z = c3823l.subs() instanceof C1981l;
        C13658l c13658l = (C13658l) this.f16369l;
        C1539l c1539l = (C1539l) this.f16370l;
        if (z) {
            return c1539l.billing(c13658l.tapsense());
        }
        if (c3823l.subs() instanceof C3890l) {
            C3890l c3890l = (C3890l) c3823l.subs();
            c3890l.getClass();
            if (c3890l.f8033l.f584l == 29514) {
                return c1539l.billing(c13658l.tapsense());
            }
        }
        return c3823l;
    }

    @Override // defpackage.InterfaceC16013l
    public void yandex(Bitmap bitmap) {
        C5633l c5633l = (C5633l) this.f16370l;
        c5633l.f11985l = bitmap;
        C13445l c13445l = (C13445l) this.f16369l;
        c13445l.smaato = c5633l;
        c13445l.yandex();
    }

    public /* synthetic */ C7847l(Object obj, Object obj2) {
        this.f16370l = obj;
        this.f16369l = obj2;
    }

    public C7847l(C1062l c1062l, String str) {
        this.f16370l = str;
        this.f16369l = c1062l;
    }

    public C7847l() {
        this.f16370l = new TreeMap();
        this.f16369l = new TreeMap();
    }

    public C7847l(C4816l c4816l) {
        this.f16369l = new C15389l();
        this.f16370l = c4816l;
        C8565l.isVip();
    }

    public C7847l(C5633l c5633l, C2350l c2350l) {
        this.f16370l = c2350l;
        Objects.requireNonNull(c5633l);
        this.f16369l = c5633l;
    }

    public C7847l(Context context) {
        this.f16370l = context;
    }

    public C7847l(C13445l c13445l, C5633l c5633l) {
        this.f16370l = c5633l;
        Objects.requireNonNull(c13445l);
        this.f16369l = c13445l;
    }
}
