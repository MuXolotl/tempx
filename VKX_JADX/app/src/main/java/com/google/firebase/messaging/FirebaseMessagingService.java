package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import defpackage.AbstractC3105l;
import defpackage.BinderC0806l;
import defpackage.C0554l;
import defpackage.C12014l;
import defpackage.C14302l;
import defpackage.C2350l;
import defpackage.C3823l;
import defpackage.C5131l;
import defpackage.C5138l;
import defpackage.ExecutorC11374l;
import defpackage.RunnableC10613l;
import defpackage.ThreadFactoryC6995l;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends Service {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final ArrayDeque f762l = new ArrayDeque(10);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f763l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public BinderC0806l f764l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ExecutorService f765l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f766l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f767l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C14302l f768l;

    public FirebaseMessagingService() {
        ThreadFactoryC6995l threadFactoryC6995l = new ThreadFactoryC6995l("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC6995l);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f765l = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f763l = new Object();
        this.f766l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    public final void loadAd(Intent intent) {
        String stringExtra;
        Bundle extras;
        ExecutorService executorServiceNewSingleThreadExecutor;
        C0554l c0554l;
        String stringExtra2;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra3 = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra = intent.getStringExtra("message_type");
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            switch (stringExtra) {
                case -2062414158:
                    if (stringExtra.equals("deleted_messages")) {
                    }
                    break;
                case 102161:
                    if (stringExtra.equals("gcm")) {
                    }
                    break;
                case 814694033:
                    if (stringExtra.equals("send_error")) {
                    }
                    break;
                case 814800675:
                    if (stringExtra.equals("send_event")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                */
            /*
                Method dump skipped, instruction units count: 472
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.loadAd(android.content.Intent):void");
        }

        @Override // android.app.Service
        public final synchronized IBinder onBind(Intent intent) {
            try {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "Service received bind request");
                }
                if (this.f764l == null) {
                    this.f764l = new BinderC0806l(new C5138l(13, this));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f764l;
        }

        @Override // android.app.Service
        public final void onDestroy() {
            this.f765l.shutdown();
            super.onDestroy();
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            synchronized (this.f763l) {
                this.f767l = i2;
                this.f766l++;
            }
            Intent intent2 = (Intent) ((ArrayDeque) C12014l.ad().f23943l).poll();
            if (intent2 == null) {
                yandex(intent);
                return 2;
            }
            C2350l c2350l = new C2350l();
            this.f765l.execute(new RunnableC10613l(this, intent2, c2350l, 20));
            C3823l c3823l = c2350l.yandex;
            if (c3823l.firebase()) {
                yandex(intent);
                return 2;
            }
            c3823l.loadAd(new ExecutorC11374l(2), new C5131l(this, intent, 17));
            return 3;
        }

        public final void yandex(Intent intent) {
            if (intent != null) {
                AbstractC3105l.loadAd(intent);
            }
            synchronized (this.f763l) {
                try {
                    int i = this.f766l - 1;
                    this.f766l = i;
                    if (i == 0) {
                        stopSelfResult(this.f767l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
