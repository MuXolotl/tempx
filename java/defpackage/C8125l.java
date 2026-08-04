package defpackage;

import android.os.Bundle;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؚٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8125l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16930l;

    public /* synthetic */ C8125l(int i) {
        this.f16930l = i;
    }

    private final Object yandex(Object obj) throws Exception {
        InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            interfaceC14742lMo668l.firebase(1, 200L);
            int iCrashlytics = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "id");
            int iCrashlytics2 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "state");
            int iCrashlytics3 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "worker_class_name");
            int iCrashlytics4 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "input_merger_class_name");
            int iCrashlytics5 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "input");
            int iCrashlytics6 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "output");
            int iCrashlytics7 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "initial_delay");
            int iCrashlytics8 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "interval_duration");
            int iCrashlytics9 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "flex_duration");
            int iCrashlytics10 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "run_attempt_count");
            int iCrashlytics11 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "backoff_policy");
            int iCrashlytics12 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "backoff_delay_duration");
            int iCrashlytics13 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "last_enqueue_time");
            int iCrashlytics14 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "minimum_retention_duration");
            int iCrashlytics15 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "schedule_requested_at");
            int iCrashlytics16 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "run_in_foreground");
            int iCrashlytics17 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "out_of_quota_policy");
            int iCrashlytics18 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "period_count");
            int iCrashlytics19 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "generation");
            int iCrashlytics20 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "next_schedule_time_override");
            int iCrashlytics21 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "next_schedule_time_override_generation");
            int iCrashlytics22 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "stop_reason");
            int iCrashlytics23 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "trace_tag");
            int iCrashlytics24 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "backoff_on_system_interruptions");
            int iCrashlytics25 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "required_network_type");
            int iCrashlytics26 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "required_network_request");
            int iCrashlytics27 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_charging");
            int iCrashlytics28 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_device_idle");
            int iCrashlytics29 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_battery_not_low");
            int iCrashlytics30 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_storage_not_low");
            int iCrashlytics31 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "trigger_content_update_delay");
            int iCrashlytics32 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "trigger_max_content_delay");
            int iCrashlytics33 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC14742lMo668l.mo827l()) {
                String strMo826implements = interfaceC14742lMo668l.mo826implements(iCrashlytics);
                int i = iCrashlytics13;
                int i2 = iCrashlytics14;
                EnumC9176l enumC9176lAdmob = AbstractC11748l.admob((int) interfaceC14742lMo668l.getLong(iCrashlytics2));
                String strMo826implements2 = interfaceC14742lMo668l.mo826implements(iCrashlytics3);
                String strMo826implements3 = interfaceC14742lMo668l.mo826implements(iCrashlytics4);
                byte[] blob = interfaceC14742lMo668l.getBlob(iCrashlytics5);
                C4279l c4279l = C4279l.loadAd;
                C4279l c4279lLoadAd = AbstractC7280l.loadAd(blob);
                C4279l c4279lLoadAd2 = AbstractC7280l.loadAd(interfaceC14742lMo668l.getBlob(iCrashlytics6));
                long j = interfaceC14742lMo668l.getLong(iCrashlytics7);
                long j2 = interfaceC14742lMo668l.getLong(iCrashlytics8);
                long j3 = interfaceC14742lMo668l.getLong(iCrashlytics9);
                int i3 = (int) interfaceC14742lMo668l.getLong(iCrashlytics10);
                int i4 = iCrashlytics;
                int i5 = iCrashlytics2;
                int iPurchase = AbstractC11748l.purchase((int) interfaceC14742lMo668l.getLong(iCrashlytics11));
                long j4 = interfaceC14742lMo668l.getLong(iCrashlytics12);
                long j5 = interfaceC14742lMo668l.getLong(i);
                long j6 = interfaceC14742lMo668l.getLong(i2);
                int i6 = iCrashlytics15;
                long j7 = interfaceC14742lMo668l.getLong(i6);
                iCrashlytics15 = i6;
                int i7 = iCrashlytics16;
                int i8 = iCrashlytics3;
                boolean z = ((int) interfaceC14742lMo668l.getLong(i7)) != 0;
                int i9 = iCrashlytics17;
                int i10 = iCrashlytics4;
                int iMopub = AbstractC11748l.mopub((int) interfaceC14742lMo668l.getLong(i9));
                int i11 = iCrashlytics18;
                int i12 = (int) interfaceC14742lMo668l.getLong(i11);
                int i13 = iCrashlytics19;
                int i14 = (int) interfaceC14742lMo668l.getLong(i13);
                int i15 = iCrashlytics20;
                long j8 = interfaceC14742lMo668l.getLong(i15);
                int i16 = iCrashlytics21;
                int i17 = (int) interfaceC14742lMo668l.getLong(i16);
                iCrashlytics21 = i16;
                iCrashlytics22 = iCrashlytics22;
                int i18 = (int) interfaceC14742lMo668l.getLong(iCrashlytics22);
                int i19 = iCrashlytics23;
                Boolean boolValueOf = null;
                String strMo826implements4 = interfaceC14742lMo668l.isNull(i19) ? null : interfaceC14742lMo668l.mo826implements(i19);
                int i20 = iCrashlytics24;
                Integer numValueOf = interfaceC14742lMo668l.isNull(i20) ? null : Integer.valueOf((int) interfaceC14742lMo668l.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iCrashlytics25;
                int iBilling = AbstractC11748l.billing((int) interfaceC14742lMo668l.getLong(i21));
                int i22 = iCrashlytics26;
                C8891l c8891lRemoteconfig = AbstractC11748l.remoteconfig(interfaceC14742lMo668l.getBlob(i22));
                int i23 = iCrashlytics27;
                boolean z2 = ((int) interfaceC14742lMo668l.getLong(i23)) != 0;
                int i24 = iCrashlytics28;
                boolean z3 = ((int) interfaceC14742lMo668l.getLong(i24)) != 0;
                int i25 = iCrashlytics29;
                boolean z4 = ((int) interfaceC14742lMo668l.getLong(i25)) != 0;
                iCrashlytics29 = i25;
                int i26 = iCrashlytics30;
                int i27 = iCrashlytics31;
                int i28 = iCrashlytics32;
                iCrashlytics31 = i27;
                int i29 = iCrashlytics33;
                arrayList.add(new C7718l(strMo826implements, enumC9176lAdmob, strMo826implements2, strMo826implements3, c4279lLoadAd, c4279lLoadAd2, j, j2, j3, new C13152l(c8891lRemoteconfig, iBilling, z2, z3, z4, ((int) interfaceC14742lMo668l.getLong(i26)) != 0, interfaceC14742lMo668l.getLong(i27), interfaceC14742lMo668l.getLong(i28), AbstractC11748l.yandex(interfaceC14742lMo668l.getBlob(i29))), i3, iPurchase, j4, j5, j6, j7, z, iMopub, i12, i14, j8, i17, i18, strMo826implements4, bool));
                iCrashlytics28 = i24;
                iCrashlytics4 = i10;
                iCrashlytics17 = i9;
                iCrashlytics18 = i11;
                iCrashlytics19 = i13;
                iCrashlytics20 = i15;
                iCrashlytics23 = i19;
                iCrashlytics24 = i20;
                iCrashlytics25 = i21;
                iCrashlytics26 = i22;
                iCrashlytics27 = i23;
                iCrashlytics33 = i29;
                iCrashlytics32 = i28;
                iCrashlytics30 = i26;
                iCrashlytics = i4;
                iCrashlytics3 = i8;
                iCrashlytics13 = i;
                iCrashlytics14 = i2;
                iCrashlytics2 = i5;
                iCrashlytics16 = i7;
            }
            return arrayList;
        } finally {
            interfaceC14742lMo668l.close();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        boolean z = false;
        switch (this.f16930l) {
            case 0:
                return Collections.singletonList(C18130l.INSTANCE);
            case 1:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                return Float.valueOf((fFloatValue <= 0.1f || fFloatValue >= 0.95f) ? 0.0f : 1.0f);
            case 3:
                Map map = (Map) obj;
                C6576l c6576l = new C6576l(C8184l.yandex);
                c6576l.amazon.setValue((String) map.get("pagetitle"));
                c6576l.yandex.setValue((String) map.get("lastloaded"));
                c6576l.mopub = (Bundle) map.get("bundle");
                return c6576l;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return ((C12923l) obj).smaato;
            case 6:
                return ((C12923l) obj).loadAd;
            case 7:
                return ((C12923l) obj).billing;
            case 8:
                return ((C12923l) obj).crashlytics;
            case 9:
                return ((C12923l) obj).purchase;
            case 10:
                return (InterfaceC13564l) obj;
            case 11:
                return ((InterfaceC4117l) obj).getClass().getSimpleName();
            case 12:
                InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("DELETE FROM WorkProgress");
                try {
                    interfaceC14742lMo668l.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l.close();
                }
            case 13:
                InterfaceC14742l interfaceC14742lMo668l2 = ((InterfaceC0684l) obj).mo668l("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iCrashlytics = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "id");
                    int iCrashlytics2 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "state");
                    int iCrashlytics3 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "worker_class_name");
                    int iCrashlytics4 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "input_merger_class_name");
                    int iCrashlytics5 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "input");
                    int iCrashlytics6 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "output");
                    int iCrashlytics7 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "initial_delay");
                    int iCrashlytics8 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "interval_duration");
                    int iCrashlytics9 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "flex_duration");
                    int iCrashlytics10 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "run_attempt_count");
                    int iCrashlytics11 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "backoff_policy");
                    int iCrashlytics12 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "backoff_delay_duration");
                    int iCrashlytics13 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "last_enqueue_time");
                    int iCrashlytics14 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "minimum_retention_duration");
                    int iCrashlytics15 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "schedule_requested_at");
                    int iCrashlytics16 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "run_in_foreground");
                    int iCrashlytics17 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "out_of_quota_policy");
                    int iCrashlytics18 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "period_count");
                    int iCrashlytics19 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "generation");
                    int iCrashlytics20 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "next_schedule_time_override");
                    int iCrashlytics21 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "next_schedule_time_override_generation");
                    int iCrashlytics22 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "stop_reason");
                    int iCrashlytics23 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "trace_tag");
                    int iCrashlytics24 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "backoff_on_system_interruptions");
                    int iCrashlytics25 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "required_network_type");
                    int iCrashlytics26 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "required_network_request");
                    int iCrashlytics27 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "requires_charging");
                    int iCrashlytics28 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "requires_device_idle");
                    int iCrashlytics29 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "requires_battery_not_low");
                    int iCrashlytics30 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "requires_storage_not_low");
                    int iCrashlytics31 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "trigger_content_update_delay");
                    int iCrashlytics32 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "trigger_max_content_delay");
                    int iCrashlytics33 = AbstractC8513l.crashlytics(interfaceC14742lMo668l2, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC14742lMo668l2.mo827l()) {
                        String strMo826implements = interfaceC14742lMo668l2.mo826implements(iCrashlytics);
                        int i = iCrashlytics14;
                        int i2 = iCrashlytics13;
                        EnumC9176l enumC9176lAdmob = AbstractC11748l.admob((int) interfaceC14742lMo668l2.getLong(iCrashlytics2));
                        String strMo826implements2 = interfaceC14742lMo668l2.mo826implements(iCrashlytics3);
                        String strMo826implements3 = interfaceC14742lMo668l2.mo826implements(iCrashlytics4);
                        byte[] blob = interfaceC14742lMo668l2.getBlob(iCrashlytics5);
                        C4279l c4279l = C4279l.loadAd;
                        C4279l c4279lLoadAd = AbstractC7280l.loadAd(blob);
                        C4279l c4279lLoadAd2 = AbstractC7280l.loadAd(interfaceC14742lMo668l2.getBlob(iCrashlytics6));
                        long j = interfaceC14742lMo668l2.getLong(iCrashlytics7);
                        long j2 = interfaceC14742lMo668l2.getLong(iCrashlytics8);
                        long j3 = interfaceC14742lMo668l2.getLong(iCrashlytics9);
                        int i3 = (int) interfaceC14742lMo668l2.getLong(iCrashlytics10);
                        int i4 = iCrashlytics5;
                        int i5 = iCrashlytics4;
                        int iPurchase = AbstractC11748l.purchase((int) interfaceC14742lMo668l2.getLong(iCrashlytics11));
                        long j4 = interfaceC14742lMo668l2.getLong(iCrashlytics12);
                        long j5 = interfaceC14742lMo668l2.getLong(i2);
                        long j6 = interfaceC14742lMo668l2.getLong(i);
                        int i6 = iCrashlytics15;
                        long j7 = interfaceC14742lMo668l2.getLong(i6);
                        iCrashlytics15 = i6;
                        int i7 = iCrashlytics16;
                        int i8 = iCrashlytics3;
                        boolean z2 = ((int) interfaceC14742lMo668l2.getLong(i7)) != 0;
                        int i9 = iCrashlytics17;
                        int i10 = iCrashlytics2;
                        int iMopub = AbstractC11748l.mopub((int) interfaceC14742lMo668l2.getLong(i9));
                        int i11 = iCrashlytics18;
                        int i12 = (int) interfaceC14742lMo668l2.getLong(i11);
                        int i13 = iCrashlytics19;
                        int i14 = (int) interfaceC14742lMo668l2.getLong(i13);
                        int i15 = iCrashlytics20;
                        long j8 = interfaceC14742lMo668l2.getLong(i15);
                        int i16 = iCrashlytics21;
                        int i17 = (int) interfaceC14742lMo668l2.getLong(i16);
                        iCrashlytics21 = i16;
                        iCrashlytics22 = iCrashlytics22;
                        int i18 = (int) interfaceC14742lMo668l2.getLong(iCrashlytics22);
                        iCrashlytics23 = iCrashlytics23;
                        String strMo826implements4 = interfaceC14742lMo668l2.isNull(iCrashlytics23) ? null : interfaceC14742lMo668l2.mo826implements(iCrashlytics23);
                        int i19 = iCrashlytics24;
                        Integer numValueOf = interfaceC14742lMo668l2.isNull(i19) ? null : Integer.valueOf((int) interfaceC14742lMo668l2.getLong(i19));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i20 = iCrashlytics25;
                        int iBilling = AbstractC11748l.billing((int) interfaceC14742lMo668l2.getLong(i20));
                        int i21 = iCrashlytics26;
                        C8891l c8891lRemoteconfig = AbstractC11748l.remoteconfig(interfaceC14742lMo668l2.getBlob(i21));
                        int i22 = iCrashlytics27;
                        boolean z3 = ((int) interfaceC14742lMo668l2.getLong(i22)) != 0;
                        int i23 = iCrashlytics28;
                        boolean z4 = ((int) interfaceC14742lMo668l2.getLong(i23)) != 0;
                        int i24 = iCrashlytics29;
                        boolean z5 = ((int) interfaceC14742lMo668l2.getLong(i24)) != 0;
                        iCrashlytics29 = i24;
                        int i25 = iCrashlytics30;
                        int i26 = iCrashlytics31;
                        int i27 = iCrashlytics32;
                        iCrashlytics31 = i26;
                        int i28 = iCrashlytics33;
                        arrayList.add(new C7718l(strMo826implements, enumC9176lAdmob, strMo826implements2, strMo826implements3, c4279lLoadAd, c4279lLoadAd2, j, j2, j3, new C13152l(c8891lRemoteconfig, iBilling, z3, z4, z5, ((int) interfaceC14742lMo668l2.getLong(i25)) != 0, interfaceC14742lMo668l2.getLong(i26), interfaceC14742lMo668l2.getLong(i27), AbstractC11748l.yandex(interfaceC14742lMo668l2.getBlob(i28))), i3, iPurchase, j4, j5, j6, j7, z2, iMopub, i12, i14, j8, i17, i18, strMo826implements4, boolValueOf));
                        iCrashlytics28 = i23;
                        iCrashlytics2 = i10;
                        iCrashlytics17 = i9;
                        iCrashlytics18 = i11;
                        iCrashlytics19 = i13;
                        iCrashlytics20 = i15;
                        iCrashlytics24 = i19;
                        iCrashlytics25 = i20;
                        iCrashlytics26 = i21;
                        iCrashlytics27 = i22;
                        iCrashlytics33 = i28;
                        iCrashlytics32 = i27;
                        iCrashlytics30 = i25;
                        iCrashlytics4 = i5;
                        iCrashlytics13 = i2;
                        iCrashlytics14 = i;
                        iCrashlytics5 = i4;
                        iCrashlytics3 = i8;
                        iCrashlytics16 = i7;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC14742lMo668l2.close();
                }
            case 14:
                InterfaceC14742l interfaceC14742lMo668l3 = ((InterfaceC0684l) obj).mo668l("SELECT * FROM workspec WHERE state=1");
                try {
                    int iCrashlytics34 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "id");
                    int iCrashlytics35 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "state");
                    int iCrashlytics36 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "worker_class_name");
                    int iCrashlytics37 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "input_merger_class_name");
                    int iCrashlytics38 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "input");
                    int iCrashlytics39 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "output");
                    int iCrashlytics40 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "initial_delay");
                    int iCrashlytics41 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "interval_duration");
                    int iCrashlytics42 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "flex_duration");
                    int iCrashlytics43 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "run_attempt_count");
                    int iCrashlytics44 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "backoff_policy");
                    int iCrashlytics45 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "backoff_delay_duration");
                    int iCrashlytics46 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "last_enqueue_time");
                    int iCrashlytics47 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "minimum_retention_duration");
                    int iCrashlytics48 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "schedule_requested_at");
                    int iCrashlytics49 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "run_in_foreground");
                    int iCrashlytics50 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "out_of_quota_policy");
                    int iCrashlytics51 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "period_count");
                    int iCrashlytics52 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "generation");
                    int iCrashlytics53 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "next_schedule_time_override");
                    int iCrashlytics54 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "next_schedule_time_override_generation");
                    int iCrashlytics55 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "stop_reason");
                    int iCrashlytics56 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "trace_tag");
                    int iCrashlytics57 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "backoff_on_system_interruptions");
                    int iCrashlytics58 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "required_network_type");
                    int iCrashlytics59 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "required_network_request");
                    int iCrashlytics60 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "requires_charging");
                    int iCrashlytics61 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "requires_device_idle");
                    int iCrashlytics62 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "requires_battery_not_low");
                    int iCrashlytics63 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "requires_storage_not_low");
                    int iCrashlytics64 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "trigger_content_update_delay");
                    int iCrashlytics65 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "trigger_max_content_delay");
                    int iCrashlytics66 = AbstractC8513l.crashlytics(interfaceC14742lMo668l3, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC14742lMo668l3.mo827l()) {
                        String strMo826implements5 = interfaceC14742lMo668l3.mo826implements(iCrashlytics34);
                        int i29 = iCrashlytics47;
                        int i30 = iCrashlytics46;
                        EnumC9176l enumC9176lAdmob2 = AbstractC11748l.admob((int) interfaceC14742lMo668l3.getLong(iCrashlytics35));
                        String strMo826implements6 = interfaceC14742lMo668l3.mo826implements(iCrashlytics36);
                        String strMo826implements7 = interfaceC14742lMo668l3.mo826implements(iCrashlytics37);
                        byte[] blob2 = interfaceC14742lMo668l3.getBlob(iCrashlytics38);
                        C4279l c4279l2 = C4279l.loadAd;
                        C4279l c4279lLoadAd3 = AbstractC7280l.loadAd(blob2);
                        C4279l c4279lLoadAd4 = AbstractC7280l.loadAd(interfaceC14742lMo668l3.getBlob(iCrashlytics39));
                        long j9 = interfaceC14742lMo668l3.getLong(iCrashlytics40);
                        long j10 = interfaceC14742lMo668l3.getLong(iCrashlytics41);
                        long j11 = interfaceC14742lMo668l3.getLong(iCrashlytics42);
                        int i31 = (int) interfaceC14742lMo668l3.getLong(iCrashlytics43);
                        int i32 = iCrashlytics38;
                        int i33 = iCrashlytics37;
                        int iPurchase2 = AbstractC11748l.purchase((int) interfaceC14742lMo668l3.getLong(iCrashlytics44));
                        long j12 = interfaceC14742lMo668l3.getLong(iCrashlytics45);
                        long j13 = interfaceC14742lMo668l3.getLong(i30);
                        long j14 = interfaceC14742lMo668l3.getLong(i29);
                        int i34 = iCrashlytics48;
                        long j15 = interfaceC14742lMo668l3.getLong(i34);
                        int i35 = iCrashlytics36;
                        int i36 = iCrashlytics49;
                        boolean z6 = ((int) interfaceC14742lMo668l3.getLong(i36)) != 0;
                        int i37 = iCrashlytics35;
                        int i38 = iCrashlytics50;
                        int iMopub2 = AbstractC11748l.mopub((int) interfaceC14742lMo668l3.getLong(i38));
                        iCrashlytics50 = i38;
                        int i39 = iCrashlytics51;
                        int i40 = (int) interfaceC14742lMo668l3.getLong(i39);
                        iCrashlytics51 = i39;
                        int i41 = iCrashlytics52;
                        int i42 = (int) interfaceC14742lMo668l3.getLong(i41);
                        int i43 = iCrashlytics53;
                        long j16 = interfaceC14742lMo668l3.getLong(i43);
                        int i44 = iCrashlytics54;
                        int i45 = (int) interfaceC14742lMo668l3.getLong(i44);
                        iCrashlytics54 = i44;
                        iCrashlytics55 = iCrashlytics55;
                        int i46 = (int) interfaceC14742lMo668l3.getLong(iCrashlytics55);
                        iCrashlytics56 = iCrashlytics56;
                        String strMo826implements8 = interfaceC14742lMo668l3.isNull(iCrashlytics56) ? null : interfaceC14742lMo668l3.mo826implements(iCrashlytics56);
                        int i47 = iCrashlytics57;
                        Integer numValueOf2 = interfaceC14742lMo668l3.isNull(i47) ? null : Integer.valueOf((int) interfaceC14742lMo668l3.getLong(i47));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i48 = iCrashlytics58;
                        int iBilling2 = AbstractC11748l.billing((int) interfaceC14742lMo668l3.getLong(i48));
                        int i49 = iCrashlytics59;
                        C8891l c8891lRemoteconfig2 = AbstractC11748l.remoteconfig(interfaceC14742lMo668l3.getBlob(i49));
                        int i50 = iCrashlytics60;
                        boolean z7 = ((int) interfaceC14742lMo668l3.getLong(i50)) != 0;
                        int i51 = iCrashlytics61;
                        boolean z8 = ((int) interfaceC14742lMo668l3.getLong(i51)) != 0;
                        int i52 = iCrashlytics62;
                        boolean z9 = ((int) interfaceC14742lMo668l3.getLong(i52)) != 0;
                        iCrashlytics62 = i52;
                        int i53 = iCrashlytics63;
                        int i54 = iCrashlytics64;
                        int i55 = iCrashlytics65;
                        iCrashlytics64 = i54;
                        int i56 = iCrashlytics66;
                        arrayList2.add(new C7718l(strMo826implements5, enumC9176lAdmob2, strMo826implements6, strMo826implements7, c4279lLoadAd3, c4279lLoadAd4, j9, j10, j11, new C13152l(c8891lRemoteconfig2, iBilling2, z7, z8, z9, ((int) interfaceC14742lMo668l3.getLong(i53)) != 0, interfaceC14742lMo668l3.getLong(i54), interfaceC14742lMo668l3.getLong(i55), AbstractC11748l.yandex(interfaceC14742lMo668l3.getBlob(i56))), i31, iPurchase2, j12, j13, j14, j15, z6, iMopub2, i40, i42, j16, i45, i46, strMo826implements8, boolValueOf2));
                        iCrashlytics35 = i37;
                        iCrashlytics49 = i36;
                        iCrashlytics52 = i41;
                        iCrashlytics53 = i43;
                        iCrashlytics57 = i47;
                        iCrashlytics58 = i48;
                        iCrashlytics59 = i49;
                        iCrashlytics60 = i50;
                        iCrashlytics61 = i51;
                        iCrashlytics66 = i56;
                        iCrashlytics65 = i55;
                        iCrashlytics63 = i53;
                        iCrashlytics47 = i29;
                        iCrashlytics37 = i33;
                        iCrashlytics38 = i32;
                        iCrashlytics36 = i35;
                        iCrashlytics48 = i34;
                        iCrashlytics46 = i30;
                        break;
                    }
                    return arrayList2;
                } finally {
                    interfaceC14742lMo668l3.close();
                }
            case 15:
                InterfaceC14742l interfaceC14742lMo668l4 = ((InterfaceC0684l) obj).mo668l("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iCrashlytics67 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "id");
                    int iCrashlytics68 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "state");
                    int iCrashlytics69 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "worker_class_name");
                    int iCrashlytics70 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "input_merger_class_name");
                    int iCrashlytics71 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "input");
                    int iCrashlytics72 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "output");
                    int iCrashlytics73 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "initial_delay");
                    int iCrashlytics74 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "interval_duration");
                    int iCrashlytics75 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "flex_duration");
                    int iCrashlytics76 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "run_attempt_count");
                    int iCrashlytics77 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "backoff_policy");
                    int iCrashlytics78 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "backoff_delay_duration");
                    int iCrashlytics79 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "last_enqueue_time");
                    int iCrashlytics80 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "minimum_retention_duration");
                    int iCrashlytics81 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "schedule_requested_at");
                    int iCrashlytics82 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "run_in_foreground");
                    int iCrashlytics83 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "out_of_quota_policy");
                    int iCrashlytics84 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "period_count");
                    int iCrashlytics85 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "generation");
                    int iCrashlytics86 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "next_schedule_time_override");
                    int iCrashlytics87 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "next_schedule_time_override_generation");
                    int iCrashlytics88 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "stop_reason");
                    int iCrashlytics89 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "trace_tag");
                    int iCrashlytics90 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "backoff_on_system_interruptions");
                    int iCrashlytics91 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "required_network_type");
                    int iCrashlytics92 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "required_network_request");
                    int iCrashlytics93 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "requires_charging");
                    int iCrashlytics94 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "requires_device_idle");
                    int iCrashlytics95 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "requires_battery_not_low");
                    int iCrashlytics96 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "requires_storage_not_low");
                    int iCrashlytics97 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "trigger_content_update_delay");
                    int iCrashlytics98 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "trigger_max_content_delay");
                    int iCrashlytics99 = AbstractC8513l.crashlytics(interfaceC14742lMo668l4, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC14742lMo668l4.mo827l()) {
                        String strMo826implements9 = interfaceC14742lMo668l4.mo826implements(iCrashlytics67);
                        int i57 = iCrashlytics80;
                        int i58 = iCrashlytics79;
                        EnumC9176l enumC9176lAdmob3 = AbstractC11748l.admob((int) interfaceC14742lMo668l4.getLong(iCrashlytics68));
                        String strMo826implements10 = interfaceC14742lMo668l4.mo826implements(iCrashlytics69);
                        String strMo826implements11 = interfaceC14742lMo668l4.mo826implements(iCrashlytics70);
                        byte[] blob3 = interfaceC14742lMo668l4.getBlob(iCrashlytics71);
                        C4279l c4279l3 = C4279l.loadAd;
                        C4279l c4279lLoadAd5 = AbstractC7280l.loadAd(blob3);
                        C4279l c4279lLoadAd6 = AbstractC7280l.loadAd(interfaceC14742lMo668l4.getBlob(iCrashlytics72));
                        long j17 = interfaceC14742lMo668l4.getLong(iCrashlytics73);
                        long j18 = interfaceC14742lMo668l4.getLong(iCrashlytics74);
                        long j19 = interfaceC14742lMo668l4.getLong(iCrashlytics75);
                        int i59 = (int) interfaceC14742lMo668l4.getLong(iCrashlytics76);
                        int i60 = iCrashlytics71;
                        int i61 = iCrashlytics70;
                        int iPurchase3 = AbstractC11748l.purchase((int) interfaceC14742lMo668l4.getLong(iCrashlytics77));
                        long j20 = interfaceC14742lMo668l4.getLong(iCrashlytics78);
                        long j21 = interfaceC14742lMo668l4.getLong(i58);
                        long j22 = interfaceC14742lMo668l4.getLong(i57);
                        int i62 = iCrashlytics81;
                        long j23 = interfaceC14742lMo668l4.getLong(i62);
                        int i63 = iCrashlytics69;
                        int i64 = iCrashlytics82;
                        boolean z10 = ((int) interfaceC14742lMo668l4.getLong(i64)) != 0;
                        int i65 = iCrashlytics68;
                        int i66 = iCrashlytics83;
                        int iMopub3 = AbstractC11748l.mopub((int) interfaceC14742lMo668l4.getLong(i66));
                        iCrashlytics83 = i66;
                        int i67 = iCrashlytics84;
                        int i68 = (int) interfaceC14742lMo668l4.getLong(i67);
                        iCrashlytics84 = i67;
                        int i69 = iCrashlytics85;
                        int i70 = (int) interfaceC14742lMo668l4.getLong(i69);
                        int i71 = iCrashlytics86;
                        long j24 = interfaceC14742lMo668l4.getLong(i71);
                        int i72 = iCrashlytics87;
                        int i73 = (int) interfaceC14742lMo668l4.getLong(i72);
                        iCrashlytics87 = i72;
                        iCrashlytics88 = iCrashlytics88;
                        int i74 = (int) interfaceC14742lMo668l4.getLong(iCrashlytics88);
                        iCrashlytics89 = iCrashlytics89;
                        String strMo826implements12 = interfaceC14742lMo668l4.isNull(iCrashlytics89) ? null : interfaceC14742lMo668l4.mo826implements(iCrashlytics89);
                        int i75 = iCrashlytics90;
                        Integer numValueOf3 = interfaceC14742lMo668l4.isNull(i75) ? null : Integer.valueOf((int) interfaceC14742lMo668l4.getLong(i75));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i76 = iCrashlytics91;
                        int iBilling3 = AbstractC11748l.billing((int) interfaceC14742lMo668l4.getLong(i76));
                        int i77 = iCrashlytics92;
                        C8891l c8891lRemoteconfig3 = AbstractC11748l.remoteconfig(interfaceC14742lMo668l4.getBlob(i77));
                        int i78 = iCrashlytics93;
                        boolean z11 = ((int) interfaceC14742lMo668l4.getLong(i78)) != 0;
                        int i79 = iCrashlytics94;
                        boolean z12 = ((int) interfaceC14742lMo668l4.getLong(i79)) != 0;
                        int i80 = iCrashlytics95;
                        boolean z13 = ((int) interfaceC14742lMo668l4.getLong(i80)) != 0;
                        iCrashlytics95 = i80;
                        int i81 = iCrashlytics96;
                        int i82 = iCrashlytics97;
                        int i83 = iCrashlytics98;
                        iCrashlytics97 = i82;
                        int i84 = iCrashlytics99;
                        arrayList3.add(new C7718l(strMo826implements9, enumC9176lAdmob3, strMo826implements10, strMo826implements11, c4279lLoadAd5, c4279lLoadAd6, j17, j18, j19, new C13152l(c8891lRemoteconfig3, iBilling3, z11, z12, z13, ((int) interfaceC14742lMo668l4.getLong(i81)) != 0, interfaceC14742lMo668l4.getLong(i82), interfaceC14742lMo668l4.getLong(i83), AbstractC11748l.yandex(interfaceC14742lMo668l4.getBlob(i84))), i59, iPurchase3, j20, j21, j22, j23, z10, iMopub3, i68, i70, j24, i73, i74, strMo826implements12, boolValueOf3));
                        iCrashlytics68 = i65;
                        iCrashlytics82 = i64;
                        iCrashlytics85 = i69;
                        iCrashlytics86 = i71;
                        iCrashlytics90 = i75;
                        iCrashlytics91 = i76;
                        iCrashlytics92 = i77;
                        iCrashlytics93 = i78;
                        iCrashlytics94 = i79;
                        iCrashlytics99 = i84;
                        iCrashlytics98 = i83;
                        iCrashlytics96 = i81;
                        iCrashlytics80 = i57;
                        iCrashlytics70 = i61;
                        iCrashlytics71 = i60;
                        iCrashlytics69 = i63;
                        iCrashlytics81 = i62;
                        iCrashlytics79 = i58;
                        break;
                    }
                    return arrayList3;
                } finally {
                    interfaceC14742lMo668l4.close();
                }
            case 16:
                InterfaceC14742l interfaceC14742lMo668l5 = ((InterfaceC0684l) obj).mo668l("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    return Integer.valueOf(interfaceC14742lMo668l5.mo827l() ? (int) interfaceC14742lMo668l5.getLong(0) : 0);
                } finally {
                    interfaceC14742lMo668l5.close();
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC14742l interfaceC14742lMo668l6 = ((InterfaceC0684l) obj).mo668l("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (interfaceC14742lMo668l6.mo827l()) {
                        z = ((int) interfaceC14742lMo668l6.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    interfaceC14742lMo668l6.close();
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return yandex(obj);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC0684l interfaceC0684l = (InterfaceC0684l) obj;
                InterfaceC14742l interfaceC14742lMo668l7 = interfaceC0684l.mo668l("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    interfaceC14742lMo668l7.mo827l();
                    return Integer.valueOf(AbstractC16837l.crashlytics(interfaceC0684l));
                } finally {
                    interfaceC14742lMo668l7.close();
                }
            default:
                return Boolean.TRUE;
        }
    }
}
