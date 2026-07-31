package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.car.app.navigation.model.Maneuver;
import androidx.versionedparcelable.ParcelImpl;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: lٗ۟٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17440l implements Parcelable.Creator {
    public static final C17440l loadAd = new C17440l(1);
    public final /* synthetic */ int yandex;

    public /* synthetic */ C17440l(int i) {
        this.yandex = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundle;
        boolean zAdcel = false;
        C17913l c17913l = null;
        switch (this.yandex) {
            case 0:
                Bundle bundle2 = parcel.readBundle(C17440l.class.getClassLoader());
                Objects.requireNonNull(bundle2);
                return new C15858l(bundle2);
            case 1:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return C3448l.f7322l;
                }
                int iIsVip = AbstractC10114l.isVip(parcel);
                while (parcel.dataPosition() < iIsVip) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        c17913l = (C17913l) AbstractC10114l.subs(parcel, i, C17913l.CREATOR);
                    } else if (c != 2) {
                        AbstractC10114l.advert(parcel, i);
                    } else {
                        zAdcel = AbstractC10114l.adcel(parcel, i);
                    }
                }
                AbstractC10114l.metrica(parcel, iIsVip);
                return new C3448l(c17913l, zAdcel);
            case 2:
                return new C6597l(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 3:
                C3204l c3204l = new C3204l(parcel);
                c3204l.f6863l = parcel.readByte() != 0;
                return c3204l;
            case 4:
                return new C12862l(parcel);
            case 5:
                return new C13746l(parcel);
            case 6:
                C14434l c14434l = new C14434l();
                c14434l.f28267l = 255;
                c14434l.f28269l = -2;
                c14434l.f28266l = -2;
                c14434l.f28246l = -2;
                c14434l.f28250l = Boolean.TRUE;
                c14434l.f28255l = parcel.readInt();
                c14434l.f28254l = (Integer) parcel.readSerializable();
                c14434l.f28247l = (Integer) parcel.readSerializable();
                c14434l.f28263l = (Integer) parcel.readSerializable();
                c14434l.f28262l = (Integer) parcel.readSerializable();
                c14434l.f28268l = (Integer) parcel.readSerializable();
                c14434l.f28248l = (Integer) parcel.readSerializable();
                c14434l.f28251l = (Integer) parcel.readSerializable();
                c14434l.f28267l = parcel.readInt();
                c14434l.f28260l = parcel.readString();
                c14434l.f28269l = parcel.readInt();
                c14434l.f28266l = parcel.readInt();
                c14434l.f28246l = parcel.readInt();
                c14434l.f28261l = parcel.readString();
                c14434l.f28252l = parcel.readString();
                c14434l.f28257l = parcel.readInt();
                c14434l.f28256l = (Integer) parcel.readSerializable();
                c14434l.f28249l = (Integer) parcel.readSerializable();
                c14434l.f28245l = (Integer) parcel.readSerializable();
                c14434l.f28273l = (Integer) parcel.readSerializable();
                c14434l.f28253l = (Integer) parcel.readSerializable();
                c14434l.f28259l = (Integer) parcel.readSerializable();
                c14434l.f28265l = (Integer) parcel.readSerializable();
                c14434l.f28264l = (Integer) parcel.readSerializable();
                c14434l.f28244l = (Integer) parcel.readSerializable();
                c14434l.f28258l = (Integer) parcel.readSerializable();
                c14434l.f28250l = (Boolean) parcel.readSerializable();
                c14434l.f28270l = (Locale) parcel.readSerializable();
                c14434l.f28271l = (Boolean) parcel.readSerializable();
                return c14434l;
            case 7:
                return new C13604l(parcel.readInt());
            case 8:
                return new C17564l(parcel);
            case 9:
                return new C12687l(parcel);
            case 10:
                C17624l c17624l = new C17624l();
                c17624l.f34294l = parcel.readString();
                c17624l.f34293l = parcel.readInt();
                return c17624l;
            case 11:
                C13585l c13585l = new C13585l();
                c13585l.f26604l = null;
                c13585l.f26606l = new ArrayList();
                c13585l.f26600l = new ArrayList();
                c13585l.f26603l = parcel.createStringArrayList();
                c13585l.f26602l = parcel.createStringArrayList();
                c13585l.f26599l = (C12862l[]) parcel.createTypedArray(C12862l.CREATOR);
                c13585l.f26605l = parcel.readInt();
                c13585l.f26604l = parcel.readString();
                c13585l.f26606l = parcel.createStringArrayList();
                c13585l.f26600l = parcel.createTypedArrayList(C13746l.CREATOR);
                c13585l.f26601l = parcel.createTypedArrayList(C17624l.CREATOR);
                return c13585l;
            case 12:
                return new C14309l(parcel);
            case 13:
                return new C12185l((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 14:
                C3798l c3798l = new C3798l();
                c3798l.f7907l = parcel.readInt();
                c3798l.f7906l = parcel.readInt();
                c3798l.f7905l = parcel.readInt() == 1;
                return c3798l;
            case 15:
                C6617l c6617l = new C6617l(parcel);
                c6617l.f13854l = ((Integer) parcel.readValue(C6617l.class.getClassLoader())).intValue();
                return c6617l;
            case 16:
                return new C11119l(parcel);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new MediaBrowserCompat$MediaItem(parcel);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return C0579l.yandex((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strMopub = AbstractC3546l.mopub(mediaDescription);
                CharSequence charSequenceSubs = AbstractC3546l.subs(mediaDescription);
                CharSequence charSequenceAdmob = AbstractC3546l.admob(mediaDescription);
                CharSequence charSequenceCrashlytics = AbstractC3546l.crashlytics(mediaDescription);
                Bitmap bitmapPurchase = AbstractC3546l.purchase(mediaDescription);
                Uri uriBilling = AbstractC3546l.billing(mediaDescription);
                Bundle bundleAmazon = AbstractC3546l.amazon(mediaDescription);
                if (bundleAmazon != null) {
                    bundleAmazon = C0554l.m628default(bundleAmazon);
                }
                Uri uriYandex = bundleAmazon != null ? (Uri) bundleAmazon.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriYandex == null) {
                    bundle = bundleAmazon;
                } else if (bundleAmazon.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleAmazon.size() == 2) {
                    bundle = null;
                } else {
                    bundleAmazon.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleAmazon.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleAmazon;
                }
                if (uriYandex == null) {
                    uriYandex = AbstractC15746l.yandex(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strMopub, charSequenceSubs, charSequenceAdmob, charSequenceCrashlytics, bitmapPurchase, uriBilling, bundle, uriYandex);
                mediaDescriptionCompat.f26l = mediaDescription;
                return mediaDescriptionCompat;
            case 20:
                return new C8937l(parcel);
            case 21:
                return new MediaMetadataCompat(parcel);
            case 22:
                return new C10517l(parcel);
            case 23:
                return new MediaSessionCompat$QueueItem(parcel);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new C5057l(token, null);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C11420l c11420l = new C11420l(parcel);
                c11420l.f22986l = parcel.readInt();
                return c11420l;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new ParcelImpl(parcel);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C13765l(parcel.readFloat());
            default:
                return new C15308l(parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.yandex) {
            case 0:
                return new C15858l[i];
            case 1:
                return new C3448l[i];
            case 2:
                return new C6597l[i];
            case 3:
                return new C3204l[i];
            case 4:
                return new C12862l[i];
            case 5:
                return new C13746l[i];
            case 6:
                return new C14434l[i];
            case 7:
                return new C13604l[i];
            case 8:
                return new C17564l[i];
            case 9:
                return new C12687l[i];
            case 10:
                return new C17624l[i];
            case 11:
                return new C13585l[i];
            case 12:
                return new C14309l[i];
            case 13:
                return new C12185l[i];
            case 14:
                return new C3798l[i];
            case 15:
                return new C6617l[i];
            case 16:
                return new C11119l[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new MediaBrowserCompat$MediaItem[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C0579l[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new MediaDescriptionCompat[i];
            case 20:
                return new C8937l[i];
            case 21:
                return new MediaMetadataCompat[i];
            case 22:
                return new C10517l[i];
            case 23:
                return new MediaSessionCompat$QueueItem[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C5057l[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new MediaSessionCompat$Token[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C11420l[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new ParcelImpl[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C13765l[i];
            default:
                return new C15308l[i];
        }
    }
}
