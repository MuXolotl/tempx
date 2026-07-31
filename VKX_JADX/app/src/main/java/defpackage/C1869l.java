package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؙٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1869l {
    public final ScheduledExecutorServiceC10335l admob;
    public final Set amazon;
    public final List billing;
    public final Range crashlytics;
    public final List loadAd;
    public final C2498l mopub;
    public final List purchase;
    public final boolean subs;
    public final C14671l yandex;

    public C1869l(List list, C14671l c14671l, List list2) {
        boolean z;
        Object next;
        String strConcat;
        String str;
        String str2;
        boolean zMetrica;
        Range range = C5464l.admob;
        this.yandex = c14671l;
        this.loadAd = list2;
        this.crashlytics = range;
        this.amazon = C5746l.f12138l;
        this.purchase = C2580l.f5619l;
        List listM4245throws = AbstractC16901l.m4245throws(list);
        this.billing = listM4245throws;
        this.mopub = new C2498l(7);
        this.admob = AbstractC12272l.admob();
        if (!range.equals(C5464l.admob)) {
            Iterator it = listM4245throws.iterator();
            while (it.hasNext()) {
                if (((AbstractC6896l) it.next()).billing.mo260super()) {
                    C8339l.metrica("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list3 = this.purchase;
        Set set = this.amazon;
        if (!set.isEmpty() || !list3.isEmpty()) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AbstractC5295l) it2.next()).yandex());
            }
            for (EnumC4775l enumC4775l : AbstractC16901l.m4245throws(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : set2) {
                    if (((AbstractC5295l) obj).yandex() == enumC4775l) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() > 1) {
                    C8936l.smaato(arrayList2, "requiredFeatures has conflicting feature values: ");
                    throw null;
                }
            }
            if (AbstractC16901l.m4245throws(list3).size() != list3.size()) {
                C11467l.isPro(41, list3, "Duplicate values in preferredFeatures(");
                throw null;
            }
            LinkedHashSet linkedHashSetM4244throw = AbstractC16901l.m4244throw(set2, list3);
            if (!linkedHashSetM4244throw.isEmpty()) {
                C8936l.smaato(linkedHashSetM4244throw, "requiredFeatures and preferredFeatures have duplicate values: ");
                throw null;
            }
            for (AbstractC6896l abstractC6896l : this.billing) {
                boolean z2 = abstractC6896l instanceof C0527l;
                EnumC15475l enumC15475l = EnumC15475l.f30273l;
                if ((z2 ? EnumC15475l.f30275l : abstractC6896l instanceof C9731l ? EnumC15475l.f30272l : abstractC6896l instanceof C9585l ? EnumC15475l.f30277l : AbstractC5641l.admob(abstractC6896l) ? EnumC15475l.f30276l : abstractC6896l instanceof C10245l ? EnumC15475l.f30278l : enumC15475l) == enumC15475l) {
                    throw new IllegalArgumentException((abstractC6896l + " is not supported with feature group").toString());
                }
                String str3 = abstractC6896l instanceof C0527l ? "Preview" : abstractC6896l instanceof C9731l ? "ImageCapture" : abstractC6896l instanceof C9585l ? "ImageAnalysis" : AbstractC5641l.admob(abstractC6896l) ? "VideoCapture" : "UseCase";
                Iterator it3 = EnumC4775l.f9801l.iterator();
                do {
                    z = false;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    int iOrdinal = ((EnumC4775l) next).ordinal();
                    if (iOrdinal == 0) {
                        zMetrica = abstractC6896l.billing.metrica();
                    } else if (iOrdinal == 1) {
                        zMetrica = abstractC6896l.billing.mo260super();
                    } else if (iOrdinal == 2) {
                        zMetrica = abstractC6896l.billing.mo861strictfp(InterfaceC0048l.f918l) || abstractC6896l.billing.mo861strictfp(InterfaceC0048l.f921l);
                    } else if (iOrdinal == 3) {
                        zMetrica = abstractC6896l.billing.mo861strictfp(C14180l.f27769l);
                    } else {
                        if (iOrdinal != 4) {
                            C18725l.billing();
                            throw null;
                        }
                        zMetrica = AbstractC8576l.yandex(abstractC6896l.billing.smaato(InterfaceC0048l.f923l, Boolean.TRUE), Boolean.FALSE);
                    }
                } while (!zMetrica);
                EnumC4775l enumC4775l2 = (EnumC4775l) next;
                if (enumC4775l2 == null) {
                    z = true;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder("A ");
                    sb.append(enumC4775l2.name());
                    sb.append(" value is set to ");
                    sb.append(str3);
                    sb.append(" despite using feature groups. Do not use APIs like ");
                    int iOrdinal2 = enumC4775l2.ordinal();
                    if (iOrdinal2 == 0) {
                        strConcat = str3.concat(".Builder.setDynamicRange");
                    } else if (iOrdinal2 == 1) {
                        strConcat = str3.concat(".Builder.setTargetFrameRateRange");
                    } else if (iOrdinal2 == 2) {
                        strConcat = AbstractC5641l.admob(abstractC6896l) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                    } else if (iOrdinal2 == 3) {
                        strConcat = str3.concat(".Builder.setOutputFormat");
                    } else {
                        if (iOrdinal2 != 4) {
                            C18725l.billing();
                            throw null;
                        }
                        strConcat = "Recorder.Builder.setQualitySelector";
                    }
                    sb.append(strConcat);
                    sb.append(" while using feature groups. If, for example, ");
                    int iOrdinal3 = enumC4775l2.ordinal();
                    if (iOrdinal3 == 0) {
                        str = "HDR";
                    } else if (iOrdinal3 == 1) {
                        str = "60 FPS";
                    } else if (iOrdinal3 == 2) {
                        str = "stabilization";
                    } else if (iOrdinal3 == 3) {
                        str = "JPEG_R output format";
                    } else {
                        if (iOrdinal3 != 4) {
                            C18725l.billing();
                            throw null;
                        }
                        str = "UHD recording quality";
                    }
                    sb.append(str);
                    sb.append(" is required, instead set ");
                    int iOrdinal4 = enumC4775l2.ordinal();
                    if (iOrdinal4 == 0) {
                        str2 = "GroupableFeature.HDR_HLG10";
                    } else if (iOrdinal4 == 1) {
                        str2 = "GroupableFeature.FPS_60";
                    } else if (iOrdinal4 == 2) {
                        str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                    } else if (iOrdinal4 == 3) {
                        str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                    } else {
                        if (iOrdinal4 != 4) {
                            C18725l.billing();
                            throw null;
                        }
                        str2 = "GroupableFeatures.UHD_RECORDING";
                    }
                    C10754l.metrica(AbstractC0653l.ads(sb, str2, " as either a required or preferred feature."));
                    throw null;
                }
            }
        }
        this.subs = true;
    }

    public final boolean loadAd() {
        return this.subs;
    }

    public final String toString() {
        return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + this.billing + ", frameRateRange=" + this.crashlytics + ", requiredFeatureGroup=" + this.amazon + ", preferredFeatureGroup=" + this.purchase + ", effects=" + this.loadAd + ", viewPort=" + this.yandex + '}';
    }

    public int yandex() {
        return 0;
    }
}
