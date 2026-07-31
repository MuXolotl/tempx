package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؓٙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1930l extends AbstractC5097l {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f4394l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f4395l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f4396l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f4397l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f4398l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f4399l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f4400l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f4401l;

    public C1930l() {
        super(false, 3);
        this.f4400l = AbstractC8020l.smaato(null);
        this.f4399l = AbstractC8020l.smaato("Untitled");
        this.f4397l = AbstractC8020l.smaato("Unknown Artist");
        this.f4396l = AbstractC8020l.smaato(null);
        Boolean bool = Boolean.FALSE;
        this.f4395l = AbstractC8020l.smaato(bool);
        this.f4401l = AbstractC8020l.smaato(bool);
        this.f4398l = AbstractC8020l.smaato(bool);
    }

    public final File ad() {
        return (File) this.f4400l.getValue();
    }

    @Override // defpackage.AbstractC2338l
    public final void admob(int i, int i2, Intent intent) throws IOException {
        AbstractC11452l c13665l;
        Activity activity = this.f5081l;
        if (i == 101) {
            c13665l = C13570l.amazon;
            if (i2 != -1 || intent == null) {
                c13665l = C13570l.purchase;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    try {
                        InputStream inputStreamOpenInputStream = activity.getApplication().getContentResolver().openInputStream(data);
                        if (inputStreamOpenInputStream != null) {
                            c13665l = new C13665l(inputStreamOpenInputStream);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            c13665l = C13570l.crashlytics;
        }
        if (c13665l instanceof C13665l) {
            InputStream inputStream = ((C13665l) c13665l).crashlytics;
            VKXApplication vKXApplication = VKXApplication.f36631l;
            InterfaceC14029l interfaceC14029l = null;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            File file = new File(vKXApplication.getDir("artworkCache", 0), "VKXAudioUpload.mp3");
            if (file.exists()) {
                file.delete();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            AbstractC11036l.purchase(inputStream, bufferedOutputStream);
            bufferedOutputStream.close();
            inputStream.close();
            C10086l c10086l = this.f4400l;
            c10086l.setValue(file);
            if (ad() != null) {
                AbstractC9033l.crashlytics((AppActivity) this.f5081l, new C11671l(this, interfaceC14029l, 8));
                return;
            }
            C10086l c10086l2 = this.f4396l;
            Bitmap bitmap = (Bitmap) c10086l2.getValue();
            if (bitmap != null) {
                bitmap.recycle();
            }
            c10086l2.setValue(null);
            c10086l.setValue(null);
            this.f4399l.setValue("Untitled");
            this.f4397l.setValue("Unknown artist");
        }
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1653191775);
        int i2 = 4;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            if (((Boolean) this.f4395l.getValue()).booleanValue()) {
                c6956l.m2123default(-153687632);
                pro(c6956l, i3 & 14);
            } else {
                c6956l.m2123default(-165566429);
            }
            c6956l.startapp(false);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(508522618, new C3998l(this, 3), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3998l(this, i, i2);
        }
    }

    public final void pro(C6956l c6956l, int i) {
        Object c7655l;
        c6956l.m2133new(1817858414);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            C6523l c6523l2 = new C6523l();
            C6523l c6523l3 = new C6523l();
            C10178l c10178lMopub = AbstractC11173l.mopub((String) this.f4399l.getValue(), c6956l, 2);
            C10178l c10178lMopub2 = AbstractC11173l.mopub((String) this.f4397l.getValue(), c6956l, 2);
            InterfaceC6497l interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
            boolean zBilling = c6956l.billing(c10178lMopub) | c6956l.billing(c10178lMopub2) | c6956l.admob(interfaceC6497l) | c6956l.billing(c6523l2) | c6956l.billing(c6523l3) | c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                c7655l = new C7655l(c10178lMopub, c10178lMopub2, interfaceC6497l, c6523l2, c6523l3, this, 2);
                c6956l.m2147try(c7655l);
            } else {
                c7655l = objM2132native2;
            }
            Function0 function0 = (Function0) c7655l;
            boolean zAdmob = c6956l.admob(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: INVOKE (r0v27 'zAdmob' boolean) = (r22v0 'c6956l' l￘ﾚ￘ﾑ￙ﾐ), (r6v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.admob(java.lang.Object):boolean A[DECLARE_VAR, MD:(java.lang.Object):boolean (m)] (LINE:157) in method: l￘ﾓ￙ﾙￛﾖ.pro(l￘ﾚ￘ﾑ￙ﾐ, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C1930l.pro(lؚِؑ, int):void");
        }

        @Override // defpackage.AbstractC2338l
        public final void smaato() {
            super.smaato();
            Bitmap bitmap = (Bitmap) this.f4396l.getValue();
            if (bitmap != null) {
                bitmap.recycle();
            }
            File fileAd = ad();
            if (fileAd != null) {
                fileAd.delete();
            }
        }
    }
