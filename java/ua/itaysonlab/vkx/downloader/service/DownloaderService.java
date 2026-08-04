package ua.itaysonlab.vkx.downloader.service;

import android.content.Intent;
import android.os.IBinder;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC0283l;
import defpackage.AbstractC0622l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC11718l;
import defpackage.AbstractC11738l;
import defpackage.AbstractC12024l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14205l;
import defpackage.AbstractC16377l;
import defpackage.AbstractC16648l;
import defpackage.AbstractC2697l;
import defpackage.AbstractC2829l;
import defpackage.AbstractC5859l;
import defpackage.AbstractC6025l;
import defpackage.AbstractC6897l;
import defpackage.AbstractC7709l;
import defpackage.AbstractC8676l;
import defpackage.AbstractServiceC5477l;
import defpackage.BinderC16641l;
import defpackage.C0366l;
import defpackage.C0790l;
import defpackage.C10424l;
import defpackage.C11054l;
import defpackage.C12399l;
import defpackage.C12418l;
import defpackage.C13602l;
import defpackage.C13624l;
import defpackage.C14951l;
import defpackage.C15186l;
import defpackage.C1579l;
import defpackage.C16016l;
import defpackage.C16552l;
import defpackage.C1687l;
import defpackage.C18389l;
import defpackage.C1868l;
import defpackage.C18731l;
import defpackage.C2347l;
import defpackage.C4425l;
import defpackage.C5268l;
import defpackage.C5313l;
import defpackage.C6356l;
import defpackage.C7167l;
import defpackage.C8084l;
import defpackage.C8195l;
import defpackage.C8339l;
import defpackage.C8490l;
import defpackage.C8994l;
import defpackage.EnumC8981l;
import defpackage.EnumC9342l;
import defpackage.ExecutorC6708l;
import defpackage.InterfaceC0582l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC15476l;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DownloaderService extends AbstractServiceC5477l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final /* synthetic */ int f36647l = 0;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C1579l f36649l = new C1579l(10);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final Map f36648l = AbstractC8676l.remoteconfig(new C8195l('\"', '\''), new C8195l('<', '['), new C8195l('>', ']'), new C8195l(':', '-'), new C8195l('*', '+'), new C8195l('?', '_'), new C8195l('/', '_'), new C8195l('\\', '_'), new C8195l('|', '_'));

    /* JADX WARN: Failed to calculate best type for var: r17v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v5 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final java.lang.Object isPro(ua.itaysonlab.vkx.downloader.service.DownloaderService r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, ua.itaysonlab.vkapi2.objects.music.AudioTrack r22, defpackage.AbstractC7317l r23, defpackage.C6640l r24, defpackage.AbstractC0283l r25) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.isPro(ua.itaysonlab.vkx.downloader.service.DownloaderService, java.lang.Integer, java.lang.String, java.lang.String, ua.itaysonlab.vkapi2.objects.music.AudioTrack, lؚٜ٘, lؙٟؗ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final Object adcel(InterfaceC15476l interfaceC15476l, String str, AbstractC0283l abstractC0283l) throws Throwable {
        C15186l c15186l;
        AbstractC5859l abstractC5859l;
        AbstractC5859l abstractC5859l2;
        AbstractC5859l abstractC5859l3;
        if (abstractC0283l instanceof C15186l) {
            c15186l = (C15186l) abstractC0283l;
            int i = c15186l.f29775l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15186l.f29775l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15186l = new C15186l(this, abstractC0283l);
            }
        } else {
            c15186l = new C15186l(this, abstractC0283l);
        }
        Object obj = c15186l.f29774l;
        int i2 = c15186l.f29775l;
        byte[] th = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            AbstractC5859l c5313l = C6356l.amazon().metrica ? new C5313l() : new C12399l();
            c15186l.f29777l = c5313l;
            c15186l.f29776l = c5313l;
            c15186l.f29779l = c5313l;
            c15186l.f29773l = interfaceC15476l;
            c15186l.f29775l = 1;
            C16552l c16552l = AbstractC11463l.yandex;
            Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C0790l(str, null), c15186l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
            abstractC5859l = c5313l;
            abstractC5859l2 = abstractC5859l;
            obj = objFirebase;
            abstractC5859l3 = abstractC5859l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC15476l = c15186l.f29773l;
            abstractC5859l3 = c15186l.f29779l;
            abstractC5859l = c15186l.f29776l;
            abstractC5859l2 = c15186l.f29777l;
            AbstractC2829l.crashlytics(obj);
        }
        Closeable closeable = (Closeable) obj;
        try {
            AbstractC6897l abstractC6897l = ((C18389l) closeable).f35907l;
            byte[] bArrYandex = abstractC6897l != null ? abstractC6897l.yandex() : null;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            byte[] bArr = th;
            th = bArrYandex;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        abstractC5859l3.yandex = th;
        abstractC5859l.loadAd = "image/jpeg";
        abstractC5859l.crashlytics = 3;
        interfaceC15476l.metrica(abstractC5859l2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        if (adcel(r7, r8, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ads(defpackage.InterfaceC15476l r7, ua.itaysonlab.vkapi2.objects.music.AudioTrack r8, defpackage.AbstractC0283l r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.ads(lٕؖۥ, ua.itaysonlab.vkapi2.objects.music.AudioTrack, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x015f A[Catch: Exception -> 0x0037, TryCatch #6 {Exception -> 0x0037, blocks: (B:13:0x0032, B:167:0x0397, B:54:0x0159, B:56:0x015f, B:58:0x0167, B:60:0x016f, B:63:0x017e, B:65:0x0186, B:67:0x0189, B:125:0x02bf, B:127:0x02d8, B:129:0x02f7, B:132:0x02ff, B:133:0x0302, B:134:0x0303, B:136:0x0308, B:138:0x0311, B:140:0x0315, B:142:0x0319, B:145:0x033b, B:147:0x033f, B:159:0x0374, B:161:0x0378, B:164:0x037e, B:150:0x0351, B:153:0x035c, B:154:0x0361, B:157:0x036e, B:28:0x00a8, B:30:0x00bf, B:32:0x00ca, B:41:0x010b, B:43:0x010f, B:48:0x0117, B:50:0x012e, B:52:0x0145, B:53:0x014d, B:33:0x00f6, B:34:0x00ff, B:37:0x0105), top: B:183:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0167 A[Catch: Exception -> 0x0037, TryCatch #6 {Exception -> 0x0037, blocks: (B:13:0x0032, B:167:0x0397, B:54:0x0159, B:56:0x015f, B:58:0x0167, B:60:0x016f, B:63:0x017e, B:65:0x0186, B:67:0x0189, B:125:0x02bf, B:127:0x02d8, B:129:0x02f7, B:132:0x02ff, B:133:0x0302, B:134:0x0303, B:136:0x0308, B:138:0x0311, B:140:0x0315, B:142:0x0319, B:145:0x033b, B:147:0x033f, B:159:0x0374, B:161:0x0378, B:164:0x037e, B:150:0x0351, B:153:0x035c, B:154:0x0361, B:157:0x036e, B:28:0x00a8, B:30:0x00bf, B:32:0x00ca, B:41:0x010b, B:43:0x010f, B:48:0x0117, B:50:0x012e, B:52:0x0145, B:53:0x014d, B:33:0x00f6, B:34:0x00ff, B:37:0x0105), top: B:183:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x016f A[Catch: Exception -> 0x0037, TryCatch #6 {Exception -> 0x0037, blocks: (B:13:0x0032, B:167:0x0397, B:54:0x0159, B:56:0x015f, B:58:0x0167, B:60:0x016f, B:63:0x017e, B:65:0x0186, B:67:0x0189, B:125:0x02bf, B:127:0x02d8, B:129:0x02f7, B:132:0x02ff, B:133:0x0302, B:134:0x0303, B:136:0x0308, B:138:0x0311, B:140:0x0315, B:142:0x0319, B:145:0x033b, B:147:0x033f, B:159:0x0374, B:161:0x0378, B:164:0x037e, B:150:0x0351, B:153:0x035c, B:154:0x0361, B:157:0x036e, B:28:0x00a8, B:30:0x00bf, B:32:0x00ca, B:41:0x010b, B:43:0x010f, B:48:0x0117, B:50:0x012e, B:52:0x0145, B:53:0x014d, B:33:0x00f6, B:34:0x00ff, B:37:0x0105), top: B:183:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.String, java.util.Iterator, lؚٜ٘, lُّ٘, ua.itaysonlab.vkapi2.objects.music.AudioTrack] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x02a0 -> B:190:0x01a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x02d8 -> B:128:0x02ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x02f8 -> B:131:0x02f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0221 -> B:179:0x022f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractServiceC5477l
    public final java.lang.Object billing(defpackage.AbstractC7317l r26, defpackage.AbstractC0283l r27) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.billing(lؚٜ٘, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object firebase(String str, String str2, AbstractC0283l abstractC0283l) throws Exception {
        C0366l c0366l;
        String str3;
        File file;
        Exception e;
        String str4;
        if (abstractC0283l instanceof C0366l) {
            c0366l = (C0366l) abstractC0283l;
            int i = c0366l.f1440l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0366l.f1440l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0366l = new C0366l(this, abstractC0283l);
            }
        } else {
            c0366l = new C0366l(this, abstractC0283l);
        }
        Object obj = c0366l.f1436l;
        int i2 = c0366l.f1440l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C8994l c8994l = C8994l.yandex;
            String strYandex = c8994l.yandex();
            String strConcat = vip(str).concat("/artwork.jpg");
            if (!c8994l.loadAd() && admob().loadAd(strYandex, strConcat)) {
                return Unit.INSTANCE;
            }
            File fileYandex = admob().yandex(strYandex, strConcat);
            try {
                c0366l.f1439l = strYandex;
                c0366l.f1438l = strConcat;
                c0366l.f1441l = fileYandex;
                c0366l.f1440l = 1;
                C16552l c16552l = AbstractC11463l.yandex;
                Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C1868l(fileYandex, str2, null), c0366l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
                str3 = strConcat;
                file = fileYandex;
                str4 = strYandex;
            } catch (Exception e2) {
                str3 = strConcat;
                file = fileYandex;
                e = e2;
                str4 = strYandex;
                admob().crashlytics(file, str4, str3);
                throw e;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = c0366l.f1441l;
            str3 = c0366l.f1438l;
            str4 = c0366l.f1439l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Exception e3) {
                e = e3;
                admob().crashlytics(file, str4, str3);
                throw e;
            }
        }
        if (file.exists()) {
            admob().amazon(file, str4, str3);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return new BinderC16641l();
    }

    @Override // defpackage.AbstractServiceC5477l, defpackage.AbstractServiceC4696l, android.app.Service
    public final void onCreate() {
        super.onCreate();
        InterfaceC14029l interfaceC14029l = null;
        C13624l c13624l = new C13624l(this, interfaceC14029l, 18);
        C8490l c8490l = AbstractC6025l.yandex;
        C12418l c12418l = this.f9539l;
        C5268l c5268l = (C5268l) c12418l.f24519l;
        C8084l c8084l = AbstractC6025l.loadAd;
        C2347l c2347l = new C2347l(new C10424l(c8084l, 12), new C18731l(c13624l, interfaceC14029l, 14), 2);
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        C14951l c14951l = new C14951l(this, interfaceC14029l, 19);
        C5268l c5268l2 = (C5268l) c12418l.f24519l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, 13), new C18731l(c14951l, interfaceC14029l, 16), 2), c5268l2, enumC8981l), AbstractC11738l.yandex(c5268l2));
    }

    @Override // defpackage.AbstractServiceC5477l
    public final AbstractC16377l purchase() {
        return new C4425l(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
    
        if (r0 == r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014f, code lost:
    
        if (startapp(r19, r20, r3, r21, r5) == r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0151, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remoteconfig(java.lang.Integer r19, java.lang.Integer r20, ua.itaysonlab.vkapi2.objects.music.AudioTrack r21, java.io.File r22, defpackage.AbstractC7317l r23, defpackage.AbstractC0283l r24) throws defpackage.C13768l, defpackage.C9511l {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.remoteconfig(java.lang.Integer, java.lang.Integer, ua.itaysonlab.vkapi2.objects.music.AudioTrack, java.io.File, lؚٜ٘, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object smaato(AudioTrack audioTrack, String str, AbstractC0283l abstractC0283l) throws Exception {
        C1687l c1687l;
        AudioTrack audioTrack2;
        String str2;
        String str3;
        String str4;
        if (abstractC0283l instanceof C1687l) {
            c1687l = (C1687l) abstractC0283l;
            int i = c1687l.f4055l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1687l.f4055l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1687l = new C1687l(this, abstractC0283l);
            }
        } else {
            c1687l = new C1687l(this, abstractC0283l);
        }
        Object objYandex = c1687l.f4051l;
        int i2 = c1687l.f4055l;
        Throwable th = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            C8994l c8994l = C8994l.yandex;
            String strYandex = c8994l.yandex();
            String strConcat = AbstractC12024l.m3335package(3, str).concat("lrc");
            if (!c8994l.loadAd() && admob().loadAd(strYandex, strConcat)) {
                return Unit.INSTANCE;
            }
            C13602l c13602l = C13602l.yandex;
            c1687l.f4054l = audioTrack;
            c1687l.f4053l = strYandex;
            c1687l.f4056l = strConcat;
            c1687l.f4055l = 1;
            objYandex = c13602l.yandex(audioTrack, null, c1687l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
            audioTrack2 = audioTrack;
            str2 = strConcat;
            str3 = strYandex;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = c1687l.f4056l;
            str3 = c1687l.f4053l;
            audioTrack2 = c1687l.f4054l;
            AbstractC2829l.crashlytics(objYandex);
        }
        InterfaceC0582l interfaceC0582l = (InterfaceC0582l) objYandex;
        if (AbstractC2697l.vip(interfaceC0582l) && (interfaceC0582l instanceof C16016l)) {
            File fileYandex = admob().yandex(str3, str2);
            try {
                C7167l c7167l = new C7167l(AbstractC7709l.amazon(fileYandex));
                try {
                    c7167l.mo706finally("[ti:");
                    c7167l.mo706finally(audioTrack2.amazon);
                    c7167l.mo706finally("]");
                    c7167l.writeByte(10);
                    c7167l.mo706finally("[ar:");
                    c7167l.mo706finally(audioTrack2.yandex);
                    c7167l.mo706finally("]");
                    c7167l.writeByte(10);
                    AudioAlbum audioAlbum = audioTrack2.vip;
                    if (audioAlbum != null && (str4 = audioAlbum.amazon) != null) {
                        c7167l.mo706finally("[al:");
                        c7167l.mo706finally(str4);
                        c7167l.mo706finally("]");
                        c7167l.writeByte(10);
                    }
                    c7167l.mo706finally("[tool:");
                    c7167l.mo706finally("vkx.app");
                    c7167l.mo706finally("]");
                    c7167l.writeByte(10);
                    c7167l.mo706finally("[ve:");
                    c7167l.mo706finally("8.14.1_pub");
                    c7167l.mo706finally("]");
                    c7167l.writeByte(10);
                    List list = ((C16016l) interfaceC0582l).yandex;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof C11054l) {
                            arrayList.add(obj);
                        }
                    }
                    int i3 = 0;
                    for (Object obj2 : arrayList) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC14055l.subscription();
                            throw null;
                        }
                        C11054l c11054l = (C11054l) obj2;
                        c7167l.mo706finally("[");
                        c7167l.mo706finally(AbstractC14205l.crashlytics(c11054l.yandex));
                        c7167l.mo706finally("]");
                        c7167l.mo706finally(c11054l.crashlytics);
                        if (i3 != AbstractC14055l.smaato(arrayList)) {
                            c7167l.writeByte(10);
                        }
                        i3 = i4;
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        c7167l.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        c7167l.close();
                    } catch (Throwable th4) {
                        AbstractC11718l.yandex(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (fileYandex.exists()) {
                    admob().amazon(fileYandex, str3, str2);
                }
            } catch (Exception e) {
                admob().crashlytics(fileYandex, str3, str2);
                throw e;
            }
        }
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object startapp(java.lang.Integer r28, java.lang.Integer r29, defpackage.InterfaceC15476l r30, ua.itaysonlab.vkapi2.objects.music.AudioTrack r31, defpackage.AbstractC0283l r32) {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkx.downloader.service.DownloaderService.startapp(java.lang.Integer, java.lang.Integer, lٕؖۥ, ua.itaysonlab.vkapi2.objects.music.AudioTrack, lّؑۧ):java.lang.Object");
    }

    public final String vip(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            Character ch = (Character) this.f36648l.get(Character.valueOf(cCharAt));
            if (ch != null) {
                cCharAt = ch.charValue();
            }
            sb.append(cCharAt);
        }
        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        if (sb.length() > 0 && AbstractC12024l.m3320else(sb) == '.') {
            sb.deleteCharAt(AbstractC12024l.m3350volatile(sb));
        }
        return AbstractC16648l.advert(sb.toString(), "_+", "_", false);
    }
}
