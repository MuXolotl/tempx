package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: lؘؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1663l implements InterfaceC11220l {
    public final C2182l amazon;
    public final C10596l crashlytics;
    public final C14232l loadAd;
    public final C15053l purchase;
    public final C11969l yandex;
    public final Object billing = new Object();
    public final LinkedHashSet mopub = new LinkedHashSet();

    public C1663l(C11969l c11969l, C14232l c14232l, C10596l c10596l, C2182l c2182l, C15053l c15053l) {
        this.yandex = c11969l;
        this.loadAd = c14232l;
        this.crashlytics = c10596l;
        this.amazon = c2182l;
        this.purchase = c15053l;
    }

    public final void loadAd(C7276l c7276l) {
        Log.d("CXCP", c7276l + " finalized");
        synchronized (this.billing) {
            this.mopub.remove(c7276l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147 A[SYNTHETIC] */
    public final Object yandex(C7931l c7931l, AbstractC0283l abstractC0283l) {
        C13139l c13139l;
        C7931l c7931l2;
        InterfaceC15754l interfaceC15754l;
        SessionConfiguration sessionConfiguration;
        OutputConfiguration outputConfiguration;
        InterfaceC12533l interfaceC12533l;
        CaptureRequest.Builder builderYandex;
        Integer num;
        Object key;
        Object value;
        CaptureRequest.Key key2;
        C7931l c7931l3 = c7931l;
        if (abstractC0283l instanceof C13139l) {
            c13139l = (C13139l) abstractC0283l;
            int i = c13139l.f25690l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13139l.f25690l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13139l = new C13139l(this, abstractC0283l);
            }
        } else {
            c13139l = new C13139l(this, abstractC0283l);
        }
        Object objLoadAd = c13139l.f25686l;
        int i2 = c13139l.f25690l;
        C14232l c14232l = this.loadAd;
        int i3 = 1;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            if (Build.VERSION.SDK_INT < 35) {
                return new C7509l(0);
            }
            String str = c7931l3.yandex;
            c13139l.f25689l = c7931l3;
            c13139l.f25690l = 1;
            objLoadAd = c14232l.loadAd(str, c13139l);
            if (objLoadAd != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            c7931l3 = c13139l.f25689l;
            AbstractC2829l.crashlytics(objLoadAd);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sessionConfiguration = (SessionConfiguration) c13139l.f25691l;
            interfaceC15754l = c13139l.f25688l;
            c7931l2 = c13139l.f25689l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        interfaceC12533l = (InterfaceC12533l) objLoadAd;
        if (interfaceC12533l != null) {
            builderYandex = ((C12301l) interfaceC12533l).yandex(c7931l2.billing);
        } else {
            builderYandex = null;
        }
        if (builderYandex != null) {
            for (Map.Entry entry : c7931l2.mopub.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (key instanceof CaptureRequest.Key) {
                    key2 = (CaptureRequest.Key) key;
                } else {
                    key2 = null;
                }
                if (key2 != null) {
                    builderYandex.set(key2, value);
                }
            }
            sessionConfiguration.setSessionParameters(builderYandex.build());
        }
        if (interfaceC15754l != null) {
            num = new Integer(interfaceC15754l.yandex(sessionConfiguration).f28392l);
        } else {
            num = null;
        }
        return num != null ? new C7509l(num.intValue()) : new C7509l(0);
        InterfaceC15754l interfaceC15754l2 = (InterfaceC15754l) objLoadAd;
        int i4 = c7931l3.admob;
        String str2 = c7931l3.yandex;
        if (i4 == 0) {
            i3 = 0;
        } else if (i4 != 1) {
            if (i4 == 2) {
                Log.i("CXCP", "Unsupported session mode: " + ((Object) C10053l.admob(c7931l3.admob)));
                return new C7509l(0);
            }
            i3 = i4;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c7931l3.loadAd.iterator();
        while (it.hasNext()) {
            for (AbstractC2371l abstractC2371l : ((C4069l) it.next()).yandex) {
                int i5 = abstractC2371l.loadAd;
                String str3 = abstractC2371l.crashlytics;
                C5819l c5819lFirebase = C11140l.firebase(null, Integer.valueOf(i5), C15617l.f30511l, abstractC2371l.amazon, abstractC2371l.purchase, abstractC2371l.billing, abstractC2371l.admob, abstractC2371l.yandex, false, 0, !(str3 == null ? false : str3.equals(str2)) ? str3 : null, 1536);
                if (c5819lFirebase != null && (outputConfiguration = (OutputConfiguration) c5819lFirebase.mo842while(AbstractC18202l.yandex.loadAd(OutputConfiguration.class))) != null) {
                    linkedHashSet.add(outputConfiguration);
                }
            }
        }
        SessionConfiguration sessionConfigurationLoadAd = AbstractC9819l.loadAd(i3, AbstractC16901l.m4213const(linkedHashSet));
        c13139l.f25689l = c7931l3;
        c13139l.f25688l = interfaceC15754l2;
        c13139l.f25691l = sessionConfigurationLoadAd;
        c13139l.f25690l = 2;
        Object objCrashlytics = c14232l.crashlytics(str2, c13139l);
        if (objCrashlytics != enumC9342l) {
            c7931l2 = c7931l3;
            interfaceC15754l = interfaceC15754l2;
            objLoadAd = objCrashlytics;
            sessionConfiguration = sessionConfigurationLoadAd;
            interfaceC12533l = (InterfaceC12533l) objLoadAd;
            if (interfaceC12533l != null) {
                builderYandex = ((C12301l) interfaceC12533l).yandex(c7931l2.billing);
            } else {
                builderYandex = null;
            }
            if (builderYandex != null) {
                while (r3.hasNext()) {
                    key = entry.getKey();
                    value = entry.getValue();
                    if (key instanceof CaptureRequest.Key) {
                        key2 = (CaptureRequest.Key) key;
                    } else {
                        key2 = null;
                    }
                    if (key2 != null) {
                        builderYandex.set(key2, value);
                    }
                }
                sessionConfiguration.setSessionParameters(builderYandex.build());
            }
            if (interfaceC15754l != null) {
                num = new Integer(interfaceC15754l.yandex(sessionConfiguration).f28392l);
            } else {
                num = null;
            }
            if (num != null) {
            }
        }
        return enumC9342l;
    }
}
