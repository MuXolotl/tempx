package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lؑۦؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0708l implements InterfaceC0930l, InterfaceC17883l {
    public C7504l adcel;
    public final Integer admob;
    public final C14338l amazon;
    public InterfaceC16983l billing;
    public final C15161l crashlytics;
    public final boolean firebase;
    public final Integer isPro;
    public final InterfaceC4446l loadAd;
    public C9426l metrica;
    public Rational mopub;
    public final InterfaceC4902l purchase;
    public final ArrayList remoteconfig;
    public final ArrayList smaato;
    public C7504l startapp;
    public final Integer subs;
    public C9426l vip;
    public final C15736l yandex;

    public C0708l(C15736l c15736l, InterfaceC4446l interfaceC4446l, C15161l c15161l, C14338l c14338l, InterfaceC4902l interfaceC4902l) {
        ArrayList arrayList;
        Object next;
        this.yandex = c15736l;
        this.loadAd = interfaceC4446l;
        this.crashlytics = c15161l;
        this.amazon = c14338l;
        this.purchase = interfaceC4902l;
        InterfaceC5389l interfaceC5389l = c15736l.loadAd;
        Object obj = 0;
        Object objCrashlytics = ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        this.admob = (Integer) (objCrashlytics == null ? obj : objCrashlytics);
        Object objCrashlytics2 = ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        this.subs = (Integer) (objCrashlytics2 == null ? obj : objCrashlytics2);
        Object objCrashlytics3 = ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        this.isPro = (Integer) (objCrashlytics3 != null ? objCrashlytics3 : 0);
        InterfaceC5389l.admob.getClass();
        this.firebase = C11905l.yandex(interfaceC5389l);
        int[] iArr = (int[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = C6558l.loadAd;
                arrayList.add(AbstractC6725l.loadAd(i));
            }
        } else {
            arrayList = null;
        }
        this.smaato = arrayList;
        int[] iArr2 = (int[]) ((C10861l) this.yandex.loadAd).crashlytics(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            ArrayList arrayList3 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = C7514l.loadAd.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((C7514l) next).yandex != i2);
                arrayList3.add((C7514l) next);
            }
            arrayList2 = arrayList3;
        }
        this.remoteconfig = arrayList2;
    }

    public final Rational crashlytics() {
        Rational rational = this.mopub;
        if (rational != null) {
            return rational;
        }
        InterfaceC4902l interfaceC4902l = this.purchase;
        return new Rational(interfaceC4902l.isPro().width(), interfaceC4902l.isPro().height());
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.billing = interfaceC16983l;
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        this.mopub = null;
        C9426l c9426l = new C9426l();
        InterfaceC16983l interfaceC16983l = this.billing;
        if (interfaceC16983l == null) {
            AbstractC14814l.isVip("Camera is not active.", c9426l);
            return;
        }
        C7504l c7504l = this.startapp;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        C7504l c7504l2 = this.adcel;
        if (c7504l2 != null) {
            c7504l2.ads(null);
        }
        C9426l c9426l2 = this.metrica;
        if (c9426l2 != null) {
            AbstractC14814l.isVip("Cancelled by another cancelFocusAndMetering()", c9426l2);
        }
        this.metrica = c9426l;
        C9426l c9426l3 = this.vip;
        if (c9426l3 != null) {
            AbstractC14814l.isVip("Cancelled by cancelFocusAndMetering()", c9426l3);
        }
        C15161l c15161l = this.crashlytics;
        synchronized (c15161l.amazon) {
            c15161l.smaato = null;
            Unit unit = Unit.INSTANCE;
        }
        c15161l.billing();
        AbstractC0140l.vip(interfaceC16983l.firebase(), c9426l);
    }

    @Override // defpackage.InterfaceC17883l
    public final void yandex(LinkedHashSet linkedHashSet) {
        Size sizeCrashlytics;
        this.mopub = null;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
            if ((abstractC6896l instanceof C0527l) && (sizeCrashlytics = ((C0527l) abstractC6896l).crashlytics()) != null) {
                this.mopub = new Rational(sizeCrashlytics.getWidth(), sizeCrashlytics.getHeight());
            }
        }
    }
}
