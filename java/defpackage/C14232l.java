package defpackage;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓٙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14232l {
    public final LinkedHashMap admob;
    public final InterfaceC15897l amazon;
    public final Object billing;
    public final C10393l crashlytics;
    public final C8084l firebase;
    public final int isPro;
    public final C11969l loadAd;
    public ArrayList mopub;
    public final C18662l purchase;
    public final C8688l smaato;
    public final LinkedHashMap subs;
    public final InterfaceC15897l yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
    public C14232l(InterfaceC15897l interfaceC15897l, C11969l c11969l, PackageManager packageManager, C10393l c10393l, InterfaceC15897l interfaceC15897l2, C5172l c5172l, InterfaceC7042l interfaceC7042l) {
        this.yandex = interfaceC15897l;
        this.loadAd = c11969l;
        this.crashlytics = c10393l;
        this.amazon = interfaceC15897l2;
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(new C2993l(interfaceC7042l), c11969l.billing).mo246l(new C0499l("Camera2DeviceCache")));
        this.purchase = c18662lYandex;
        this.billing = new Object();
        this.admob = new LinkedHashMap();
        this.subs = new LinkedHashMap();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        this.isPro = i;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i);
        c5172l.crashlytics(2, new RunnableC16112l(10, this));
        InterfaceC6942l interfaceC6942lIsPro = AbstractC0622l.isPro(AbstractC0622l.amazon(new C5163l(this, null, 24)));
        C12051l c12051l = new C12051l(Long.MAX_VALUE);
        C11522l c11522lAmazon = AbstractC16829l.amazon(interfaceC6942lIsPro);
        C8490l c8490lYandex = AbstractC3861l.yandex(1, c11522lAmazon.loadAd, c11522lAmazon.crashlytics);
        this.firebase = new C8084l(c8490lYandex, AbstractC10999l.billing(c12051l.equals(C16110l.yandex) ? 1 : 4, (InterfaceC12932l) c11522lAmazon.purchase, c18662lYandex, new C0384l(c12051l, (InterfaceC6942l) c11522lAmazon.amazon, c8490lYandex, AbstractC3861l.yandex, (InterfaceC14029l) null, 20)));
        this.smaato = new C8688l(new C9636l(28, this));
    }

    public static void purchase(C12428l c12428l, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (AbstractC0676l.billing(c12428l, arrayList) instanceof C15230l) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    public static final void yandex(C14232l c14232l, C12428l c12428l, String str, boolean z) {
        ArrayList arrayList;
        synchronized (c14232l.billing) {
            arrayList = c14232l.mopub;
        }
        ArrayList arrayListAmazon = null;
        if (z) {
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        Log.i("CXCP", "New camera " + str + " detected");
                        arrayListAmazon = c14232l.amazon();
                        break;
                    }
                } while (!AbstractC8576l.yandex(((C10160l) it.next()).yandex, str));
            } else {
                Log.i("CXCP", "New camera " + str + " detected");
                arrayListAmazon = c14232l.amazon();
                break;
            }
        } else {
            if (z) {
                C18725l.billing();
                return;
            }
            if (arrayList == null) {
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayListAmazon = c14232l.amazon();
                break;
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (AbstractC8576l.yandex(((C10160l) it2.next()).yandex, str)) {
                        Log.i("CXCP", "Unavailable camera " + str + " detected");
                        arrayListAmazon = c14232l.amazon();
                        break;
                    }
                }
            }
        }
        if (arrayListAmazon != null && (arrayListAmazon.size() >= c14232l.isPro || arrayList == null)) {
            arrayList = arrayListAmazon;
        }
        if (arrayList != null) {
            purchase(c12428l, arrayList);
        }
    }

    public final ArrayList amazon() {
        try {
            String[] cameraIdList = ((CameraManager) this.yandex.get()).getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                C10160l.yandex(str);
                arrayList.add(new C10160l(str));
            }
            if (arrayList.size() < this.isPro) {
                Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
                return arrayList;
            }
            synchronized (this.billing) {
                this.mopub = arrayList;
                Unit unit = Unit.INSTANCE;
            }
            Log.i("CXCP", "Loaded CameraIdList " + arrayList);
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(String str, AbstractC0283l abstractC0283l) {
        C6437l c6437l;
        InterfaceC1142l interfaceC1142l;
        if (abstractC0283l instanceof C6437l) {
            c6437l = (C6437l) abstractC0283l;
            int i = c6437l.f13462l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6437l.f13462l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6437l = new C6437l(this, abstractC0283l);
            }
        } else {
            c6437l = new C6437l(this, abstractC0283l);
        }
        Object objM832l = c6437l.f13465l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c6437l.f13462l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM832l);
            synchronized (this.billing) {
                try {
                    LinkedHashMap linkedHashMap = this.subs;
                    C10160l c10160l = new C10160l(str);
                    Object objCrashlytics = linkedHashMap.get(c10160l);
                    if (objCrashlytics == null) {
                        objCrashlytics = AbstractC10999l.crashlytics(2, this.loadAd.amazon, this.purchase, new C2099l(str, this, null));
                        linkedHashMap.put(c10160l, objCrashlytics);
                    }
                    interfaceC1142l = (InterfaceC1142l) objCrashlytics;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c6437l.f13464l = str;
            c6437l.f13463l = interfaceC1142l;
            c6437l.f13462l = 1;
            objM832l = interfaceC1142l.m832l(c6437l);
            if (objM832l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC1142l interfaceC1142l2 = c6437l.f13463l;
            String str2 = c6437l.f13464l;
            AbstractC2829l.crashlytics(objM832l);
            interfaceC1142l = interfaceC1142l2;
            str = str2;
        }
        InterfaceC12533l interfaceC12533l = (InterfaceC12533l) objM832l;
        if (interfaceC12533l != null) {
            return interfaceC12533l;
        }
        Log.d("CXCP", "Removing null camera2DeviceSetupWrapper from cache for " + ((Object) C10160l.loadAd(str)));
        synchronized (this.billing) {
            Map.EL.remove(this.subs, new C10160l(str), interfaceC1142l);
        }
        return interfaceC12533l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(String str, AbstractC0283l abstractC0283l) {
        C2386l c2386l;
        InterfaceC1142l interfaceC1142l;
        if (abstractC0283l instanceof C2386l) {
            c2386l = (C2386l) abstractC0283l;
            int i = c2386l.f5152l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2386l.f5152l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2386l = new C2386l(this, abstractC0283l);
            }
        } else {
            c2386l = new C2386l(this, abstractC0283l);
        }
        Object objM832l = c2386l.f5155l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c2386l.f5152l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM832l);
            if (Build.VERSION.SDK_INT < 35) {
                return null;
            }
            synchronized (this.billing) {
                try {
                    LinkedHashMap linkedHashMap = this.admob;
                    C10160l c10160l = new C10160l(str);
                    Object objCrashlytics = linkedHashMap.get(c10160l);
                    if (objCrashlytics == null) {
                        objCrashlytics = AbstractC10999l.crashlytics(2, this.loadAd.amazon, this.purchase, new C13624l(str, this, interfaceC14029l, 7));
                        linkedHashMap.put(c10160l, objCrashlytics);
                    }
                    interfaceC1142l = (InterfaceC1142l) objCrashlytics;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2386l.f5154l = str;
            c2386l.f5153l = interfaceC1142l;
            c2386l.f5152l = 1;
            objM832l = interfaceC1142l.m832l(c2386l);
            if (objM832l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC1142l interfaceC1142l2 = c2386l.f5153l;
            String str2 = c2386l.f5154l;
            AbstractC2829l.crashlytics(objM832l);
            interfaceC1142l = interfaceC1142l2;
            str = str2;
        }
        InterfaceC15754l interfaceC15754l = (InterfaceC15754l) objM832l;
        if (interfaceC15754l != null) {
            return interfaceC15754l;
        }
        Log.d("CXCP", "Removing null CameraDeviceSetupCompat from cache for " + ((Object) C10160l.loadAd(str)));
        synchronized (this.billing) {
            Map.EL.remove(this.admob, new C10160l(str), interfaceC1142l);
        }
        return interfaceC15754l;
    }
}
