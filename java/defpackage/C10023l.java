package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lَؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10023l implements InterfaceC0252l, InterfaceC15837l, InterfaceC6228l, InterfaceC7882l, InterfaceC12356l, InterfaceC6646l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final String[] f20416l = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C4269l f20417l = new C4269l(5);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f20418l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f20419l;

    public C10023l(int i) {
        switch (i) {
            case 23:
                this.f20419l = new HashMap();
                this.f20418l = C5536l.loadAd;
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f20419l = new SparseIntArray();
                this.f20418l = new SparseIntArray();
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.f20419l = new ArrayList();
                this.f20418l = new C13991l();
                break;
            default:
                this.f20419l = new int[10];
                this.f20418l = new int[10];
                break;
        }
    }

    public static C5536l pro(C5536l c5536l, List list) {
        c5536l.getClass();
        Map map = c5536l.yandex;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new C5536l(map2);
    }

    public static int signatures(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static void vip(C10023l c10023l, C5536l c5536l) {
        c10023l.getClass();
        for (Map.Entry entry : new HashMap((HashMap) c10023l.f20419l).entrySet()) {
            if (entry.getKey() != null) {
                C18725l.loadAd();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!pro(c5536l, list).equals(pro((C5536l) c10023l.f20418l, list))) {
                    throw null;
                }
            }
        }
        c10023l.f20418l = c5536l;
    }

    public void Signature() {
        this.f20419l = null;
        this.f20418l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList ad() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        C3585l c3585l = (C3585l) this.f20418l;
        Context context = (Context) this.f20419l;
        Class cls = (Class) c3585l.f7511l;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C13256l(0, (String) it.next()));
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC0252l
    public Object adcel(AbstractC3031l abstractC3031l, C13146l c13146l, AbstractC18041l abstractC18041l) {
        C4207l c4207l = (C4207l) AbstractC0714l.loadAd(c13146l, ((C7780l) this.f20419l).subs);
        if (c4207l == null) {
            return null;
        }
        return ((C0458l) this.f20418l).m551native(abstractC18041l, c4207l, (InterfaceC3588l) abstractC3031l.f6545l);
    }

    @Override // defpackage.InterfaceC7882l
    public InterfaceC14356l admob(InterfaceC14356l interfaceC14356l) {
        C2723l c2723l = (C2723l) this.f20419l;
        C2700l c2700l = interfaceC14356l instanceof C2700l ? (C2700l) interfaceC14356l : null;
        if (c2700l != null && c2700l.yandex == c2723l && c2700l.loadAd != null) {
            return c2700l;
        }
        AbstractC8859l abstractC8859lTapsense = ((AbstractC8859l) this.f20418l).tapsense((AbstractC2426l) c2723l.loadAd.f14720l);
        C2700l c2700l2 = new C2700l();
        c2700l2.yandex = c2723l;
        c2700l2.loadAd = abstractC8859lTapsense;
        return c2700l2;
    }

    @Override // defpackage.InterfaceC15837l
    public List ads(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i, int i2, C18426l c18426l) {
        return appmetrica(c18426l.f35988l, (List) c18426l.firebase(((C7780l) this.f20419l).isPro), (InterfaceC3588l) abstractC3031l.f6545l);
    }

    public HashMap advert() throws C12309l {
        try {
            ((String) this.f20418l).getClass();
            Cursor cursorQuery = ((C11324l) this.f20419l).getReadableDatabase().query((String) this.f20418l, f20416l, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C17144l(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    @Override // defpackage.InterfaceC15837l
    public ArrayList amazon(C18128l c18128l, InterfaceC3588l interfaceC3588l) {
        return appmetrica(c18128l.f35440l, (List) c18128l.firebase(((C7780l) this.f20419l).firebase), interfaceC3588l);
    }

    public void applovin() {
        ((SparseIntArray) this.f20419l).clear();
    }

    public ArrayList appmetrica(List list, List list2, InterfaceC3588l interfaceC3588l) {
        if (list.isEmpty()) {
            list = list2 == null ? C2580l.f5619l : list2;
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0458l) this.f20418l).applovin((C7899l) it.next(), interfaceC3588l));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC0252l
    public /* bridge */ /* synthetic */ Object billing(AbstractC3031l abstractC3031l, C13146l c13146l, AbstractC18041l abstractC18041l) {
        return null;
    }

    @Override // defpackage.InterfaceC12356l
    public void crashlytics(InterfaceC11947l interfaceC11947l) {
        InterfaceC1711l interfaceC1711l = (InterfaceC1711l) ((HashMap) this.f20418l).remove(interfaceC11947l);
        if (interfaceC1711l != null) {
            ((AbstractC6475l) this.f20419l).loadAd(interfaceC1711l);
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m2826extends(int i, int i2, int i3, int i4) {
        AbstractC2568l abstractC2568l = (AbstractC2568l) this.f20418l;
        abstractC2568l.f5593l.set(i, i2, i3, i4);
        Rect rect = abstractC2568l.f5589l;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b5 A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #1 {all -> 0x00b6, blocks: (B:60:0x00b5, B:63:0x00b8, B:64:0x00d0), top: B:68:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:60:0x00b5, B:63:0x00b8, B:64:0x00d0), top: B:68:0x00b3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00b8, please report this as an issue */
    @Override // defpackage.InterfaceC6228l
    public InterfaceC0684l firebase(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        C3512l c3512l = (C3512l) this.f20418l;
        if (!str.equals(":memory:")) {
            str = ((C8508l) c3512l.crashlytics).yandex.getDatabasePath(str).getAbsolutePath();
        }
        boolean z = true;
        C9026l c9026l = new C9026l(str, (c3512l.yandex || c3512l.loadAd || AbstractC8576l.yandex(str, ":memory:")) ? false : true);
        ReentrantLock reentrantLock = c9026l.yandex;
        reentrantLock.lock();
        C3797l c3797l = c9026l.loadAd;
        if (c3797l != null) {
            try {
                c3797l.applovin();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
        try {
            try {
                if (c3512l.loadAd) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                InterfaceC0684l interfaceC0684lFirebase = ((InterfaceC6228l) this.f20419l).firebase(str);
                if (c3512l.yandex) {
                    if (((C8508l) c3512l.crashlytics).mopub == 3) {
                        AbstractC13628l.amazon(interfaceC0684lFirebase, "PRAGMA synchronous = NORMAL");
                    } else {
                        AbstractC13628l.amazon(interfaceC0684lFirebase, "PRAGMA synchronous = FULL");
                    }
                    C3512l.loadAd(interfaceC0684lFirebase);
                    ((AbstractC9963l) c3512l.amazon).amazon(interfaceC0684lFirebase);
                } else {
                    try {
                        c3512l.loadAd = true;
                        C3512l.yandex(c3512l, interfaceC0684lFirebase);
                        c3512l.loadAd = false;
                    } catch (Throwable th3) {
                        c3512l.loadAd = false;
                        throw th3;
                    }
                }
                if (c3797l != null && (fileChannel2 = (FileChannel) c3797l.f7902l) != null) {
                    try {
                        fileChannel2.close();
                        c3797l.f7902l = null;
                    } catch (Throwable th4) {
                        c3797l.f7902l = null;
                        throw th4;
                    }
                }
                reentrantLock.unlock();
                return interfaceC0684lFirebase;
            } catch (Throwable th5) {
                if (c3797l != null && (fileChannel = (FileChannel) c3797l.f7902l) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        c3797l.f7902l = null;
                    }
                }
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        }
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m2827for(int i, C11522l c11522l) {
        Iterator it = (Iterator) this.f20419l;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f20418l;
            if (entry == null || ((C7367l) entry.getKey()).f15280l >= i) {
                return;
            }
            C7367l c7367l = (C7367l) ((Map.Entry) this.f20418l).getKey();
            Object value = ((Map.Entry) this.f20418l).getValue();
            C2090l c2090l = C2090l.crashlytics;
            EnumC17998l enumC17998l = c7367l.f15279l;
            int i2 = c7367l.f15280l;
            if (c7367l.f15278l) {
                for (Object obj : (List) value) {
                    if (enumC17998l == EnumC17998l.f35190l) {
                        c11522l.m3102const(i2, 3);
                        ((AbstractC14080l) obj).billing(c11522l);
                        c11522l.m3102const(i2, 4);
                    } else {
                        c11522l.m3102const(i2, enumC17998l.f35193l);
                        C2090l.firebase(c11522l, enumC17998l, obj);
                    }
                }
            } else if (enumC17998l == EnumC17998l.f35190l) {
                c11522l.m3102const(i2, 3);
                ((AbstractC14080l) value).billing(c11522l);
                c11522l.m3102const(i2, 4);
            } else {
                c11522l.m3102const(i2, enumC17998l.f35193l);
                C2090l.firebase(c11522l, enumC17998l, value);
            }
            if (it.hasNext()) {
                this.f20418l = (Map.Entry) it.next();
            } else {
                this.f20418l = null;
            }
        }
    }

    public void inmobi(AbstractC12048l abstractC12048l) {
        C12014l c12014l = (C12014l) this.f20419l;
        ((ActionMode.Callback) c12014l.f23941l).onDestroyActionMode(c12014l.adcel(abstractC12048l));
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) this.f20418l;
        if (layoutInflaterFactory2C14405l.f28170l != null) {
            layoutInflaterFactory2C14405l.f28203l.getDecorView().removeCallbacks(layoutInflaterFactory2C14405l.f28214l);
        }
        if (layoutInflaterFactory2C14405l.f28174l != null) {
            C2932l c2932l = layoutInflaterFactory2C14405l.f28183l;
            if (c2932l != null) {
                c2932l.loadAd();
            }
            C2932l c2932lYandex = AbstractC15872l.yandex(layoutInflaterFactory2C14405l.f28174l);
            c2932lYandex.yandex(0.0f);
            layoutInflaterFactory2C14405l.f28183l = c2932lYandex;
            c2932lYandex.amazon(new C16972l(2, this));
        }
        layoutInflaterFactory2C14405l.f28175l = null;
        ViewGroup viewGroup = layoutInflaterFactory2C14405l.f28201l;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C14405l.m3850private();
    }

    @Override // defpackage.InterfaceC15837l
    public List isPro(AbstractC3031l abstractC3031l, C13146l c13146l) {
        List list = c13146l.f25727l;
        ((C7780l) this.f20419l).getClass();
        return appmetrica(list, null, (InterfaceC3588l) abstractC3031l.f6545l);
    }

    public InputMethodManager isVip() {
        return (InputMethodManager) ((InterfaceC1220l) this.f20418l).getValue();
    }

    public void license() {
        String str = (String) this.f20419l;
        try {
            C12714l c12714l = (C12714l) this.f20418l;
            c12714l.getClass();
            new File((File) c12714l.f25072l, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // defpackage.InterfaceC15837l
    public List loadAd(AbstractC3031l abstractC3031l, C16400l c16400l) {
        return appmetrica(c16400l.f32096l, (List) c16400l.firebase(((C7780l) this.f20419l).admob), (InterfaceC3588l) abstractC3031l.f6545l);
    }

    public C2385l metrica() throws GeneralSecurityException {
        Integer num = (Integer) this.f20419l;
        if (num == null) {
            C18262l.ads("Key size is not set");
            return null;
        }
        if (((C16751l) this.f20418l) != null) {
            return new C2385l(num.intValue(), (C16751l) this.f20418l);
        }
        C18262l.ads("Variant is not set");
        return null;
    }

    @Override // defpackage.InterfaceC12356l
    public void mopub(InterfaceC11947l interfaceC11947l) {
        HashMap map = (HashMap) this.f20418l;
        if (map.containsKey(interfaceC11947l)) {
            C8339l.smaato("Already subscribed");
            return;
        }
        C5285l c5285l = new C5285l(interfaceC11947l, new C12242l(this, interfaceC11947l, 16), 0);
        map.put(interfaceC11947l, c5285l);
        ((AbstractC6475l) this.f20419l).yandex(c5285l);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void m2828native(String str, long j, long j2) throws C12309l {
        ((String) this.f20418l).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C11324l) this.f20419l).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.f20418l, null, contentValues);
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public void m2829package(Context context, XmlResourceParser xmlResourceParser) {
        C4759l c4759l = new C4759l();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C5609l c5609lCrashlytics = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (c5609lCrashlytics == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c5609lCrashlytics.amazon.yandex(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (c5609lCrashlytics == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c5609lCrashlytics.crashlytics.yandex(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c5609lCrashlytics = C4759l.crashlytics(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (c5609lCrashlytics == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c5609lCrashlytics.loadAd.yandex(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (c5609lCrashlytics == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c5609lCrashlytics.purchase.yandex(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c5609lCrashlytics = C4759l.crashlytics(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c5609lCrashlytics.amazon.yandex = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (c5609lCrashlytics != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C16420l.yandex(context, xmlResourceParser, c5609lCrashlytics.billing);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c5609lCrashlytics = C4759l.crashlytics(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c5609lCrashlytics.amazon.f8819this = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (c5609lCrashlytics != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C16420l.yandex(context, xmlResourceParser, c5609lCrashlytics.billing);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c5609lCrashlytics = C4759l.crashlytics(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c4759l.crashlytics.put(Integer.valueOf(c5609lCrashlytics.yandex), c5609lCrashlytics);
                                        c5609lCrashlytics = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c4759l.crashlytics.put(Integer.valueOf(c5609lCrashlytics.yandex), c5609lCrashlytics);
                                        c5609lCrashlytics = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c4759l.crashlytics.put(Integer.valueOf(c5609lCrashlytics.yandex), c5609lCrashlytics);
                                        c5609lCrashlytics = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.f20418l).put(identifier, c4759l);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                ((SparseArray) this.f20418l).put(identifier, c4759l);
                return;
            }
        }
    }

    public void premium(long j) throws C12309l {
        C11324l c11324l = (C11324l) this.f20419l;
        try {
            String hexString = Long.toHexString(j);
            this.f20418l = "ExoPlayerCacheFileMetadata" + hexString;
            if (AbstractC16932l.yandex(c11324l.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c11324l.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC16932l.crashlytics(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f20418l));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f20418l) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m2830private(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f20419l = Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC15837l
    public ArrayList purchase(C17586l c17586l, InterfaceC3588l interfaceC3588l) {
        return appmetrica(c17586l.f34247l, (List) c17586l.firebase(((C7780l) this.f20419l).smaato), interfaceC3588l);
    }

    @Override // defpackage.InterfaceC15837l
    public List remoteconfig(AbstractC3031l abstractC3031l, C13146l c13146l) {
        List list = c13146l.f25733l;
        ((C7780l) this.f20419l).getClass();
        return appmetrica(list, null, (InterfaceC3588l) abstractC3031l.f6545l);
    }

    @Override // defpackage.InterfaceC15837l
    public List smaato(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i) {
        String str;
        C7780l c7780l = (C7780l) this.f20419l;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) abstractC3031l.f6545l;
        if (abstractC14080l instanceof C14036l) {
            List list = ((C14036l) abstractC14080l).f27356l;
            c7780l.getClass();
            return appmetrica(list, null, interfaceC3588l);
        }
        if (!(abstractC14080l instanceof C13146l)) {
            C17132l.metrica(abstractC14080l, "Unknown message: ");
            return null;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 1 || iInmobi == 2 || iInmobi == 3) {
            List list2 = ((C13146l) abstractC14080l).f25722l;
            c7780l.getClass();
            return appmetrica(list2, null, interfaceC3588l);
        }
        if (i == 1) {
            str = "FUNCTION";
        } else if (i == 2) {
            str = "PROPERTY";
        } else if (i != 3) {
            str = i != 4 ? "null" : "PROPERTY_SETTER";
        } else {
            str = "PROPERTY_GETTER";
        }
        C18262l.subs("Unsupported callable kind with property proto for receiver annotations: ".concat(str));
        return null;
    }

    @Override // defpackage.InterfaceC15837l
    public List startapp(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i, int i2, C18426l c18426l) {
        List listAds = c18426l != null ? ads(abstractC3031l, abstractC14080l, i, i2, c18426l) : null;
        return listAds == null ? C2580l.f5619l : listAds;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void m2831strictfp(Set set) throws C12309l {
        ((String) this.f20418l).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C11324l) this.f20419l).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f20418l, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12309l(e);
        }
    }

    @Override // defpackage.InterfaceC6646l
    public Object subs(Uri uri, C8162l c8162l) {
        AbstractC2712l abstractC2712l = (AbstractC2712l) ((InterfaceC6646l) this.f20419l).subs(uri, c8162l);
        List list = (List) this.f20418l;
        return (list == null || list.isEmpty()) ? abstractC2712l : (AbstractC2712l) abstractC2712l.yandex(list);
    }

    @Override // defpackage.InterfaceC15837l
    public List subscription(C15627l c15627l) {
        C6582l c6582l = c15627l.f30551l;
        return appmetrica(c6582l.f13791l, (List) c6582l.firebase(((C7780l) this.f20419l).crashlytics), (InterfaceC3588l) c15627l.f6545l);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m2832synchronized(String str, InterfaceC16588l interfaceC16588l, Function0 function0) {
        HashMap map = (HashMap) this.f20418l;
        if (map.containsKey(str)) {
            C8936l.subs("Another supplier is already registered with the key: ".concat(str));
        } else {
            map.put(str, new C13707l(interfaceC16588l, function0));
        }
    }

    @Override // defpackage.InterfaceC15837l
    public List tapsense(AbstractC3031l abstractC3031l, AbstractC14080l abstractC14080l, int i) {
        C7780l c7780l = (C7780l) this.f20419l;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) abstractC3031l.f6545l;
        if (abstractC14080l instanceof C13347l) {
            C13347l c13347l = (C13347l) abstractC14080l;
            return appmetrica(c13347l.f26203l, (List) c13347l.firebase(c7780l.loadAd), interfaceC3588l);
        }
        if (abstractC14080l instanceof C14036l) {
            C14036l c14036l = (C14036l) abstractC14080l;
            return appmetrica(c14036l.f27360l, (List) c14036l.firebase(c7780l.amazon), interfaceC3588l);
        }
        if (!(abstractC14080l instanceof C13146l)) {
            C17132l.metrica(abstractC14080l, "Unknown message: ");
            return null;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 1) {
            C13146l c13146l = (C13146l) abstractC14080l;
            return appmetrica(c13146l.f25718l, (List) c13146l.firebase(c7780l.purchase), interfaceC3588l);
        }
        if (iInmobi == 2) {
            C13146l c13146l2 = (C13146l) abstractC14080l;
            return appmetrica(c13146l2.f25714l, (List) c13146l2.firebase(c7780l.billing), interfaceC3588l);
        }
        if (iInmobi == 3) {
            C13146l c13146l3 = (C13146l) abstractC14080l;
            return appmetrica(c13146l3.f25741l, (List) c13146l3.firebase(c7780l.mopub), interfaceC3588l);
        }
        C8339l.smaato("Unsupported callable kind with property proto");
        return null;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean m2833throws(AbstractC12048l abstractC12048l, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C14405l) this.f20418l).f28201l;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        viewGroup.requestApplyInsets();
        C12014l c12014l = (C12014l) this.f20419l;
        ActionMode.Callback callback = (ActionMode.Callback) c12014l.f23941l;
        C8363l c8363lAdcel = c12014l.adcel(abstractC12048l);
        C5128l c5128l = (C5128l) c12014l.f23943l;
        Menu menuC0062l = (Menu) c5128l.get(menu);
        if (menuC0062l == null) {
            menuC0062l = new MenuC0062l((Context) c12014l.f23940l, (MenuC4984l) menu);
            c5128l.put(menu, menuC0062l);
        }
        return callback.onPrepareActionMode(c8363lAdcel, menuC0062l);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public C7695l m2834volatile() {
        Map map = (Map) this.f20419l;
        HashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new HashMap();
        for (Map.Entry entry : ((HashMap) this.f20418l).entrySet()) {
            String str = (String) entry.getKey();
            C13707l c13707l = (C13707l) entry.getValue();
            Object objInvoke = c13707l.loadAd.invoke();
            C7695l c7695lYandex = objInvoke != null ? AbstractC16840l.yandex(c13707l.yandex, objInvoke) : null;
            if (c7695lYandex != null) {
                linkedHashMap.put(str, c7695lYandex);
            }
        }
        return AbstractC16840l.yandex(C6343l.Companion.serializer(), new C6343l(linkedHashMap));
    }

    @Override // defpackage.InterfaceC12356l
    public EnumC2771l yandex() {
        int iOrdinal = ((C5268l) ((AbstractC6475l) this.f20419l)).subs.ordinal();
        if (iOrdinal == 0) {
            return EnumC2771l.f6019l;
        }
        if (iOrdinal == 1) {
            return EnumC2771l.f6018l;
        }
        if (iOrdinal == 2) {
            return EnumC2771l.f6017l;
        }
        if (iOrdinal == 3) {
            return EnumC2771l.f6021l;
        }
        if (iOrdinal == 4) {
            return EnumC2771l.f6020l;
        }
        C18725l.billing();
        return null;
    }

    public /* synthetic */ C10023l(Object obj, Object obj2) {
        this.f20418l = obj;
        this.f20419l = obj2;
    }

    public /* synthetic */ C10023l(Object obj, Object obj2, boolean z) {
        this.f20419l = obj;
        this.f20418l = obj2;
    }

    public C10023l(C7695l c7695l) {
        C6343l c6343l;
        this.f20419l = (c7695l == null || (c6343l = (C6343l) c7695l.yandex(C6343l.Companion.serializer())) == null) ? null : c6343l.yandex;
        this.f20418l = new HashMap();
    }

    public C10023l(InterfaceC11865l interfaceC11865l, C12014l c12014l, C7780l c7780l) {
        this.f20419l = c7780l;
        this.f20418l = new C0458l(interfaceC11865l, c12014l, 5);
    }

    public C10023l(AbstractC6475l abstractC6475l) {
        this.f20419l = abstractC6475l;
        this.f20418l = new HashMap();
    }

    public C10023l(C12714l c12714l) {
        this.f20419l = c12714l;
        this.f20418l = f20417l;
    }

    public C10023l(View view) {
        this.f20419l = view;
        this.f20418l = AbstractC9968l.crashlytics(3, new C7730l(12, this));
    }

    public C10023l(AbstractC2597l abstractC2597l) {
        C2090l c2090l = abstractC2597l.f5657l;
        c2090l.getClass();
        Iterator it = ((C6542l) c2090l.yandex.entrySet()).iterator();
        this.f20419l = it;
        if (it.hasNext()) {
            this.f20418l = (Map.Entry) it.next();
        }
    }
}
