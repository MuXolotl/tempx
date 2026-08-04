package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashMap;

/* JADX INFO: renamed from: lَؚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC10152l extends AbstractBinderC4213l implements InterfaceC0591l {
    public static InterfaceC0591l asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0591l ? (InterfaceC0591l) iInterfaceQueryLocalInterface : new C8093l(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 5);
    }

    @Override // defpackage.AbstractBinderC4213l
    public final boolean crashlytics(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        InterfaceC6989l c6018l = null;
        InterfaceC12695l c13710l = null;
        InterfaceC6989l c6018l2 = null;
        InterfaceC6989l c6018l3 = null;
        InterfaceC6989l c6018l4 = null;
        InterfaceC6989l c6018l5 = null;
        InterfaceC11939l c8952l = null;
        InterfaceC11939l c8952l2 = null;
        InterfaceC11939l c8952l3 = null;
        InterfaceC6989l c6018l6 = null;
        InterfaceC6989l c6018l7 = null;
        InterfaceC6989l c6018l8 = null;
        InterfaceC6989l c6018l9 = null;
        InterfaceC6989l c6018l10 = null;
        InterfaceC6989l c6018l11 = null;
        InterfaceC6914l c5845l = null;
        InterfaceC6989l c6018l12 = null;
        InterfaceC6989l c6018l13 = null;
        InterfaceC6989l c6018l14 = null;
        InterfaceC6989l c6018l15 = null;
        InterfaceC6989l c6018l16 = null;
        switch (i) {
            case 1:
                InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcel.readStrongBinder());
                C16351l c16351l = (C16351l) AbstractC15425l.yandex(parcel, C16351l.CREATOR);
                long j = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                initialize(interfaceC3396lM3896l, c16351l, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l = iInterfaceQueryLocalInterface instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface : new C6018l(strongBinder);
                }
                InterfaceC6989l interfaceC6989l = c6018l;
                long j3 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                logEventAndBundle(string3, string4, bundle2, interfaceC6989l, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC3396l interfaceC3396lM3896l2 = BinderC14844l.m3896l(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC15425l.yandex;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setUserProperty(string5, string6, interfaceC3396lM3896l2, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC15425l.yandex;
                boolean z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l16 = iInterfaceQueryLocalInterface2 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface2 : new C6018l(strongBinder2);
                }
                AbstractC15425l.amazon(parcel);
                getUserProperties(string7, string8, z5, c6018l16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l15 = iInterfaceQueryLocalInterface3 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface3 : new C6018l(strongBinder3);
                }
                AbstractC15425l.amazon(parcel);
                getMaxUserProperties(string9, c6018l15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                AbstractC15425l.amazon(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l14 = iInterfaceQueryLocalInterface4 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface4 : new C6018l(strongBinder4);
                }
                AbstractC15425l.amazon(parcel);
                getConditionalUserProperties(string13, string14, c6018l14);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC15425l.yandex;
                boolean z6 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setMeasurementEnabled(z6, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                InterfaceC3396l interfaceC3396lM3896l3 = BinderC14844l.m3896l(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setCurrentScreen(interfaceC3396lM3896l3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l13 = iInterfaceQueryLocalInterface5 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface5 : new C6018l(strongBinder5);
                }
                AbstractC15425l.amazon(parcel);
                getCurrentScreenName(c6018l13);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l12 = iInterfaceQueryLocalInterface6 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface6 : new C6018l(strongBinder6);
                }
                AbstractC15425l.amazon(parcel);
                getCurrentScreenClass(c6018l12);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c5845l = iInterfaceQueryLocalInterface7 instanceof InterfaceC6914l ? (InterfaceC6914l) iInterfaceQueryLocalInterface7 : new C5845l(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 5);
                }
                AbstractC15425l.amazon(parcel);
                setInstanceIdProvider(c5845l);
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l11 = iInterfaceQueryLocalInterface8 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface8 : new C6018l(strongBinder8);
                }
                AbstractC15425l.amazon(parcel);
                getCachedAppInstanceId(c6018l11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l10 = iInterfaceQueryLocalInterface9 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface9 : new C6018l(strongBinder9);
                }
                AbstractC15425l.amazon(parcel);
                getAppInstanceId(c6018l10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l9 = iInterfaceQueryLocalInterface10 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface10 : new C6018l(strongBinder10);
                }
                AbstractC15425l.amazon(parcel);
                getGmpAppId(c6018l9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l8 = iInterfaceQueryLocalInterface11 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface11 : new C6018l(strongBinder11);
                }
                AbstractC15425l.amazon(parcel);
                generateEventId(c6018l8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC3396l interfaceC3396lM3896l4 = BinderC14844l.m3896l(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityStarted(interfaceC3396lM3896l4, j14);
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC3396l interfaceC3396lM3896l5 = BinderC14844l.m3896l(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityStopped(interfaceC3396lM3896l5, j15);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                InterfaceC3396l interfaceC3396lM3896l6 = BinderC14844l.m3896l(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityCreated(interfaceC3396lM3896l6, bundle5, j16);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                InterfaceC3396l interfaceC3396lM3896l7 = BinderC14844l.m3896l(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityDestroyed(interfaceC3396lM3896l7, j17);
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                InterfaceC3396l interfaceC3396lM3896l8 = BinderC14844l.m3896l(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityPaused(interfaceC3396lM3896l8, j18);
                break;
            case 30:
                InterfaceC3396l interfaceC3396lM3896l9 = BinderC14844l.m3896l(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityResumed(interfaceC3396lM3896l9, j19);
                break;
            case 31:
                InterfaceC3396l interfaceC3396lM3896l10 = BinderC14844l.m3896l(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l7 = iInterfaceQueryLocalInterface12 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface12 : new C6018l(strongBinder12);
                }
                long j20 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivitySaveInstanceState(interfaceC3396lM3896l10, c6018l7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l6 = iInterfaceQueryLocalInterface13 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface13 : new C6018l(strongBinder13);
                }
                long j21 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                performAction(bundle6, c6018l6, j21);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC3396l interfaceC3396lM3896l11 = BinderC14844l.m3896l(parcel.readStrongBinder());
                InterfaceC3396l interfaceC3396lM3896l12 = BinderC14844l.m3896l(parcel.readStrongBinder());
                InterfaceC3396l interfaceC3396lM3896l13 = BinderC14844l.m3896l(parcel.readStrongBinder());
                AbstractC15425l.amazon(parcel);
                logHealthData(i2, string19, interfaceC3396lM3896l11, interfaceC3396lM3896l12, interfaceC3396lM3896l13);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c8952l3 = iInterfaceQueryLocalInterface14 instanceof InterfaceC11939l ? (InterfaceC11939l) iInterfaceQueryLocalInterface14 : new C8952l(strongBinder14);
                }
                AbstractC15425l.amazon(parcel);
                setEventInterceptor(c8952l3);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c8952l2 = iInterfaceQueryLocalInterface15 instanceof InterfaceC11939l ? (InterfaceC11939l) iInterfaceQueryLocalInterface15 : new C8952l(strongBinder15);
                }
                AbstractC15425l.amazon(parcel);
                registerOnMeasurementEventListener(c8952l2);
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c8952l = iInterfaceQueryLocalInterface16 instanceof InterfaceC11939l ? (InterfaceC11939l) iInterfaceQueryLocalInterface16 : new C8952l(strongBinder16);
                }
                AbstractC15425l.amazon(parcel);
                unregisterOnMeasurementEventListener(c8952l);
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                HashMap hashMap = parcel.readHashMap(AbstractC15425l.yandex);
                AbstractC15425l.amazon(parcel);
                initForTests(hashMap);
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l5 = iInterfaceQueryLocalInterface17 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface17 : new C6018l(strongBinder17);
                }
                int i3 = parcel.readInt();
                AbstractC15425l.amazon(parcel);
                getTestFlag(c6018l5, i3);
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                ClassLoader classLoader4 = AbstractC15425l.yandex;
                boolean z7 = parcel.readInt() != 0;
                AbstractC15425l.amazon(parcel);
                setDataCollectionEnabled(z7);
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l4 = iInterfaceQueryLocalInterface18 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface18 : new C6018l(strongBinder18);
                }
                AbstractC15425l.amazon(parcel);
                isDataCollectionEnabled(c6018l4);
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            default:
                return false;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                Bundle bundle7 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                AbstractC15425l.amazon(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                long j22 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                clearMeasurementEnabled(j22);
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                Bundle bundle8 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setConsent(bundle8, j23);
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                Bundle bundle9 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l3 = iInterfaceQueryLocalInterface19 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface19 : new C6018l(strongBinder19);
                }
                AbstractC15425l.amazon(parcel);
                getSessionId(c6018l3);
                break;
            case 48:
                Intent intent = (Intent) AbstractC15425l.yandex(parcel, Intent.CREATOR);
                AbstractC15425l.amazon(parcel);
                setSgtmDebugInfo(intent);
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                C8066l c8066l = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                setCurrentScreenByScionActivityInfo(c8066l, string20, string21, j25);
                break;
            case 51:
                C8066l c8066l2 = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                long j26 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityStartedByScionActivityInfo(c8066l2, j26);
                break;
            case 52:
                C8066l c8066l3 = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                long j27 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityStoppedByScionActivityInfo(c8066l3, j27);
                break;
            case 53:
                C8066l c8066l4 = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityCreatedByScionActivityInfo(c8066l4, bundle10, j28);
                break;
            case 54:
                C8066l c8066l5 = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                long j29 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityDestroyedByScionActivityInfo(c8066l5, j29);
                break;
            case 55:
                C8066l c8066l6 = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                long j30 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityPausedByScionActivityInfo(c8066l6, j30);
                break;
            case 56:
                C8066l c8066l7 = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                long j31 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivityResumedByScionActivityInfo(c8066l7, j31);
                break;
            case 57:
                C8066l c8066l8 = (C8066l) AbstractC15425l.yandex(parcel, C8066l.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c6018l2 = iInterfaceQueryLocalInterface20 instanceof InterfaceC6989l ? (InterfaceC6989l) iInterfaceQueryLocalInterface20 : new C6018l(strongBinder20);
                }
                long j32 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(c8066l8, c6018l2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c13710l = iInterfaceQueryLocalInterface21 instanceof InterfaceC12695l ? (InterfaceC12695l) iInterfaceQueryLocalInterface21 : new C13710l(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 5);
                }
                AbstractC15425l.amazon(parcel);
                retrieveAndUploadBatches(c13710l);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) AbstractC15425l.yandex(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z8 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z, z8, j33, j34);
                break;
            case 60:
                InterfaceC3396l interfaceC3396lM3896l14 = BinderC14844l.m3896l(parcel.readStrongBinder());
                C16351l c16351l2 = (C16351l) AbstractC15425l.yandex(parcel, C16351l.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                initializeWithElapsedTime(interfaceC3396lM3896l14, c16351l2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                AbstractC15425l.amazon(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
