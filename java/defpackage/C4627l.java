package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: lْؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4627l implements Handler.Callback {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9401l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9402l;

    public /* synthetic */ C4627l(int i, Object obj) {
        this.f9402l = i;
        this.f9401l = obj;
    }

    private final boolean loadAd(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i);
        }
        ServiceConnectionC16475l serviceConnectionC16475l = (ServiceConnectionC16475l) this.f9401l;
        synchronized (serviceConnectionC16475l) {
            try {
                C7075l c7075l = (C7075l) serviceConnectionC16475l.f32203l.get(i);
                if (c7075l == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                serviceConnectionC16475l.f32203l.remove(i);
                serviceConnectionC16475l.crashlytics();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    c7075l.loadAd(new C10756l(16, "Not supported by GmsCore", null));
                    return true;
                }
                switch (c7075l.purchase) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            c7075l.crashlytics(null);
                            return true;
                        }
                        c7075l.loadAd(new C10756l(16, "Invalid response to one way request", null));
                        return true;
                    default:
                        Bundle bundle = data.getBundle("data");
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        c7075l.crashlytics(bundle);
                        return true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean yandex(Message message) {
        if (message.what != 0) {
            return false;
        }
        C13577l c13577l = (C13577l) this.f9401l;
        if (message.obj != null) {
            C18725l.loadAd();
            return false;
        }
        synchronized (c13577l.f26595l) {
            throw null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f9402l) {
            case 0:
                return yandex(message);
            case 1:
                return loadAd(message);
            default:
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    C13304l c13304l = (C13304l) this.f9401l;
                    synchronized (c13304l.yandex) {
                        try {
                            C5219l c5219l = (C5219l) message.obj;
                            ServiceConnectionC14198l serviceConnectionC14198l = (ServiceConnectionC14198l) c13304l.yandex.get(c5219l);
                            if (serviceConnectionC14198l != null && serviceConnectionC14198l.f27790l == 3) {
                                String strValueOf = String.valueOf(c5219l);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                                sb.append("Timeout waiting for ServiceConnection callback ");
                                sb.append(strValueOf);
                                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                                ComponentName componentName = serviceConnectionC14198l.f27794l;
                                if (componentName == null) {
                                    c5219l.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = c5219l.loadAd;
                                    AbstractC1051l.subs(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                serviceConnectionC14198l.onServiceDisconnected(componentName);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                } else {
                    C13304l c13304l2 = (C13304l) this.f9401l;
                    synchronized (c13304l2.yandex) {
                        try {
                            C5219l c5219l2 = (C5219l) message.obj;
                            ServiceConnectionC14198l serviceConnectionC14198l2 = (ServiceConnectionC14198l) c13304l2.yandex.get(c5219l2);
                            if (serviceConnectionC14198l2 != null && serviceConnectionC14198l2.f27791l.isEmpty()) {
                                if (serviceConnectionC14198l2.f27788l) {
                                    C5219l c5219l3 = serviceConnectionC14198l2.f27792l;
                                    C13304l c13304l3 = serviceConnectionC14198l2.f27789l;
                                    c13304l3.crashlytics.removeMessages(1, c5219l3);
                                    c13304l3.amazon.crashlytics(c13304l3.loadAd, serviceConnectionC14198l2);
                                    serviceConnectionC14198l2.f27788l = false;
                                    serviceConnectionC14198l2.f27790l = 2;
                                }
                                c13304l2.yandex.remove(c5219l2);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return true;
        }
    }
}
