package defpackage;

import android.R;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.drawable.IconCompat;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lَؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10038l implements InterfaceC13158l, InterfaceC12997l, InterfaceC1361l, InterfaceC14426l, InterfaceC12200l, InterfaceC0589l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C12110l f20459l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6851l f20460l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final String[] f20461l = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f20462l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f20463l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20464l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f20465l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f20466l;

    static {
        int i = 0;
        f20459l = new C12110l(i);
        f20460l = new C6851l(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r9v32, types: [androidx.core.graphics.drawable.IconCompat] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [android.graphics.drawable.Icon] */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C10038l(C11757l c11757l) {
        ArrayList<C18283l> arrayList;
        int i;
        Bundle[] bundleArr;
        int i2;
        ArrayList arrayList2;
        ?? r16;
        ?? Subs;
        int i3;
        this.f20464l = 20;
        this.f20465l = new Bundle();
        this.f20466l = c11757l;
        Context context = c11757l.yandex;
        ArrayList arrayList3 = c11757l.signatures;
        ArrayList<C18283l> arrayList4 = c11757l.crashlytics;
        ArrayList arrayList5 = c11757l.amazon;
        this.f20463l = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20462l = AbstractC5941l.firebase(context, c11757l.pro);
        } else {
            this.f20462l = new Notification.Builder(context);
        }
        Notification notification = c11757l.isVip;
        ?? r10 = 0;
        int i4 = 0;
        ((Notification.Builder) this.f20462l).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c11757l.purchase).setContentText(c11757l.billing).setContentInfo(null).setContentIntent(c11757l.mopub).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(c11757l.subs).setProgress(c11757l.metrica, c11757l.startapp, false);
        Notification.Builder builder = (Notification.Builder) this.f20462l;
        IconCompat iconCompat = c11757l.admob;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.subs(context));
        ((Notification.Builder) this.f20462l).setSubText(c11757l.vip).setUsesChronometer(c11757l.smaato).setPriority(c11757l.isPro);
        for (C8926l c8926l : c11757l.loadAd) {
            if (c8926l.loadAd == null && (i3 = c8926l.billing) != 0) {
                c8926l.loadAd = IconCompat.crashlytics(r10, "", i3);
            }
            ?? r9 = c8926l.loadAd;
            boolean z = c8926l.amazon;
            Bundle bundle = c8926l.yandex;
            if (r9 != 0) {
                r16 = r10;
                Subs = r9.subs(r10);
            } else {
                ?? r11 = r10;
                r16 = r11;
                Subs = r11;
            }
            int i5 = i4;
            Notification.Action.Builder builder2 = new Notification.Action.Builder((Icon) Subs, c8926l.mopub, c8926l.admob);
            AbstractC10278l[] abstractC10278lArr = c8926l.crashlytics;
            if (abstractC10278lArr != null) {
                int length = abstractC10278lArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (abstractC10278lArr.length > 0) {
                    AbstractC10278l abstractC10278l = abstractC10278lArr[i5];
                    throw r16;
                }
                for (int i6 = i5; i6 < length; i6++) {
                    builder2.addRemoteInput(remoteInputArr[i6]);
                }
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24) {
                AbstractC11965l.ad(builder2, z);
            }
            bundle2.putInt("android.support.action.semanticAction", i5);
            if (i7 >= 28) {
                AbstractC13950l.m3801abstract(builder2);
            }
            if (i7 >= 29) {
                AbstractC11880l.m3275extends(builder2);
            }
            if (i7 >= 31) {
                AbstractC12148l.inmobi(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c8926l.purchase);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f20462l).addAction(builder2.build());
            r10 = r16;
            i4 = 0;
        }
        ?? r17 = r10;
        Bundle bundle3 = c11757l.tapsense;
        if (bundle3 != null) {
            ((Bundle) this.f20465l).putAll(bundle3);
        }
        ((Notification.Builder) this.f20462l).setShowWhen(c11757l.firebase);
        ((Notification.Builder) this.f20462l).setLocalOnly(c11757l.ads);
        ((Notification.Builder) this.f20462l).setGroup(c11757l.adcel);
        ((Notification.Builder) this.f20462l).setSortKey(r17);
        ((Notification.Builder) this.f20462l).setGroupSummary(false);
        ((Notification.Builder) this.f20462l).setCategory(c11757l.subscription);
        ((Notification.Builder) this.f20462l).setColor(c11757l.Signature);
        ((Notification.Builder) this.f20462l).setVisibility(c11757l.license);
        ((Notification.Builder) this.f20462l).setPublicVersion(null);
        ((Notification.Builder) this.f20462l).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                for (C18283l c18283l : arrayList4) {
                    CharSequence charSequence = c18283l.yandex;
                    String str = c18283l.crashlytics;
                    if (str == null) {
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList2.add(str);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    C10834l c10834l = new C10834l(arrayList3.size() + arrayList2.size());
                    c10834l.addAll(arrayList2);
                    c10834l.addAll(arrayList3);
                    arrayList3 = new ArrayList(c10834l);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((Notification.Builder) this.f20462l).addPerson((String) it.next());
            }
        }
        if (arrayList5.size() > 0) {
            if (c11757l.tapsense == null) {
                c11757l.tapsense = new Bundle();
            }
            Bundle bundle4 = c11757l.tapsense.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList5.size()) {
                String string = Integer.toString(i8);
                C8926l c8926l2 = (C8926l) arrayList5.get(i8);
                Bundle bundle7 = new Bundle();
                if (c8926l2.loadAd == null && (i2 = c8926l2.billing) != 0) {
                    c8926l2.loadAd = IconCompat.crashlytics(null, "", i2);
                }
                IconCompat iconCompat2 = c8926l2.loadAd;
                Bundle bundle8 = c8926l2.yandex;
                ArrayList arrayList6 = arrayList4;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.amazon() : 0);
                bundle7.putCharSequence("title", c8926l2.mopub);
                bundle7.putParcelable("actionIntent", c8926l2.admob);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", c8926l2.amazon);
                bundle7.putBundle("extras", bundle9);
                AbstractC10278l[] abstractC10278lArr2 = c8926l2.crashlytics;
                if (abstractC10278lArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[abstractC10278lArr2.length];
                    if (abstractC10278lArr2.length > 0) {
                        AbstractC10278l abstractC10278l2 = abstractC10278lArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", c8926l2.purchase);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i8++;
                arrayList4 = arrayList6;
            }
            arrayList = arrayList4;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (c11757l.tapsense == null) {
                c11757l.tapsense = new Bundle();
            }
            c11757l.tapsense.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f20465l).putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            arrayList = arrayList4;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            ((Notification.Builder) this.f20462l).setExtras(c11757l.tapsense);
            AbstractC11965l.isVip((Notification.Builder) this.f20462l);
        }
        if (i9 >= 26) {
            AbstractC5941l.m1883continue((Notification.Builder) this.f20462l);
            AbstractC5941l.m1902public((Notification.Builder) this.f20462l);
            AbstractC5941l.m1888finally((Notification.Builder) this.f20462l);
            AbstractC5941l.m1878break((Notification.Builder) this.f20462l);
            AbstractC5941l.m1887final((Notification.Builder) this.f20462l);
            if (!TextUtils.isEmpty(c11757l.pro)) {
                ((Notification.Builder) this.f20462l).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i9 >= 28) {
            for (C18283l c18283l2 : arrayList) {
                Notification.Builder builder3 = (Notification.Builder) this.f20462l;
                c18283l2.getClass();
                AbstractC13950l.purchase(builder3, AbstractC13950l.m3826this(c18283l2));
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            AbstractC11880l.m3281strictfp((Notification.Builder) this.f20462l, c11757l.advert);
            AbstractC11880l.m3280private((Notification.Builder) this.f20462l);
        }
        if (i10 >= 31 && (i = c11757l.ad) != 0) {
            AbstractC12148l.m3367throws((Notification.Builder) this.f20462l, i);
        }
        if (i10 >= 36) {
            AbstractC12479l.billing((Notification.Builder) this.f20462l);
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static void m2835final(C11324l c11324l, String str) throws C12309l {
        try {
            String str2 = "ExoPlayerCacheIndex" + str;
            SQLiteDatabase writableDatabase = c11324l.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                AbstractC16932l.loadAd(writableDatabase, 1, str);
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    @Override // defpackage.InterfaceC12997l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public void mo2836abstract() {
        C12714l c12714l = (C12714l) this.f20465l;
        C3498l c3498l = (C3498l) this.f20466l;
        ArrayList arrayList = (ArrayList) this.f20463l;
        C17538l c17538lPurchase = AbstractC11621l.purchase(c3498l, (InterfaceC17477l) c12714l.f25077l);
        if (c17538lPurchase != null) {
            ((HashMap) c12714l.f25074l).put(c3498l, new C1691l(AbstractC3324l.amazon(arrayList), c17538lPurchase.yandex()));
            return;
        }
        if (((C1424l) c12714l.f25072l).m962try((C3624l) c12714l.f25076l) && AbstractC8576l.yandex(c3498l.loadAd(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C18438l) {
                    arrayList2.add(obj);
                }
            }
            List list = (List) c12714l.f25078l;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                list.add((InterfaceC1910l) ((C18438l) it.next()).yandex);
            }
        }
    }

    @Override // defpackage.InterfaceC14426l
    public void ad(int i, Object obj, int i2, Map map) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f20466l).crashlytics(c3585l, obj);
        long ptr$cinterop_release = ((LongPointerWrapper) this.f20465l).getPtr$cinterop_release();
        int i3 = AbstractC9795l.yandex;
        realmcJNI.realm_list_insert(ptr$cinterop_release, i, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics);
        Unit unit = Unit.INSTANCE;
        c3585l.tapsense();
    }

    @Override // defpackage.InterfaceC13158l
    public boolean advert() throws C12309l {
        try {
            SQLiteDatabase readableDatabase = ((C11324l) this.f20463l).getReadableDatabase();
            String str = (String) this.f20466l;
            str.getClass();
            return AbstractC16932l.yandex(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    @Override // defpackage.InterfaceC13158l
    public void amazon() throws C12309l {
        C11324l c11324l = (C11324l) this.f20463l;
        String str = (String) this.f20466l;
        str.getClass();
        m2835final(c11324l, str);
    }

    @Override // defpackage.InterfaceC14426l
    public boolean applovin(int i, Collection collection, int i2, Map map) {
        return AbstractC1757l.mopub(this, i, collection, i2, map);
    }

    @Override // defpackage.InterfaceC1361l
    public InterfaceC14991l billing() {
        return (C16660l) this.f20466l;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public void m2837break(C2872l c2872l) {
        HashMap map = (HashMap) this.f20462l;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c2872l.crashlytics;
        if (abstractComponentCallbacksC4411l.f8977l) {
            ((C7966l) this.f20465l).billing(abstractComponentCallbacksC4411l);
        }
        if (map.get(abstractComponentCallbacksC4411l.f8974l) == c2872l && ((C2872l) map.put(abstractComponentCallbacksC4411l.f8974l, null)) != null && C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC4411l);
        }
    }

    @Override // defpackage.InterfaceC1361l
    public void cancel() throws IOException {
        ((Socket) this.f20463l).close();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public C1778l m2838case() throws GeneralSecurityException {
        C7972l c7972l;
        C0346l c0346lLoadAd;
        C8378l c8378l = (C8378l) this.f20463l;
        if (c8378l == null) {
            C18262l.ads("Cannot build without parameters");
            return null;
        }
        C7972l c7972l2 = (C7972l) this.f20462l;
        if (c7972l2 == null || (c7972l = (C7972l) this.f20466l) == null) {
            C18262l.ads("Cannot build without key material");
            return null;
        }
        if (c8378l.yandex != ((C0346l) c7972l2.f16631l).yandex.length) {
            C18262l.ads("AES key size mismatch");
            return null;
        }
        if (c8378l.loadAd != ((C0346l) c7972l.f16631l).yandex.length) {
            C18262l.ads("HMAC key size mismatch");
            return null;
        }
        if (c8378l.yandex() && ((Integer) this.f20465l) == null) {
            C18262l.ads("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C8378l) this.f20463l).yandex() && ((Integer) this.f20465l) != null) {
            C18262l.ads("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C6932l c6932l = ((C8378l) this.f20463l).purchase;
        if (c6932l == C6932l.purchase) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else if (c6932l == C6932l.amazon) {
            c0346lLoadAd = AbstractC17168l.yandex(((Integer) this.f20465l).intValue());
        } else {
            if (c6932l != C6932l.crashlytics) {
                C8339l.smaato("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(c6932l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(((Integer) this.f20465l).intValue());
        }
        return new C1778l((C8378l) this.f20463l, (C7972l) this.f20462l, (C7972l) this.f20466l, c0346lLoadAd, (Integer) this.f20465l);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m2839catch(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList2 = (ArrayList) this.f20462l;
            if (TextUtils.isEmpty(str)) {
                C8339l.metrica("groupMemberId must not be empty");
                return;
            } else if (!arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public C13187l m2840class() {
        Bundle bundle = (Bundle) this.f20463l;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.f20466l));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.f20462l));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.f20465l));
        return new C13187l(bundle);
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public void m2841const() {
        this.f20466l = 16;
    }

    @Override // defpackage.InterfaceC14426l
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public C0485l m2842continue() {
        Integer num = (Integer) this.f20463l;
        if (num == null) {
            C18262l.ads("key size is not set");
            return null;
        }
        if (((Integer) this.f20462l) == null) {
            C18262l.ads("tag size is not set");
            return null;
        }
        if (((C10858l) this.f20466l) == null) {
            C18262l.ads("hash type is not set");
            return null;
        }
        if (((C3179l) this.f20465l) == null) {
            C18262l.ads("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f20463l));
        }
        Integer num2 = (Integer) this.f20462l;
        int iIntValue = num2.intValue();
        C10858l c10858l = (C10858l) this.f20466l;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c10858l == C10858l.loadAd) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c10858l == C10858l.crashlytics) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c10858l == C10858l.amazon) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c10858l == C10858l.purchase) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c10858l != C10858l.billing) {
                C18262l.ads("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C0485l(((Integer) this.f20463l).intValue(), ((Integer) this.f20462l).intValue(), (C3179l) this.f20465l, (C10858l) this.f20466l);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m2843default(C3716l c3716l, Map.Entry entry) {
        C3716l c3716l2 = (C3716l) entry.getValue();
        AbstractC5088l.yandex("SurfaceProcessorNode", "     -> outputEdge = " + c3716l2);
        C2005l c2005l = null;
        C2005l c2005l2 = new C2005l(c3716l.mopub.yandex, ((C6822l) entry.getKey()).amazon, c3716l.crashlytics ? (InterfaceC18690l) this.f20462l : null, ((C6822l) entry.getKey()).billing, ((C6822l) entry.getKey()).mopub);
        int i = ((C6822l) entry.getKey()).crashlytics;
        c3716l2.getClass();
        AbstractC12225l.crashlytics();
        c3716l2.loadAd();
        AbstractC5641l.purchase("Consumer can only be linked once.", !c3716l2.isPro);
        c3716l2.isPro = true;
        C10500l c10500l = c3716l2.smaato;
        RunnableC9823l runnableC9823lSmaato = AbstractC11356l.smaato(c10500l.crashlytics(), new C11573l(c3716l2, c10500l, i, c2005l2, c2005l), AbstractC12272l.admob());
        runnableC9823lSmaato.yandex(new RunnableC9929l(runnableC9823lSmaato, new C18396l(this, c3716l2, false, 23), 0 == true ? 1 : 0), AbstractC12272l.admob());
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m2844else(SQLiteDatabase sQLiteDatabase, C1013l c1013l) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1424l.crashlytics(c1013l.purchase, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c1013l.yandex));
        contentValues.put("key", c1013l.loadAd);
        contentValues.put("metadata", byteArray);
        String str = (String) this.f20465l;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public Enum m2845finally(Object obj) {
        return (Enum) ((C14092l) ((InterfaceC5319l) this.f20466l)).get(((InterfaceC1421l) ((AbstractC1387l) this.f20462l).purchase(((Number) ((C0114l) this.f20463l).get(obj)).intValue())).yandex());
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m2846for(ArrayList arrayList) {
        if (arrayList == null) {
            C8339l.metrica("filters must not be null");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                ArrayList arrayList2 = (ArrayList) this.f20466l;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14426l
    public Object get(int i) {
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f20465l;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_list_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        return ((AbstractC14507l) this.f20466l).amazon(realm_value_tVar);
    }

    @Override // defpackage.InterfaceC0589l
    public View getRoot() {
        switch (this.f20464l) {
            case 23:
                return (LinearLayout) this.f20463l;
            default:
                return (FrameLayout) this.f20463l;
        }
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public AbstractComponentCallbacksC4411l m2847goto(String str) {
        C2872l c2872l = (C2872l) ((HashMap) this.f20462l).get(str);
        if (c2872l != null) {
            return c2872l.crashlytics;
        }
        return null;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public Bundle m2848implements(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f20466l;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public ArrayList m2849import() {
        ArrayList arrayList = new ArrayList();
        for (C2872l c2872l : ((HashMap) this.f20462l).values()) {
            if (c2872l != null) {
                arrayList.add(c2872l);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC14426l
    public int indexOf(Object obj) {
        C3585l c3585l = new C3585l(16);
        AbstractC14507l abstractC14507l = (AbstractC14507l) this.f20466l;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f20465l;
        realm_value_t realm_value_tVarCrashlytics = abstractC14507l.crashlytics(c3585l, obj);
        long[] jArr = new long[1];
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, jArr, zArr);
        return (int) (zArr[0] ? jArr[0] : -1L);
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public ArrayList m2850instanceof() {
        ArrayList arrayList = new ArrayList();
        for (C2872l c2872l : ((HashMap) this.f20462l).values()) {
            if (c2872l != null) {
                arrayList.add(c2872l.crashlytics);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m2851interface(C10771l c10771l) {
        Runnable runnable;
        synchronized (this.f20466l) {
            runnable = (Runnable) ((LinkedHashMap) this.f20465l).remove(c10771l);
        }
        if (runnable != null) {
            ((Handler) ((C5008l) this.f20463l).f10245l).removeCallbacks(runnable);
        }
    }

    @Override // defpackage.InterfaceC13158l
    public void isVip(HashMap map) throws C12309l {
        SparseArray sparseArray = (SparseArray) this.f20462l;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((C11324l) this.f20463l).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C1013l c1013l = (C1013l) sparseArray.valueAt(i);
                    if (c1013l == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.f20465l;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        m2844else(writableDatabase, c1013l);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    @Override // defpackage.InterfaceC12997l
    public void license(C3624l c3624l, C3498l c3498l) {
        ((ArrayList) this.f20463l).add(new C17452l(c3624l, c3498l));
    }

    @Override // defpackage.InterfaceC14426l
    public InterfaceC14426l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        return new C10038l((C5501l) this.f20463l, interfaceC7832l, (AbstractC14507l) this.f20466l, longPointerWrapper, 21);
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public void m2852l(C10771l c10771l) {
        RunnableC10311l runnableC10311l = new RunnableC10311l(this, c10771l, 15);
        synchronized (this.f20466l) {
        }
        ((Handler) ((C5008l) this.f20463l).f10245l).postDelayed(runnableC10311l, 5400000L);
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public C0376l m2853l(C12512l c12512l) {
        C8857l c8857l = (C8857l) this.f20463l;
        AbstractC12225l.crashlytics();
        String strSignature = AbstractC15560l.Signature("[", (String) this.f20465l, "] ");
        StringBuilder sb = new StringBuilder();
        sb.append(strSignature);
        sb.append("SurfaceProcessorNode Transform (Processor=");
        sb.append(c8857l);
        sb.append("\n   inputEdge = ");
        C3716l c3716l = c12512l.yandex;
        List<C6822l> list = c12512l.loadAd;
        sb.append(c3716l);
        AbstractC5088l.yandex("SurfaceProcessorNode", sb.toString());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5088l.yandex("SurfaceProcessorNode", "   outputConfig = " + ((C6822l) it.next()));
        }
        this.f20466l = new C0376l();
        for (C6822l c6822l : list) {
            C0376l c0376l = (C0376l) this.f20466l;
            Rect rect = c6822l.amazon;
            int i = c6822l.billing;
            boolean z = c6822l.mopub;
            Matrix matrix = new Matrix(c3716l.loadAd);
            RectF rectF = new RectF(rect);
            Size size = c6822l.purchase;
            matrix.postConcat(AbstractC18611l.yandex(rectF, AbstractC18611l.subs(size), i, z));
            AbstractC5641l.yandex(AbstractC18611l.amazon(AbstractC18611l.admob(i, AbstractC18611l.billing(rect)), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            C6472l c6472lLoadAd = c3716l.mopub.loadAd();
            c6472lLoadAd.f13512l = size;
            c0376l.put(c6822l, new C3716l(c6822l.loadAd, c6822l.crashlytics, c6472lLoadAd.yandex(), matrix, false, rect2, c3716l.subs - i, -1, c3716l.purchase != z));
        }
        c8857l.yandex(c3716l.amazon((InterfaceC18690l) this.f20462l, true));
        for (Map.Entry entry : ((C0376l) this.f20466l).entrySet()) {
            m2843default(c3716l, entry);
            ((C3716l) entry.getValue()).yandex(new RunnableC15278l(this, c3716l, entry, 6));
        }
        c3716l.metrica.add(new C10927l(0, (C0376l) this.f20466l));
        return (C0376l) this.f20466l;
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public void m2854l() {
        View view = (View) this.f20463l;
        ComposeView composeView = new ComposeView(view.getContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(C1083l.f2991l);
        composeView.setContent(new C15578l(-353687653, true, new C10188l(this, 0)));
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setId(R.id.content);
        AppActivity appActivity = (AppActivity) view.getContext();
        frameLayout.setTag(ua.itaysonlab.vkx.R.id.view_tree_lifecycle_owner, appActivity);
        frameLayout.setTag(ua.itaysonlab.vkx.R.id.view_tree_saved_state_registry_owner, appActivity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(composeView);
        PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
        this.f20465l = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = (PopupWindow) this.f20465l;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(true);
        }
        PopupWindow popupWindow3 = (PopupWindow) this.f20465l;
        if (popupWindow3 != null) {
            popupWindow3.showAsDropDown(view);
        }
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public void m2855new(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            C18073l.license("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C5128l) this.f20462l).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m2855new(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.InterfaceC12200l
    public C8160l premium(C3624l c3624l) {
        C6582l c6582l = (C6582l) ((LinkedHashMap) this.f20465l).get(c3624l);
        if (c6582l == null) {
            return null;
        }
        return new C8160l((C10919l) this.f20463l, c6582l, (C5378l) this.f20462l, (InterfaceC5706l) ((C2911l) this.f20466l).invoke(c3624l));
    }

    @Override // defpackage.InterfaceC12997l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void mo2856private(C14700l c14700l) {
        ((ArrayList) this.f20463l).add(new C16634l(c14700l));
    }

    @Override // defpackage.InterfaceC13158l
    public void pro(C1013l c1013l) {
        ((SparseArray) this.f20462l).put(c1013l.yandex, c1013l);
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public void m2857protected() {
        this.f20462l = 12;
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public List m2858public() {
        ArrayList arrayList;
        if (((ArrayList) this.f20463l).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f20463l)) {
            arrayList = new ArrayList((ArrayList) this.f20463l);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC12997l
    public InterfaceC14209l purchase(C3624l c3624l) {
        ArrayList arrayList = new ArrayList();
        C1424l c1424l = (C1424l) this.f20462l;
        return new C12014l(new C12714l(c1424l, AbstractC9033l.billing((C10202l) c1424l.f3601l, c3624l, (C12014l) c1424l.f3605l), c3624l, arrayList, InterfaceC5706l.f12087l), this, arrayList);
    }

    @Override // defpackage.InterfaceC10984l
    public InterfaceC7832l remoteconfig() {
        return (InterfaceC7832l) this.f20462l;
    }

    @Override // defpackage.InterfaceC14426l
    public boolean remove(Object obj) {
        return AbstractC1757l.advert(this, obj);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public void m2859return(C9095l c9095l, Enum r5) {
        C0114l c0114l = (C0114l) this.f20463l;
        C5950l c5950l = (C5950l) ((ArrayList) this.f20465l).get(r5.ordinal());
        int iIntValue = ((Number) c0114l.get(c9095l)).intValue();
        int i = (1 << c5950l.loadAd) - 1;
        int i2 = c5950l.yandex;
        c0114l.appmetrica(c9095l, Integer.valueOf((iIntValue & (~(i << i2))) + (c5950l.crashlytics << i2)));
    }

    @Override // defpackage.InterfaceC13158l
    public void signatures(long j) {
        String hexString = Long.toHexString(j);
        this.f20466l = hexString;
        this.f20465l = AbstractC14814l.startapp("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.InterfaceC13158l
    public void startapp(C1013l c1013l, boolean z) {
        SparseArray sparseArray = (SparseArray) this.f20462l;
        int i = c1013l.yandex;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void m2860static() {
        C5571l c5571l;
        AbstractC12225l.crashlytics();
        C0554l c0554l = (C0554l) this.f20462l;
        c0554l.getClass();
        AbstractC12225l.crashlytics();
        C11539l c11539l = (C11539l) c0554l.f1956l;
        Objects.requireNonNull(c11539l);
        C6344l c6344l = (C6344l) c0554l.f1958l;
        Objects.requireNonNull(c6344l);
        C6344l c6344l2 = (C6344l) c0554l.f1957l;
        C5571l c5571l2 = c11539l.yandex;
        Objects.requireNonNull(c5571l2);
        c5571l2.yandex();
        C5571l c5571l3 = c11539l.yandex;
        Objects.requireNonNull(c5571l3);
        AbstractC11356l.admob(c5571l3.purchase).yandex(new RunnableC9090l(c6344l, 0), AbstractC12272l.admob());
        C5571l c5571l4 = c11539l.crashlytics;
        int i = 1;
        if (c5571l4 != null) {
            c5571l4.yandex();
            AbstractC11356l.admob(c11539l.crashlytics.purchase).yandex(new RunnableC9090l(null, i), AbstractC12272l.admob());
        }
        if (c11539l.billing.size() > 1 && (c5571l = c11539l.loadAd) != null) {
            c5571l.yandex();
            AbstractC11356l.admob(c11539l.loadAd.purchase).yandex(new RunnableC9090l(c6344l2, 2), AbstractC12272l.admob());
        }
        ((C6921l) this.f20466l).getClass();
    }

    @Override // defpackage.InterfaceC14426l
    /* JADX INFO: renamed from: strictfp */
    public Object mo1566strictfp(int i, Object obj, int i2, LinkedHashMap linkedHashMap) {
        Object obj2 = get(i);
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f20466l).crashlytics(c3585l, obj);
        long ptr$cinterop_release = ((LongPointerWrapper) this.f20465l).getPtr$cinterop_release();
        int i3 = AbstractC9795l.yandex;
        realmcJNI.realm_list_set(ptr$cinterop_release, i, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics);
        Unit unit = Unit.INSTANCE;
        c3585l.tapsense();
        return obj2;
    }

    @Override // defpackage.InterfaceC13158l
    public void subs(HashMap map) throws C12309l {
        try {
            SQLiteDatabase writableDatabase = ((C11324l) this.f20463l).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                m2864this(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    m2844else(writableDatabase, (C1013l) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.f20462l).clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public AbstractComponentCallbacksC4411l m2861super(String str) {
        for (C2872l c2872l : ((HashMap) this.f20462l).values()) {
            if (c2872l != null) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lM2861super = c2872l.crashlytics;
                if (!str.equals(abstractComponentCallbacksC4411lM2861super.f8974l)) {
                    abstractComponentCallbacksC4411lM2861super = abstractComponentCallbacksC4411lM2861super.f8949l.crashlytics.m2861super(str);
                }
                if (abstractComponentCallbacksC4411lM2861super != null) {
                    return abstractComponentCallbacksC4411lM2861super;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public C16816l m2862switch() {
        Integer num = (Integer) this.f20463l;
        if (num == null) {
            C18262l.ads("Key size is not set");
            return null;
        }
        if (((C5138l) this.f20465l) == null) {
            C18262l.ads("Variant is not set");
            return null;
        }
        if (((Integer) this.f20462l) == null) {
            C18262l.ads("IV size is not set");
            return null;
        }
        if (((Integer) this.f20466l) != null) {
            return new C16816l(num.intValue(), ((Integer) this.f20462l).intValue(), ((Integer) this.f20466l).intValue(), (C5138l) this.f20465l);
        }
        C18262l.ads("Tag size is not set");
        return null;
    }

    @Override // defpackage.InterfaceC13158l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void mo2863synchronized(HashMap map, SparseArray sparseArray) throws C12309l {
        C11324l c11324l = (C11324l) this.f20463l;
        AbstractC12442l.subscription(((SparseArray) this.f20462l).size() == 0);
        try {
            SQLiteDatabase readableDatabase = c11324l.getReadableDatabase();
            String str = (String) this.f20466l;
            str.getClass();
            if (AbstractC16932l.yandex(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c11324l.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m2864this(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c11324l.getReadableDatabase();
            String str2 = (String) this.f20465l;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f20461l, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new C1013l(i, string, C1424l.yandex(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C12309l(e);
        }
    }

    @Override // defpackage.InterfaceC12997l
    public void tapsense(Object obj) {
        ArrayList arrayList = (ArrayList) this.f20463l;
        C1424l c1424l = (C1424l) this.f20462l;
        C3498l c3498l = (C3498l) this.f20466l;
        Object objSubs = C1083l.subs((C10202l) c1424l.f3601l, obj);
        if (objSubs == null) {
            objSubs = new C15501l("Unsupported annotation argument: " + c3498l);
        }
        arrayList.add(objSubs);
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public void m2864this(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.f20466l;
        str.getClass();
        AbstractC16932l.crashlytics(sQLiteDatabase, 1, str);
        String str2 = (String) this.f20465l;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.f20465l) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m2865throw(AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l) {
        if (((ArrayList) this.f20463l).contains(abstractComponentCallbacksC4411l)) {
            C11983l.ad(abstractComponentCallbacksC4411l, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f20463l)) {
            ((ArrayList) this.f20463l).add(abstractComponentCallbacksC4411l);
        }
        abstractComponentCallbacksC4411l.f8984l = true;
    }

    @Override // defpackage.InterfaceC1361l
    /* JADX INFO: renamed from: throws */
    public InterfaceC10506l mo489throws() {
        return (C7443l) this.f20465l;
    }

    public String toString() {
        switch (this.f20464l) {
            case 10:
                return ((Socket) this.f20463l).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public void m2866transient() {
        ((C8857l) this.f20463l).release();
        AbstractC12225l.firebase(new RunnableC6665l(5, this));
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void m2867try(C2872l c2872l) {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c2872l.crashlytics;
        String str = abstractComponentCallbacksC4411l.f8974l;
        HashMap map = (HashMap) this.f20462l;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC4411l.f8974l, c2872l);
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC4411l);
        }
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public void m2868while(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f20463l = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC14426l
    public NativePointer yandex() {
        return (LongPointerWrapper) this.f20465l;
    }

    public /* synthetic */ C10038l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f20464l = i;
        this.f20463l = obj;
        this.f20462l = obj2;
        this.f20466l = obj3;
        this.f20465l = obj4;
    }

    public C10038l(int i) {
        this.f20464l = i;
        final int i2 = 0;
        switch (i) {
            case 9:
                this.f20463l = new LinkedHashMap();
                this.f20462l = new C8688l(new Function0(this) { // from class: lْۣٕ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C10038l f26850l;

                    {
                        this.f26850l = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        C10038l c10038l = this.f26850l;
                        switch (i3) {
                            case 0:
                                List listM4243this = AbstractC16901l.m4243this(((LinkedHashMap) c10038l.f20463l).entrySet(), new C13617l(16));
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4243this, 10));
                                Iterator it = listM4243this.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((AbstractC18717l) ((InterfaceC1220l) ((Map.Entry) it.next()).getValue()).getValue());
                                }
                                return arrayList;
                            default:
                                List list = (List) ((C8688l) c10038l.f20462l).getValue();
                                int size = list.size();
                                if (size != 0) {
                                    return size != 1 ? new C2514l(list) : (AbstractC18717l) AbstractC16901l.m4231native(list);
                                }
                                C8339l.smaato("No providers registered. Please provide a dependency or register provider explicitly");
                                return null;
                        }
                    }
                });
                final int i3 = 1;
                this.f20466l = new C8688l(new Function0(this) { // from class: lْۣٕ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C10038l f26850l;

                    {
                        this.f26850l = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = i3;
                        C10038l c10038l = this.f26850l;
                        switch (i4) {
                            case 0:
                                List listM4243this = AbstractC16901l.m4243this(((LinkedHashMap) c10038l.f20463l).entrySet(), new C13617l(16));
                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4243this, 10));
                                Iterator it = listM4243this.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((AbstractC18717l) ((InterfaceC1220l) ((Map.Entry) it.next()).getValue()).getValue());
                                }
                                return arrayList;
                            default:
                                List list = (List) ((C8688l) c10038l.f20462l).getValue();
                                int size = list.size();
                                if (size != 0) {
                                    return size != 1 ? new C2514l(list) : (AbstractC18717l) AbstractC16901l.m4231native(list);
                                }
                                C8339l.smaato("No providers registered. Please provide a dependency or register provider explicitly");
                                return null;
                        }
                    }
                });
                this.f20465l = new C8688l(new C3321l(this));
                break;
            case 11:
                this.f20463l = new C7353l(10);
                this.f20462l = new C5128l(0);
                this.f20466l = new ArrayList();
                this.f20465l = new HashSet();
                break;
            case 12:
                this.f20463l = new int[10];
                this.f20462l = new int[10];
                this.f20466l = new int[10];
                this.f20465l = new int[10];
                break;
            case 14:
                this.f20463l = new ArrayList();
                this.f20462l = new HashMap();
                this.f20466l = new HashMap();
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f20463l = new HashMap();
                this.f20462l = new HashMap();
                this.f20466l = new HashMap();
                this.f20465l = new HashMap();
                break;
            default:
                C12110l c12110l = AbstractC11020l.loadAd;
                this.f20463l = new HashMap();
                this.f20462l = new HashMap();
                this.f20465l = null;
                this.f20466l = c12110l;
                break;
        }
    }

    public C10038l(C7431l c7431l, C10919l c10919l, C5378l c5378l, C2911l c2911l) {
        this.f20464l = 22;
        this.f20463l = c10919l;
        this.f20462l = c5378l;
        this.f20466l = c2911l;
        List list = c7431l.f15381l;
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase < 16 ? 16 : iFirebase);
        for (Object obj : list) {
            linkedHashMap.put(AbstractC18719l.subs((C10919l) this.f20463l, ((C6582l) obj).f13788l), obj);
        }
        this.f20465l = linkedHashMap;
    }

    public C10038l(C5008l c5008l, C5633l c5633l) {
        this.f20464l = 27;
        this.f20463l = c5008l;
        this.f20462l = c5633l;
        this.f20466l = new Object();
        this.f20465l = new LinkedHashMap();
    }

    public C10038l(C18662l c18662l, C15079l c15079l, C12513l c12513l, C6637l c6637l) {
        this.f20464l = 25;
        this.f20463l = c18662l;
        this.f20462l = c6637l;
        this.f20466l = AbstractC12098l.yandex(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
        this.f20465l = new C3142l(0);
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c18662l.f36440l.mo245l(C1083l.f2996l);
        if (interfaceC7042l != null) {
            interfaceC7042l.mo2154l(new C6411l(c15079l, this, c12513l, 7));
        }
    }

    public C10038l(View view, Function1 function1) {
        this.f20464l = 8;
        this.f20463l = view;
        this.f20462l = function1;
        ArrayList arrayList = new ArrayList();
        function1.invoke(new C13856l(arrayList, this));
        this.f20466l = arrayList;
    }

    public C10038l(Socket socket) {
        this.f20464l = 10;
        this.f20463l = socket;
        this.f20462l = new AtomicInteger();
        this.f20466l = new C16660l(this);
        this.f20465l = new C7443l(this);
    }

    public C10038l(C3344l c3344l) {
        this.f20464l = 24;
        this.f20463l = new HashMap(c3344l.yandex);
        this.f20462l = new HashMap(c3344l.loadAd);
        this.f20466l = new HashMap(c3344l.crashlytics);
        this.f20465l = new HashMap(c3344l.amazon);
    }

    public C10038l(ClassLoader classLoader, InterfaceC6272l interfaceC6272l, C2494l c2494l) {
        this.f20464l = 0;
        C1770l c1770l = new C1770l(13);
        this.f20463l = classLoader;
        this.f20462l = interfaceC6272l;
        this.f20466l = c2494l;
        this.f20465l = c1770l;
    }

    public /* synthetic */ C10038l(int i, boolean z) {
        this.f20464l = i;
    }

    public C10038l(InterfaceC18690l interfaceC18690l, C8857l c8857l, String str) {
        this.f20464l = 26;
        this.f20462l = interfaceC18690l;
        this.f20463l = c8857l;
        this.f20465l = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10038l(C14180l c14180l, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int iIntValue;
        boolean z2;
        InterfaceC12679l c10685l;
        C2498l c2498l;
        C9723l c9723l;
        boolean z3;
        int i;
        C9723l c9723l2;
        this.f20464l = 16;
        AbstractC12225l.crashlytics();
        this.f20463l = c14180l;
        c14180l.getClass();
        C13069l c13069l = (C13069l) c14180l.smaato(InterfaceC0048l.f917l, null);
        if (c13069l != null) {
            C9598l c9598l = new C9598l(1);
            c13069l.yandex(c14180l, c9598l);
            c9598l.pro();
            C0554l c0554l = new C0554l();
            this.f20462l = c0554l;
            Executor executor = (Executor) ((C7420l) c14180l.subs()).smaato(InterfaceC5178l.f11243private, AbstractC12272l.mopub());
            Objects.requireNonNull(executor);
            C6921l c6921l = new C6921l(executor, cameraCharacteristics);
            this.f20466l = c6921l;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            if (((Integer) AbstractC4338l.smaato(c14180l, InterfaceC16352l.isVip, 0)).intValue() != 0) {
                arrayList.add(32);
                arrayList.add(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            } else {
                Integer num = (Integer) ((C7420l) c14180l.subs()).smaato(C14180l.f27770l, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    Integer num2 = (Integer) ((C7420l) c14180l.subs()).smaato(InterfaceC16352l.advert, null);
                    if (num2 == null || num2.intValue() != 4101) {
                        iIntValue = (num2 == null || num2.intValue() != 32) ? 256 : 32;
                    } else {
                        iIntValue = 4101;
                    }
                }
                arrayList.add(Integer.valueOf(iIntValue));
            }
            int iFirebase = c14180l.firebase();
            if (((C7420l) c14180l.subs()).smaato(C14180l.f27772l, null) == null) {
                C3789l c3789l = new C3789l();
                C3789l c3789l2 = new C3789l();
                C11539l c11539l = new C11539l(size, iFirebase, arrayList, z, c3789l, c3789l2);
                this.f20465l = c11539l;
                AbstractC5641l.purchase("CaptureNode does not support recreation yet.", ((C11539l) c0554l.f1956l) == null && ((C6344l) c0554l.f1958l) == null);
                c0554l.f1956l = c11539l;
                C12569l c12569l = new C12569l();
                boolean z4 = arrayList.size() > 1;
                int i3 = 2;
                if (!z) {
                    if (z4) {
                        z3 = true;
                        i = 0;
                        C9723l c9723l3 = new C9723l(size.getWidth(), size.getHeight(), PSKKeyManager.MAX_KEY_LENGTH_BYTES, 4);
                        AbstractC17002l.loadAd(c12569l, c9723l3.f19828l);
                        c9723l = new C9723l(size.getWidth(), size.getHeight(), 32, 4);
                        AbstractC17002l.loadAd(c12569l, c9723l.f19828l);
                        c9723l2 = c9723l3;
                    } else {
                        z3 = true;
                        i = 0;
                        C9723l c9723l4 = new C9723l(size.getWidth(), size.getHeight(), iFirebase, 4);
                        AbstractC17002l.loadAd(c12569l, c9723l4.f19828l);
                        c9723l = null;
                        c9723l2 = c9723l4;
                    }
                    i2 = i;
                    c2498l = new C2498l(c0554l, i2);
                    z2 = z3;
                    c10685l = c9723l2;
                } else {
                    z2 = true;
                    c10685l = new C10685l(AbstractC6159l.yandex(size.getWidth(), size.getHeight(), iFirebase, 4));
                    c2498l = new C2498l(c0554l, true ? 1 : 0);
                    c9723l = null;
                }
                Surface surface = c10685l.getSurface();
                Objects.requireNonNull(surface);
                AbstractC5641l.purchase("The surface is already set.", c11539l.yandex == null ? z2 ? 1 : 0 : i2);
                c11539l.yandex = new C5571l(surface, size, iFirebase);
                c0554l.f1958l = new C6344l(c10685l);
                c10685l.premium(new C18353l(c0554l), AbstractC12272l.admob());
                if (z4 && c9723l != null) {
                    Surface surface2 = c9723l.getSurface();
                    AbstractC5641l.purchase("The secondary surface is already set.", c11539l.loadAd != null ? false : z2);
                    c11539l.loadAd = new C5571l(surface2, size, iFirebase);
                    c0554l.f1957l = new C6344l(c9723l);
                    c9723l.premium(new C18353l(c0554l), AbstractC12272l.admob());
                }
                c3789l.loadAd = c2498l;
                c3789l2.loadAd = new C2498l(c0554l, i3);
                return;
            }
            C18725l.loadAd();
            throw null;
        }
        C1759l.isPro(AbstractC12589l.metrica(c14180l, c14180l.toString()), "Implementation is missing option unpacker for ");
        throw null;
    }

    public C10038l(C7757l c7757l, InterfaceC7483l interfaceC7483l, InterfaceC1220l interfaceC1220l) {
        this.f20464l = 17;
        this.f20463l = c7757l;
        this.f20462l = interfaceC7483l;
        this.f20466l = interfaceC1220l;
        this.f20465l = new C18449l(this, interfaceC7483l);
    }

    public C10038l(C1424l c1424l, C3498l c3498l, C12714l c12714l) {
        this.f20464l = 6;
        this.f20462l = c1424l;
        this.f20466l = c3498l;
        this.f20465l = c12714l;
        this.f20463l = new ArrayList();
    }

    public C10038l(C13708l c13708l, C2494l c2494l, C18396l c18396l, C13568l c13568l) {
        Object objSignature;
        this.f20464l = 19;
        if (c13708l != null) {
            objSignature = AbstractC1186l.Signature(c13708l);
        } else {
            C9258l c9258l = AbstractC1186l.f3181l;
            objSignature = C13708l.f26763l;
        }
        this.f20463l = objSignature;
        this.f20462l = c2494l;
        this.f20466l = c18396l;
        this.f20465l = c13568l;
    }

    public C10038l(String str, String str2) {
        this.f20464l = 18;
        this.f20462l = new ArrayList();
        this.f20466l = new ArrayList();
        this.f20465l = new HashSet();
        Bundle bundle = new Bundle();
        this.f20463l = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            } else {
                C6541l.subs("name must not be null");
                throw null;
            }
        }
        C6541l.subs("id must not be null");
        throw null;
    }

    public C10038l(C13187l c13187l) {
        this.f20464l = 18;
        this.f20462l = new ArrayList();
        this.f20466l = new ArrayList();
        this.f20465l = new HashSet();
        this.f20463l = new Bundle(c13187l.yandex);
        this.f20462l = c13187l.crashlytics();
        this.f20466l = c13187l.loadAd();
        this.f20465l = c13187l.yandex();
    }

    public C10038l(C11324l c11324l) {
        this.f20464l = 1;
        this.f20463l = c11324l;
        this.f20462l = new SparseArray();
    }
}
