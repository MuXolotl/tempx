package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lٌٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14775l {
    public static final C15578l yandex = new C15578l(987320134, false, new C14484l(27));
    public static final C15578l loadAd = new C15578l(-1482812322, false, new C11112l(24));
    public static final C15578l crashlytics = new C15578l(1746379670, false, new C11112l(25));
    public static final C15578l amazon = new C15578l(1869283607, false, new C11112l(26));

    public static ValueAnimator admob(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        int i;
        TypedArray typedArraySignature = AbstractC10310l.Signature(resources, theme, attributeSet, AbstractC14760l.mopub);
        TypedArray typedArraySignature2 = AbstractC10310l.Signature(resources, theme, attributeSet, AbstractC14760l.firebase);
        ValueAnimator valueAnimator = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j = AbstractC10310l.startapp(xmlPullParser, "duration") ? typedArraySignature.getInt(1, 300) : 300;
        long j2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArraySignature.getInt(2, 0) : 0;
        int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArraySignature.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArraySignature.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i3 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArraySignature.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i2 = ((z && billing(i3)) || (z2 && billing(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderPurchase = purchase(typedArraySignature, i2, 5, 6, "");
            if (propertyValuesHolderPurchase != null) {
                valueAnimator.setValues(propertyValuesHolderPurchase);
            }
        }
        valueAnimator.setDuration(j);
        valueAnimator.setStartDelay(j2);
        valueAnimator.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArraySignature.getInt(3, 0) : 0);
        valueAnimator.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArraySignature.getInt(4, 1) : 1);
        if (typedArraySignature2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String strMetrica = AbstractC10310l.metrica(typedArraySignature2, xmlPullParser, "pathData", 1);
            if (strMetrica != null) {
                String strMetrica2 = AbstractC10310l.metrica(typedArraySignature2, xmlPullParser, "propertyXName", 2);
                String strMetrica3 = AbstractC10310l.metrica(typedArraySignature2, xmlPullParser, "propertyYName", 3);
                if (i2 != 2) {
                }
                if (strMetrica2 == null && strMetrica3 == null) {
                    throw new InflateException(typedArraySignature2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    AbstractC15300l.subs(AbstractC15300l.mopub(strMetrica), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    do {
                        length = pathMeasure.getLength() + length;
                        arrayList.add(Float.valueOf(length));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f = length / (iMin - 1);
                    int i4 = 0;
                    float f2 = 0.0f;
                    int i5 = 0;
                    while (i4 < iMin) {
                        int i6 = iMin;
                        int i7 = i4;
                        pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                        fArr[i7] = fArr3[0];
                        fArr2[i7] = fArr3[1];
                        int i8 = i5 + 1;
                        f2 += f;
                        if (i8 < arrayList.size() && f2 > ((Float) arrayList.get(i8)).floatValue()) {
                            pathMeasure2.nextContour();
                            i5 = i8;
                        }
                        i4 = i7 + 1;
                        iMin = i6;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strMetrica2 != null ? PropertyValuesHolder.ofFloat(strMetrica2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strMetrica3 != null ? PropertyValuesHolder.ofFloat(strMetrica3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                    i = 0;
                } catch (RuntimeException e) {
                    C18073l.Signature("Error in parsing ".concat(strMetrica), e);
                    return null;
                }
            } else {
                i = 0;
                objectAnimator2.setPropertyName(AbstractC10310l.metrica(typedArraySignature2, xmlPullParser, "propertyName", 0));
            }
        } else {
            i = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArraySignature.getResourceId(i, i) : i;
        if (resourceId > 0) {
            Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, resourceId);
            AbstractC5646l.metrica(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
            valueAnimator.setInterpolator(interpolatorLoadInterpolator);
        }
        typedArraySignature.recycle();
        if (typedArraySignature2 != null) {
            typedArraySignature2.recycle();
        }
        return valueAnimator;
    }

    /* JADX WARN: Code duplicated, block: B:203:0x03af  */
    public static Animator amazon(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        int i2;
        ArrayList arrayList;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i3;
        int i4;
        int i5;
        int i6;
        PropertyValuesHolder propertyValuesHolderPurchase;
        int size;
        int i7;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorAdmob;
        int depth = xmlPullParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList2 = null;
        while (true) {
            int next = xmlPullParser.next();
            int i8 = 3;
            int i9 = 0;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i10 = 1;
            if (next == 1) {
                break;
            }
            int i11 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    admob(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    animatorAdmob = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorAdmob = admob(context, resources, theme, attributeSet, null, xmlPullParser);
                    } else {
                        Resources resources2 = resources;
                        Resources.Theme theme2 = theme;
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArraySignature = AbstractC10310l.Signature(resources2, theme2, attributeSet, AbstractC14760l.admob);
                            amazon(context, resources2, theme2, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: INVOKE 
                                  (r28v0 'context' android.content.Context)
                                  (r5v4 'resources2' android.content.res.Resources)
                                  (r6v0 'theme2' android.content.res.Resources$Theme)
                                  (r12v0 ?? I:??[OBJECT, ARRAY])
                                  (r32v0 'attributeSet' android.util.AttributeSet)
                                  (r0v4 'animatorSet2' android.animation.AnimatorSet)
                                  (wrap int:?: TERNARY null = ((wrap java.lang.String:0x0086: INVOKE (r31v0 'xmlPullParser' org.xmlpull.v1.XmlPullParser), ("http://schemas.android.com/apk/res/android"), ("ordering") INTERFACE call: org.xmlpull.v1.XmlPullParser.getAttributeValue(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (c), WRAPPED] (LINE:135)) != (null java.lang.String)) ? (wrap ??:0x0091: INVOKE (r13v3 'typedArraySignature' android.content.res.TypedArray), (0 int), (0 int) VIRTUAL call: android.content.res.TypedArray.getInt(int, int):int A[MD:(int, int):int (c), WRAPPED] (LINE:141)) : (0 int))
                                 STATIC call: l￙ﾔ￙ﾌￛﾖ.amazon(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator A[MD:(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator throws org.xmlpull.v1.XmlPullParserException, java.io.IOException (m)] (LINE:160) in method: l￙ﾔ￙ﾌￛﾖ.amazon(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator, file: classes3.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 1004
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14775l.amazon(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
                        }

                        public static boolean billing(int i) {
                            return i >= 28 && i <= 31;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        public static final Object crashlytics(File file, Function1 function1, AbstractC0283l abstractC0283l) throws IOException {
                            C5826l c5826l;
                            if (abstractC0283l instanceof C5826l) {
                                c5826l = (C5826l) abstractC0283l;
                                int i = c5826l.f12281l;
                                if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                                    c5826l.f12281l = i - RecyclerView.UNDEFINED_DURATION;
                                } else {
                                    c5826l = new C5826l(abstractC0283l);
                                }
                            } else {
                                c5826l = new C5826l(abstractC0283l);
                            }
                            Object obj = c5826l.f12279l;
                            int i2 = c5826l.f12281l;
                            try {
                                if (i2 != 0) {
                                    if (i2 != 1) {
                                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    File file2 = c5826l.f12280l;
                                    AbstractC2829l.crashlytics(obj);
                                    return obj;
                                }
                                AbstractC2829l.crashlytics(obj);
                                c5826l.f12280l = file;
                                c5826l.f12281l = 1;
                                Object objInvoke = function1.invoke(c5826l);
                                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                                return objInvoke == enumC9342l ? enumC9342l : objInvoke;
                            } catch (IOException e) {
                                if (e instanceof C16916l) {
                                    throw e;
                                }
                                if (!file.exists()) {
                                    throw AbstractC4959l.crashlytics(file, e);
                                }
                                if (file.isFile()) {
                                    if (file.canRead()) {
                                        if (file.canWrite()) {
                                            throw AbstractC4959l.crashlytics(file, e);
                                        }
                                        throw AbstractC4959l.crashlytics(file, e);
                                    }
                                    if (file.canWrite()) {
                                        throw AbstractC4959l.crashlytics(file, e);
                                    }
                                    throw AbstractC4959l.crashlytics(file, e);
                                }
                                if (file.canRead()) {
                                    if (file.canWrite()) {
                                        throw AbstractC4959l.crashlytics(file, e);
                                    }
                                    throw AbstractC4959l.crashlytics(file, e);
                                }
                                if (file.canWrite()) {
                                    throw AbstractC4959l.crashlytics(file, e);
                                }
                                throw AbstractC4959l.crashlytics(file, e);
                            }
                        }

                        public static final void loadAd(C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C6956l c6956l, int i) {
                            c6956l.m2133new(709166801);
                            if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                                C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
                                long j = c6956l.f14595continue;
                                int i2 = (int) (j ^ (j >>> 32));
                                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                                C4346l c4346l = C4346l.f8873l;
                                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
                                InterfaceC8801l.firebase.getClass();
                                C16395l c16395l = C3438l.loadAd;
                                c6956l.m2140super();
                                if (c6956l.f14603switch) {
                                    c6956l.firebase(c16395l);
                                } else {
                                    c6956l.m2136protected();
                                }
                                C6415l c6415l = C3438l.mopub;
                                AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
                                C6415l c6415l2 = C3438l.billing;
                                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
                                Integer numValueOf = Integer.valueOf(i2);
                                C6415l c6415l3 = C3438l.isPro;
                                AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                                C11192l c11192l = C3438l.firebase;
                                AbstractC8182l.purchase(c6956l, c11192l);
                                C6415l c6415l4 = C3438l.amazon;
                                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                                long j2 = c6956l.f14595continue;
                                int i3 = (int) (j2 ^ (j2 >>> 32));
                                InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
                                c6956l.m2140super();
                                if (c6956l.f14603switch) {
                                    c6956l.firebase(c16395l);
                                } else {
                                    c6956l.m2136protected();
                                }
                                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
                                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                                AbstractC11043l.isPro(i3, c6956l, c6415l3, c6956l, c11192l);
                                AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                                c15578l2.invoke(c6956l, 6);
                                c15578l.invoke(c6956l, 6);
                                c6956l.startapp(true);
                                c15578l3.invoke(c6956l, 6);
                                c6956l.startapp(true);
                            } else {
                                c6956l.m2124else();
                            }
                            C4224l c4224lAds = c6956l.ads();
                            if (c4224lAds != null) {
                                c4224lAds.amazon = new C12755l(c15578l, c15578l2, c15578l3, i);
                            }
                        }

                        public static final boolean mopub(KeyEvent keyEvent) {
                            return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
                        }

                        public static PropertyValuesHolder purchase(TypedArray typedArray, int i, int i2, int i3, String str) {
                            int color;
                            int color2;
                            int color3;
                            PropertyValuesHolder propertyValuesHolderOfFloat;
                            TypedValue typedValuePeekValue = typedArray.peekValue(i2);
                            boolean z = typedValuePeekValue != null;
                            int i4 = z ? typedValuePeekValue.type : 0;
                            TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
                            boolean z2 = typedValuePeekValue2 != null;
                            int i5 = z2 ? typedValuePeekValue2.type : 0;
                            if (i == 4) {
                                i = ((z && billing(i4)) || (z2 && billing(i5))) ? 3 : 0;
                            }
                            boolean z3 = i == 0;
                            PropertyValuesHolder propertyValuesHolderOfInt = null;
                            if (i == 2) {
                                String string = typedArray.getString(i2);
                                String string2 = typedArray.getString(i3);
                                C15101l[] c15101lArrMopub = AbstractC15300l.mopub(string);
                                C15101l[] c15101lArrMopub2 = AbstractC15300l.mopub(string2);
                                if (c15101lArrMopub != null || c15101lArrMopub2 != null) {
                                    if (c15101lArrMopub != null) {
                                        C7850l c7850l = new C7850l();
                                        if (c15101lArrMopub2 == null) {
                                            return PropertyValuesHolder.ofObject(str, c7850l, c15101lArrMopub);
                                        }
                                        if (AbstractC15300l.amazon(c15101lArrMopub, c15101lArrMopub2)) {
                                            return PropertyValuesHolder.ofObject(str, c7850l, c15101lArrMopub, c15101lArrMopub2);
                                        }
                                        throw new InflateException(AbstractC14814l.adcel(" Can't morph from ", string, " to ", string2));
                                    }
                                    if (c15101lArrMopub2 != null) {
                                        return PropertyValuesHolder.ofObject(str, new C7850l(), c15101lArrMopub2);
                                    }
                                }
                                return null;
                            }
                            C3811l c3811l = i == 3 ? C3811l.yandex : null;
                            if (z3) {
                                if (z) {
                                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                                    if (z2) {
                                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                                    } else {
                                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                                    }
                                } else {
                                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                                }
                                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
                            } else if (z) {
                                if (i4 == 5) {
                                    color2 = (int) typedArray.getDimension(i2, 0.0f);
                                } else {
                                    color2 = billing(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                                }
                                if (z2) {
                                    if (i5 == 5) {
                                        color3 = (int) typedArray.getDimension(i3, 0.0f);
                                    } else {
                                        color3 = billing(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                                    }
                                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
                                } else {
                                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
                                }
                            } else if (z2) {
                                if (i5 == 5) {
                                    color = (int) typedArray.getDimension(i3, 0.0f);
                                } else {
                                    color = billing(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                                }
                                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
                            }
                            if (propertyValuesHolderOfInt != null && c3811l != null) {
                                propertyValuesHolderOfInt.setEvaluator(c3811l);
                            }
                            return propertyValuesHolderOfInt;
                        }

                        public static final void yandex(int i, int i2, C6956l c6956l, int i3) {
                            Object objAmazon;
                            int i4 = i2;
                            C6956l c6956l2 = c6956l;
                            c6956l2.m2133new(-1808130633);
                            int i5 = i3 | (c6956l2.amazon(i) ? 4 : 2) | (c6956l2.amazon(i4) ? 32 : 16);
                            if (c6956l2.m2127for(i5 & 1, (i5 & 19) != 18)) {
                                C4346l c4346l = C4346l.f8873l;
                                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 8.0f, 0.0f, 2);
                                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                                long j = c6956l2.f14595continue;
                                int i6 = (int) (j ^ (j >>> 32));
                                InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                                InterfaceC8801l.firebase.getClass();
                                C16395l c16395l = C3438l.loadAd;
                                c6956l2.m2140super();
                                if (c6956l2.f14603switch) {
                                    c6956l2.firebase(c16395l);
                                } else {
                                    c6956l2.m2136protected();
                                }
                                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                                AbstractC8182l.billing(c6956l2, Integer.valueOf(i6), C3438l.isPro);
                                AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                                boolean z = (i5 & 14) == 4;
                                Object objM2132native = c6956l2.m2132native();
                                C13863l c13863l = C1867l.yandex;
                                if (z || objM2132native == c13863l) {
                                    DecimalFormat decimalFormat = C15638l.yandex;
                                    objM2132native = AbstractC14205l.amazon(i, false);
                                    c6956l2.m2147try(objM2132native);
                                }
                                C14855l c14855l = C18450l.f36035l;
                                C16170l c16170l = C16170l.yandex;
                                InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(c4346l, c14855l);
                                C8540l c8540l = AbstractC12502l.yandex;
                                long jLoadAd = C9735l.loadAd(0.5f, ((C9735l) c6956l2.isPro(c8540l)).yandex);
                                C10707l c10707l = AbstractC16964l.yandex;
                                AbstractC13010l.loadAd((String) objM2132native, interfaceC17242lYandex, jLoadAd, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.vip, c6956l, 0, 0, 131064);
                                boolean z2 = (i5 & 112) == 32;
                                Object objM2132native2 = c6956l.m2132native();
                                if (z2 || objM2132native2 == c13863l) {
                                    DecimalFormat decimalFormat2 = C15638l.yandex;
                                    i4 = i2;
                                    objAmazon = AbstractC14205l.amazon(i4, false);
                                    c6956l.m2147try(objAmazon);
                                } else {
                                    objAmazon = objM2132native2;
                                    i4 = i2;
                                }
                                AbstractC13010l.loadAd((String) objAmazon, c16170l.yandex(c4346l, C18450l.f36018l), C9735l.loadAd(0.5f, ((C9735l) c6956l.isPro(c8540l)).yandex), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.vip, c6956l, 0, 0, 131064);
                                c6956l2 = c6956l;
                                c6956l2.startapp(true);
                            } else {
                                c6956l2.m2124else();
                            }
                            C4224l c4224lAds = c6956l2.ads();
                            if (c4224lAds != null) {
                                c4224lAds.amazon = new C10165l(i, i4, i3);
                            }
                        }
                    }
