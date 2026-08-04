package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٕؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC2628l extends Handler {
    public WeakReference loadAd;
    public final /* synthetic */ int yandex = 0;

    public HandlerC2628l(C7815l c7815l) {
        this.loadAd = new WeakReference(c7815l);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C5717l c5717l;
        C4568l c4568l;
        AbstractC16531l abstractC16531l;
        C17646l c17646l;
        switch (this.yandex) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.loadAd.get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                C7815l c7815l = (C7815l) this.loadAd.get();
                if (c7815l != null) {
                    SparseArray sparseArray = c7815l.admob;
                    ServiceConnectionC2783l serviceConnectionC2783l = c7815l.subs;
                    ArrayList<InterfaceC8526l> arrayList = serviceConnectionC2783l.f6080l;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    InterfaceC8526l interfaceC8526l = null;
                    InterfaceC8526l interfaceC8526l2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == c7815l.mopub) {
                                c7815l.mopub = 0;
                                if (serviceConnectionC2783l.f6081l == c7815l) {
                                    serviceConnectionC2783l.firebase();
                                }
                            }
                            if (((C7413l) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                C7413l.yandex(null, null);
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (c7815l.billing == 0 && i3 == c7815l.mopub && i4 >= 1) {
                                    c7815l.mopub = 0;
                                    c7815l.billing = i4;
                                    C4300l c4300lYandex = C4300l.yandex(bundle);
                                    if (serviceConnectionC2783l.f6081l == c7815l) {
                                        serviceConnectionC2783l.billing(c4300lYandex);
                                    }
                                    if (serviceConnectionC2783l.f6081l == c7815l) {
                                        serviceConnectionC2783l.f6077l = true;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((InterfaceC8526l) arrayList.get(i5)).loadAd(serviceConnectionC2783l.f6081l);
                                        }
                                        C4658l c4658l = serviceConnectionC2783l.f7558l;
                                        if (c4658l != null) {
                                            C7815l c7815l2 = serviceConnectionC2783l.f6081l;
                                            int i6 = c7815l2.amazon;
                                            c7815l2.amazon = i6 + 1;
                                            c7815l2.loadAd(10, i6, 0, c4658l.yandex, null);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                C7413l c7413l = (C7413l) sparseArray.get(i3);
                                if (c7413l != null) {
                                    sparseArray.remove(i3);
                                    c7413l.loadAd(bundle2);
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((C7413l) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    C7413l.yandex(string, bundle3);
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (c7815l.billing != 0) {
                                    C4300l c4300lYandex2 = C4300l.yandex(bundle4);
                                    if (serviceConnectionC2783l.f6081l == c7815l) {
                                        serviceConnectionC2783l.billing(c4300lYandex2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                C7413l c7413l2 = (C7413l) sparseArray.get(i3);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    c7413l2.loadAd(bundle5);
                                } else {
                                    c7413l2.getClass();
                                    C7413l.yandex("DynamicGroupRouteController is created without valid route id.", bundle5);
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (c7815l.billing != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    C13187l c13187l = bundle7 != null ? new C13187l(bundle7) : null;
                                    ArrayList<Bundle> parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Bundle bundle8 : parcelableArrayList) {
                                        if (bundle8 == null) {
                                            c5717l = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            C13187l c13187l2 = bundle9 != null ? new C13187l(bundle9) : null;
                                            int i7 = bundle8.getInt("selectionState", 1);
                                            bundle8.getBoolean("isUnselectable", false);
                                            bundle8.getBoolean("isGroupable", false);
                                            bundle8.getBoolean("isTransferable", false);
                                            c5717l = new C5717l(c13187l2, i7);
                                        }
                                        arrayList2.add(c5717l);
                                    }
                                    if (serviceConnectionC2783l.f6081l == c7815l) {
                                        for (InterfaceC8526l interfaceC8526l3 : arrayList) {
                                            if (interfaceC8526l3.yandex() == i4) {
                                                interfaceC8526l2 = interfaceC8526l3;
                                                if (interfaceC8526l2 instanceof C5939l) {
                                                    ((C5939l) interfaceC8526l2).isPro(c13187l, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (interfaceC8526l2 instanceof C5939l) {
                                            ((C5939l) interfaceC8526l2).isPro(c13187l, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (serviceConnectionC2783l.f6081l == c7815l) {
                                for (InterfaceC8526l interfaceC8526l4 : arrayList) {
                                    if (interfaceC8526l4.yandex() == i4) {
                                        interfaceC8526l = interfaceC8526l4;
                                        c4568l = serviceConnectionC2783l.f6075l;
                                        if (c4568l != null && (interfaceC8526l instanceof AbstractC16531l)) {
                                            abstractC16531l = (AbstractC16531l) interfaceC8526l;
                                            c17646l = (C17646l) ((C8961l) c4568l.f9268l).amazon;
                                            if (c17646l.purchase == abstractC16531l) {
                                                c17646l.isPro(c17646l.crashlytics(), 2, true);
                                            }
                                        }
                                        if (interfaceC8526l != null) {
                                            arrayList.remove(interfaceC8526l);
                                            interfaceC8526l.crashlytics();
                                            serviceConnectionC2783l.smaato();
                                        }
                                        break;
                                    }
                                }
                                c4568l = serviceConnectionC2783l.f6075l;
                                if (c4568l != null) {
                                    abstractC16531l = (AbstractC16531l) interfaceC8526l;
                                    c17646l = (C17646l) ((C8961l) c4568l.f9268l).amazon;
                                    if (c17646l.purchase == abstractC16531l) {
                                        c17646l.isPro(c17646l.crashlytics(), 2, true);
                                    }
                                }
                                if (interfaceC8526l != null) {
                                    arrayList.remove(interfaceC8526l);
                                    interfaceC8526l.crashlytics();
                                    serviceConnectionC2783l.smaato();
                                }
                            }
                            break;
                    }
                    int i8 = ServiceConnectionC2783l.f6073l;
                }
                break;
        }
    }

    public /* synthetic */ HandlerC2628l() {
    }
}
