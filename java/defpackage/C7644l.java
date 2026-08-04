package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.json.JSONObject;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؚۥۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7644l implements InterfaceC0589l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f15734l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f15735l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f15736l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f15737l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f15738l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f15739l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f15740l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f15741l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f15742l;

    public C7644l(C0511l c0511l, InterfaceC3588l interfaceC3588l, InterfaceC8371l interfaceC8371l, C14965l c14965l, C5557l c5557l, AbstractC12974l abstractC12974l, InterfaceC8850l interfaceC8850l, C15615l c15615l, List list) {
        this.f15738l = c0511l;
        this.f15737l = interfaceC3588l;
        this.f15734l = interfaceC8371l;
        this.f15740l = c14965l;
        this.f15739l = c5557l;
        this.f15742l = abstractC12974l;
        this.f15735l = interfaceC8850l;
        this.f15736l = new C15615l(this, c15615l, list, "Deserializer for \"" + interfaceC8371l.getName() + '\"', interfaceC8850l != null ? interfaceC8850l.vip() : "[container not found]");
        this.f15741l = new C8792l(this);
    }

    public static void vip(JSONObject jSONObject, String str) {
        StringBuilder sbAd = AbstractC5020l.ad(str);
        sbAd.append(jSONObject.toString());
        String string = sbAd.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object adcel(AbstractC0283l abstractC0283l) {
        C15932l c15932l;
        if (abstractC0283l instanceof C15932l) {
            c15932l = (C15932l) abstractC0283l;
            int i = c15932l.f31270l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15932l.f31270l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15932l = new C15932l(this, abstractC0283l);
            }
        } else {
            c15932l = new C15932l(this, abstractC0283l);
        }
        Object objStartapp = c15932l.f31269l;
        int i2 = c15932l.f31270l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objStartapp);
            if (((C4645l) this.f15735l).yandex == 0) {
                return Unit.INSTANCE;
            }
            if (AbstractC7866l.yandex.purchase().compareTo(((C4645l) this.f15735l).billing) >= 0) {
                c15932l.f31270l = 1;
                objStartapp = AbstractC13095l.startapp(this, null, c15932l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objStartapp == enumC9342l) {
                    return enumC9342l;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(objStartapp);
        C4964l c4964l = (C4964l) AbstractC10802l.isPro((AbstractC14237l) objStartapp);
        if (c4964l == null) {
            return Unit.INSTANCE;
        }
        C4645l c4645l = (C4645l) this.f15735l;
        String strYandex = c4964l.yandex();
        String str = c4964l.amazon;
        C2106l c2106lPurchase = AbstractC7866l.yandex.purchase();
        C6760l c6760l = C9658l.f19699l;
        C4645l c4645lYandex = C4645l.yandex(c4645l, 0L, null, null, null, null, c2106lPurchase.loadAd(AbstractC15918l.tapsense(30, EnumC16636l.MINUTES)), strYandex, c4964l.loadAd, c4964l.crashlytics, str, false, 1055);
        AbstractC2238l.isPro((C7026l) this.f15742l, c4645lYandex);
        this.f15735l = c4645lYandex;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object admob(AbstractC0283l abstractC0283l) {
        C12484l c12484l;
        if (abstractC0283l instanceof C12484l) {
            c12484l = (C12484l) abstractC0283l;
            int i = c12484l.f24624l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12484l.f24624l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12484l = new C12484l(this, abstractC0283l);
            }
        } else {
            c12484l = new C12484l(this, abstractC0283l);
        }
        Object objSmaato = c12484l.f24623l;
        int i2 = c12484l.f24624l;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSmaato);
            c12484l.f24624l = 1;
            objSmaato = smaato(new C13954l(this, interfaceC14029l, 10), c12484l);
            if (objSmaato != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objSmaato);
                return objSmaato;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(objSmaato);
        if (!((Boolean) objSmaato).booleanValue()) {
            return Boolean.FALSE;
        }
        c12484l.f24624l = 2;
        Object objSmaato2 = smaato(new C14897l(true, this, null), c12484l);
        return objSmaato2 == obj ? obj : objSmaato2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f1, code lost:
    
        if (r1 == r14) goto L39;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x01b1, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object amazon(int r20, java.lang.String r21, java.lang.String r22, defpackage.AbstractC0283l r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7644l.amazon(int, java.lang.String, java.lang.String, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0189 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0198 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ac A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c0 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f6 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x020e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x020f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0215 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x022b  */
    /* JADX WARN: Code duplicated, block: B:129:0x022c  */
    /* JADX WARN: Code duplicated, block: B:133:0x023e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x0249 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x024f A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0253 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006f A[PHI: r1 r2
  0x006f: PHI (r1v12 java.lang.Object) = (r1v8 java.lang.Object), (r1v1 java.lang.Object) binds: [B:52:0x00dd, B:30:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r2v11 lٗۡؑ) = (r2v6 lٗۡؑ), (r2v27 lٗۡؑ) binds: [B:52:0x00dd, B:30:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0141  */
    /* JADX WARN: Code duplicated, block: B:84:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x0147 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:95:0x016b A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0184 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:18:0x003e, B:130:0x022d, B:21:0x004b, B:116:0x01f2, B:134:0x023f, B:118:0x01f6, B:24:0x005a, B:93:0x0167, B:95:0x016b, B:27:0x0065, B:75:0x0121, B:77:0x0125, B:30:0x006c, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:61:0x00f2, B:66:0x00fd, B:69:0x0107, B:71:0x010d, B:85:0x0147, B:87:0x014d, B:89:0x0153, B:99:0x0184, B:101:0x0189, B:103:0x018f, B:105:0x0198, B:106:0x01a8, B:108:0x01ac, B:109:0x01bc, B:111:0x01c0, B:112:0x01c5, B:124:0x0215, B:126:0x0219, B:136:0x0249, B:138:0x024f, B:140:0x0253, B:141:0x025a, B:63:0x00f6, B:64:0x00f9, B:33:0x0074, B:40:0x009d, B:42:0x00a3, B:44:0x00ad, B:46:0x00b9, B:49:0x00be, B:51:0x00d0, B:36:0x007b), top: B:147:0x0029 }] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15, types: [lؖۦٌ, lٗۡؑ] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [lؖۦٌ, lٗۡؑ] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public Object billing(C17464l c17464l, InterfaceC14029l interfaceC14029l) {
        C11099l c11099l;
        C17464l c17464l2;
        AbstractC10022l abstractC10022l;
        C17464l c17464l3;
        C0951l c0951l;
        C4513l c4513l;
        Object obj;
        String str;
        int i;
        ?? r6;
        Object obj2;
        int i2;
        Object obj3;
        String str2;
        C3585l c3585l;
        C17963l c17963l;
        Double d;
        Integer num;
        String str3;
        ?? r7;
        Object objFirebase;
        C17464l c17464l4;
        C4513l c4513l2;
        int i3;
        C17464l c17464l5;
        int i4;
        C3585l c3585l2;
        C17464l c17464l6;
        int i5;
        Object obj4;
        C1245l c1245l;
        Map map;
        Object objBilling;
        Map map2;
        Object objBilling2;
        Map map3;
        Object objBilling3;
        Object objBilling4;
        if (interfaceC14029l instanceof C11099l) {
            c11099l = (C11099l) interfaceC14029l;
            int i6 = c11099l.f22301l;
            if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11099l.f22301l = i6 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11099l = new C11099l(this, interfaceC14029l);
            }
        } else {
            c11099l = new C11099l(this, interfaceC14029l);
        }
        C11099l c11099l2 = c11099l;
        Object objMopub = c11099l2.f22297l;
        int i7 = c11099l2.f22301l;
        InterfaceC14029l interfaceC14029l2 = null;
        Object obj5 = EnumC9342l.f19165l;
        try {
            switch (i7) {
                case 0:
                    AbstractC2829l.crashlytics(objMopub);
                    String str4 = (String) c17464l.amazon;
                    boolean z = c17464l.yandex;
                    String str5 = (String) c17464l.purchase;
                    HashMap map4 = (LinkedHashMap) c17464l.mopub;
                    Map map5 = (LinkedHashMap) c17464l.admob;
                    c11099l2.f22300l = c17464l;
                    c11099l2.f22301l = 1;
                    objMopub = mopub(str4, z, str5, map4, map5, null, false, c11099l2);
                    if (objMopub != obj5) {
                        c17464l2 = c17464l;
                        abstractC10022l = (AbstractC10022l) objMopub;
                        if (c17464l2.loadAd) {
                            return new C17922l(993, "BH.VkApi - One-Shot methods have no content");
                        }
                        if (!AbstractC8576l.yandex(abstractC10022l.mopub(), C2759l.f5975l) && !c17464l2.yandex) {
                            return new C17922l(abstractC10022l.mopub().f5987l, abstractC10022l.mopub().f5986l);
                        }
                        InterfaceC13540l interfaceC13540l = (InterfaceC13540l) c17464l2.billing;
                        c11099l2.f22300l = c17464l2;
                        c11099l2.f22301l = 2;
                        objMopub = interfaceC13540l.mo805throws(abstractC10022l, c11099l2);
                        if (objMopub == obj5) {
                            c17464l3 = c17464l2;
                            c0951l = (C0951l) objMopub;
                            if (c17464l3.yandex) {
                                obj4 = c0951l.yandex;
                                if (obj4 instanceof C1245l) {
                                    c1245l = (C1245l) obj4;
                                } else {
                                    c1245l = null;
                                }
                                if (c1245l != null || (c4513l = c1245l.yandex) == null) {
                                    c4513l = c0951l.loadAd;
                                }
                            } else {
                                c4513l = c0951l.loadAd;
                            }
                            if (c4513l == null) {
                                obj = c0951l.yandex;
                                if (obj != null) {
                                    return new C10898l(obj);
                                }
                                throw new IllegalStateException("[unboxVkResponse] raw as no error but response is null, needs investigating");
                            }
                            str = c4513l.subs;
                            i = c4513l.yandex;
                            if (i == 17) {
                                if (str != null && (c3585l2 = (C3585l) this.f15737l) != null) {
                                    c11099l2.f22300l = c17464l3;
                                    c11099l2.f22299l = c4513l;
                                    c11099l2.f22302l = 0;
                                    c11099l2.f22301l = 3;
                                    objMopub = c3585l2.subs(str, c11099l2);
                                    if (objMopub != obj5) {
                                        c17464l6 = c17464l3;
                                        c4513l2 = c4513l;
                                        i5 = 0;
                                        map = (Map) objMopub;
                                        if (map != null) {
                                            ((LinkedHashMap) c17464l6.mopub).putAll(map);
                                            c11099l2.f22300l = null;
                                            c11099l2.f22299l = null;
                                            c11099l2.f22302l = i5;
                                            c11099l2.f22301l = 4;
                                            objBilling = billing(c17464l6, c11099l2);
                                            if (objBilling != obj5) {
                                                return objBilling;
                                            }
                                        }
                                        c4513l = c4513l2;
                                    }
                                }
                                return new C17922l(c4513l.yandex, c4513l.loadAd);
                            }
                            if (i != 14) {
                                r6 = 0;
                                obj2 = obj5;
                                if (i == 1117 && !c17464l3.crashlytics) {
                                    c17464l3.crashlytics = true;
                                    c11099l2.f22300l = c17464l3;
                                    c11099l2.f22299l = null;
                                    c11099l2.f22302l = 0;
                                    c11099l2.f22301l = 9;
                                    if (admob(c11099l2) == obj2) {
                                        return obj2;
                                    }
                                    i2 = 0;
                                    c11099l2.f22300l = r6;
                                    c11099l2.f22299l = r6;
                                    c11099l2.f22302l = i2;
                                    c11099l2.f22301l = 10;
                                    objBilling4 = billing(c17464l3, c11099l2);
                                    if (objBilling4 == obj2) {
                                        return obj2;
                                    }
                                    return objBilling4;
                                }
                            } else if (str != null || str.length() <= 0) {
                                obj3 = obj5;
                                str2 = c4513l.amazon;
                                if (str2 != null && (c3585l = (C3585l) this.f15737l) != null) {
                                    c17963l = new C17963l();
                                    d = c4513l.mopub;
                                    if (d != null) {
                                    }
                                    num = c4513l.admob;
                                    if (num != null) {
                                    }
                                    str3 = c4513l.purchase;
                                    if (str3 != null) {
                                        c17963l.put("captcha_sid", str3);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    C17963l c17963lCrashlytics = c17963l.crashlytics();
                                    c11099l2.f22300l = c17464l3;
                                    c11099l2.f22299l = c4513l;
                                    c11099l2.f22302l = 0;
                                    c11099l2.f22301l = 7;
                                    C16552l c16552l = AbstractC11463l.yandex;
                                    r7 = 0;
                                    objFirebase = AbstractC10999l.firebase(AbstractC17278l.yandex, new C0384l(str2, c17963lCrashlytics, (AppActivity) c3585l.f7511l, interfaceC14029l2, 4), c11099l2);
                                    if (objFirebase == obj3) {
                                        return obj3;
                                    }
                                    c17464l4 = c17464l3;
                                    c4513l2 = c4513l;
                                    i3 = 0;
                                    map3 = (Map) objFirebase;
                                    if (map3 != null) {
                                        ((LinkedHashMap) c17464l4.mopub).putAll(map3);
                                        c11099l2.f22300l = r7;
                                        c11099l2.f22299l = r7;
                                        c11099l2.f22302l = i3;
                                        c11099l2.f22301l = 8;
                                        objBilling3 = billing(c17464l4, c11099l2);
                                        if (objBilling3 == obj3) {
                                            return obj3;
                                        }
                                        return objBilling3;
                                    }
                                    c4513l = c4513l2;
                                }
                            } else {
                                C3585l c3585l3 = (C3585l) this.f15737l;
                                if (c3585l3 != null) {
                                    c11099l2.f22300l = c17464l3;
                                    c11099l2.f22299l = c4513l;
                                    c11099l2.f22302l = 0;
                                    c11099l2.f22301l = 5;
                                    objMopub = c3585l3.subs(str, c11099l2);
                                    if (objMopub != obj5) {
                                        c17464l5 = c17464l3;
                                        c4513l2 = c4513l;
                                        i4 = 0;
                                        map2 = (Map) objMopub;
                                        if (map2 != null) {
                                            ((LinkedHashMap) c17464l5.mopub).putAll(map2);
                                            c11099l2.f22300l = null;
                                            c11099l2.f22299l = null;
                                            c11099l2.f22302l = i4;
                                            c11099l2.f22301l = 6;
                                            objBilling2 = billing(c17464l5, c11099l2);
                                            if (objBilling2 != obj5) {
                                                return objBilling2;
                                            }
                                        }
                                        c4513l = c4513l2;
                                    }
                                }
                            }
                            return new C17922l(c4513l.yandex, c4513l.loadAd);
                        }
                    }
                    return obj5;
                case 1:
                    c17464l2 = c11099l2.f22300l;
                    AbstractC2829l.crashlytics(objMopub);
                    abstractC10022l = (AbstractC10022l) objMopub;
                    if (c17464l2.loadAd) {
                        return new C17922l(993, "BH.VkApi - One-Shot methods have no content");
                    }
                    if (!AbstractC8576l.yandex(abstractC10022l.mopub(), C2759l.f5975l)) {
                        return new C17922l(abstractC10022l.mopub().f5987l, abstractC10022l.mopub().f5986l);
                    }
                    InterfaceC13540l interfaceC13540l2 = (InterfaceC13540l) c17464l2.billing;
                    c11099l2.f22300l = c17464l2;
                    c11099l2.f22301l = 2;
                    objMopub = interfaceC13540l2.mo805throws(abstractC10022l, c11099l2);
                    if (objMopub == obj5) {
                        c17464l3 = c17464l2;
                        c0951l = (C0951l) objMopub;
                        if (c17464l3.yandex) {
                            obj4 = c0951l.yandex;
                            if (obj4 instanceof C1245l) {
                                c1245l = (C1245l) obj4;
                            } else {
                                c1245l = null;
                            }
                            if (c1245l != null) {
                                c4513l = c0951l.loadAd;
                            } else {
                                c4513l = c0951l.loadAd;
                            }
                        } else {
                            c4513l = c0951l.loadAd;
                        }
                        if (c4513l == null) {
                            obj = c0951l.yandex;
                            if (obj != null) {
                                return new C10898l(obj);
                            }
                            throw new IllegalStateException("[unboxVkResponse] raw as no error but response is null, needs investigating");
                        }
                        str = c4513l.subs;
                        i = c4513l.yandex;
                        if (i == 17) {
                            if (str != null) {
                                c11099l2.f22300l = c17464l3;
                                c11099l2.f22299l = c4513l;
                                c11099l2.f22302l = 0;
                                c11099l2.f22301l = 3;
                                objMopub = c3585l2.subs(str, c11099l2);
                                if (objMopub != obj5) {
                                    c17464l6 = c17464l3;
                                    c4513l2 = c4513l;
                                    i5 = 0;
                                    map = (Map) objMopub;
                                    if (map != null) {
                                        ((LinkedHashMap) c17464l6.mopub).putAll(map);
                                        c11099l2.f22300l = null;
                                        c11099l2.f22299l = null;
                                        c11099l2.f22302l = i5;
                                        c11099l2.f22301l = 4;
                                        objBilling = billing(c17464l6, c11099l2);
                                        if (objBilling != obj5) {
                                            return objBilling;
                                        }
                                    }
                                    c4513l = c4513l2;
                                }
                            }
                            return new C17922l(c4513l.yandex, c4513l.loadAd);
                        }
                        if (i != 14) {
                            r6 = 0;
                            obj2 = obj5;
                            if (i == 1117) {
                                c17464l3.crashlytics = true;
                                c11099l2.f22300l = c17464l3;
                                c11099l2.f22299l = null;
                                c11099l2.f22302l = 0;
                                c11099l2.f22301l = 9;
                                if (admob(c11099l2) == obj2) {
                                    return obj2;
                                }
                                i2 = 0;
                                c11099l2.f22300l = r6;
                                c11099l2.f22299l = r6;
                                c11099l2.f22302l = i2;
                                c11099l2.f22301l = 10;
                                objBilling4 = billing(c17464l3, c11099l2);
                                if (objBilling4 == obj2) {
                                    return obj2;
                                }
                                return objBilling4;
                            }
                        } else if (str != null) {
                            obj3 = obj5;
                            str2 = c4513l.amazon;
                            if (str2 != null) {
                                c17963l = new C17963l();
                                d = c4513l.mopub;
                                if (d != null) {
                                }
                                num = c4513l.admob;
                                if (num != null) {
                                }
                                str3 = c4513l.purchase;
                                if (str3 != null) {
                                    c17963l.put("captcha_sid", str3);
                                }
                                Unit unit2 = Unit.INSTANCE;
                                C17963l c17963lCrashlytics2 = c17963l.crashlytics();
                                c11099l2.f22300l = c17464l3;
                                c11099l2.f22299l = c4513l;
                                c11099l2.f22302l = 0;
                                c11099l2.f22301l = 7;
                                C16552l c16552l2 = AbstractC11463l.yandex;
                                r7 = 0;
                                objFirebase = AbstractC10999l.firebase(AbstractC17278l.yandex, new C0384l(str2, c17963lCrashlytics2, (AppActivity) c3585l.f7511l, interfaceC14029l2, 4), c11099l2);
                                if (objFirebase == obj3) {
                                    return obj3;
                                }
                                c17464l4 = c17464l3;
                                c4513l2 = c4513l;
                                i3 = 0;
                                map3 = (Map) objFirebase;
                                if (map3 != null) {
                                    ((LinkedHashMap) c17464l4.mopub).putAll(map3);
                                    c11099l2.f22300l = r7;
                                    c11099l2.f22299l = r7;
                                    c11099l2.f22302l = i3;
                                    c11099l2.f22301l = 8;
                                    objBilling3 = billing(c17464l4, c11099l2);
                                    if (objBilling3 == obj3) {
                                        return obj3;
                                    }
                                    return objBilling3;
                                }
                                c4513l = c4513l2;
                            }
                        } else {
                            obj3 = obj5;
                            str2 = c4513l.amazon;
                            if (str2 != null) {
                                c17963l = new C17963l();
                                d = c4513l.mopub;
                                if (d != null) {
                                }
                                num = c4513l.admob;
                                if (num != null) {
                                }
                                str3 = c4513l.purchase;
                                if (str3 != null) {
                                    c17963l.put("captcha_sid", str3);
                                }
                                Unit unit3 = Unit.INSTANCE;
                                C17963l c17963lCrashlytics3 = c17963l.crashlytics();
                                c11099l2.f22300l = c17464l3;
                                c11099l2.f22299l = c4513l;
                                c11099l2.f22302l = 0;
                                c11099l2.f22301l = 7;
                                C16552l c16552l3 = AbstractC11463l.yandex;
                                r7 = 0;
                                objFirebase = AbstractC10999l.firebase(AbstractC17278l.yandex, new C0384l(str2, c17963lCrashlytics3, (AppActivity) c3585l.f7511l, interfaceC14029l2, 4), c11099l2);
                                if (objFirebase == obj3) {
                                    return obj3;
                                }
                                c17464l4 = c17464l3;
                                c4513l2 = c4513l;
                                i3 = 0;
                                map3 = (Map) objFirebase;
                                if (map3 != null) {
                                    ((LinkedHashMap) c17464l4.mopub).putAll(map3);
                                    c11099l2.f22300l = r7;
                                    c11099l2.f22299l = r7;
                                    c11099l2.f22302l = i3;
                                    c11099l2.f22301l = 8;
                                    objBilling3 = billing(c17464l4, c11099l2);
                                    if (objBilling3 == obj3) {
                                        return obj3;
                                    }
                                    return objBilling3;
                                }
                                c4513l = c4513l2;
                            }
                        }
                        return new C17922l(c4513l.yandex, c4513l.loadAd);
                    }
                    return obj5;
                case 2:
                    c17464l2 = c11099l2.f22300l;
                    AbstractC2829l.crashlytics(objMopub);
                    c17464l3 = c17464l2;
                    c0951l = (C0951l) objMopub;
                    if (c17464l3.yandex) {
                        obj4 = c0951l.yandex;
                        if (obj4 instanceof C1245l) {
                            c1245l = (C1245l) obj4;
                        } else {
                            c1245l = null;
                        }
                        if (c1245l != null) {
                            c4513l = c0951l.loadAd;
                        } else {
                            c4513l = c0951l.loadAd;
                        }
                    } else {
                        c4513l = c0951l.loadAd;
                    }
                    if (c4513l == null) {
                        obj = c0951l.yandex;
                        if (obj != null) {
                            return new C10898l(obj);
                        }
                        throw new IllegalStateException("[unboxVkResponse] raw as no error but response is null, needs investigating");
                    }
                    str = c4513l.subs;
                    i = c4513l.yandex;
                    if (i == 17) {
                        if (str != null) {
                            c11099l2.f22300l = c17464l3;
                            c11099l2.f22299l = c4513l;
                            c11099l2.f22302l = 0;
                            c11099l2.f22301l = 3;
                            objMopub = c3585l2.subs(str, c11099l2);
                            if (objMopub != obj5) {
                                c17464l6 = c17464l3;
                                c4513l2 = c4513l;
                                i5 = 0;
                                map = (Map) objMopub;
                                if (map != null) {
                                    ((LinkedHashMap) c17464l6.mopub).putAll(map);
                                    c11099l2.f22300l = null;
                                    c11099l2.f22299l = null;
                                    c11099l2.f22302l = i5;
                                    c11099l2.f22301l = 4;
                                    objBilling = billing(c17464l6, c11099l2);
                                    if (objBilling != obj5) {
                                        return objBilling;
                                    }
                                }
                                c4513l = c4513l2;
                            }
                            return obj5;
                        }
                        return new C17922l(c4513l.yandex, c4513l.loadAd);
                    }
                    if (i != 14) {
                        r6 = 0;
                        obj2 = obj5;
                        if (i == 1117) {
                            c17464l3.crashlytics = true;
                            c11099l2.f22300l = c17464l3;
                            c11099l2.f22299l = null;
                            c11099l2.f22302l = 0;
                            c11099l2.f22301l = 9;
                            if (admob(c11099l2) == obj2) {
                                return obj2;
                            }
                            i2 = 0;
                            c11099l2.f22300l = r6;
                            c11099l2.f22299l = r6;
                            c11099l2.f22302l = i2;
                            c11099l2.f22301l = 10;
                            objBilling4 = billing(c17464l3, c11099l2);
                            if (objBilling4 == obj2) {
                                return obj2;
                            }
                            return objBilling4;
                        }
                    } else if (str != null) {
                        obj3 = obj5;
                        str2 = c4513l.amazon;
                        if (str2 != null) {
                            c17963l = new C17963l();
                            d = c4513l.mopub;
                            if (d != null) {
                            }
                            num = c4513l.admob;
                            if (num != null) {
                            }
                            str3 = c4513l.purchase;
                            if (str3 != null) {
                                c17963l.put("captcha_sid", str3);
                            }
                            Unit unit4 = Unit.INSTANCE;
                            C17963l c17963lCrashlytics4 = c17963l.crashlytics();
                            c11099l2.f22300l = c17464l3;
                            c11099l2.f22299l = c4513l;
                            c11099l2.f22302l = 0;
                            c11099l2.f22301l = 7;
                            C16552l c16552l4 = AbstractC11463l.yandex;
                            r7 = 0;
                            objFirebase = AbstractC10999l.firebase(AbstractC17278l.yandex, new C0384l(str2, c17963lCrashlytics4, (AppActivity) c3585l.f7511l, interfaceC14029l2, 4), c11099l2);
                            if (objFirebase == obj3) {
                                return obj3;
                            }
                            c17464l4 = c17464l3;
                            c4513l2 = c4513l;
                            i3 = 0;
                            map3 = (Map) objFirebase;
                            if (map3 != null) {
                                ((LinkedHashMap) c17464l4.mopub).putAll(map3);
                                c11099l2.f22300l = r7;
                                c11099l2.f22299l = r7;
                                c11099l2.f22302l = i3;
                                c11099l2.f22301l = 8;
                                objBilling3 = billing(c17464l4, c11099l2);
                                if (objBilling3 == obj3) {
                                    return obj3;
                                }
                                return objBilling3;
                            }
                            c4513l = c4513l2;
                        }
                    } else {
                        obj3 = obj5;
                        str2 = c4513l.amazon;
                        if (str2 != null) {
                            c17963l = new C17963l();
                            d = c4513l.mopub;
                            if (d != null) {
                            }
                            num = c4513l.admob;
                            if (num != null) {
                            }
                            str3 = c4513l.purchase;
                            if (str3 != null) {
                                c17963l.put("captcha_sid", str3);
                            }
                            Unit unit5 = Unit.INSTANCE;
                            C17963l c17963lCrashlytics5 = c17963l.crashlytics();
                            c11099l2.f22300l = c17464l3;
                            c11099l2.f22299l = c4513l;
                            c11099l2.f22302l = 0;
                            c11099l2.f22301l = 7;
                            C16552l c16552l5 = AbstractC11463l.yandex;
                            r7 = 0;
                            objFirebase = AbstractC10999l.firebase(AbstractC17278l.yandex, new C0384l(str2, c17963lCrashlytics5, (AppActivity) c3585l.f7511l, interfaceC14029l2, 4), c11099l2);
                            if (objFirebase == obj3) {
                                return obj3;
                            }
                            c17464l4 = c17464l3;
                            c4513l2 = c4513l;
                            i3 = 0;
                            map3 = (Map) objFirebase;
                            if (map3 != null) {
                                ((LinkedHashMap) c17464l4.mopub).putAll(map3);
                                c11099l2.f22300l = r7;
                                c11099l2.f22299l = r7;
                                c11099l2.f22302l = i3;
                                c11099l2.f22301l = 8;
                                objBilling3 = billing(c17464l4, c11099l2);
                                if (objBilling3 == obj3) {
                                    return obj3;
                                }
                                return objBilling3;
                            }
                            c4513l = c4513l2;
                        }
                    }
                    return new C17922l(c4513l.yandex, c4513l.loadAd);
                case 3:
                    i5 = c11099l2.f22302l;
                    c4513l2 = c11099l2.f22299l;
                    c17464l6 = c11099l2.f22300l;
                    AbstractC2829l.crashlytics(objMopub);
                    map = (Map) objMopub;
                    if (map != null) {
                        ((LinkedHashMap) c17464l6.mopub).putAll(map);
                        c11099l2.f22300l = null;
                        c11099l2.f22299l = null;
                        c11099l2.f22302l = i5;
                        c11099l2.f22301l = 4;
                        objBilling = billing(c17464l6, c11099l2);
                        if (objBilling != obj5) {
                            return obj5;
                        }
                        return objBilling;
                    }
                    c4513l = c4513l2;
                    return new C17922l(c4513l.yandex, c4513l.loadAd);
                case 4:
                case 6:
                case 8:
                case 10:
                    AbstractC2829l.crashlytics(objMopub);
                    return objMopub;
                case 5:
                    i4 = c11099l2.f22302l;
                    c4513l2 = c11099l2.f22299l;
                    c17464l5 = c11099l2.f22300l;
                    AbstractC2829l.crashlytics(objMopub);
                    map2 = (Map) objMopub;
                    if (map2 != null) {
                        ((LinkedHashMap) c17464l5.mopub).putAll(map2);
                        c11099l2.f22300l = null;
                        c11099l2.f22299l = null;
                        c11099l2.f22302l = i4;
                        c11099l2.f22301l = 6;
                        objBilling2 = billing(c17464l5, c11099l2);
                        if (objBilling2 != obj5) {
                            return obj5;
                        }
                        return objBilling2;
                    }
                    c4513l = c4513l2;
                    return new C17922l(c4513l.yandex, c4513l.loadAd);
                case 7:
                    i3 = c11099l2.f22302l;
                    c4513l2 = c11099l2.f22299l;
                    C17464l c17464l7 = c11099l2.f22300l;
                    AbstractC2829l.crashlytics(objMopub);
                    c17464l4 = c17464l7;
                    r7 = 0;
                    objFirebase = objMopub;
                    obj3 = obj5;
                    map3 = (Map) objFirebase;
                    if (map3 != null) {
                        ((LinkedHashMap) c17464l4.mopub).putAll(map3);
                        c11099l2.f22300l = r7;
                        c11099l2.f22299l = r7;
                        c11099l2.f22302l = i3;
                        c11099l2.f22301l = 8;
                        objBilling3 = billing(c17464l4, c11099l2);
                        if (objBilling3 == obj3) {
                            return obj3;
                        }
                        return objBilling3;
                    }
                    c4513l = c4513l2;
                    return new C17922l(c4513l.yandex, c4513l.loadAd);
                case 9:
                    i2 = c11099l2.f22302l;
                    c17464l3 = c11099l2.f22300l;
                    AbstractC2829l.crashlytics(objMopub);
                    r6 = 0;
                    obj2 = obj5;
                    c11099l2.f22300l = r6;
                    c11099l2.f22299l = r6;
                    c11099l2.f22302l = i2;
                    c11099l2.f22301l = 10;
                    objBilling4 = billing(c17464l3, c11099l2);
                    if (objBilling4 == obj2) {
                        return obj2;
                    }
                    return objBilling4;
                default:
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new C17922l(0, message);
        }
    }

    public C6871l firebase() {
        return (C6871l) ((AtomicReference) this.f15736l).get();
    }

    @Override // defpackage.InterfaceC0589l
    public View getRoot() {
        return (FrameLayout) this.f15738l;
    }

    public C6871l isPro(int i) {
        C6871l c6871l = null;
        try {
            if (!AbstractC5020l.firebase(2, i)) {
                JSONObject jSONObjectApplovin = ((C7026l) this.f15739l).applovin();
                if (jSONObjectApplovin != null) {
                    C6871l c6871lInmobi = ((C5008l) this.f15734l).inmobi(jSONObjectApplovin);
                    vip(jSONObjectApplovin, "Loaded cached settings: ");
                    ((C15655l) this.f15740l).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (AbstractC5020l.firebase(3, i) || c6871lInmobi.crashlytics >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return c6871lInmobi;
                        } catch (Exception e) {
                            e = e;
                            c6871l = c6871lInmobi;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return c6871l;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public C7644l loadAd(InterfaceC8371l interfaceC8371l, List list, InterfaceC3588l interfaceC3588l, C14965l c14965l, C5557l c5557l, AbstractC12974l abstractC12974l) {
        C0511l c0511l = (C0511l) this.f15738l;
        int i = abstractC12974l.loadAd;
        if ((i != 1 || abstractC12974l.crashlytics < 4) && i <= 1) {
            c5557l = (C5557l) this.f15739l;
        }
        return new C7644l(c0511l, interfaceC3588l, interfaceC8371l, c14965l, c5557l, abstractC12974l, (InterfaceC8850l) this.f15735l, (C15615l) this.f15736l, list);
    }

    public void metrica(long j) {
        C7026l c7026l = (C7026l) this.f15742l;
        C4645l c4645lAmazon = AbstractC2238l.amazon(c7026l, j);
        if (c4645lAmazon != null) {
            long j2 = c4645lAmazon.yandex;
            C6232l c6232lAdcel = AbstractC7470l.adcel(c7026l);
            if (c6232lAdcel != null) {
                AbstractC7470l.ads(c7026l, new C6232l(j2, c6232lAdcel.loadAd));
            }
        } else {
            C4645l.Companion.getClass();
            c4645lAmazon = C4645l.smaato;
        }
        this.f15735l = c4645lAmazon;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f A[LOOP:0: B:45:0x0139->B:47:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x017a  */
    /* JADX WARN: Code duplicated, block: B:52:0x018a  */
    /* JADX WARN: Code duplicated, block: B:54:0x019c  */
    /* JADX WARN: Code duplicated, block: B:55:0x019f  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b3 A[EDGE_INSN: B:60:0x01b3->B:68:0x01c9 BREAK  A[LOOP:1: B:62:0x01b9->B:67:0x01c6]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c6 A[LOOP:1: B:62:0x01b9->B:67:0x01c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0213, code lost:
    
        if (r4 == r11) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mopub(java.lang.String r18, boolean r19, java.lang.String r20, java.util.HashMap r21, java.util.Map r22, java.lang.String r23, boolean r24, defpackage.AbstractC0283l r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7644l.mopub(java.lang.String, boolean, java.lang.String, java.util.HashMap, java.util.Map, java.lang.String, boolean, lّؑۧ):java.lang.Object");
    }

    public void purchase(long j) {
        C7026l c7026l = (C7026l) this.f15742l;
        C6232l c6232lAdcel = AbstractC7470l.adcel(c7026l);
        if (c6232lAdcel != null) {
            long j2 = c6232lAdcel.yandex;
            if (j2 == j) {
                j2 = 0;
            }
            List list = c6232lAdcel.loadAd;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C4645l) obj).yandex != j) {
                    arrayList.add(obj);
                }
            }
            AbstractC7470l.ads(c7026l, new C6232l(j2, arrayList));
        }
        if (j == ((C4645l) this.f15735l).yandex) {
            C4645l.Companion.getClass();
            this.f15735l = C4645l.smaato;
        }
    }

    public void remoteconfig(C4330l c4330l, int i) {
        byte[] bArr;
        long j;
        C13331l c13331l;
        String str;
        C13331l c13331l2;
        int i2;
        C9489l c9489lCrashlytics;
        String str2;
        Integer numValueOf;
        C7644l c7644l;
        final C7644l c7644l2 = this;
        final C4330l c4330l2 = c4330l;
        byte[] bArr2 = c4330l2.loadAd;
        C16163l c16163l = (C16163l) c7644l2.f15742l;
        InterfaceC9691l interfaceC9691lYandex = ((C2690l) c7644l2.f15737l).yandex(c4330l2.yandex);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            if (!((Boolean) c16163l.ads(new InterfaceC12350l(c7644l2) { // from class: lٍؓۖ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C7644l f4149l;

                {
                    this.f4149l = c7644l2;
                }

                @Override // defpackage.InterfaceC12350l
                public final Object purchase() {
                    Boolean bool;
                    int i4 = i3;
                    C4330l c4330l3 = c4330l2;
                    C7644l c7644l3 = this.f4149l;
                    switch (i4) {
                        case 0:
                            C16163l c16163l2 = (C16163l) c7644l3.f15734l;
                            SQLiteDatabase sQLiteDatabaseYandex = c16163l2.yandex();
                            sQLiteDatabaseYandex.beginTransaction();
                            try {
                                Long lBilling = C16163l.billing(sQLiteDatabaseYandex, c4330l3);
                                if (lBilling == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c16163l2.yandex().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lBilling.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseYandex.setTransactionSuccessful();
                                sQLiteDatabaseYandex.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseYandex.endTransaction();
                                throw th2;
                            }
                        default:
                            C16163l c16163l3 = (C16163l) c7644l3.f15734l;
                            c16163l3.getClass();
                            return (Iterable) c16163l3.mopub(new C15263l(c16163l3, c4330l3, 19));
                    }
                }
            })).booleanValue()) {
                c16163l.ads(new C8000l(jMax, c7644l2, c4330l2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) c16163l.ads(new InterfaceC12350l(c7644l2) { // from class: lٍؓۖ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C7644l f4149l;

                {
                    this.f4149l = c7644l2;
                }

                @Override // defpackage.InterfaceC12350l
                public final Object purchase() {
                    Boolean bool;
                    int i5 = i4;
                    C4330l c4330l3 = c4330l2;
                    C7644l c7644l3 = this.f4149l;
                    switch (i5) {
                        case 0:
                            C16163l c16163l2 = (C16163l) c7644l3.f15734l;
                            SQLiteDatabase sQLiteDatabaseYandex = c16163l2.yandex();
                            sQLiteDatabaseYandex.beginTransaction();
                            try {
                                Long lBilling = C16163l.billing(sQLiteDatabaseYandex, c4330l3);
                                if (lBilling == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c16163l2.yandex().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lBilling.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseYandex.setTransactionSuccessful();
                                sQLiteDatabaseYandex.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseYandex.endTransaction();
                                throw th2;
                            }
                        default:
                            C16163l c16163l3 = (C16163l) c7644l3.f15734l;
                            c16163l3.getClass();
                            return (Iterable) c16163l3.mopub(new C15263l(c16163l3, c4330l3, 19));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (interfaceC9691lYandex == null) {
                AbstractC2991l.subs("Uploader", "Unknown backend for %s, deleting event batch for it...", c4330l2);
                c13331l2 = new C13331l(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<C10555l> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6468l) it.next()).crashlytics);
                }
                if (bArr2 != null) {
                    C16163l c16163l2 = (C16163l) c7644l2.f15741l;
                    Objects.requireNonNull(c16163l2);
                    C8724l c8724l = (C8724l) c16163l.ads(new C1977l(c16163l2, i3));
                    C18289l c18289l = new C18289l(i4);
                    c18289l.mopub = new HashMap();
                    c18289l.purchase = Long.valueOf(((InterfaceC4701l) c7644l2.f15735l).admob());
                    c18289l.billing = Long.valueOf(((InterfaceC4701l) c7644l2.f15736l).admob());
                    c18289l.loadAd = "GDT_CLIENT_METRICS";
                    C7017l c7017l = new C7017l("proto");
                    c8724l.getClass();
                    C4816l c4816l = AbstractC15226l.yandex;
                    c4816l.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c4816l.yandex(c8724l, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c18289l.amazon = new C3385l(c7017l, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C16171l) interfaceC9691lYandex).yandex(c18289l.crashlytics()));
                }
                C16171l c16171l = (C16171l) interfaceC9691lYandex;
                HashMap map = new HashMap();
                for (C10555l c10555l : arrayList) {
                    String str3 = c10555l.yandex;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(c10555l);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c10555l);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    C10555l c10555l2 = (C10555l) ((List) entry.getValue()).get(0);
                    EnumC16883l enumC16883l = EnumC16883l.f32935l;
                    long jAdmob = c16171l.billing.admob();
                    long jAdmob2 = c16171l.purchase.admob();
                    C4511l c4511l = new C4511l(new C11398l(Integer.valueOf(c10555l2.loadAd("sdk-version")), c10555l2.yandex("model"), c10555l2.yandex("hardware"), c10555l2.yandex("device"), c10555l2.yandex("product"), c10555l2.yandex("os-uild"), c10555l2.yandex("manufacturer"), c10555l2.yandex("fingerprint"), c10555l2.yandex("locale"), c10555l2.yandex("country"), c10555l2.yandex("mcc_mnc"), c10555l2.yandex("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C10555l c10555l3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        C3385l c3385l = c10555l3.crashlytics;
                        byte[] bArr4 = c10555l3.isPro;
                        C7017l c7017l2 = c3385l.yandex;
                        byte[] bArr5 = c3385l.loadAd;
                        long j2 = jMax;
                        if (c7017l2.equals(new C7017l("proto"))) {
                            c7644l = new C7644l();
                            c7644l.f15739l = bArr5;
                        } else {
                            if (c7017l2.equals(new C7017l("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                C7644l c7644l3 = new C7644l();
                                c7644l3.f15742l = str4;
                                c7644l = c7644l3;
                            } else {
                                String strRemoteconfig = AbstractC2991l.remoteconfig("CctTransportBackend");
                                if (Log.isLoggable(strRemoteconfig, 5)) {
                                    Log.w(strRemoteconfig, "Received event of unsupported encoding " + c7017l2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        c7644l.f15738l = Long.valueOf(c10555l3.amazon);
                        c7644l.f15740l = Long.valueOf(c10555l3.purchase);
                        String str5 = (String) c10555l3.billing.get("tz-offset");
                        c7644l.f15735l = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        c7644l.f15736l = new C12088l((EnumC5625l) EnumC5625l.f11979l.get(c10555l3.loadAd("net-type")), (EnumC1996l) EnumC1996l.f4516l.get(c10555l3.loadAd("mobile-subtype")));
                        Integer num = c10555l3.loadAd;
                        if (num != null) {
                            c7644l.f15737l = num;
                        }
                        Integer num2 = c10555l3.mopub;
                        if (num2 != null) {
                            C16757l c16757l = new C16757l(new C0206l(num2));
                            EnumC18077l enumC18077l = EnumC18077l.f35371l;
                            c7644l.f15734l = new C3252l(c16757l);
                        }
                        byte[] bArr6 = c10555l3.subs;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            c7644l.f15741l = new C12281l(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strConcat = ((Long) c7644l.f15738l) == null ? " eventTimeMs" : "";
                        if (((Long) c7644l.f15740l) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) c7644l.f15735l) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            C8339l.smaato("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new C12628l(((Long) c7644l.f15738l).longValue(), (Integer) c7644l.f15737l, (C3252l) c7644l.f15734l, ((Long) c7644l.f15740l).longValue(), (byte[]) c7644l.f15739l, (String) c7644l.f15742l, ((Long) c7644l.f15735l).longValue(), (C12088l) c7644l.f15736l, (C12281l) c7644l.f15741l));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new C12560l(jAdmob, jAdmob2, c4511l, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                C6480l c6480l = new C6480l(arrayList3);
                URL urlLoadAd = c16171l.amazon;
                if (bArr != null) {
                    try {
                        C16529l c16529lYandex = C16529l.yandex(bArr);
                        str = c16529lYandex.loadAd;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = c16529lYandex.yandex;
                        if (str6 != null) {
                            urlLoadAd = C16171l.loadAd(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c13331l = new C13331l(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i5 = 10;
                    C18449l c18449l = new C18449l(urlLoadAd, c6480l, str, i5);
                    C2683l c2683l = new C2683l(9, c16171l);
                    int i6 = 5;
                    do {
                        c9489lCrashlytics = c2683l.crashlytics(c18449l);
                        URL url = (URL) c9489lCrashlytics.crashlytics;
                        if (url != null) {
                            AbstractC2991l.subs("CctTransportBackend", "Following redirect to: %s", url);
                            c18449l = new C18449l(url, (C6480l) c18449l.f36009l, (String) c18449l.f36012l, i5);
                        } else {
                            c18449l = null;
                        }
                        if (c18449l == null) {
                            break;
                        } else {
                            i6--;
                        }
                    } while (i6 >= 1);
                    int i7 = c9489lCrashlytics.yandex;
                    if (i7 == 200) {
                        c13331l2 = new C13331l(1, c9489lCrashlytics.loadAd);
                    } else {
                        if (i7 >= 500 || i7 == 404) {
                            c13331l = new C13331l(2, -1L);
                        } else if (i7 == 400) {
                            try {
                                c13331l = new C13331l(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                AbstractC2991l.isPro("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                c13331l2 = new C13331l(2, -1L);
                            }
                        } else {
                            c13331l = new C13331l(3, -1L);
                        }
                        c13331l2 = c13331l;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i8 = c13331l2.yandex;
            if (i8 == i2) {
                c16163l.ads(new C6390l(this, iterable, c4330l, j));
                ((C10111l) this.f15740l).m2883strictfp(c4330l, i + 1, true);
                return;
            }
            c7644l2 = this;
            c4330l2 = c4330l;
            jMax = j;
            c16163l.ads(new C15263l(c7644l2, iterable, 24));
            if (i8 == 1) {
                jMax = Math.max(jMax, c13331l2.loadAd);
                if (bArr != null) {
                    c16163l.ads(new C4568l(9, c7644l2));
                }
            } else if (i8 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((C6468l) it2.next()).crashlytics.yandex;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                c16163l.ads(new C15263l(c7644l2, map2, 25));
            }
            bArr2 = bArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6 == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object smaato(kotlin.jvm.functions.Function1 r7, defpackage.AbstractC0283l r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f15739l
            lٖؗؓ r0 = (defpackage.C4910l) r0
            boolean r1 = r8 instanceof defpackage.C11476l
            if (r1 == 0) goto L17
            r1 = r8
            lُۥْ r1 = (defpackage.C11476l) r1
            int r2 = r1.f23064l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f23064l = r2
            goto L1c
        L17:
            lُۥْ r1 = new lُۥْ
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r1.f23065l
            int r8 = r1.f23064l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r8 == 0) goto L3f
            if (r8 == r3) goto L37
            if (r8 != r2) goto L31
            defpackage.AbstractC2829l.crashlytics(r6)     // Catch: java.lang.Throwable -> L2f
            goto L5b
        L2f:
            r6 = move-exception
            goto L5f
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r4
        L37:
            lٌؘۦ r7 = r1.f23066l
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L50
        L3f:
            defpackage.AbstractC2829l.crashlytics(r6)
            r6 = r7
            lٌؘۦ r6 = (defpackage.AbstractC5563l) r6
            r1.f23066l = r6
            r1.f23064l = r3
            java.lang.Object r6 = r0.yandex(r1)
            if (r6 != r5) goto L50
            goto L5a
        L50:
            r1.f23066l = r4     // Catch: java.lang.Throwable -> L2f
            r1.f23064l = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r6 = r7.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            if (r6 != r5) goto L5b
        L5a:
            return r5
        L5b:
            r0.billing(r4)
            return r6
        L5f:
            r0.billing(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7644l.smaato(kotlin.jvm.functions.Function1, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object startapp(AbstractC0283l abstractC0283l) {
        C16904l c16904l;
        C4910l c4910l;
        if (abstractC0283l instanceof C16904l) {
            c16904l = (C16904l) abstractC0283l;
            int i = c16904l.f32962l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16904l.f32962l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16904l = new C16904l(this, abstractC0283l);
            }
        } else {
            c16904l = new C16904l(this, abstractC0283l);
        }
        Object obj = c16904l.f32963l;
        int i2 = c16904l.f32962l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C4910l c4910l2 = (C4910l) this.f15740l;
            c16904l.f32964l = c4910l2;
            c16904l.f32962l = 1;
            Object objYandex = c4910l2.yandex(c16904l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            c4910l = c4910l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4910l = c16904l.f32964l;
            AbstractC2829l.crashlytics(obj);
        }
        try {
            return (C4645l) this.f15735l;
        } finally {
            c4910l.billing(null);
        }
    }

    public ArrayList subs() {
        C6232l c6232lAdcel = AbstractC7470l.adcel((C7026l) this.f15742l);
        List<C4645l> list = c6232lAdcel != null ? c6232lAdcel.loadAd : null;
        if (list == null) {
            list = C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (C4645l c4645l : list) {
            arrayList.add(new C15050l(c4645l.yandex, c4645l.mopub, c4645l.isPro));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (r14 == r8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object yandex(defpackage.AbstractC0283l r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.C8281l
            if (r0 == 0) goto L13
            r0 = r14
            lًٌۜ r0 = (defpackage.C8281l) r0
            int r1 = r0.f17177l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17177l = r1
            goto L18
        L13:
            lًٌۜ r0 = new lًٌۜ
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f17176l
            int r1 = r0.f17177l
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L4b
            if (r1 == r7) goto L47
            if (r1 == r6) goto L43
            if (r1 == r5) goto L3f
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L9e
        L35:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r13)
            return r2
        L3b:
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L93
        L3f:
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L84
        L43:
            defpackage.AbstractC2829l.crashlytics(r14)
            return r14
        L47:
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L59
        L4b:
            defpackage.AbstractC2829l.crashlytics(r14)
            java.util.ArrayList r14 = defpackage.AbstractC18569l.yandex
            r0.f17177l = r7
            java.lang.Object r14 = r13.startapp(r0)
            if (r14 != r8) goto L59
            goto L9d
        L59:
            lؗؕؗ r14 = (defpackage.C4645l) r14
            long r9 = r14.yandex
            r11 = 0
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L74
            r0.f17177l = r6
            lٌؙؓ r14 = new lٌؙؓ
            r1 = 12
            r14.<init>(r13, r2, r1)
            java.lang.Object r13 = r13.smaato(r14, r0)
            if (r13 != r8) goto L73
            goto L9d
        L73:
            return r13
        L74:
            r0.f17177l = r5
            lًٓؗ r14 = new lًٓؗ
            r1 = 10
            r14.<init>(r13, r2, r1)
            java.lang.Object r14 = r13.smaato(r14, r0)
            if (r14 != r8) goto L84
            goto L9d
        L84:
            r0.f17177l = r4
            lؚٔٔ r14 = new lؚٔٔ
            r1 = 0
            r14.<init>(r1, r13, r2)
            java.lang.Object r14 = r13.smaato(r14, r0)
            if (r14 != r8) goto L93
            goto L9d
        L93:
            java.util.ArrayList r14 = defpackage.AbstractC18569l.yandex
            r0.f17177l = r3
            java.lang.Object r14 = r13.startapp(r0)
            if (r14 != r8) goto L9e
        L9d:
            return r8
        L9e:
            lؗؕؗ r14 = (defpackage.C4645l) r14
            java.lang.String r13 = r14.loadAd
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7644l.yandex(lّؑۧ):java.lang.Object");
    }
}
