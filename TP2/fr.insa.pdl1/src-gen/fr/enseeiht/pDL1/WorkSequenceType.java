/**
 */
package fr.enseeiht.pDL1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Work Sequence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pDL1.PDL1Package#getWorkSequenceType()
 * @model
 * @generated
 */
public enum WorkSequenceType implements Enumerator
{
  /**
   * The '<em><b>Start2start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START2START_VALUE
   * @generated
   * @ordered
   */
  START2START(0, "start2start", "s2s"),

  /**
   * The '<em><b>Finish2start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINISH2START_VALUE
   * @generated
   * @ordered
   */
  FINISH2START(1, "finish2start", "f2s"),

  /**
   * The '<em><b>Start2finish</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #START2FINISH_VALUE
   * @generated
   * @ordered
   */
  START2FINISH(2, "start2finish", "s2f"),

  /**
   * The '<em><b>Finish2finish</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINISH2FINISH_VALUE
   * @generated
   * @ordered
   */
  FINISH2FINISH(3, "finish2finish", "f2f");

  /**
   * The '<em><b>Start2start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Start2start</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #START2START
   * @model name="start2start" literal="s2s"
   * @generated
   * @ordered
   */
  public static final int START2START_VALUE = 0;

  /**
   * The '<em><b>Finish2start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Finish2start</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FINISH2START
   * @model name="finish2start" literal="f2s"
   * @generated
   * @ordered
   */
  public static final int FINISH2START_VALUE = 1;

  /**
   * The '<em><b>Start2finish</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Start2finish</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #START2FINISH
   * @model name="start2finish" literal="s2f"
   * @generated
   * @ordered
   */
  public static final int START2FINISH_VALUE = 2;

  /**
   * The '<em><b>Finish2finish</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Finish2finish</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FINISH2FINISH
   * @model name="finish2finish" literal="f2f"
   * @generated
   * @ordered
   */
  public static final int FINISH2FINISH_VALUE = 3;

  /**
   * An array of all the '<em><b>Work Sequence Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final WorkSequenceType[] VALUES_ARRAY =
    new WorkSequenceType[]
    {
      START2START,
      FINISH2START,
      START2FINISH,
      FINISH2FINISH,
    };

  /**
   * A public read-only list of all the '<em><b>Work Sequence Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<WorkSequenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Work Sequence Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkSequenceType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WorkSequenceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Work Sequence Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkSequenceType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WorkSequenceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Work Sequence Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkSequenceType get(int value)
  {
    switch (value)
    {
      case START2START_VALUE: return START2START;
      case FINISH2START_VALUE: return FINISH2START;
      case START2FINISH_VALUE: return START2FINISH;
      case FINISH2FINISH_VALUE: return FINISH2FINISH;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private WorkSequenceType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //WorkSequenceType
