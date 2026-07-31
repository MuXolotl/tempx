package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Map;

/* JADX INFO: renamed from: lَؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9992l implements InterfaceC5899l, InterfaceC7299l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC5899l f20389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f20390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20391l = 0;

    public C9992l(TotalCaptureResult totalCaptureResult, String str) {
        this.f20390l = totalCaptureResult;
        this.f20389l = new C15331l(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            Map mapAdcel = i >= 31 ? AbstractC12148l.adcel(totalCaptureResult) : i >= 28 ? AbstractC13950l.advert(totalCaptureResult) : C14054l.f27396l;
            if (mapAdcel != null && !mapAdcel.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(mapAdcel.size());
                for (Map.Entry entry : mapAdcel.entrySet()) {
                    String str2 = (String) entry.getKey();
                    C10160l.yandex(str2);
                    arrayMap.put(new C10160l(str2), new C15331l((CaptureResult) entry.getValue(), str2));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public C15331l admob() {
        return (C15331l) this.f20389l;
    }

    @Override // defpackage.InterfaceC7299l
    public EnumC15027l amazon() {
        C15331l c15331lAdmob = ((C9992l) this.f20389l).admob();
        Integer num = (Integer) c15331lAdmob.f29963l.get(CaptureResult.CONTROL_AWB_STATE);
        if (num != null && num.intValue() == 0) {
            return EnumC15027l.f29549l;
        }
        if (num != null && num.intValue() == 1) {
            return EnumC15027l.f29548l;
        }
        if (num != null && num.intValue() == 2) {
            return EnumC15027l.f29552l;
        }
        if (num != null && num.intValue() == 3) {
            return EnumC15027l.f29551l;
        }
        EnumC15027l enumC15027l = EnumC15027l.f29550l;
        if (num != null && AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) C1266l.yandex(c15331lAdmob.f29963l.getFrameNumber())) + '!');
        }
        return enumC15027l;
    }

    @Override // defpackage.InterfaceC7299l
    public long crashlytics() {
        Object obj = ((C9992l) this.f20389l).admob().f29963l.get(CaptureResult.SENSOR_TIMESTAMP);
        return ((Number) (obj != null ? obj : -1L)).longValue();
    }

    @Override // defpackage.InterfaceC7299l
    public int loadAd() {
        C15331l c15331lAdmob = ((C9992l) this.f20389l).admob();
        Integer num = (Integer) c15331lAdmob.f29963l.get(CaptureResult.FLASH_STATE);
        int i = 2;
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return 3;
            }
            i = 4;
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num != null && AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) C1266l.yandex(c15331lAdmob.f29963l.getFrameNumber())) + '!');
                }
                return 1;
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC7299l
    public EnumC4090l mopub() {
        C15331l c15331lAdmob = ((C9992l) this.f20389l).admob();
        Integer num = (Integer) c15331lAdmob.f29963l.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null && num.intValue() == 0) {
            return EnumC4090l.f8431l;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return EnumC4090l.f8428l;
        }
        if (num != null && num.intValue() == 4) {
            return EnumC4090l.f8435l;
        }
        if (num != null && num.intValue() == 5) {
            return EnumC4090l.f8429l;
        }
        if (num != null && num.intValue() == 2) {
            return EnumC4090l.f8434l;
        }
        if (num != null && num.intValue() == 6) {
            return EnumC4090l.f8433l;
        }
        EnumC4090l enumC4090l = EnumC4090l.f8432l;
        if (num != null && AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) C1266l.yandex(c15331lAdmob.f29963l.getFrameNumber())) + '!');
        }
        return enumC4090l;
    }

    @Override // defpackage.InterfaceC7299l
    public EnumC11672l purchase() {
        C15331l c15331lAdmob = ((C9992l) this.f20389l).admob();
        Integer num = (Integer) c15331lAdmob.f29963l.get(CaptureResult.CONTROL_AE_STATE);
        if (num != null && num.intValue() == 0) {
            return EnumC11672l.f23391l;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return EnumC11672l.f23389l;
        }
        if (num != null && num.intValue() == 4) {
            return EnumC11672l.f23394l;
        }
        if (num != null && num.intValue() == 2) {
            return EnumC11672l.f23393l;
        }
        if (num != null && num.intValue() == 3) {
            return EnumC11672l.f23395l;
        }
        EnumC11672l enumC11672l = EnumC11672l.f23392l;
        if (num != null && AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) C1266l.yandex(c15331lAdmob.f29963l.getFrameNumber())) + '!');
        }
        return enumC11672l;
    }

    public String toString() {
        switch (this.f20391l) {
            case 0:
                StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
                C15331l c15331l = (C15331l) this.f20389l;
                sb.append((Object) C10160l.loadAd(c15331l.f29962l));
                sb.append(", frameNumber: ");
                sb.append(c15331l.f29963l.getFrameNumber());
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        switch (this.f20391l) {
            case 0:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.f20390l;
                C2336l c2336l = AbstractC18202l.yandex;
                if (interfaceC1388l.equals(c2336l.loadAd(CaptureResult.class)) || interfaceC1388l.equals(c2336l.loadAd(TotalCaptureResult.class))) {
                    return totalCaptureResult;
                }
                return null;
            default:
                boolean zEquals = interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(C9992l.class));
                C9992l c9992l = (C9992l) this.f20389l;
                return zEquals ? c9992l : c9992l.mo842while(interfaceC1388l);
        }
    }

    @Override // defpackage.InterfaceC7299l
    public C12920l yandex() {
        return (C12920l) ((InterfaceC10687l) this.f20390l).yandex(AbstractC14471l.yandex, C12920l.loadAd);
    }

    public C9992l(InterfaceC10687l interfaceC10687l, C9992l c9992l) {
        this.f20390l = interfaceC10687l;
        this.f20389l = c9992l;
    }
}
